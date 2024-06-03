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

public class UserDao {
	private static Connection conn ;
	static PreparedStatement preparsetatement=null;
	ResultSet resultat=null;
	
	public UserDao(){
		this.conn=ConnectionDB.getConnect();
	}
	
	public static  List<user> getAllUsers() {
	    List<user> listUsers = new ArrayList<>();
	    String query = "SELECT * FROM users";

	    Connection conn = null;
	    Statement statement = null;
	    ResultSet resultSet = null;

	    try {
	        conn = ConnectionDB.getConnect();
	        statement = conn.createStatement();
	        resultSet = statement.executeQuery(query);

	        // Récupération des données de la base de données
	        while (resultSet.next()) {
	            user user = new user();
	            int idUser = resultSet.getInt("id");
	            String username = resultSet.getString("username");
	            String password = resultSet.getString("password");

	            user.setIdUser(idUser);
	            user.setUsername(username);
	            user.setPassword(password);

	            listUsers.add(user);

	            System.out.println("Utilisateur récupéré : " + user.getUsername());
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } 

		return listUsers;
	}
	
	
	
	

	//ajouter un element dans la base de donne
	public static boolean addUser(String username,String password)  {
		conn=ConnectionDB.getConnect();
		try {
			preparsetatement=conn.prepareStatement("INSERT INTO users( username,password) VALUES (?,?);");
			preparsetatement.setString(1,username);
			preparsetatement.setString(2,password);
			preparsetatement.executeUpdate();

			System.out.println("utilisateur est inserer dans la base de donne");
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		System.out.println("utilisateur est n'inserer pas dans la base de donne");
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
