package com.javalec.ex;

public class Grade {
	
	private int first;
	private int second;
	private int third;
	private int fourth;
	
	public void grade(int num) {
	
		System.out.print("성적은 ");
		if(num > first) {
			System.out.println("수입니다.");
		} else if(num > second) {
			System.out.println("우입니다.");	
		} else if(num > third) {
			System.out.println("미입니다.");	
		} else if(num > fourth) {
			System.out.println("양입니다.");	
		} else {
			System.out.println("가입니다.");	
		}
	}

	public int getFirst() {
		return first;
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public int getThird() {
		return third;
	}

	public void setThird(int third) {
		this.third = third;
	}

	public int getFourth() {
		return fourth;
	}

	public void setFourth(int fourth) {
		this.fourth = fourth;
	}

}
