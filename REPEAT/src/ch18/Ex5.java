package ch18;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class Ex5 {
	public static void main(String[] args) {
		//바이트 단위가 아닌 OutputStreamWriter활용해보기
		
		//똑같은 로직으로 보조스트림이므로 기반스트림이 안에 들어가야하고,
		//바깥으로 출력하면 된다.
		
		PrintStream ps = System.out;
		OutputStream os = ps;
		OutputStreamWriter osw = new OutputStreamWriter(os);
		
		try {
			osw.write("냐용");
			osw.write(44032);//문자로 출력된다. 콘솔창에.
			osw.flush();//출력
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
}
