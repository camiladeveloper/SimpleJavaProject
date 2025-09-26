package Java_JDBC;

import java.util.*;

import java.sql.*;
import java.sql.Date;

public class Autor {
	private int id;
	private String nome;
	private java.sql.Date dataNasc;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public java.sql.Date getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(java.sql.Date dataNasc) {
		this.dataNasc = dataNasc;
	}
//	public Autor(int id, String nome, Date dataNasc) {
//		super();
//		this.id = id;
//		this.nome = nome;
//		this.dataNasc = dataNasc;
//	}


}
