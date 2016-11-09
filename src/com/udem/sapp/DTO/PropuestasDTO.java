package com.udem.sapp.DTO;

public class PropuestasDTO {
	private int Cod;
	private String Asunto;
	private String PerfilAsesor;
	private String Estado;
	private String Url;
	private int CodEstudiante;
	private int CodAsesor;
	
	public PropuestasDTO(int cod, String asunto, String perfilAsesor, String estado, String url, int codEstudiante,
			int codAsesor) {
		Cod = cod;
		Asunto = asunto;
		PerfilAsesor = perfilAsesor;
		Estado = estado;
		Url = url;
		CodEstudiante = codEstudiante;
		CodAsesor = codAsesor;
	}

	public PropuestasDTO() {
		
	}
	
	public int getCod() {
		return Cod;
	}
	public void setCod(int cod) {
		Cod = cod;
	}
	public String getAsunto() {
		return Asunto;
	}
	public void setAsunto(String asunto) {
		Asunto = asunto;
	}
	public String getPerfilAsesor() {
		return PerfilAsesor;
	}
	public void setPerfilAsesor(String perfilAsesor) {
		PerfilAsesor = perfilAsesor;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	public String getUrl() {
		return Url;
	}
	public void setUrl(String url) {
		Url = url;
	}
	public int getCodEstudiante() {
		return CodEstudiante;
	}
	public void setCodEstudiante(int codEstudiante) {
		CodEstudiante = codEstudiante;
	}
	public int getCodAsesor() {
		return CodAsesor;
	}
	public void setCodAsesor(int codAsesor) {
		CodAsesor = codAsesor;
	}
	
}
