package swing.quiz;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JButton;

public class S02_NextButton extends JButton implements ActionListener {

	ArrayList<JButton> btns;
	
	public S02_NextButton(int x, int y, ArrayList<JButton> btns) {
		super("»Ì±â");
		
		this.btns = btns;
		setSize(80,80);
		setLocation(new Point(x, y));
		addActionListener(this);
	}
	
	
	private static List<Integer> getLotto_list() {
		List<Integer> list = new ArrayList<>(45);
		
		for (int i = 0; i <= 45; i++) {
			list.add(i);
		}
		
		return list;
	}
	
	@Override
		
	public void actionPerformed(ActionEvent e) {
		List<Integer> numbers = getLotto_list();
		Collections.shuffle(numbers);;
		
		numbers = numbers.subList(0, 6);
		Collections.sort(numbers);
		
		for (JButton btn : btns) {
				btn.setText(numbers.remove(0).toString());
			}
			((JButton)e.getSource()).setText("ÇÑ¹ø ´õ »Ì±â!");
			
		}	
	
}
