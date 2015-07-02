package ba.bitcamp.homework19;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PaintPanel extends JPanel {

	private static final long serialVersionUID = 8116418407672994835L;

	private PointArray points;
	private PointArray pointsRedo;
	private PointArray undoPoints;
	private PointArray tempPoints;

	private Color activeColor;
	private int pointSize = 2;

	private int x1;
	private int y1;
	private int x2;
	private int y2;

	String text = "";
	int coordX;
	int coordY;
	int counter = 0;

	private static Color[] supportedColors = new Color[] { Color.RED,
			Color.BLUE, Color.GREEN, Color.ORANGE, Color.PINK };

	public PaintPanel(int height, int width) {

		super();

		points = new PointArray();
		setSize(width, height);
		setBackground(Color.WHITE);

		for (int i = 0; i < supportedColors.length; i++) {
			JButton color = new JButton("Pick");
			color.setName(Integer.toString(i));
			color.setForeground(supportedColors[i]);
			color.setBorderPainted(false);

			color.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					JButton clicked = (JButton) e.getSource();

					String name = clicked.getName();
					int index = Integer.parseInt(name);
					activeColor = supportedColors[index];

				}
			});
			add(color);
			addMouseMotionListener(new MouseHandler());
			addMouseListener(new MouseHandler());
		}

		// Adding two buttons for + and -
		JButton button1 = new JButton("+");
		JButton button2 = new JButton("-");
		button1.setBorderPainted(false);
		button2.setBorderPainted(false);

		// Setting button +
		add(button1);
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (pointSize < 20) {
					pointSize += 1;
				}
			}
		});

		// Setting button -
		add(button2);
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (pointSize > 0) {
					pointSize -= 1;
				}
			}
		});

		// Adding the button for Undo
		JButton button3 = new JButton("Undo");
		button3.setBorderPainted(false);

		// Setting button Undo
		button3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				undoPoints = new PointArray();
				pointsRedo = new PointArray();

				// Deleting one point from points array
				for (int i = 0; i < points.getLength() - 5; i++) {
					undoPoints.addPoint(points.elementAt(i));
				}

				points = undoPoints;

				repaint();
			}
		});
		add(button3);

		// Adding button Redo
		JButton button4 = new JButton("Redo");
		button4.setBorderPainted(false);

		button4.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				pointsRedo = tempPoints;

				if (counter < 16) {
					points.addPoint(pointsRedo.elementAt(undoPoints.getLength()
							+ counter));
					counter += 4;
					System.out.println(counter);
				}
				repaint();
			}
		});

		add(button4);

		// Adding button Text
		JButton button5 = new JButton("Text");
		button5.setBorderPainted(false);

		button5.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				text = JOptionPane.showInputDialog("Insert text");

				String coordinates = JOptionPane
						.showInputDialog("Input coordinates where you want"
								+ " to set the text in form XX,YY!");

				coordX = Integer.parseInt(coordinates.substring(0,
						coordinates.indexOf(',')));
				coordY = Integer.parseInt(coordinates.substring(
						coordinates.indexOf(',') + 1, coordinates.length()));
				repaint();
			}
		});
		add(button5);

	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		for (int i = 0; i < points.getLength(); i++) {
			Point p = points.elementAt(i);
			g.setColor(p.getColor());
			Graphics2D g2d = (Graphics2D) g;

			if (p.isFill()) {
				g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
						RenderingHints.VALUE_ANTIALIAS_ON);
				g2d.setStroke(new BasicStroke(p.getSize()));
				g2d.drawLine(p.getX(), p.getY(), p.getX2(), p.getY2());
			} else {
				g2d.drawOval(p.getX(), p.getY(), p.getSize(), p.getSize());
			}

		}
		g.setFont(new Font("Serif", Font.BOLD, 20));
		g.drawString(text, coordX, coordY);

	}

	private class MouseHandler extends MouseAdapter {

		public void mouseDragged(MouseEvent e) {

			Point newPoint = new Point(x2, y2, e.getX(), e.getY(), pointSize,
					activeColor);

			x2 = e.getX();
			y2 = e.getY();

			if (e.isShiftDown() == true) {
				newPoint.setColor(Color.WHITE);
			}

			if (e.isControlDown() == true) {
				newPoint.setFill(false);
			} else {
				newPoint.setFill(true);
			}

			points.addPoint(newPoint);
			tempPoints = points;

			repaint();

		}

		public void mousePressed(MouseEvent e) {
			super.mousePressed(e);

			x1 = e.getX();
			y1 = e.getY();
			x2 = x1;
			y2 = y1;
		}

	}

}
