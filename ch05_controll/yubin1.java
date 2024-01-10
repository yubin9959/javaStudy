package ch05_controll;

import java.util.Scanner;

public class yubin1 {

	public static void main(String[] args) {
	       Scanner scan = new Scanner(System.in);
	       
	       System.out.println("국어 점수를 입력해주세요.");
	       int KoreanScore = scan.nextInt();
	       
	       System.out.println("영어 점수를 입력해주세요.");
	       int EnglishScore = scan.nextInt();
	       
	       System.out.println("수학 점수를 입력해주세요.");
	       int mathScore = scan.nextInt();
	       
	       double avarage = (KoreanScore + EnglishScore + mathScore) / 3.0;
	       
	   	   String grade;
	   	   
	   	   if(avarage >= 90) {
	   		   grade = "A";
	   	   }else if(avarage >= 80) {
	   		   grade = "B";
	   	   }else if(avarage >= 70) {
	   		   grade = "C";
	   	   }else {
	   		   grade = "D";
	   	   }
	   	   
	   	   System.out.println("평균:" + avarage);
	       System.out.println("등급:" + grade + " 등급");
	       
	       scan.close();
	       
	}

}
