package com.rms.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rms.bean.PayRent;
import com.rms.service.PayRentService;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class PayRentController {

	
	@Autowired
	PayRentService service;

	@PostMapping("PerformRentPaymentInsert")
	public String performInsert(@RequestBody PayRent payrent) {
		service.addRentPayment(payrent);
		return "Record Inserted";

	}
	
	@PutMapping("PerformRentPaymentUpdate")
	public String performUpdate(@RequestBody PayRent payrent) {
		service.updateRentPayment(payrent);
		return "Record Updated";

	}
	
	@GetMapping("ViewAllRentPayment")
	public List<PayRent> viewAllPayments() {
		Iterator<PayRent> it = service.viewAllRentPayments().iterator();
		List<PayRent> list = new ArrayList<>();
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
}
