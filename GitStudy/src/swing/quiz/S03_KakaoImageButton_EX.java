package swing.quiz;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class S03_KakaoImageButton_EX extends JButton {
	
	public static final int RYON = 0;
	public static final int APEACH = 1;
	public static final int MUJI = 2;
	public static final int TUBE = 3;
	
	private static HashMap<Integer, Image> btn_images = new HashMap<>();
	
	static {
		try {
			BufferedImage src = ImageIO.read(new File("./data/Ä¸Ã³.GIF"));
			
			int crop_width = src.getWidth() / 2 -44;
			
			// BufferedImageÀÇ getSubimage(x, y, width, height)
			btn_images.put(RYON, src.getSubimage(0, 0, src.getWidth() / 2, src.getHeight() / 2));
			btn_images.put(APEACH, src.getSubimage(src.getWidth() / 2, 0, src.getWidth() / 2, src.getHeight() / 2));
			btn_images.put(MUJI, src.getSubimage(src.getHeight() / 2, src.getWidth() / 2, src.getWidth() / 2,  src.getHeight() / 2));
			btn_images.put(TUBE, src.getSubimage(src.getWidth() / 2, src.getHeight() / 2, src.getHeight() / 2, src.getHeight() / 2 ));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public S03_KakaoImageButton_EX(int picture, int x, int y, int width, int height) {
		
		setIcon(new ImageIcon(
				btn_images.get(picture)
				.getScaledInstance(width, height, Image.SCALE_SMOOTH)
				));
		setBounds(x, y, width, height);
		
	}
	
	
}
