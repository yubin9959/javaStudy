package ch04_operator;

import java.util.Scanner;

public class operatorEx {

	public static void main(String[] args) {
		
		// 사용자에게 이메일 주소를 입력받고 @가 포함되어 있을경우 
		// (사용가능) 없을경우 (이메일형식이 아님)을 출력하시오 
		// ex) indexOf는 대상문자열이 없을경우 -1 있을경우는 인덱스값을 반환함.
		
		//1.Scanner 생성
		//2.email입력 메세지 출력
		//3.입력받은 데이터를 가지고 비교 조건식작성
		//4.결과 출력
		Scanner scan = new Scanner(System.in);
		System.out.println("email을 입력하시오");
		System.out.print(">>> ");
		String email = scan.nextLine();
		String msg = (email.indexOf("@") == -1) ? ("이메일 형식이 아님"):("사용가능");
		System.out.printf("고객님의 입력:%s 은 %s 합니다.", email, msg);
	}

}
