package com.rms.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.rms.bean.Payment;
import com.rms.repo.PaymentRepo;

@Service
public class PaymentService {

	@Autowired
	PaymentRepo repo;

	public String addPayment( Payment payment) {
		repo.save(payment);
		return"Record Inserted";
		
	}
	
	public boolean updatePayment(Payment payment) {
		repo.save(payment);
		return true;

	}

	public List<Payment> viewAllPaidTenants(){
		Iterator<Payment> it=repo.viewAllPaidTenants().iterator();
		 List<Payment> list=new ArrayList<>();
	        while (it.hasNext()) {
	            list.add(it.next());
	        }
	        return list;
	}
	
	public List<Payment> viewAllNonPaidTenants(){
		Iterator<Payment> it=repo.viewAllNonPaidTenants().iterator();
		 List<Payment> list=new ArrayList<>();
	        while (it.hasNext()) {
	            list.add(it.next());
	        }
	        return list;
	}
	
	public List<Payment> viewNonPaidTenantDetails(){
		Iterator<Payment> it=repo.viewNonPaidTenantDetail().iterator();
		 List<Payment> list=new ArrayList<>();
	        while (it.hasNext()) {
	            list.add(it.next());
	        }
	        return list;
	}
	
	public List<Payment> viewAllStatus(){
		Iterator<Payment> it=repo.findAll().iterator();
		 List<Payment> list=new ArrayList<>();
	        while (it.hasNext()) {
	            list.add(it.next());
	        }
	        return list;
	}

	
}
