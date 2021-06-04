package swing;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import swing.quiz.S03_KakaoImageButton_EX;

public class S03_JButton extends JFrame {

	private static final long serialVersionUID = 1L;

	public S03_JButton() {
		setLayout(null);
		
		JButton btn1 = new JButton("����������");
		
		// setBounds(x, y, width, height) : ��ư�� ��ġ�� ũ�� ������ �ѹ��� �Ѵ�
		btn1.setBounds(100, 100, 100, 200);
		
		//setText() : �ش� ������Ʈ�� �ؽ�Ʈ�� �����Ѵ�
		btn1.setText("Push this button!");
		
		// setEnabled() : �ش� ������Ʈ�� Ȱ��ȭ/��Ȱ��ȭ �Ѵ�
		btn1.setEnabled(true);
		
		// setBackground() : �ش� ������Ʈ�� ������ �����Ѵ�
		btn1.setBackground(new Color(255, 255, 0));
		
		// setIcon() : �ش� ������Ʈ�� �������� �����Ѵ�
		btn1.setIcon(new ImageIcon("./data/images.jpg"));
		
		add(btn1);
		add(new S03_KakaoImageButton_EX(S03_KakaoImageButton_EX.RYON, 100, 300, 100, 100));
		add(new S03_KakaoImageButton_EX(S03_KakaoImageButton_EX.APEACH, 100, 450, 100, 100));
		add(new S03_KakaoImageButton_EX(S03_KakaoImageButton_EX.MUJI, 100, 600, 100, 100));
		add(new S03_KakaoImageButton_EX(S03_KakaoImageButton_EX.TUBE, 100, 750, 100, 100));
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1920, 1080);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new S03_JButton();
	}
}
