package it.parksafe.la.models;

import java.io.Serializable;

public class ResponsabileParco implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3604835450055759760L;
	
	private Integer codResponsabile;
	private String nome;
	private String cognome;
	private String password;
	
	public Integer getCodResponsabile() {
		return codResponsabile;
	}
	public void setCodResponsabile(Integer codResponsabile) {
		this.codResponsabile = codResponsabile;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}	
}
