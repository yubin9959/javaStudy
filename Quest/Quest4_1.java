package Quest;

import java.util.Random;
import java.util.Scanner;

public class Quest4_1 {

	   public static void main(String[] args) {
	        // 1부터 50까지의 랜덤한 수 생성
	        Random random = new Random();
	        int change = random.nextInt(50) + 1;

	        // 사용자에게 5번의 기회 제공
	        for (int attempt = 1; attempt <= 5; attempt++) {
	            System.out.print("숫자를 입력해주세요 : ");

	            // 사용자 입력 받기
	            Scanner scanner = new Scanner(System.in);
	            int guess = scanner.nextInt();

	            // 입력한 숫자에 대한 업다운 알림 출력
	            if (guess == change) {
	                System.out.println("정답입니다!");
	                break;
	            } else if (guess < change) {
	                System.out.println("업!! 기회가 " + (5 - attempt) + "번 남았습니다.");
	            } else {
	                System.out.println("다운!! 기회가 " + (5 - attempt) + "번 남았습니다.");
	            }

	            // 5번의 기회가 끝났을 때 실패 메시지 출력
	            if (attempt == 5) {
	                System.out.println("실패하였습니다. 정답은 " + change + "입니다.");
	            }
	        }
	    }
	}