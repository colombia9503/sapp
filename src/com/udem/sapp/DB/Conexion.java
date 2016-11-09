package com.udem.sapp.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	private static String _db = "sapp";
	private static String url = "jdbc:mysql://localhost:3306/" + _db;
	private static String user = "root";
	private static String password = "";
	
	private String message;
	
	public Conexion() {
		// TODO Auto-generated constructor stub
	}
	
	private String name;
	
	public Conexion(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	public Connection getConnection(){
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = (Connection) DriverManager.getConnection(url, user, password);
			if (connection != null) {
				System.out.println("DB connection to " + url + " success..");
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("There's a problem with the connection to " + url);
		} catch (ClassNotFoundException e) {
			setMessage(e.getMessage());
		}
		return connection;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "DB Connection: " + name;
	}

}
