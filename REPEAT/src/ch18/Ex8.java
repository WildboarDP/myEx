package ch18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex8 {
	public static void main(String[] args) {
		
		FileWriter fw = null;
		InputStreamReader isr = new InputStreamReader(System.in);
		
		BufferedWriter bw = null;
		BufferedReader br = null;
		
		try {
			fw = new FileWriter("c:\\test\\aba.txt");
			//새로 파일만들 , 파일을 쓸 아웃스트림 만들었다.
			System.out.println("입력하세요.");
			//입력받은 값을 파일에 써서 출력할 예정
			br = new BufferedReader(new FileReader("c:\\test\\aba.txt"));
			bw = new BufferedWriter(new FileWriter("c:\\test\\bbb.txt"));
			//읽어와서 출력할 것이다.
			
			while(true) { //를 반복
			int var = isr.read(); //한 바이트씩 읽어드리는 것
			if(var == 13) break;
			fw.write(var); //읽은 것 출력
			fw.flush();
						
			}
			System.out.println("저장완료");
			
			while(true) {
				String line = br.readLine();
				if(line == null) break;
				bw.write(line + "\r\n");
			}
			System.out.println("복사완");
	
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(br!=null)
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(bw!=null)
				try {
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		
		//이 파일을 복사하겠다는 건 => 
		//파일의 내용을 읽어드릴(큰 버퍼)
		//파일의 내용을 출력할(큰 버퍼)
		
	}

}
