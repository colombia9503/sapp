package com.udem.sapp.DAO.classic;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

import com.udem.sapp.DAO.IntPropuestasDAO;
import com.udem.sapp.DB.Conexion;
import com.udem.sapp.DB.PoolConnection;
import com.udem.sapp.DTO.PropuestasDTO;

public class PropuestasDAO implements IntPropuestasDAO{
	
	private PoolConnection pool;
	private Conexion connection;
	private String message;
	
	public PropuestasDAO() {
		// TODO Auto-generated constructor stub
		connection = new Conexion();
		pool = new PoolConnection();
	}
	

	@Override
	public void nuevaPropuesta(PropuestasDTO propuesta) {
		// TODO Auto-generated method stub
		Statement st = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		//conexion class
		Conexion connection = null;
		/**
		 * Distinto
		 * */
		Connection conn = null;
		try {
			connection = pool.getConexion();
			System.out.println(connection.toString());
			conn = connection.getConnection();
			
			st = conn.createStatement();
			String query = "INSERT INTO Propuestas ()";
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@Override
	public void actualizarPropuesta(PropuestasDTO propuesta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarPropuesta(int Codigo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PropuestasDTO buscarPropuesta(int Codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PropuestasDTO> listaPropuestas() {
		// TODO Auto-generated method stub
		Statement st = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		//conexion class
		Conexion connection = null;
		/**
		 * Distinto
		 * */
		Connection conn = null;
		try {
			connection = pool.getConexion();
			System.out.println(connection.toString());
			conn = connection.getConnection();
			st = conn.createStatement();
			String query = "SELECT * FROM propuestas";
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			List<PropuestasDTO> propuestasList = new ArrayList<>();
			
			while (rs.next()) {
				PropuestasDTO propuesta = new PropuestasDTO();
				propuesta.setCod(rs.getInt("codigo"));
				propuesta.setAsunto(rs.getString("asunto"));
				propuesta.setPerfilAsesor("perfil_asesor");
				propuesta.setEstado(rs.getString("estado"));
				propuesta.setUrl(rs.getString("url"));
				propuesta.setCodEstudiante(rs.getInt("estudiantes_codigo"));
				propuesta.setCodAsesor(rs.getInt("asesores_codigo"));
			}
		} catch (Exception e) {
			setMessage(e.getMessage());
		} finally {
			try {
				rs.close();
			} catch (Exception e2) {
				/*Ignore*/
			}
			try {
				st.close();
			} catch (Exception e2) {
				/*Ignore*/
			}
			try {
				pool.BreakConnection(connection);
			} catch (Exception e2) {
				/*Ignore*/
			}
		}
		
		
		return null;
	}
	
	
	
	public void setMessage(String message) {
		this.message = message;
	}


	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.message;
	}

	
}
