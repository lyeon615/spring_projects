package com.javalec.ex;

public class MyGrade {
	private Grade grade;
	private int math;
	private int english;
	private int korean;
	
	public void myGrade() {
		System.out.print("수학 ");
		grade.grade(math);
		System.out.print("영어 ");
		grade.grade(english);
		System.out.print("국어 ");
		grade.grade(korean);
	}
	
	public Grade getGrade() {
		return grade;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getKorean() {
		return korean;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	
}
