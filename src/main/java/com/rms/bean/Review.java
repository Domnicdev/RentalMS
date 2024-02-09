package com.rms.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_review")
public class Review {

	@Id
	@Column(name = "review_id")
	private long reviewId;
	@Column(name = "user_review", nullable = false)
	private String userReview;
	@Column(name = "house_id", nullable = false)
	private long houseId;

	public Review(long reviewId, String userReview, long houseId) {
		super();
		this.reviewId = reviewId;
		this.userReview = userReview;
		this.houseId = houseId;
	}

	public Review() {
		super();
	}

	public long getReviewId() {
		return reviewId;
	}

	public void setReviewId(long reviewId) {
		this.reviewId = reviewId;
	}

	public String getUserReview() {
		return userReview;
	}

	public void setUserReview(String userReview) {
		this.userReview = userReview;
	}

	public long getHouseId() {
		return houseId;
	}

	public void setHouseId(long houseId) {
		this.houseId = houseId;
	}

	@Override
	public String toString() {
		return "Review [reviewId=" + reviewId + ", userReview=" + userReview + ", houseId=" + houseId + "]";
	}

}
