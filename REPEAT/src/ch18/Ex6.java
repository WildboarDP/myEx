package ch18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex6 {
	//입력버퍼로 값을 반복적으로 처리받아 출력해보기
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			
			System.out.println("입력하세요.");
			
			while(true) {
				String input = br.readLine(); //문자열 읽어오기
				if(input == null) break;//문자열에 아무것도 없으면 
				System.out.println(input);
				bw.write(input + "\r\n");
				bw.flush();//출력
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
