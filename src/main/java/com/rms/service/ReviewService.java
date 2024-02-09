package com.rms.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rms.bean.Review;
import com.rms.repo.ReviewRepo;

@Service
public class ReviewService {

	@Autowired
	ReviewRepo repo;
	
	public boolean addReview(Review review) {
		repo.save(review);
		return true;
		
	}
	
	public boolean deleteReview(long reviewId) {
		repo.deleteById(reviewId);
		return true;

	}

	public Review viewReview(long reviewId) {
		
		return repo.findById(reviewId).get();
		
	}
	
	public List<Review> viewAllReviews(){
		Iterator<Review> it=repo.findAll().iterator();
		 List<Review> list=new ArrayList<>();
	        while (it.hasNext()) {
	            list.add(it.next());
	        }
	        return list;
	}
	
}
