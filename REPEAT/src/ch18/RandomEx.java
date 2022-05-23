package ch18;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class RandomEx {
	
	public static void main(String[] args) {
		String a = null;
		try {
			RandomAccessFile rf = new RandomAccessFile("c:\\test\\rand2.txt","rw");
			System.out.println(rf.getFilePointer());
			rf.seek(9);
			System.out.println(rf.getFilePointer());
			rf.write("w룡안".getBytes());
			//rf.write(byte)를 매개변수로 받기 때문에
			//문자열을 byte배열로 변환
			System.out.println(rf.length());
			while(rf.getFilePointer()<rf.length()) {
				a = rf.readLine();
				a = new String(a.getBytes("8859_1"),"utf-8");
			}
			System.out.println(rf.length());
			System.out.println(rf.getFilePointer());
			rf.close(); //닫아줘야함
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
