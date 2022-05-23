package ch18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SeriUse {
	//객체를 파일로 저장할 것이다.
	//일단 파일을 출력하는 기반스트림
	//객체를 파일로 바꿔줄 보조스트림(객체 생성할 때 꼭 만들어줘야함)
	
	//왜냐면 내가 할 일은, 저장된 객체(인스턴스 변수모음) -> 파일로 만들기
	//객체에 있는 인스턴스 멤버들을 풀어서 연속적인 모습으로 변하게 하기
	
	//ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("c:\\test\\a.txt"));
	//천천히 차분하게 해보기
	
	//객체 생성해줘야지
	//자바 메모리에 객체 올려줘
	public static void main(String[] args) {
		FileOutputStream fs;
		ObjectOutputStream os;
		
		SeriEx se2 = new SeriEx("ame","ch","b",1200,1);
		SeriEx se3 = new SeriEx("ame","ch","b",1200,1);
		SeriEx se4 = new SeriEx("ame","ch","b",1200,1);
		
		try {
			fs = new FileOutputStream("c:\\test\\wow.dat");
			os = new ObjectOutputStream(fs);
			
			//객체 출력해주고 싶어.
			os.writeObject(se2);
			os.writeObject(se3);
			os.writeObject(se4);
			
			System.out.println("객체 출력 완료");
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		FileInputStream fis;
		ObjectInputStream ois;
		
		//읽어들이기
		try {
			fis = new FileInputStream("c:\\test\\wow.dat");
			ois = new ObjectInputStream(fis);
			
			//파일에 있는 데이터를 읽어와서 객체를 만들어주는 것
			//역직렬화 -> 그러나 Object타입으로 읽어오니까 원래의
			//객체 타입에 맞춰줘야한다.
			SeriEx s = (SeriEx)ois.readObject();
			SeriEx s1 = (SeriEx)ois.readObject();
			SeriEx s2 = (SeriEx)ois.readObject();
			
			System.out.println(s);//toString의 경우 멤버 다 보여줌
			System.out.println(s1);
			System.out.println(s2);
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}
