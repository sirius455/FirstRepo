package swing;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;



public class S05_GridLayout extends MyFrame {

	
	public S05_GridLayout() {
		
		ArrayList<JButton> btns = new ArrayList<>(10);
		
		for (int i = 0; i < 14; i++) {
			btns.add(new JButton("Button" + i));
		}
		
		
		//GridLayout(행, 열, 가로여백 , 세로여백)
		setLayout(new GridLayout(2, 7, 15, 15));
		
		for(JButton btn : btns) {
			add(btn);
		}
		
		setVisible(true);
		
	}
	
	
	
	public static void main(String[] args) {
		new S05_GridLayout();
	}
	
	
}
