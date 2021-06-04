package swing.quiz;

import java.awt.Image;
import java.awt.image.CropImageFilter;
import java.awt.image.FilteredImageSource;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class S03_KaKaoImageButton extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	public S03_KaKaoImageButton() {
		setLayout(null);
		
		JButton btn1 = new JButton(new ImageIcon("./data/ĸó.GIF"));
		JButton btn2 = new JButton(new ImageIcon("./data/ĸó.GIF"));
		JButton btn3 = new JButton(new ImageIcon("./data/ĸó.GIF"));
		JButton btn4 = new JButton(new ImageIcon("./data/ĸó.GIF"));
		
		
		 ImageIcon icon = new ImageIcon("./data/ĸó.GIF");
	     
		 Image ima = icon.getImage();
	     ima = btn1.createImage(new FilteredImageSource(ima.getSource(),new CropImageFilter(0, 0, 150, 150)));
	 
	     Image ima2 = icon.getImage();
	     ima2 = btn2.createImage(new FilteredImageSource(ima2.getSource(),new CropImageFilter(0, 165, 150, 150)));
	    
	     Image ima3 = icon.getImage();
	     ima3 = btn3.createImage(new FilteredImageSource(ima3.getSource(),new CropImageFilter(165, 0, 150, 150)));
	     
	     Image ima4 = icon.getImage();
	     ima4 = btn4.createImage(new FilteredImageSource(ima4.getSource(),new CropImageFilter(165, 167, 150, 150)));
	     
		
		btn1 = new JButton(new ImageIcon(ima));
		btn2 = new JButton(new ImageIcon(ima2));
		btn3 = new JButton(new ImageIcon(ima3));
		btn4 = new JButton(new ImageIcon(ima4));
		
		btn1.setBounds(0, 0, 150, 150);
		btn1.setEnabled(true);
		
		btn2.setBounds(150, 0, 150, 150);
		btn2.setEnabled(true);
	
		btn3.setBounds(0, 150, 150, 150);
		btn3.setEnabled(true);
		
		btn4.setBounds(150, 150, 150, 150);
		btn4.setEnabled(true);
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(316, 339);
		setVisible(true);
	}
	
	   public void cropImage(){
	         
	    
	   }
	
	public static void main(String[] args) {
		new S03_KaKaoImageButton();
	}
}
