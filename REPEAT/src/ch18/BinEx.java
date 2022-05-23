package ch18;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BinEx {
	public static void main(String[] args) {
		//텍스트파일이 아닌 binary file(이진파일)로 저장
		try {
			//파일로 저장할거니까
			DataOutputStream dataout = new DataOutputStream(new FileOutputStream("c:\\test\\da.dat"));
			//이진파일로 출력하는 역할을 하는 보조스트림(기반 스트림:파일스트림-바이트로 처리)
			dataout.writeChar('a');
			dataout.writeByte(1);
			dataout.writeBoolean(true);
			dataout.writeFloat(1.0f);
			//다양한 형태의 자료형을 출력하는 것을 지원하는듯
			//바이트 차원에서는 따로 flush()하지 않는 것 같네요.
			dataout.close(); //왠만해서 write차원은 닫아주세용.
			
			//읽어보기
			DataInputStream din = new DataInputStream(new FileInputStream("c:\\test\\da.dat"));
			System.out.println(din.readChar());
			System.out.println(din.readByte());
			System.out.println(din.readBoolean());
			System.out.println(din.readFloat());
		
		
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
