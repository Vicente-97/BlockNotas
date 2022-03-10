package com.jacaranda.bloc;

import com.jacaranda.notas.Nota;

public class Bloc {

	private static final Integer NUMERO_NOTAS_MAXIMA=10;
	private Integer numNotas;
	private String nombre;
	Nota[]blockNotas=new Nota[NUMERO_NOTAS_MAXIMA];
	
	
	public Bloc(String textoBloc) {
		this.nombre=textoBloc;
	}
	
	public String getNota(int posicion) {
		String resultado="";
		if(this.blockNotas[posicion-1]!=null) {
		 return this.blockNotas[posicion-1].getTexto();
		}else if (this.blockNotas[posicion]==null) {
			resultado="No hay nota";
		}
		
		return resultado;
	}
	
	public void updateNota(String nota, int numero) {
		setNombre(nota);
		setNumNotas(numero);
		
	}

	public Integer getNumNotas() {
		return numNotas;
	}

	public void setNumNotas(Integer numNotas) {
		this.numNotas = numNotas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}