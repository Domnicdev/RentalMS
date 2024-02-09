package com.rms.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rms.bean.Review;

import com.rms.service.ReviewService;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class ReviewController {

	@Autowired
	ReviewService service;

	@PostMapping("/PerformReviewInsert")
	public void performAddReview(@RequestBody Review review) {
		service.addReview(review);

	}

	@DeleteMapping("PerformDeleteHouse/{reviewId}")
	public String performDelete(@PathVariable("reviewId") long reviewId) {
		service.deleteReview(reviewId);
		return "Record Deleted";
	}

	@GetMapping("PerformViewHouseReview/{reviewId}")
	public Review performView(@PathVariable("reviewId") long reviewId) {
		return service.viewReview(reviewId);
	}
	
	@GetMapping("ViewAllReviews")
	public List<Review> viewAllHouse() {
		Iterator<Review> it = service.viewAllReviews().iterator();
		List<Review> list = new ArrayList<>();
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}

}
