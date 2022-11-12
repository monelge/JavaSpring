package com.cretech.bys.webapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cretech.bys.bussines.abstracts.PersonelService;
import com.cretech.bys.entities.concretes.Personel;

@RestController
@RequestMapping("/api/personels")
public class PersonelsContoller {

	private PersonelService personelService;

	@Autowired
	public PersonelsContoller(PersonelService personelService) {
		this.personelService = personelService;
	}

	@GetMapping("/getAll")
	public List<Personel> getAll() {
		return personelService.getAll();
	}
}
