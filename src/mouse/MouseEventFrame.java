package mouse;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseEventFrame extends JFrame {
	public MouseEventFrame() {
		super("���콺 �ø��� ������ ����");//�̺�Ʈ �̸� 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Love Java");
		c.add(label); // ����Ʈ�ҿ� ���̱�, �ʱ�ȭ�� love java
		
		label.addMouseListener(new MouseAdapter() {
			@Override  //love java���� ���콺�� �ø��� 
			public void mouseEntered(MouseEvent e) {
				JLabel la = (JLabel)e.getSource();
				la.setText("Love Java");
 			}          //����ط� �ٲ�� ������ �ٽ� love java 
			@Override  //�� �ٲ�� 
			public void mouseExited(MouseEvent e) {
				JLabel la = (JLabel)e.getSource();
				la.setText("�����");
			}			
		});
		setSize(250,150);
		setVisible(true);}
	static public void main(String [] args) {
		new MouseEventFrame();
	}    //���콺 �̺�Ʈ ������ ���� 
}