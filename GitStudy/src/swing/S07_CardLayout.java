package swing;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class S07_CardLayout extends MyFrame {

	/*
	  	# CardLayout
	  	
	  	 - 컴포넌트를 카드처럼 넘기면서 사용하는 레이아웃
	  	
	  	# methods
	  	
	  	 - CardLayout.first(Parent) : 맨 처음 카드보기
		 - CardLayout.last(Parent) : 맨 마지막 카드 보기
		 - CardLayout.next(Parent) : 다음 카드 보기
		 - CardLayout.previous(Parent) : 이전 카드 카드보기
		 - CardLayout.show(Parent, card_name) : 원하는 카드보기
	 */
	
	public S07_CardLayout() {
		
		setLayout(new BorderLayout());
		
		JPanel center = new JPanel();
		
		// JLabel : 내용을 그냥 출력하는 
		JLabel label1 = new JLabel("Hello");
		JLabel label2 = new JLabel("Nice to meet you!");
		JLabel label3 = new JLabel("Good bye!");
		
		// 카드 레이아웃에 컴포넌트를 추가할 때는 컴포넌트의 이름을 지정해 놓는 것이 좋다.
		center.setLayout(new CardLayout(5, 5));
		center.add("card1", label1);
		center.add("card2", label2);
		center.add("card3", label3);
		
		JPanel south = new JPanel();
		
		JButton prev = new JButton("prev");
		prev.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// 다음 카드로 넘기기 (레이아웃이 설정된 컨테이너의 인스턴스가 필요하다)
				CardLayout card = (CardLayout)center.getLayout();
				
				// 첫 번째 라벨이 보이지 않을때만 이전 버튼이 동작함 
//				if(!label1.isVisible()) {
//					card.show(center, "card3");; 
//				}
				card.show(center, "card3");; 
			}
		});
		
		JButton next = new JButton("next");
		next.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// 다음 카드로 넘기기 (레이아웃이 설정된 컨테이너의 인스턴스가 필요하다)
				CardLayout card = (CardLayout)center.getLayout();
				card.next(center); 
			}
		});
		
		south.setLayout(new GridLayout(1, 2));
		south.add(prev);
		south.add(next);
		
		add(center, BorderLayout.CENTER);
		add(south, BorderLayout.SOUTH);
		
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new S07_CardLayout();
	}	
}
