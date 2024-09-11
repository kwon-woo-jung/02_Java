package edu.kh.poly.ex1.model.dto;

public class Spark extends Car{ // 경차
	
	private double discountOffer; // 할인혜택
	
	// 기본생성자
	public Spark() {}

	
	// 매개변수생성자 + 부모
	public Spark(double discountOffer) {
		super();
		this.discountOffer = discountOffer;
	}



	
	// getter/setter

	public double getDiscountOffer() {
		return discountOffer;
	}


	public void setDiscountOffer(double discountOffer) {
		this.discountOffer = discountOffer;
	}
	
	
	
	// Car.to String() 오버라이딩
	
}
