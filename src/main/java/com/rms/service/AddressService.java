package com.rms.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.rms.bean.Address;
import com.rms.repo.AddressRepo;

@Service
public class AddressService {

	@Autowired
	AddressRepo repo;
	
	public boolean addAddress(Address address) {
		repo.save(address);
		return true;
		
	}
	
	public String updateAddress(Address address) {
		repo.save(address);
		return "Updated";

	}
	
	public String deleteAddress(long addressId) {
		repo.deleteById(addressId);
		return "Record Deleted";
	}
	
	
	public Address viewAddress(long addressId) {
	
		return repo.findById(addressId).get();
	}
	public List<Address> viewAllAddress(){
		Iterator<Address> it=repo.findAll().iterator();
		 List<Address> list=new ArrayList<>();
	        while (it.hasNext()) {
	            list.add(it.next());
	        }
	        return list;
	}
	
}
