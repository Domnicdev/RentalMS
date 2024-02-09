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

import com.rms.bean.Payment;
import com.rms.service.PaymentService;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class PaymentController {

	@Autowired
	PaymentService service;

	@PostMapping("PerformPaymentInsert")
	public String performInsert(@RequestBody Payment payment) {
		service.addPayment(payment);
		return "Record Inserted";

	}

	@PutMapping("PerformPaymentUpdate")
	public String performUpdate(@RequestBody Payment payment) {
		service.updatePayment(payment);
		return "Record Updated";

	}

	@GetMapping("ViewAllPaidTenants")
	public List<Payment> viewAllPaidTenants() {
		Iterator<Payment> it = service.viewAllPaidTenants().iterator();
		List<Payment> list = new ArrayList<>();
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}

	@GetMapping("ViewAllNotPaidTenants")
	public List<Payment> viewAllNonPaidTenants() {
		Iterator<Payment> it = service.viewAllNonPaidTenants().iterator();
		List<Payment> list = new ArrayList<>();
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}

	@GetMapping("ViewNotPaidTenantDetails")
	public List<Payment> viewNonPaidTenantDetails() {
		return service.viewNonPaidTenantDetails();
	}

	@GetMapping("ViewAllStatus")
	public List<Payment> viewAllHouse() {
		Iterator<Payment> it = service.viewAllStatus().iterator();
		List<Payment> list = new ArrayList<>();
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}

}
