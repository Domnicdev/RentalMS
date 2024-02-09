package com.rms.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rms.bean.PayRent;
import com.rms.repo.PayRentRepo;

@Service
public class PayRentService {

	@Autowired
	PayRentRepo repo;

	public boolean addRentPayment( PayRent payrent) {
		repo.save(payrent);
		return true;
		
	}
	
	public boolean updateRentPayment( PayRent payrent) {
		repo.save(payrent);
		return true;

	}
	
	public List<PayRent> viewAllRentPayments(){
		Iterator<PayRent> it=repo.findAll().iterator();
		 List<PayRent> list=new ArrayList<>();
	        while (it.hasNext()) {
	            list.add(it.next());
	        }
	        return list;
	}
	
}
