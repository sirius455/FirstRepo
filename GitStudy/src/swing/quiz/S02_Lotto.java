package swing.quiz;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;

import javax.swing.JButton;
import javax.swing.JFrame;


public class S02_Lotto extends javax.swing.JFrame {
	
	/*
	  뽑기 버튼을 누를때마다 6개의 중복없는 랜덤 숫자를 가진 버튼을 
	  프레임에 띄우는 프로그램을 만들어보세요
	*/
	
	public HashSet<Integer> getLottoSet(){
		HashSet<Integer> lotto = new HashSet<>();
		
		while(lotto.size() < 6 ) {
			lotto.add((int)(Math.random() * 45 + 1));
		}
		
		return lotto;

	}
	
	public ArrayList<Integer> getLottoList() {
		
		return new ArrayList<>(getLottoSet());
	
	}


	public S02_Lotto() {
		
		setLayout(new BorderLayout());
		
		JButton luckey_btn = new JButton("뽑기");
		JButton lotto_num1 = new JButton("");
		JButton lotto_num2 = new JButton("");
		JButton lotto_num3 = new JButton("");
		JButton lotto_num4 = new JButton("");
		JButton lotto_num5 = new JButton("");
		JButton lotto_num6 = new JButton("");
		
		luckey_btn.setFont(new Font("굴림", Font.BOLD, 20));
		
		luckey_btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				ArrayList<Integer> lotto = getLottoList();
				
				((JButton) e.getSource()).setText("" + lotto + "");
			}
		});
		
		
		add(new JButton("뽑기"), BorderLayout.CENTER);
		
		
		
		add(luckey_btn, BorderLayout.CENTER);
		
		setSize(600, 600);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new S02_Lotto();
		
	}
	
}
