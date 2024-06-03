package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.DB.ConnectionDB;
import com.beans.note;
import com.beans.user;
import com.mysql.cj.xdevapi.PreparableStatement;

import jakarta.servlet.jsp.jstl.sql.Result;

public class NoteDao {

	private static Connection conn ;
	public NoteDao() {

		this.conn=ConnectionDB.getConnect();
	}
	static PreparedStatement preparsetatement=null;
	ResultSet resultat=null;
	
  //Recuperer la liste des notes
	public static List<note> getALLNote(){
		List<note> ListeNotes=new ArrayList<>();
		
		Statement statement=null;
		ResultSet resultat=null;

		conn=ConnectionDB.getConnect();
		 try {

			statement=conn.createStatement();
			
			
			// l'execution de la requete
			 resultat=statement.executeQuery("SELECT*FROM notes;");// on utilise statement car on a  select  Pour des requêtes ad hoc : Lorsque vous exécutez des requêtes simples sans paramètres.

			 
			 
			// la Recuperation des donnes de la base de donnes
			 while(resultat.next()) {
				 note note=new note();
                    int idNote=resultat.getInt("idNote");
					String title=resultat.getString("title");
					String content=resultat.getString("content");
					int idUser=resultat.getInt("idUser");
					
					note.setIdNote(idNote);
					note.setTitle(title);
					note.setContent(content);;
					note.setUser(getUserById(idUser));
					
					ListeNotes.add(note);

					System.out.println(" la liste des objets notes est recuperer");
			 }
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		 System.out.println("la liste de notes est recuperer");
		
		
	
		
		
		return ListeNotes;
	}
	
	
	
	
	
	
	public static user getUserById(int userId) throws SQLException {
        user user = null;

		ResultSet resultat=null;

		conn=ConnectionDB.getConnect();
        
        try {
            String query = "SELECT * FROM users WHERE id = ?";
            
            preparsetatement = conn.prepareStatement(query);
            preparsetatement.setInt(1, userId);
            
            resultat = preparsetatement.executeQuery();
            
            if (resultat.next()) {
                user = new user();
                user.setIdUser(resultat.getInt("id"));
                user.setUsername(resultat.getString("username"));
                user.setPassword(resultat.getString("password"));
                // Ajoutez d'autres propriétés si nécessaire
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
  
        } 
        
        return user;
    
}
		
		
		
		
		// supprimer une note 
	
	
	public static boolean deleteNote(int id) {
	    boolean f = false;
	   
	    try (
	    	Connection conn =ConnectionDB.getConnect();
	         PreparedStatement preparedStatement = conn.prepareStatement("DELETE FROM notes WHERE idNote = ?;")) {
	        
	        // Remplir le paramètre de la requête
	        preparedStatement.setInt(1, id);
	        
	        // Exécuter la suppression
	        int rowsDeleted = preparedStatement.executeUpdate();
	        
	        if(rowsDeleted==1) {
	        	f=true;
	        	System.out.println("Note est supprimer");
	        }
	}catch(Exception e) {
		e.printStackTrace();
	}

    	System.out.println("Note n'est pas supprimer");
	    return f;
	}
		
		
	
	
	
	
	
	
	
	
	
	
	
	

	//ajouter un element dans la base de donne
	public static boolean addNote(String ti,String ct,int ui)  {
		conn=ConnectionDB.getConnect();
		try {
			preparsetatement=conn.prepareStatement("INSERT INTO notes(title, content,idUser) VALUES (?,?,?);");
			preparsetatement.setString(1,ti);
			preparsetatement.setString(2,ct);
			preparsetatement.setInt(3,ui);
			preparsetatement.executeUpdate();

			System.out.println("la note est inserer");
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	// recuperer la liste d'un seul utilisateur connecter selon la session
	public static List<note> getAllNotesByUser(int userId) {
	    List<note> notesList = new ArrayList<>();

	    String query = "SELECT * FROM notes WHERE idUser = ?;";
	    
	    try (Connection conn = ConnectionDB.getConnect();
	         PreparedStatement pstmt = conn.prepareStatement(query)) {
	        
	        pstmt.setInt(1, userId);
	        
	        try (ResultSet rs = pstmt.executeQuery()) {
	            while (rs.next()) {
	                note note = new note();
	                note.setIdNote(rs.getInt("idNote"));
	                note.setTitle(rs.getString("title"));
	                note.setContent(rs.getString("content"));
	                note.setUser(getUserById(rs.getInt("idUser")));
	                
	                notesList.add(note);
	            }
	        }
	        
	        System.out.println("La liste de notes a été récupérée");
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    
	    return notesList;
	}
	
	
	
	
	// modifier lobjet note
	
	public static boolean UpdateNote(note note) {
	    // Utilisation de try-with-resources pour gérer la fermeture automatique des ressources
	    try (
	    		Connection conn =ConnectionDB.getConnect();
	         PreparedStatement preparedstatement = conn.prepareStatement("UPDATE notes SET title = ?, content = ?WHERE idNote = ?;")) {
	        
	        // Remplir les paramètres de la requête
	        preparedstatement.setString(1, note.getTitle());
	        preparedstatement.setString(2, note.getContent());
	        preparedstatement.setInt(3, note.getIdNote());

	        // Exécuter la mise à jour
	        int rowsUpdated = preparedstatement.executeUpdate();

	        // Vérifier le nombre de lignes mises à jour
	        if (rowsUpdated > 0) {
	            System.out.println("la note a été mise à jour avec succès.");
	            return true;
	        } else {
	            System.out.println("Aucune note n'a été mise à jour.");
	            return false;
	        }
	    } catch (SQLException e) {
	        // Gérer l'exception de la mise à jour de la base de données
	        e.printStackTrace();
	        return false;
	    }
	}

	
	
	
	
}
