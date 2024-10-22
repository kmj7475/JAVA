package ch02.part03.typecast;
/**
 * 아래와 같이 변수 4개를 선언하고 값을 초기화한 경우
 * 변수들을 기반으로 연산한 결과를 출력할 수 있도록
 * 코드를 수정하세요.
 */
public class Example02 {
	public static void main(String[] args) {
		int x = 100;
		long y = 140L;
		float f = 3.14F;
		double d = 10.15;
		
		int result1 = x + y + f;	// 코드 수정
		System.out.println(result1);
		int result2 = y + f + d;	// 코드 수정
		System.out.println(result2);
	}
}
