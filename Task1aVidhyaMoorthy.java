import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 * 
 * @author Vidhya Moorthy
 * Task1a --> Create a GUI application that paints a house on the JPanel (Content pane) using Graphics
 *
 */

public class Task1aVidhyaMoorthy extends JFrame {
	private JPanel contentPane;
	/**
	 * Launch the application with a frame class that extends JFrame
	 */
	public static void main(String[] args) {
		Task1aVidhyaMoorthy frame = new Task1aVidhyaMoorthy();
		frame.setVisible(true);
	}
	/**
	 * Create the frame that will hold the panel of components that draws the house as a graphic
	 */
	public Task1aVidhyaMoorthy() {
		/**
		 * this method initiates the frame class that extends JFrame and calls the paint() method to display the 
		 * house graphic
		 */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

	public void paint(Graphics G){
		/**
		 * this method draws the house graphic by using coordinates on the panel
		 */
		  super.paint(G);
		G.setColor(Color.BLACK); // set the color of graphic as black
		 Graphics2D g = (Graphics2D) G;
         g.setStroke(new BasicStroke(10));
         // drawing the house using coordinates(startx,starty,endx,endy)
			g.drawLine(300, 600, 300, 900); 
			g.drawLine(600, 580, 600, 950); 
			g.drawLine(300, 900, 600, 950);							
			g.drawLine(250, 650, 450, 450); 
			g.drawLine(450, 450, 650, 625); 
			g.drawLine(600, 950, 1000, 830);
			g.drawLine(1000, 830, 1000,530);
			g.drawLine(450, 450, 980, 330);
			g.drawLine(650, 625, 1100, 500);
			g.drawLine(980, 330, 1100, 500);
			g.drawLine(750, 685, 850, 660); 
			g.drawLine(750, 645, 850, 620);
			g.drawLine(750, 725, 850, 700);
			g.drawLine(750, 725, 750, 645);
			g.drawLine(850, 700, 850, 620);
			g.drawLine(800, 715, 800, 630);
			g.drawLine(405, 915, 405, 730);
			g.drawLine(465, 925, 465, 730);
			g.drawLine(405, 730, 465, 730); 
			g.drawLine(405, 915, 325, 950); 
			g.drawLine(465, 925, 400, 960); 
			g.drawLine(700, 350, 700, 450); 
			g.drawLine(750, 330, 750, 420);
			g.drawLine(700, 350, 750, 330);
			g.drawOval(800, 320, 80, 85);
			g.drawLine(840, 360, 900, 300);
			g.drawLine(840, 360, 840, 430);
			g.drawOval(420, 600, 40, 50);        
          
	}
}

