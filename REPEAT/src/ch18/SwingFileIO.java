package ch18;

import java.awt.Container;
import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class SwingFileIO extends JFrame implements ActionListener{

	Container con;
	JButton btSave,btLoad; //저장:출력,불러오기:입력
	JTextArea ta;
	
	public SwingFileIO(String title) {
		super(title);
		con = getContentPane(); //프레임 위 기본패널
		setBounds(100, 100, 400, 400); //프레임 위치
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	void setDesign() {
		JPanel pTop = new JPanel(); //패널만들기(북쪽)
		btSave = new JButton("Save");
		btLoad = new JButton("Load"); //버튼 만들기
		pTop.add(btSave);
		pTop.add(btLoad); //패널에 버튼 붙임
		add(pTop,"North"); //북쪽에 붙임
		
		ta = new JTextArea(); //ta만듬
		//ta는 Scroll안에 있어야함
		JScrollPane sc = new JScrollPane(ta);
		add(sc,"Center");
		
		btSave.addActionListener(this);
		btLoad.addActionListener(this);
		
		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//버튼을 누르면 (btSave) -> 파일에 저장되게
		//파일다이얼로그가 뜨게끔 해야함
		Object source = e.getSource();
		if(source == btSave) { //파일 저장 기능
			FileDialog fd = new FileDialog(this,"Save file",FileDialog.SAVE);
			fd.setVisible(true);//보이게 해줘야함
			String filename = fd.getDirectory() + fd.getFile();
			if(fd.getFile()==null) {
				return;
			}
			
			FileWriter fw = null;
			try {
				fw = new FileWriter(filename);
				fw.write(ta.getText());//ta에 쓰여진 걸 출력
				ta.setText("save()");
				fw.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}else if(source == btLoad) {
			FileDialog fd = new FileDialog(this,"Load File",FileDialog.LOAD);
			fd.setVisible(true);
			String filename = fd.getDirectory()+fd.getFile();
			if(fd.getFile()==null) {
				return; //종료
			}
			FileReader fr = null;
			try {
				fr = new FileReader(filename);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
			BufferedReader br = null;
			try {
				br = new BufferedReader(fr);
				ta.setText("");
				while(true) {
					String line = "";
					try {
						line = br.readLine();
					} catch (Exception e2) {
						e2.printStackTrace();
					}
					if(line==null) break;
					ta.append(line +"\n");
				}
				try {
					br.close();
					fr.close();
				}catch (Exception e3) {
					e3.printStackTrace();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	public static void main(String[] args) {
		new SwingFileIO("복잡해");
	}
	
}
