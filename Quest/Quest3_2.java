package Quest;
import java.util.Scanner;
public class Quest3_2 {
	
public static void main(String[] args) {

	  // 사용자에게 문자열 입력 받기
    Scanner scanner = new Scanner(System.in);
    System.out.print("문자열을 입력하세요: ");
    String inputString = scanner.nextLine();

    // 뒤집힌 문자열 계산
    String reversedString = reverse(inputString);

    // 결과 출력
    System.out.println("뒤집힌 문자열: " + reversedString);

    // Scanner 닫기
    scanner.close();
}

	// 문자열 뒤집기 메서드
	public static String reverse(String str) {
    char[] charArray = str.toCharArray();
    int left = 0;
    int right = charArray.length - 1;

    while (left < right) {
        // 왼쪽과 오른쪽의 문자 교환
        char temp = charArray[left];
        charArray[left] = charArray[right];
        charArray[right] = temp;

        // 인덱스 이동
        left++;
        right--;
    }

    // char 배열을 문자열로 변환하여 반환
    return new String(charArray);

	
 }
}