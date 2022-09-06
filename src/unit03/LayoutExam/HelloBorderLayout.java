package unit03.LayoutExam;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloBorderLayout extends JFrame{
	HelloBorderLayout(){
		JPanel p = new JPanel();
		add(p);
		
		//변경점을 저장해서 업로드 해보기 위해 수정하는 코드 
		JButton btn1 = new JButton("Button1");
		JButton btn2 = new JButton("Button2");
		JButton btn3 = new JButton("Button3");
		JButton btn4 = new JButton("Button4");
		JButton btn5 = new JButton("Button5");
		
		p.setLayout(new BorderLayout());
		p.add(btn1, BorderLayout.NORTH);
		p.add(btn2, BorderLayout.WEST);
		p.add(btn3, BorderLayout.EAST);
		p.add(btn4, BorderLayout.CENTER);
		p.add(btn5, BorderLayout.SOUTH);
		
		
	//
		
		setTitle("보더 레이아웃");
		setSize(350,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new HelloBorderLayout();
	}

}


