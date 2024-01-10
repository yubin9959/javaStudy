package Quest;

public class Quest3_4 {
	  public static void main(String[] args) {
	        int height = 5; // 트리의 높이 설정

	        printInvertedChristmasTree(height);
	    }

	    public static void printInvertedChristmasTree(int height) {
	        for (int i = height; i > 0; i--) {
	            // 각 층의 공백 출력
	            for (int j = 0; j < height - i; j++) {
	                System.out.print(" ");
	            }

	            // 각 층의 별 출력
	            for (int k = 0; k < 2 * i - 1; k++) {
	                System.out.print("*");
	            }

	            // 다음 줄로 이동
	            System.out.println();
	        }
	    }

}
