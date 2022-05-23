package ch18;

import java.io.OutputStream;
import java.io.PrintStream;

public class Ex4 {
	
	public static void main(String[] args) {
		//Output예제
		//outputStream을 통해 출력하는 연습
		//콘솔창에 별도로 출력하기 위한 스트림
		PrintStream ps = System.out;
		OutputStream os = ps;
		//부모인 OutputStream에 PrintStream 받아줌
		try {
			//외부로 출력
			os.write(97);//문자가 출력됨
			os.write(98);
			os.write(99);
			os.flush(); //방출하는 메소드
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
