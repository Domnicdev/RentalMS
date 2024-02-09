package com.rms.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rms.bean.House;

import com.rms.service.HouseService;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class HouseController {

	@Autowired
	HouseService service;

	@PostMapping("PerformHouseInsert")
	public String performInsert(@RequestBody House house) {
		service.addHouse(house);
		return "Record Inserted";

	}

	@PutMapping("PerformHouseUpdate")
	public String performUpdate(@RequestBody House house) {
		service.updateHouse(house);
		return "Record Updated";

	}

	@DeleteMapping("PerformHouseDelete/{houseId}")
	public String performDelete(@PathVariable("houseId") long houseId) {
		service.deleteHouse(houseId);
		return "Record Deleted";
	}

	@GetMapping("PerformHouseView/{houseId}")
	public House performView(@PathVariable("houseId") long houseId) {

		return service.viewHouse(houseId);
	}

	@GetMapping("ViewAllHouse")
	public List<House> viewAllHouse() {
		Iterator<House> it = service.viewAllHouse().iterator();
		List<House> list = new ArrayList<>();
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
}
