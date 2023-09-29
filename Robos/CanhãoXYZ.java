mport robocode.*;

import java.awt.*;



public class CanhãoXYZ extends AdvancedRobot {
	boolean movingForward;

	public void run() {
		setBodyColor(new Color(255, 2255, 0));
		setGunColor(new Color(255, 255, 0));
		setRadarColor(new Color(255, 255, 0));
		setBulletColor(new Color(255, 255, 0));
		setScanColor(new Color(255, 255, 0));

	
		while (true) {
		
			setAhead(40000);
			movingForward = true;
		
			setTurnRight(90);
		
			waitFor(new TurnCompleteCondition(this));
			
			setTurnLeft(180);
		
			waitFor(new TurnCompleteCondition(this));
		
			setTurnRight(180);
		
			waitFor(new TurnCompleteCondition(this));
		
		}
	}

	public void onHitWall(HitWallEvent e) {
	
		reverseDirection();
	}


	public void reverseDirection() {
		if (movingForward) {
			setBack(40000);
			movingForward = false;
		} else {
			setAhead(40000);
			movingForward = true;
		}
	}


	public void onScannedRobot(ScannedRobotEvent e) {
		fire(3);
	}

	public void onHitRobot(HitRobotEvent e) {
		
		if (e.isMyFault()) {
			reverseDirection();
		}
	}
}
