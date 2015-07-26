package com.digitek.ifconditions;

public class IfElseConditions {

	public static void main(String[] args) {
		
		ifElseExample();
		determineGrade();
		
	}
	public static void ifElseExample() {
		
		int value1=2;
		int value2=2;
		
		System.out.println(value1=value2);
	  
		if (value1==value2){
		System.out.println("value1=value2");
		}
		
		if (value1!=value2){
		System.out.println("value1!=value2");
		}
		
		if (value1>=value2){
		System.out.println("value1>=value2");

		}
		
	}
	public static void determineGrade(){
		int marks=60;
		char grade;
		
		if (marks>=90) {
			grade = 'A';
		}else if(marks>=80) {
			grade = 'B';
		}else if (marks>=70) {
			grade = 'C';
		}else if (marks>=60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		System.out.println("Grade is:" + grade);
		
	}

}
