package swing;

import java.awt.AWTEvent;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class S02_BorderLayout extends javax.swing.JFrame {
	
	/*
	  	# BorderLayout
	  	
	  	 - �������ϰ� ����� �̷���� ���̾ƿ�
	  	 - ������Ʈ�� �߰��� �� ��ġ�� �Բ� ������ �� �� �ִ�  
	 */
	
	public S02_BorderLayout() {
		

		// �� �������� ���̾ƿ� ����
		setLayout(new BorderLayout());
		
		// �� ���̾ƿ� ���� �� �߰��ؾ� ��
		JButton quit_btn = new JButton("Quit");
		JButton save_btn = new JButton("Save");
		JButton load_btn = new JButton("Load");
		JButton delete_btn = new JButton("Delete");
		JButton update_btn = new JButton("Update");
		
		// ��ư�� ��Ʈ ����
		quit_btn.setFont(new Font("����", Font.BOLD, 35));
		
		// ��ư�� �̺�Ʈ�� �߰�
		quit_btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("������ ����1 : " + e.getActionCommand());
				System.out.println("������ ����2 : " + e.getID());
				System.out.println("������ ����3 : " + e.getModifiers());
				System.out.println("������ ����4 : " + e.getWhen());
				System.out.println("������ ����5 : " + e.getClass());
				
				// e.getSource()���� �׼��� �߻��� ������Ʈ�� �ν��Ͻ��� ����ְ�
				// �ٿ�ĳ���� �Ͽ� ����ؾ� �Ѵ�.
				((JButton) e.getSource()).setText("�����ϴ�!");
			}
		});
		
		save_btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("�������� �̸� : " + e.getActionCommand());
				System.out.println("�������� ID : " + e.getID());
			
				
				((JButton) e.getSource()).setText("����Ǿ����ϴ�!");
			}
		});
		
		load_btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("������ ����1 : " + e.getActionCommand());
	

				((JButton) e.getSource()).setText("�ҷ��ɴϴ�!");
			}
		});
		
		delete_btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("������ ����1 : " + e.getActionCommand());
				
				((JButton) e.getSource()).setText("�����߽��ϴ�");
			}
		});
		
		update_btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("������ ����1 : " + e.getActionCommand());
				
				((JButton) e.getSource()).setText("������Ʈ�Ǿ����ϴ�");
			}
		});
		
		add(new JButton("Save"), BorderLayout.CENTER);
		add(new JButton("Load"), BorderLayout.EAST);
		add(new JButton("Delete"), BorderLayout.WEST);
		add(new JButton("Update"), BorderLayout.NORTH);
		add(new JButton("Quit"), BorderLayout.SOUTH);
		add(quit_btn, BorderLayout.SOUTH);
		add(save_btn, BorderLayout.CENTER);
		add(load_btn, BorderLayout.EAST);
		add(delete_btn, BorderLayout.WEST);
		add(update_btn, BorderLayout.NORTH);
		// ��ġ ����
		//setLocation(x, x);
		
		// ������ ũ�� ����
		setSize(600, 600);
		
		// X��ư�� ������ ���� ���� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//�������� ���̰� ���� (ȭ�鿡 �׸���)
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new S02_BorderLayout();
	}
}
