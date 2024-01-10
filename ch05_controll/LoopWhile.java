package ch05_controll;

import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		// while(조건) 조건이 true이면 반복(무한루프 조심해야함.)
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
			
		}
		int j = 1;
		while(true) {
			System.out.println(j);
			j++;
			if(j==10) {
				break;
			}
		}
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
			System.out.println("====================");
			System.out.println("이름을 입력하세요(종료 q)");
			System.out.println(">>> ");
			String nm = scan.nextLine();
			// equals 문자열이 같은지 비교 숫자와 달리 String은 == (x), equals
			if(nm.equals("q")) {
				flag = false;
				System.out.println("종료 하겠습니다.");
			}else {
				System.out.println(nm + "님 환영합니다");
			}
			System.out.println("====================");
		}
		
		//do-while 문
		//최소 한번은 실행
		boolean isRun = false;
		do {
			System.out.println("hi"); //최초 1번은 실행
		}while(isRun);
		
		//반복문 Label 활용
		int x = 0;
		outerLoop : while(x < 5) {
			int y = 0;
			while(y < 5) {
				if(x * y >6) {
					System.out.println("breaking !");
					System.out.println("x:" + x + "y" + y);
//					break; //내부 반복문만 중단되어 다시 메인루프는 진행됨
				}
				y++;
			}
			x++;
		}
		//while 문을 활용하여 구구단 2~9단을 출력
		// 2 ~ 9단 출력 
//				for(int i= 2; i <= 9 ; i++) {
//					System.out.println(i + "단");
//					for(int j = 1; j <= 9 ; j++) {
//						System.out.printf("%d x %d = %d \n", i , j, i * j);
//					}
//				}
	
	    int dan =2;
	    while(dan <=9 ) {
	    	int su =1;
	    	System.out.println(dan + "단");
	    	while(su <=9) {
	    		System.out.printf("%d + %d = %d \n", dan, su, (dan*su));
	    		su++;
	    	}
	    	dan++;
	    }
	
	}

}
