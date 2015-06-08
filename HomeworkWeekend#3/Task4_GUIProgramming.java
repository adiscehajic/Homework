import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Task4_GUIProgramming {

	public static void main(String[] args) {
		DrawWindow w = new DrawWindow();
		draw(w);
	}

	public static void draw(DrawWindow w) {
		BufferedImage img = new BufferedImage(1200, 800,
				BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();

		g.setColor(Color.BLACK);

		// Main rectangle
		g.drawRect(25, 25, 530, 310);
		
		// Blue letters
		g.setColor(Color.BLUE);
		g.setFont(new Font("Cambria", Font.BOLD, 18));
		g.drawString("java", 33, 45);
		g.drawString("lang", 80, 92);
		g.drawString("awt", 265, 92);
		g.drawString("util", 450, 92);
		
		// Green letters
		g.setColor(Color.GREEN);
		g.setFont(new Font("Cambria", Font.BOLD, 14));
		g.drawString("Math", 105, 123);
		g.drawString("String", 105, 240);
		g.drawString("Integer", 105, 290);
		g.drawString("Graphics", 290, 123);
		g.drawString("Color", 290, 240);
		g.drawString("Font", 290, 290);
		
		// Red letters
		g.setColor(Color.RED);
		g.setFont(new Font("Cambria", Font.BOLD, 14));
		g.drawString("sqrt()", 145, 155);
		g.drawString("random()", 135, 190);
		g.drawString("drawRect()", 315, 155);
		g.drawString("setColor()", 320, 190);
		
		g.setColor(Color.BLACK);
		// First rectangle
		g.drawRect(75, 75, 150, 240);
		g.drawRect(100, 105, 115, 100);
		g.drawRect(120, 135, 90, 30);
		g.drawRect(120, 170, 90, 30);
		g.drawRect(100, 215, 115, 40);
		g.drawRect(100, 265, 115, 40);
		
		// Second rectangle
		g.drawRect(260, 75, 150, 240);
		g.drawRect(285, 105, 115, 100);
		g.drawRect(305, 135, 90, 30);
		g.drawRect(305, 170, 90, 30);
		g.drawRect(285, 215, 115, 40);
		g.drawRect(285, 265, 115, 40);
		
		// Third rectangle
		g.drawRect(445, 75, 90, 240);

		w.setImage(img);
	}
}
