package Quest;

public class Quest3_1 {

	 public static void main(String[] args) {
	        // 룰렛이 힘차게 돌았던 각도
	        int rotatedAngle = 5834;

	        // 메서드 호출하여 결과 출력
	        spinRoulette(rotatedAngle);
	    }

	    public static void spinRoulette(int rotatedAngle) {
	        // 한 바퀴의 각도
	        int fullRotationAngle = 360;

	        // 총 몇 바퀴 돌아갔는지 계산
	        int totalRotations = rotatedAngle / fullRotationAngle;

	        // 룰렛이 멈춘 각도 계산
	        int stoppedAngle = rotatedAngle % fullRotationAngle;

	        // 경품 조건에 따라 출력
	        if (stoppedAngle >= 0 && stoppedAngle < 60) {
	            System.out.println("경품: 사탕");
	        } else if (stoppedAngle >= 60 && stoppedAngle < 120) {
	            System.out.println("경품: 초콜릿");
	        } else if (stoppedAngle >= 120 && stoppedAngle < 180) {
	            System.out.println("경품: 쿠키");
	        } else if (stoppedAngle >= 180 && stoppedAngle < 240) {
	            System.out.println("경품: 콜라");
	        } else if (stoppedAngle >= 240 && stoppedAngle < 300) {
	            System.out.println("경품: 아이스크림");
	        } else if (stoppedAngle >= 300 && stoppedAngle < 360) {
	            System.out.println("경품: 커피");
	        }

	        // 총 몇 바퀴 돌아갔는지 출력
	        System.out.println("총 돌아간 바퀴의 수는: " + totalRotations + " 바퀴");
	    }
	}
