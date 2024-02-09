package com.rms.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.rms.bean.Payment;

public interface PaymentRepo extends CrudRepository<Payment, Long> {

	@Query(value = "select * from tbl_payment where due_amount=0", nativeQuery = true)
	List<Payment> viewAllPaidTenants();

	@Query(value = "select * from tbl_payment where due_amount>0", nativeQuery = true)
	List<Payment> viewAllNonPaidTenants();

	@Query(value = "select * from tbl_users where user_id in (select user_id from tbl_payment where due_amount > 0)", nativeQuery = true)
	List<Payment> viewNonPaidTenantDetail();
}
