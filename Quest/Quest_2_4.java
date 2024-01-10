package Quest;

public class Quest_2_4 {

	public static void main(String[] args) {
		  int height = 5;  // 트리의 높이

	        // 트리 층별로 반복
	        for (int i = height; i >= 1; i--) {
	            // 현재 층에 '*' 출력
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }

	            // 줄 바꿈
	            System.out.println();
	        }

	}

}
