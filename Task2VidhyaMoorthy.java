import java.awt.Color;
import javax.swing.JFrame;

public class Task2VidhyaMoorthy
{
   public static void main(String[] args)
   {
	   JFrame carFrame = new JFrame();
	   final int FRAME_WIDTH = 570;
	   final int FRAME_HEIGHT = 400;
		carFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		carFrame.setTitle("Two cars");
		carFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		carFrame.setForeground(Color.cyan);
		carFrame.setBackground(Color.MAGENTA);

   CarComponent component = new CarComponent();
   carFrame.add(component);
   carFrame.setVisible(true);
   component.startCars(); // creates two threads and initiates two cars in opposite direction
   }
}