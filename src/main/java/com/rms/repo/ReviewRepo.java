package com.rms.repo;

import org.springframework.data.repository.CrudRepository;

import com.rms.bean.Review;

public interface ReviewRepo extends CrudRepository<Review, Long> {

}
