package com.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {

	private static Connection connection;
	
	public ConnectionDB( Connection c) {
		this.connection=c;
	}
	public static Connection getConnect() {
		//chargement du driver
			try {

				Class.forName("com.mysql.jdbc.Driver");

				System.out.println("le chargement a reussi");
			}catch(ClassNotFoundException e) {
				System.out.println("le chargement est echoue");
			}
			
			//connection a la base de donne
			
			try {
				connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/enote","root","");

				System.out.println("connecte avec bdd");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		
		return connection;	
	}
	
}
