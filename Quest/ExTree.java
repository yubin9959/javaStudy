package Quest;

public class ExTree {
	public void name(String args) {
		MakeTree(5);
		
	}
	public static void MakeTree(int size){
		//1.입력받은 크기만큼 for문
		for(int i = 0 ; i < size; i ++) {
			   //2. 공백 그리기 4 별 1
			   //           3   3
			   //           2   5
			   //           1   7
			   //           0   9
			for(int j = size - i ; j > 1; j --) {
				System.out.print(" ");
			}
			//3. 별 그리기
			for(int j = 0; j <= 2 * i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//아래쪽도 찍어서 다이아몬드 그리기
		for(int i = size -2; i >= 0; i--) {
			//공백 그리기
			for(int j = size-i; j > 1; j--) {
				System.out.print(" ");
			}
			//별 그리기
			for(int j = 0 ; j <= 2* i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
