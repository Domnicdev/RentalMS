package com.rms.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rms.bean.Address;

import com.rms.service.AddressService;

@RestController
public class AddressController {

	@Autowired
	AddressService service;

	@PostMapping("PerformAddressInsert")
	public String performInsert(@RequestBody Address address) {
		service.addAddress(address);
		return "Record Inserted";

	}

	@PutMapping("PerformAddressUpdate")
	public String performUpdate(@RequestBody Address address) {
		service.updateAddress(address);
		return "Record Updated";

	}

	@DeleteMapping("PerformAddressDelete/{addressId}")
	public String performDelete(@PathVariable("addressId") long addressId) {
		service.deleteAddress(addressId);
		return "Record Deleted";
	}

	@GetMapping("PerformAddressView/{addressId}")
	public Address performView(@PathVariable("addressId") long addressId) {
		return service.viewAddress(addressId);
		
	}

	@GetMapping("ViewAllAddress")
	public List<Address> viewAllAddress() {
		Iterator<Address> it = service.viewAllAddress().iterator();
		List<Address> list = new ArrayList<>();
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}

}
