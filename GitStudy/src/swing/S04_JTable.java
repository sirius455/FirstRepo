package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;

public class S04_JTable extends JFrame {
	
	public S04_JTable() {
		Container container = getContentPane();
		setLayout(new BorderLayout(50, 50));
		
		String data[][] = {
				{"100", "Smith", "3500", "10"},	
				{"101", "King", "4500", "30"},	
				{"102", "Steve", "50000", "10"},	
				{"103", "Ryo", "30", "10"},	
		};
		
		String column[] = {"ID", "NAME", "SALARY", "DEPTNO"};
		
		JTable table = new JTable(data, column);
		
//		DefaultTableModel model = (DefaultTableModel) table.getModel();
//		
//		model.addRow(data[0]);
//		model.addRow(data[1]);
//		model.addRow(data[2]);
//		model.addRow(data[3]);
		
//		model.addColumn("name");
		
		add(table, BorderLayout.CENTER);
		add(new JButton("Hello, swing!"), BorderLayout.SOUTH);
		
		addMouseListener(new MouseAdapter() {



			@Override
			public void mousePressed(MouseEvent arg0) {
				container.setBackground(Color.RED);
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				container.setBackground(Color.BLACK);
				
			}
			
			
		});
		
		//������Ʈ�� �پ��� �̺�Ʈ�� �߰��Ҽ��ְ� �� ��͸� ���������� 4���������� ����ؾ������� ��͸� ���� ���ϴ� �͵鸸 �����ؼ� ����� �� �ִ�
		addComponentListener(new ComponentAdapter() {
		
			@Override
			public void componentResized(ComponentEvent e) {
				java.awt.Component com = e.getComponent();
				System.out.println("-----------------------------");
				System.out.println("location - (" + com.getX() + ", " + com.getY() + ")");
				System.out.println("location - (" + com.getWidth() + ", " + com.getHeight() + ")");
			}
		
			
		});
		
		setBounds(300, 300, 286, 292);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 600);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new S04_JTable();
	}
}
