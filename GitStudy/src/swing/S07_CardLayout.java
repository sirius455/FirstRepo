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
	  	
	  	 - ������Ʈ�� ī��ó�� �ѱ�鼭 ����ϴ� ���̾ƿ�
	  	
	  	# methods
	  	
	  	 - CardLayout.first(Parent) : �� ó�� ī�庸��
		 - CardLayout.last(Parent) : �� ������ ī�� ����
		 - CardLayout.next(Parent) : ���� ī�� ����
		 - CardLayout.previous(Parent) : ���� ī�� ī�庸��
		 - CardLayout.show(Parent, card_name) : ���ϴ� ī�庸��
	 */
	
	public S07_CardLayout() {
		
		setLayout(new BorderLayout());
		
		JPanel center = new JPanel();
		
		// JLabel : ������ �׳� ����ϴ� 
		JLabel label1 = new JLabel("Hello");
		JLabel label2 = new JLabel("Nice to meet you!");
		JLabel label3 = new JLabel("Good bye!");
		
		// ī�� ���̾ƿ��� ������Ʈ�� �߰��� ���� ������Ʈ�� �̸��� ������ ���� ���� ����.
		center.setLayout(new CardLayout(5, 5));
		center.add("card1", label1);
		center.add("card2", label2);
		center.add("card3", label3);
		
		JPanel south = new JPanel();
		
		JButton prev = new JButton("prev");
		prev.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// ���� ī��� �ѱ�� (���̾ƿ��� ������ �����̳��� �ν��Ͻ��� �ʿ��ϴ�)
				CardLayout card = (CardLayout)center.getLayout();
				
				// ù ��° ���� ������ �������� ���� ��ư�� ������ 
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
				
				// ���� ī��� �ѱ�� (���̾ƿ��� ������ �����̳��� �ν��Ͻ��� �ʿ��ϴ�)
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
