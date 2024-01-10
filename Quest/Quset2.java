package Quest;

import java.util.Scanner;

public class Quset2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	  
		System.out.println("국어 점수를 입력하세요");
		int koreanScore = scan.nextInt();
		
		System.out.println("영어 점수를 입력하세요");
		int englistScore = scan.nextInt();
		
		System.out.println("수학 점수를 입력하세요");
		int mathScore = scan.nextInt();
		
		//평균
		double avarage = (koreanScore + englistScore + mathScore) / 3.0;
		
		String grade;
		if(avarage >= 90) {
			grade = "A";
		}else if(avarage >= 80){
			grade = "B";
		}else if(avarage >= 70) {
			grade = "C";
		}else {
			grade = "D";
		}
		
		System.out.println("평균점수:" + avarage);
		System.out.println("등급" + grade);
		
		scan.close();
		
	}

}
