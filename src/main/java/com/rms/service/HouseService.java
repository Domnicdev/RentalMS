package com.rms.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.rms.bean.House;
import com.rms.repo.HouseRepo;

@Service
public class HouseService {
	@Autowired
	HouseRepo repo;
	
	public boolean addHouse(House house) {
		repo.save(house);
		return true;
		
	}
	
	public boolean updateHouse( House house) {
		repo.save(house);
		return true;

	}
	
	public boolean deleteHouse(long houseId) {
		repo.deleteById(houseId);
		return true;
	}
	
	public House viewHouse(long houseId) {
		
		return repo.findById(houseId).get();
	}
	public List<House> viewAllHouse(){
		Iterator<House> it=repo.findAll().iterator();
		 List<House> list=new ArrayList<>();
	        while (it.hasNext()) {
	            list.add(it.next());
	        }
	        return list;
	}
}
