package ch02.part03.typecast;
/**
 * 아래와 같이 변수 4개를 선언하고 값을 초기화한 경우
 * 변수들을 기반으로 '10숫자결합6.75'을 출력할 수 있도록
 * 코드를 수정하세요.
 */
public class Example04 {
	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		double c = 4.75;
		String str = "숫자결합";
		
		String result = a + str + b + c;   // 코드 수정
		System.out.println(result);
	}
}
