package ch18;

public class Ex1 {
//스트림 : 데이터의 논리적 통로
//1byte단위로 처리
//프로그램 기준
//InputStream(입력스트림) : System.in 이 표준(read)
//OutPutStream(출력스트림) : System.out이 표준(write)

	public static void main(String[] args) {
		//입출력은 try,catch문이 필수
		//int 변수를 만든다.
		//입력스트림의 메소드를 통해 값을 읽어온다.
		//int 변수 안에 넣어서 출력한다.
		//int 변수를 문자형으로 바꾸어서 출력한다.
		
		int var = 0;
		try {
			System.out.println("입력하세요:");
			
			//입력받은 값을 다 꺼내오려면 반복문 필요
			while(var!=13) { //엔터키 입력 시 반환
			var = System.in.read();	
			System.out.println(var+"==>"+(char)var);
			var = System.in.read();
			//왜 이렇게 해주냐?
			//만약 끝에 var = System.in.read();가 생략되면
			//첫번째 반복문이 끝나도 var는 입력받은 값으로 남아 있으므로
			//var!=13의 조건이 참이된 상태로 반복문으로 들어와서
			//받아온 엔터값인 13을 출력하고 그 뒤에 조건문에 걸려서 종료되므로
			 
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
