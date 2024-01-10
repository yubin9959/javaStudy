package Quest;

import java.util.Iterator;
import java.util.Scanner;

public class Result04 {

	public static void main(String[] args) {
		// 1 ~ 50 사이의 랜덤함 수 생성
		// 업다운 게임을 만들어보세
		while(true){
		for(int i = 1 ; i <= 50; i++) {
		int randInt = (int) (Math.random() * 50 + 1);
		
		// 5번의 기회
		for(int attempt = 1; attempt <= 5; attempt ++) {
			System.out.println("숫자를 입력해주세요 :");
			
        // 사용자 입력 받기
            Scanner scan = new Scanner(System.in);
            int guess = scan.nextInt();
       
       // 입력한 숫자에 대해 업다운 알림 출력
          if(guess == randInt) {
        	  System.out.println("정답입니다!");
        	  break;
          } else if (guess < randInt) {
			  System.out.println("업!! 기회가 " + (5 - attempt) + "번 남았습니다. ");
          } else {
			  System.out.println("다운!! 기회가 " + (5 - attempt) + "번 남았습니다. ");
          }
          
       // 5번의 기회가 끝낫을때 실패 메시지
          if(attempt == 5) {
        	  System.out.println("실패하였습니다. 정답은 " + guess + "입니다. ");
        	  
          			}
		 		}
			}
		}
	}
}
