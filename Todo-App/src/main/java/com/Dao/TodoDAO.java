package com.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.DB.DbConnect;
import com.entite.entity;
import com.mysql.cj.xdevapi.PreparableStatement;


public class TodoDAO {

	private static Connection conn;
	
	PreparableStatement preparsetatement=null;
	ResultSet resultat=null;
	
	public TodoDAO(Connection conn) {
		this.conn=conn;
	}
	
	
	public static List<entity> getALLTodo()  {

		conn=DbConnect.getConnect();
		List<entity> todoList=new ArrayList<>();
		
		
		Statement statement=null;
		ResultSet resultat=null;
		
		 try {

			statement=conn.createStatement();
			
			
			// l'execution de la requete
			 resultat=statement.executeQuery("SELECT*FROM todotable;");// on utilise statement car on a  select  Pour des requêtes ad hoc : Lorsque vous exécutez des requêtes simples sans paramètres.

			 
			 
			// la Recuperation des donnes de la base de donnes
			 while(resultat.next()) {
				 entity entite=new entity();
                    int id=resultat.getInt("id");
					String nom=resultat.getString("name");
					String todo=resultat.getString("todo");
					String status=resultat.getString("status");
					
					entite.setId(id);
					entite.setName(nom);
					entite.setTodo(todo);
					entite.setStatus(status);
					
					todoList.add(entite);

					System.out.println(" la liste des objet todoList est recuperer");
			 }
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		 System.out.println("la liste est recuperer");
		 return  todoList;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static boolean addTodo(entity entity) {
		
		conn=DbConnect.getConnect();
		
		try {
			PreparedStatement preparsetatement= conn.prepareStatement("INSERT INTO todotable(name, todo,status) VALUES (?,?,?);");
			preparsetatement.setString(1,entity.getName());
			preparsetatement.setString(2,entity.getTodo());
			preparsetatement.setString(3,entity.getStatus());
			preparsetatement.executeUpdate();

			System.out.println("objet est insrer");
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
	}
	
	
	
	
	
/*	
	public static entity getTodoById(entity t) {
		conn=DbConnect.getConnect();
		entity entite=new entity();
		try {
			PreparedStatement preparsetatement= conn.prepareStatement("SELECT* FROM todotable WHERE id=?;");
			preparsetatement.setLong(1,t.getId());
			ResultSet resultat=preparsetatement.executeQuery();
			
			
			// la Recuperation d'un seul element de la base de donnes
			  while(resultat.next()) {

					String nom=resultat.getString("name");
					String todo=resultat.getString("todo");
					String status=resultat.getString("status");
					
					entite.setName(nom);
					entite.setStatus(todo);
					entite.setStatus(status);
					
			 }
			
			System.out.println(" seul  objet todo est recuperer par son id ");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return entite;
	}*/
	
	
	
	
	
	
	
	
	
	
	
	public static entity getTodoById(int id) {
	    conn = DbConnect.getConnect();
	    entity entite = null; // Déclarez l'entité comme null au début
	    try {
	        PreparedStatement preparsetatement = conn.prepareStatement("SELECT * FROM todotable WHERE id = ?;");
	        preparsetatement.setInt(1, id); // Passez l'ID en tant qu'entier

	        ResultSet resultat = preparsetatement.executeQuery();

	        // Utilisez une condition if pour traiter un seul résultat
	        if (resultat.next()) {
	            entite = new entity(); // Créez une nouvelle entité uniquement si des données sont trouvées
	            String nom = resultat.getString("name");
	            String todo = resultat.getString("todo");
	            String status = resultat.getString("status");

	            entite.setId(id); // Définir l'ID
	            entite.setName(nom);
	            entite.setTodo(todo);
	            entite.setStatus(status);
	        }

	        System.out.println("Objet todo récupéré par son ID");
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return entite; // Renvoie l'entité trouvée ou null si non trouvée
	}

	
	
	

/*public static boolean UpdateTask(entity entite) {
	conn = DbConnect.getConnect();
	
	try {


		PreparedStatement preparedstatement=conn.prepareStatement("UPDATE todotable SET name = ?, todo = ?, status = ? WHERE id = ?;");//PreparedStatement avec insert et update Si vous avez des paramètres à insérer dans votre requête SQL, comme des données d'utilisateur
		
		preparedstatement.setString(1,entite.getName());
		preparedstatement.setString(2,entite.getTodo());
		preparedstatement.setString(3,entite.getStatus());
		 preparedstatement.setInt(4, entite.getId());
		preparedstatement.executeUpdate();
		//dans la modification on a pas besoin de lire 
		
		
		// Exécution de la mise à jour
        int rowsUpdated = preparedstatement.executeUpdate();
        
     // Vérification du nombre de lignes mises à jour
        if (rowsUpdated > 0) {
            System.out.println("todo a été mise à jour avec succès.");
            return true;
        } else {
            System.out.println("Aucune todo n'a été mise à jour.");
            
        }
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();

		return false;
	}
}
	*/
	
	
	public static boolean UpdateTask(entity entite) {
	    // Utilisation de try-with-resources pour gérer la fermeture automatique des ressources
	    try (Connection conn = DbConnect.getConnect();
	         PreparedStatement preparedstatement = conn.prepareStatement("UPDATE todotable SET name = ?, todo = ?, status = ? WHERE id = ?;")) {
	        
	        // Remplir les paramètres de la requête
	        preparedstatement.setString(1, entite.getName());
	        preparedstatement.setString(2, entite.getTodo());
	        preparedstatement.setString(3, entite.getStatus());
	        preparedstatement.setInt(4, entite.getId());

	        // Exécuter la mise à jour
	        int rowsUpdated = preparedstatement.executeUpdate();

	        // Vérifier le nombre de lignes mises à jour
	        if (rowsUpdated > 0) {
	            System.out.println("Todo a été mise à jour avec succès.");
	            return true;
	        } else {
	            System.out.println("Aucune todo n'a été mise à jour.");
	            return false;
	        }
	    } catch (SQLException e) {
	        // Gérer l'exception de la mise à jour de la base de données
	        e.printStackTrace();
	        return false;
	    }
	}

	
	
	
	public static boolean deleteTodo(int id) {
	    boolean f = false;
	    // Utilisation de try-with-resources pour gérer la fermeture automatique des ressources
	    try (Connection conn = DbConnect.getConnect();
	         PreparedStatement preparedStatement = conn.prepareStatement("DELETE FROM todotable WHERE id = ?;")) {
	        
	        // Remplir le paramètre de la requête
	        preparedStatement.setInt(1, id);
	        
	        // Exécuter la suppression
	        int rowsDeleted = preparedStatement.executeUpdate();
	        
	        if(rowsDeleted==1) {
	        	f=true;
	        	System.out.println("todo est supprimer");
	        }
	}catch(Exception e) {
		e.printStackTrace();
	}
	    return f;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
