package Quest;

public class Quest2_3 {

	public static void main(String[] args) {
	     String findWally = "윌리울리일리울리울리일리월리일리윌리월리울리일리일리월리일리윌리일리윌리일리월리월리윌리울리윌리울리일리울리울리윌리일리";

	        // "월리" 문자열 카운트
	        int wallyCount = 0;

	        // 문자열을 순회하면서 "월리"를 찾음
	        for (int i = 0; i < findWally.length() - 1; i++) {
	            if (findWally.substring(i, i + 2).equals("월리")) {
	                wallyCount++;
	            }
	        }

	        // 결과 출력
	        System.out.println("결과: " + wallyCount);

	}

}
