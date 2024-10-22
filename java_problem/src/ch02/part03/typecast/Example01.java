package ch02.part03.typecast;
/**
 * 아래 작성된 코드는 에러가 발생합니다.
 * 에러가 나는 코드를 수정하여
 * 정상적으로 해당 println()문이 실행되도록 하세요.
 */
public class Example01 {
	public static void main(String[] args) {
		byte byteValue = 65;
		char result1 = byteValue;  // error
		
		System.out.println(result1);
		
		char charValue = 'B';
		short result2 = charValue;  // error
		
		System.out.println(result2);
		
		float floatValue = 3.14f;
		int result3 = floatValue;  // error
		
		System.out.println(result3);
	}
}
