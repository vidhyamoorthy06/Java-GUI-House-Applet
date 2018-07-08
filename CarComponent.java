import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
   This component draws two cars
*/
public class CarComponent extends JComponent
{
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Car car1;
	private Car car2;

   public CarComponent()
   {
	   car1 = new Car(1200, 100);//car 1 starts on the far left of the screen
	   car2 = new Car(10, 300); //car 2 starts on the right side of the screen
   }
  
   public void paintComponent(Graphics g)
   {
	   Graphics2D g2 = (Graphics2D) g;
	   car1.draw(g2);
	   car2.draw(g2);
   }
  
/**
Starts the animation threads.
 */
   
   public void startCars()
   {
	   
	   class CarRunnable implements Runnable
	   {
		   Car car;
		   int dx;
		   int dy;
		   
		   public CarRunnable(Car car, int dx, int dy) 
		   {
			   this.car = car;
			   this.dx = dx;
			   this.dy = dy;
		   }

   public void run()
   {
	   final int DELAY = 10; // speed of the car movement can be set here. Lower the delay time, faster car
	   final int STEPS = 1150; // travel distance inside the frame
	   try
	   {
		   for (int i = 0; i < STEPS; i++)
		   {
			   car.move(dy, dx);
			   CarComponent.this.repaint();
			   Thread.sleep(DELAY);
		   }
   
	   }
	  catch (InterruptedException exception)
	   {}
   }
  
  
}

// Creation of car thread and run
	   
Runnable r1 = new CarRunnable(car1, 0, -1); // x and y position lets the car move from left to right
Runnable r2 = new CarRunnable(car2, 0, 1); // right to left position
Thread t1 = new Thread(r1);
Thread t2 = new Thread(r2);
t1.start();
t2.start();
   }
}