package ch02.part04.systemIO;

import java.util.Scanner;

/**
 * 해당 코드를 실행하고
 * 차례대로 이름과 생년월일을 입력하면 
 * 아래의 예시처럼 정해진 포맷으로 출력하도록 코드를 수정하세요.
 * 
 * '홍길동'과 '211004'를 순서대로 입력할 경우
 * 각각 '01 | 성함이 홍길동인 사람의', '2 | 생년월일은 211004입니다.'이 출력됩니다.
 * 
 * '이한'과 '240514'를 순서대로 입력할 경우
 * 각각 '01 | 성함이   이한인 사람의', '2 | 생년월일은 240514입니다.'이 출력됩니다.
 */
public class Example01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int no = 0;
		String inputData;

		inputData = scanner.nextLine();
		System.out.printf("여기를 수정하세요", ++no, inputData); // 코드 수정		
		inputData = scanner.nextLine();
		System.out.println( ++no + "여기를 수정하세요"); 		   // 코드 수정
		
		scanner.close();
	}
}
