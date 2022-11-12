package com.cretech.bys.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "Employee")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PerID")
	private int PerID;
	
	@Column(name = "Adi")
	private String Adi;
	
	@Column(name = "Soyadi")
	private String Soyadi;
	
	@Column(name = "TcNo")
	private int TcNo;
	
	@Column(name = "Telefon")
	private int Telefon;
	
	@Column(name = "Adres")
	private String Adres;
	
	@Column(name = "DogTar")
	private java.sql.Date DogTar;
	
	@Column(name = "UnitID")
	private int UnitID;
	
	@Column(name = "UserName")
	private String UserName;
	
	@Column(name = "Pass")
	private String Pass;
	
	@Column(name = "StartWorkDate")
	private java.sql.Date StartWorkDate;
	
	@Column(name = "CreateDate")
	private java.sql.Date CreateDate;
	
	@Column(name = "Guid")
	private String Guid;
}
