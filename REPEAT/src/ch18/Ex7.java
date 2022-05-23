package ch18;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;


public class Ex7 {
	public static void main(String[] args) {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			//정수는 이상하게 방출) 문자처리해서 그런가?
			bw.write("안녕");
			bw.newLine();
			bw.write("Hello java");
			
			bw.flush(); //방출

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
