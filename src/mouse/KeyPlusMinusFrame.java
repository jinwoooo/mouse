package mouse;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class KeyPlusMinusFrame extends JFrame {
	public KeyPlusMinusFrame() {
		super("+,- 키로 폰트 크기 조절");//프레임 이름 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel label = new JLabel("Love Java");//초기 레이블 생성  
		c.add(label);
		label.setFont(new Font("Arial", Font.PLAIN, 10));
		label.addKeyListener(new KeyAdapter() {//arial 폰트로 10픽셀 크기 
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == '+') {//+ 키를 눌렀을때 
					JLabel la = (JLabel)e.getSource();
					Font f = la.getFont();
					int size = f.getSize();
					la.setFont(new Font("Arial", Font.PLAIN, size+5)); 					
				}                      // arial 폰트로 사이즈 5 플러스                
				else if(e.getKeyChar() == '-') { // - 키를 눌렀을때 
					JLabel la = (JLabel)e.getSource();
					Font f = la.getFont();
					int size = f.getSize();
					if(size <= 5)
						return; // arial 폰트로 사이즈 5 마이너스
					la.setFont(new Font("Arial", Font.PLAIN, size-5));} }});
		setSize(300,150);
		setVisible(true);
		
		label.setFocusable(true); // 레이블이 포커스를 받을 수 있도록 지정
		label.requestFocus(); // 레이블에 키 입력 포커스 서정
	}
	static public void main(String [] args) {
		new KeyPlusMinusFrame();//프레임 실행 
	}
}