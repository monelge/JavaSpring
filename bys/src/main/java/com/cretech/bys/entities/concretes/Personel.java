package com.cretech.bys.entities.concretes;

public class Personel {

	private int id;
	private String Adi;
	private String Soyadi;
	
	public Personel() {
	}

	public Personel(int id, String adi, String soyadi) {
		this.id = id;
		Adi = adi;
		Soyadi = soyadi;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdi() {
		return Adi;
	}

	public void setAdi(String adi) {
		Adi = adi;
	}

	public String getSoyadi() {
		return Soyadi;
	}

	public void setSoyadi(String soyadi) {
		Soyadi = soyadi;
	}
	
}
