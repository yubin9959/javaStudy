package ch06_method;


public class RecursionMain {

	public static void main(String[] args) {

		Func(5);
		System.out.println(factorial(4));
		System.out.println(factorial(10));
		System.out.println(factorial(15));
		
		System.out.println(recFactorial(4));
		System.out.println(recFactorial(10));
		System.out.println(recFactorial(15));
		
		makeCrad("펭수", 80, 70, 60);
		makeCrad("펭수", 80, 70, 60);
		
		

		
	}
	// 재귀 함수
	public static void Func(int num) {
		//재귀함수는 멈추는게 중요 (잘못작성하면 무한루프)
		if(num == 0) {
			return;
		}else {
			System.out.println("hi");
			//자신을 호출
			Func(num -1);
		}
	}
	// factorial
	public static long factorial(int num) {
		long sum = 1;
		for(int i = 1 ; i <= num; i++) {
			sum *=i;
		}
		return sum;
	
	}
	// 재귀함수 활용
	public static long recFactorial(int num) {
		if(num == 1) {
			return 1;
		}
		/* 3을 입력 받았다면
		 * 3* reFactorial(2)
		 * 3* 2* reFactorial(1)
		 * */
		return num * recFactorial(num-1);
	}
	
	// 이름 , 국어점수, 수학점수, 영어점수를 입력받아
	// 평균과 등급을 출력하는 메소드를 작성하시오
	// input : String, int, int, int
	// output : X없음
	// 평균이 90 이상 A, 80 이상 B, 나머지 C
	// X님의 평균은 (소수점2째자리 까지출력)으로 y등급입니다. 출력
	
	public static void makeCrad(String nm, int kor, int math, int eng) {
		System.out.println("이름:" + nm);
		System.out.println("국어:" + kor);
		System.out.println("수학:" + math);
		System.out.println("영어:" + eng);
		double avg = (kor + math + eng) / 3.0;
		String grade = "C";
		if(avg >= 90) {
			grade ="A";
		}else if(avg >= 80) {
			grade ="B";
		}
		System.out.printf("%s 님의 평균은 %.2f으로 %s등급 입니다.",nm, avg, grade);
		
	}
}
