package mouse;
import java.awt.event.*;
import javax.swing.*;

public class LeftKeyFrame extends JFrame 
{
    JPanel jp = new JPanel();
    JLabel jl = new JLabel("Love Java"); //Ű �Է¿� ���� ������ ���̺� ������Ʈ
    LeftKeyFrame()
    {
        this.setTitle("LeftŰ�� ���ڿ� ��ĭ�� �̵�");// <- Ű �Է� 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(jp);
        jp.addKeyListener(new LeftListener());
        jp.add(jl);
        setSize(200, 100);
        setVisible(true); //���� ������ ���
        jp.requestFocus(); // ���̺� Ű �Է� ��Ŀ�� ����
    }
     public static void main(String[] args)
    {
        new LeftKeyFrame();//����Ʈ ������ ���� 
    }
    public class LeftListener extends KeyAdapter
    {
        String str = jl.getText();
        int c = 0;
        public void keyPressed(KeyEvent e)
        {
            int keyCode = e.getKeyCode();
            if(keyCode == KeyEvent.VK_LEFT)c++; //���� ȭ��ǥ Ű�� �Էµɶ�
            jl.setText(str.substring(c) + str.substring(0, c));
            if(c == str.length()) c = 0;//������ �յ��� �ٲٰ� ���� ��Ų��
            }}}
