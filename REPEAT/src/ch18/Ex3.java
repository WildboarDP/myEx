package ch18;

import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex3 {
	public static void main(String[] args) {
		//InputStream 변수에 대표적인 입력을 넣어준다.
		//문자처리해주는 InputStreamReader 변수를 만든다.
		//받아온 값을 출력한다.
		
		InputStream is = System.in;
		//public static InputStream in;
		//인풋스트림 타입의 static 변수 in(1바이트 처리)
		
		//문자처리로 변환
		InputStreamReader isr = new InputStreamReader(is);
		
		try {
			System.out.println("한글자를 입력하세요.");
			while(true) {
				int var = isr.read();
				char ch = (char)var;
				if(var == 13) break;
				System.out.println(var);
				System.out.println(ch);
			}
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
