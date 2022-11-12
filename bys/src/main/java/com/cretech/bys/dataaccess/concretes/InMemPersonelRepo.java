package com.cretech.bys.dataaccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cretech.bys.dataaccess.abstracts.PersonelRepository;
import com.cretech.bys.entities.concretes.Personel;

@Repository
public class InMemPersonelRepo implements PersonelRepository {

	List<Personel> personels;

	public InMemPersonelRepo() {
		personels = new ArrayList<Personel>();
		personels.add(new Personel(1,"Mehmet", "ÖNELGE"));
		personels.add(new Personel(1,"Mert", "ÖNELGE"));
		personels.add(new Personel(1,"Mete", "ÖNELGE"));
		personels.add(new Personel(1,"Melih", "ÖNELGE"));
	}

	@Override
	public List<Personel> getAll() {
		return personels;
	}

}
