package BlockNotas;
/**
 * Clase Nota de la creacion
 * de un Bloc de Notas
 */

import java.time.LocalDateTime;
import java.util.Objects;

import Enteros.Entero;

public class Nota implements Comparable<Nota> {

	//Atributos de la clase nota//
	private static int codigoSiguiente;
	private Integer codigo;
	private String texto;
	private LocalDateTime fechaCreacion;
	private LocalDateTime fechaUltimaModificacion;
	
	
	//constructores//
	public Nota(String nota) {
		this.texto=nota;
	}
	
	
	//metodos de la clase Nota//
	public boolean isModificacion() {
		
		if (fechaUltimaModificacion!=null) {
			return true;
		}
	
		return false;
	}
	
	public boolean isEmpty() {
		
		if (texto==null || texto.trim().isEmpty()) {
			return true;
		}
		
		return false;
	}
	
	public boolean isCreadoAnterior(Nota nota) {
		return false;
	}
	
	public boolean isModificadoAnterior (Nota nota) {
		return false;
	}
	
	
	
	//getters//
	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public LocalDateTime getFechaUltimaModificacion() {
		return fechaUltimaModificacion;
	}


	@Override
	public int hashCode() {
		return Objects.hash(codigo, fechaCreacion, fechaUltimaModificacion, texto);
	}


	
	public boolean equals(Nota notaDesconocida) {
		boolean SonLoMismo = false;
		
		Nota convertida = (Nota) notaDesconocida;
		
		SonLoMismo= this.texto.equals(notaDesconocida.getTexto()) &&
				this.codigo.equals(notaDesconocida.getCodigo());
		
		return SonLoMismo;
	}


	@Override
	public String toString() {
		return "Nota codigo=" + codigo + ", texto=" + texto + ", fechaCreacion=" + fechaCreacion
				+ ", fechaUltimaModificacion=" + fechaUltimaModificacion + "";
	}
	
	@Override
	public int compareTo(Nota otraNota) {
		int resultado=0;
		
		if (this.fechaCreacion.isBefore(otraNota.getFechaCreacion())) {
			resultado=-1;
		}else if (this.fechaCreacion.isAfter(otraNota.getFechaCreacion())) {
			resultado=1;
		}
		
		
		return resultado;
	}
	
}
