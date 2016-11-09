package com.udem.sapp.DB;

import java.util.ArrayList;
import java.util.List;

import javax.jws.soap.SOAPBinding.Use;

public class PoolConnection {
	private static final int POOL_SIZE = 5;
	
	private List<Conexion> AviableConnections;
	private List<Conexion> UsedConnections;
	
	public PoolConnection() {
		// TODO Auto-generated constructor stub
		AviableConnections = new ArrayList<Conexion>();
		UsedConnections = new ArrayList<Conexion>();
		
		for (int i = 1; i < POOL_SIZE; i++) {
			AviableConnections.add(new Conexion(i+""));
		}
	}
	
	public Conexion getConexion(){
		Conexion conexion;
		if (AviableConnections.size()>0) {
			conexion = AviableConnections.remove(0);
		}else{
			conexion = new Conexion("nueva");
		}
		UsedConnections.add(conexion);
		return conexion;
	}
	
	public void BreakConnection(Conexion conexion) {
		UsedConnections.remove(conexion);
		if(AviableConnections.size()<POOL_SIZE) {
			AviableConnections.add(conexion);
		}
	}
}
