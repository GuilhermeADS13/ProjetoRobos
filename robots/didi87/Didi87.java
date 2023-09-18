package didi87;
import robocode.*;
import java.awt.Color;

/**
 * didi87 - a class by (Jose  guilherme)
 */
public class Didi87 extends Robot {
    public void run() {    
        setColors(Color.black,Color.red,Color.blue,Color.green,Color.blue);
        while (true) {
			ahead(1000);
		    turnRight(60); 
		}
    }
	//tank robô inimigo
   public void onScannedRobot(ScannedRobotEvent e) {
	String robotank = e.getName();   
    double distancia = e.getDistance();
	System.out.print(robotank + "distância" + distancia);
    if (distancia < 135) {
		fire(3);
	} else {
		fire(1);
	}
   }
  //colisão com a parede 
  public void onHitWall(HitWallEvent e ) {
	  back(100);
	  turnRight(90);
  }
}