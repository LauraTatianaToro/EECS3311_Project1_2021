package shape;

import java.awt.event.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MyPanel extends JPanel implements ActionListener {

	MyPanel shapePanel;
	JFrame frame;
	JButton loadButton, sortButton;
	static List<Shape> shapeList;

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == loadButton) {
			shapeList = ShapeFactory.createShapes();

		} else if (e.getSource() == sortButton) {
			SortShapes.Sort(shapeList);

		}
		shapePanel.repaint();

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;

		if (shapeList != null) {
			for (Shape shape : shapeList) {
				g2d.setColor(shape.getColor());
				shape.drawShape(g2d);
			}
		}

	}

	public void createWindow() {
		shapePanel = new MyPanel();
		JFrame frame = new JFrame("Sort shapes!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		loadButton = new JButton("Load Shapes");
		loadButton.setBounds(145, 1, 150, 30);
		loadButton.addActionListener(this);
		shapePanel.add(loadButton);

		sortButton = new JButton("Sort Shapes");
		sortButton.setBounds(300, 1, 150, 30);
		sortButton.addActionListener(this);
		shapePanel.add(sortButton);

		frame.add(shapePanel);
		shapePanel.setVisible(true);
		frame.setSize(600, 600);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		MyPanel mainWindow = new MyPanel();
		mainWindow.createWindow();

	}
}
