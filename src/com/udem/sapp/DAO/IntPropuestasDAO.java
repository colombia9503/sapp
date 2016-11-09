package com.udem.sapp.DAO;

import java.util.List;

import com.udem.sapp.DTO.PropuestasDTO;

public interface IntPropuestasDAO {
	public void nuevaPropuesta (PropuestasDTO propuesta);
	public void actualizarPropuesta (PropuestasDTO propuesta);
	public void eliminarPropuesta (int Codigo);
	public PropuestasDTO buscarPropuesta (int Codigo);
	public List<PropuestasDTO> listaPropuestas ();
	public String getMessage();

}
