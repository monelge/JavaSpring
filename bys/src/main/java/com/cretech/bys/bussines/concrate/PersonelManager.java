package com.cretech.bys.bussines.concrate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cretech.bys.bussines.abstracts.PersonelService;
import com.cretech.bys.dataaccess.abstracts.PersonelRepository;
import com.cretech.bys.entities.concretes.Personel;

@Service
public class PersonelManager implements PersonelService {
	private PersonelRepository personelRepository;

	@Autowired
	public PersonelManager(PersonelRepository personelRepository) {
		this.personelRepository = personelRepository;
	}

	@Override
	public List<Personel> getAll() {
		return personelRepository.getAll();
	}

}
