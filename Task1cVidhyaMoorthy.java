import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 * 
 * @author Vidhya Moorthy
 * Task1c --> Create an applet from the GUI application created in Task1b
 * Replace JFrame with JApplet
 *
 */

public class Task1cVidhyaMoorthy extends JApplet implements ActionListener {
	// initialize data members  
		private JPanel contentPane;
		private JMenuBar  menubar;
		private JMenu  color;
		private JMenuItem  red;
		private JMenuItem  blue;
		private JMenuItem  green;
		private JMenuItem  yellow;
		private JMenuItem  black;
		private JMenuItem  pink;
		private JMenuItem  cyan;
		private JMenuItem  magenta;
		private JMenuItem  random;
		/**
		 * Launch the application with a frame class that extends JFrame
		 */
		public Task1cVidhyaMoorthy() {
			/**
			 * this method initiates the frame class that extends JFrame and calls the paint() method to display the 
			 * house graphic
			 */
			setBounds(200, 200, 550, 400);
			contentPane = new JPanel(); // creating the panel that holds the graphic
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			//Create a menu bar that will hold the color menu
			 menubar = new JMenuBar();
			
			 /**
			 * Creating a menu "color" that holds the list of colors to be changed as background 
			 * when selected
			 */
			 
			 color =  new JMenu("Color");
			 /**
			  * Creating the menu items that represent the colors
			  * adding action listener to each menu item
			  */
			 red = new JMenuItem("Red");
			 red.addActionListener(this);
			 blue = new JMenuItem("Blue");
			 blue.addActionListener(this);
			 green = new JMenuItem("Green");
			 green.addActionListener(this);
			 yellow = new JMenuItem("Yellow");
			 yellow.addActionListener(this);
			 black = new JMenuItem("Black");
			 black.addActionListener(this);
			 pink = new JMenuItem("Pink");
			 pink.addActionListener(this);
			 cyan = new JMenuItem("Cyan");
			 cyan.addActionListener(this);
			 magenta = new JMenuItem("Magenta");
			 magenta.addActionListener(this);
			 random = new JMenuItem("Random");
			 random.addActionListener(this);

			 //register menuItems to menu
			 color.add(red);
			 color.add(blue);
			 color.add(green);
			 color.add(yellow);
			 color.add(black);
			 color.add(pink);
			 color.add(cyan);
			 color.add(magenta);
			 color.add(random);

			 // register color menu in menu bar
			 menubar.add(color);
			 //set menu bar
			 setJMenuBar(menubar);
		}
		/**
		 * this method draws the house graphic by using coordinates on the panel
		 */
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
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			// If selected color is red
			if(arg0.getSource()==red){ 
			  this.getContentPane().setBackground(Color.RED);
			  red.setBackground(Color.RED);
			}
			// If selected color is blue
			if(arg0.getSource()==blue){
				  this.getContentPane().setBackground(Color.BLUE);
				  blue.setBackground(Color.BLUE);
	  		}
			// If selected color is green
			if(arg0.getSource()==green){
				  this.getContentPane().setBackground(Color.GREEN);
			      green.setBackground(Color.GREEN);
				}
			// If selected color is yellow
			if(arg0.getSource()==yellow){
				  this.getContentPane().setBackground(Color.YELLOW);
			      yellow.setBackground(Color.YELLOW);
				}
			// If selected color is black
			if(arg0.getSource()==black){
				  this.getContentPane().getGraphics().setColor(Color.WHITE);
				  this.getContentPane().setBackground(Color.BLACK);
			      black.setBackground(Color.BLACK);
				}
			// If selected color is pink
			if(arg0.getSource()==pink){
				  this.getContentPane().setBackground(Color.PINK);
			      pink.setBackground(Color.PINK);
		}
			// If selected color is cyan
			if(arg0.getSource()==cyan){
				  this.getContentPane().setBackground(Color.CYAN);
			      cyan.setBackground(Color.CYAN);
				}
			// If selected color is magenta
			if(arg0.getSource()==magenta){
				  this.getContentPane().setBackground(Color.MAGENTA);
			      magenta.setBackground(Color.MAGENTA);
				}
			
			// If selected color is random
			/**
			 * create a list of possible colors and select a random one and 
			 * change the background
			 */
			List<Color> colors = new ArrayList<>();
			colors.add(Color.BLUE);
			colors.add(Color.GREEN);
			colors.add(Color.RED);
			colors.add(Color.YELLOW);
			colors.add(Color.BLACK);
			colors.add(Color.PINK);
			colors.add(Color.CYAN);
			colors.add(Color.MAGENTA);
			Random rand = new Random();
		    Color c =colors.get(rand.nextInt(colors.size()));
					if(arg0.getSource()==random){
						  this.getContentPane().setBackground(c);
					      random.setBackground(c);
						}
		
		repaint();	
		}
}
