package ch18;

import java.io.InputStreamReader;

public class Ex2 {
//InputStream,OutputStream은 1바이트로 처리되지만
//Reader,Writer는 문자기반 스트림으로 2바이트 이상 처리
//Reader는 특정 인코딩을 읽어 유니코드로 변환
//Writer는 유니코드를 특정 인코딩으로 변환하여 저장
	
	public static void main(String[] args) {
		int var = 0; //받아줄 변수 지정
		
		//문자 보조 스트림(기반스트림)
		InputStreamReader isr = new InputStreamReader(System.in);
		
		try {
			System.out.println("입력하세요.");
			while(true) {
			var = isr.read();
			if(var == 13) break;
			System.out.println(var+"==>"+(char)var);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
