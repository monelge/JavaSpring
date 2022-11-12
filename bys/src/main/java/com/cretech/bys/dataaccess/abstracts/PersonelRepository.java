package com.cretech.bys.dataaccess.abstracts;

import java.util.List;
import com.cretech.bys.entities.concretes.Personel;

public interface PersonelRepository {
	
	List<Personel> getAll();
	
}
