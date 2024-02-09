package com.rms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rms.bean.PayRent;

@Repository
public interface PayRentRepo extends  JpaRepository<PayRent, Long> {

}
