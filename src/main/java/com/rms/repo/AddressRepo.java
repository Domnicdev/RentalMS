package com.rms.repo;

import org.springframework.data.repository.CrudRepository;

import com.rms.bean.Address;

public interface AddressRepo extends CrudRepository<Address, Long>{

}
