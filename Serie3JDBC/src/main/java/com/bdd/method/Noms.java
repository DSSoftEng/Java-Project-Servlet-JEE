package com.bdd.method;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bdd.beans.utilisateur;

public class Noms {
	private Connection connection=null;
	public Noms() {
		
	}
	

	
	
public List<utilisateur> getUsers()  {
	
	List<utilisateur> utilisateurs=new ArrayList<>();
	//chargement du driver
	/*try {

		Class.forName("com.mysql.jdbc.Driver");
=
	}catch(ClassNotFoundException e) {
	}*/
	//connection a la base de donne
	
	Statement statement=null;
	ResultSet resultat=null;
	loadDatabase();
	 try {

		statement=connection.createStatement();
		
		
		// l'execution de la requete
		 resultat=statement.executeQuery("SELECT nom,prenom FROM noms;");// on utilise statement car on a  select  Pour des requêtes ad hoc : Lorsque vous exécutez des requêtes simples sans paramètres.

		 
		 
		// la Recuperation des donnes de la base de donnes
		  while(resultat.next()) {

				String nom=resultat.getString("nom");
				String prenom=resultat.getString("prenom");
				
				utilisateur utilisateur=new utilisateur();
				utilisateur.setNom(nom);
				utilisateur.setPrenom(prenom);
				 utilisateurs.add(utilisateur);
		 }
		 
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	 System.out.println("la liste est recuperer");
	 return  utilisateurs;
}





private void loadDatabase() {
	//chargement du driver
		try {

			Class.forName("com.mysql.jdbc.Driver");

			System.out.println("le chargement a reussi");
		}catch(ClassNotFoundException e) {
			System.out.println("le chargement est echoue");
		}
		
		//connection a la base de donne
		
		try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaee","root","");

			System.out.println("connecte avec bdd");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
		
}


  public void addUser(utilisateur utilisateur) {
	loadDatabase();
	try {
		PreparedStatement preparedstatement=connection.prepareStatement("INSERT INTO noms(nom, prenom) VALUES (?,?);");//PreparedStatement avec insert et update Si vous avez des paramètres à insérer dans votre requête SQL, comme des données d'utilisateur
		preparedstatement.setString(1,utilisateur.getNom());
		preparedstatement.setString(2,utilisateur.getPrenom());
		preparedstatement.executeUpdate();
		System.out.println("objet est insrer");
		//dans insertion pas besoin de lire 
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
	


}
