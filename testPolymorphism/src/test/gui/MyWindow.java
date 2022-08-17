package test.gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
//클래스와 인터페이스를 같이 상속 받을 수 있음
//클래스(단일상속), 인터페이스(다중상속)
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyWindow extends JFrame implements ActionListener, KeyListener{
	//Field
	private JButton btn = new JButton("클릭하세요.");
	
	//Constructor
	public MyWindow() {
		super("상속 테스트");
		this.setSize(300, 300);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		this.add(btn);
		this.btn.addActionListener(this);
		
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 인터페이스가 가진 추상 메소드를 강제적으로 완성해야 함
		// 상속받은 추상메소드 오버라이딩
		JOptionPane.showConfirmDialog(this, "버튼이 클릭되었습니다.");
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
			
}
