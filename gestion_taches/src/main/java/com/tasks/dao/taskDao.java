package com.tasks.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.tasks.beans.Task;

public class taskDao {

	private Connection connection=null;
  public taskDao() {
   }

public List<Task> getTasks() {

	List<Task> tasksList=new ArrayList<>();
	
	
	Statement statement=null;
	ResultSet resultat=null;
	
	loadDatabase();
	try {

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_taches","root","");
		System.out.println("connecte avec bdd");
		statement=connection.createStatement();
		resultat=statement.executeQuery("SELECT id,title,description,status FROM tache;");
		
		while(resultat.next()) {

            int id=resultat.getInt("id");
			String title=resultat.getString("title");
			String description=resultat.getString("description");
			String status=resultat.getString("status");
			Task tache=new Task();
			tache.setTitle(title);
			 tache.setId(id);
			tache.setDescription(description);
			tache.setStatus(status);
			 tasksList.add(tache);
	 }
		
	} catch (SQLException e) {
		
		e.printStackTrace();
	}

	 System.out.println("la liste est recuperer");
	return tasksList ;
}













private static void loadDatabase() {
	//chargement du driver
		try {

			Class.forName("com.mysql.jdbc.Driver");

			System.out.println("le chargement a reussi");
		}catch(ClassNotFoundException e) {
			System.out.println("le chargement est echoue");
		}
	
		
}







public static void addTask(Task task) {
	loadDatabase();
	try {


		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_taches","root","");
		PreparedStatement preparedstatement=connection.prepareStatement("INSERT INTO tache(title, description,status) VALUES (?,?,?);");//PreparedStatement avec insert et update Si vous avez des paramètres à insérer dans votre requête SQL, comme des données d'utilisateur
		preparedstatement.setString(1,task.getTitle());
		preparedstatement.setString(2,task.getDescription());
		preparedstatement.setString(3,task.getStatus());
		preparedstatement.executeUpdate();
		System.out.println("objet tache est insrer");
		//dans insertion pas besoin de lire 
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
	












public static void UpdateTask(Task task) {
	loadDatabase();
	try {


		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_taches","root","");
		PreparedStatement preparedstatement=connection.prepareStatement("UPDATE tache SET title = ?, description = ?, status = ? WHERE id = ?;");//PreparedStatement avec insert et update Si vous avez des paramètres à insérer dans votre requête SQL, comme des données d'utilisateur
		preparedstatement.setString(1,task.getTitle());
		preparedstatement.setString(2,task.getDescription());
		preparedstatement.setString(3,task.getStatus());
		 preparedstatement.setInt(4, task.getId());
		preparedstatement.executeUpdate();
		System.out.println("objet tache est modifier");
		//dans la modification on a pas besoin de lire 
		
		
		// Exécution de la mise à jour
        int rowsUpdated = preparedstatement.executeUpdate();
        
     // Vérification du nombre de lignes mises à jour
        if (rowsUpdated > 0) {
            System.out.println("La tâche a été mise à jour avec succès.");
        } else {
            System.out.println("Aucune tâche n'a été mise à jour.");
        }
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}


public static void deleteTask(int id) {
    loadDatabase();
    try {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_taches", "root", "");
        PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM tache WHERE id = ?;");
        preparedStatement.setInt(1, id);
        
        // Exécution de la suppression
        int rowsDeleted = preparedStatement.executeUpdate();
        
        // Vérification du nombre de lignes supprimées
        if (rowsDeleted > 0) {
            System.out.println("La tâche a été supprimée avec succès.");
        } else {
            System.out.println("Aucune tâche n'a été supprimée.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}



public static Task getTaskById(int id) {
    loadDatabase();
    Task task = null;
    try {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_taches", "root", "");
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM tache WHERE id = ?;");
        preparedStatement.setInt(1, id);
        
        // Exécution de la requête et récupération du résultat
        ResultSet resultSet = preparedStatement.executeQuery();
        
        // Lecture de la tâche
        if (resultSet.next()) {
            task = new Task();
            task.setId(resultSet.getInt("id"));
            task.setTitle(resultSet.getString("title"));
            task.setDescription(resultSet.getString("description"));
            task.setStatus(resultSet.getString("status"));
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return task;
}




}
