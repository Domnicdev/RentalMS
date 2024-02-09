package com.rms.repo;

import org.springframework.data.repository.CrudRepository;

import com.rms.bean.House;

public interface HouseRepo extends CrudRepository<House, Long> {

}
