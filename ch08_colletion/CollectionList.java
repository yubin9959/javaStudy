package ch08_colletion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CollectionList {

	public static void main(String[] args) {
		/**
		 * 컬렉션 프레임워크는 데이터를 보다 쉽게 다룰 수 있도록
		 * 재사용 가능한 컬렉션 클래스를 제공함.
		 * List, Set, Map
		 * 1.List : 순서대로 객체를 저장하는 구조, 중복된 원소를 허용
		 * 			원소에 접근하기 위해 인덱스를 사용
		 * 			대표적인 ArrayList, LinkdList
		 * 2.set  : 중복을 허용하지 않은 객체의 모음
		 * 			원소의 순서는 보장하지 않음
		 * 			대표 : HashSet, TreeSet
		 * 3.map  : 키와 값의 쌍으로 이루어진 객체를 저장하는 구조
		 * 			키는 중복될 수 없으며
		 * 			각 키는 하나의 값을 가리킴.
		 *          대표 : HashMap, TreeMap			
		 * */ 
		 //ArrayList (동적 배열형태)
		ArrayList<String> student = new ArrayList<>();
	    //ArrayList<String> student = new ArrayList<>(); 오른쪽은 생략가능
		// <> <-- 이 부분은 제네릭(Generic) 이라고함.
		//        코드에서 타입의 안전성을 보장할 수 있으며 불필요한 캐스팅을 줄이기위해.
		// 제네릭은 객체(참조타입)만 담을 수 있음
		// Wrapper Class(기본타입을 객체로 만든 클래스 int, boolean...)
		ArrayList<Integer> intList = new ArrayList<>();
		//list 기본 메서드 .add(요소) 요소 추가시 사용
		intList.add(5);
		intList.add(10);
		System.out.println(intList);
		student.add("펭수");
		student.add("동길");
		System.out.println(student);
		// .get(인덱스) 해당 인덱스 값을 리턴
		System.out.println(intList.get(0));
		System.out.println(student.get(0));
		// .set(인덱스, 값) 해당 인덱스의 값을 변경
		student.set(0, "펭수");
		System.out.println(student);
		// .contains(값) 리스트 안에 해당 값이 존재하면 true, 아닐경우 false 리턴
		System.out.println(student.contains("길동"));
		// .indexOf(값) 리스트 안에 해당 값이 어떤 인덱스에 있는지 리턴 없으면 -1
		System.out.println(student.indexOf("동길"));
		//. isEmpty() 리스트가 비어 있는지 체크 true//fasle
		System.out.println(student.isEmpty());
		// .size() 리스트의 요소 수
		System.out.println(student.size());
		// .remove(값) 해당 값이 있으면 삭제 없으면 아무일도 안일어남
		student.remove("홍길동");
		// .clear() 리스트 비움(size 0됨)
		student.clear();
		System.out.println(student);
		
		student.add("강성준");
		student.add("권보성");
		student.add("권유빈");
		student.add("김기찬");
		student.add("김대영");
		student.add("김동우");
		student.add("김동현");
		student.add("김명기");
		student.add("김영주");
		student.add("김유정");
		student.add("김은혜");
		student.add("김휘건");
		student.add("나항진");
		student.add("문성민");
		student.add("박진기");
		student.add("백현진");
		student.add("오정연");
		student.add("유하영");
		student.add("이예진");
		student.add("이용빈");
		student.add("정유진");
		
		for(int i = 0; i < student.size(); i ++) {
//			System.out.println(student.get(i));
			if(student.contains("김영주")) {
				System.out.println("김영주님의 출석 번호:" + (student.indexOf("김영주") +1) );
				break;
			}
		}
		// 1. 리스트 복사 (얕은 복사)
		ArrayList<String> stu = student;
		System.out.println(stu);
		stu.set(0, "성준");
		System.out.println(stu);
		System.out.println(student);
		
		// 2. 깊은 복사
		ArrayList<String> stu2 = new ArrayList<String>(stu);
		ArrayList<String> stu3 = new ArrayList<>();
		stu3.addAll(stu);
		stu2.add("nick");
		stu3.add("judy");
		System.out.println(stu);
		System.out.println(stu2);
		System.out.println(stu3);
		// 향상된 for문 (값만 필요할때)
		for(String str: student) {
			System.out.println(str);
		}
		// 일반 배열도 가능
		String [] strArr = {"1", "2", "3"};
		for(String str: strArr) {
			System.out.println(str);
		}
		// 값을 주면서 선언
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10,20, 1,2));
		// 컬렉션 sort
		System.out.println(numbers);
		// 정렬 오름차순
		Collections.sort(numbers);
		System.out.println(numbers);
		// 정렬 내림차순
		Collections.sort(numbers, Collections.reverseOrder());
		System.out.println(numbers);
	}

}
