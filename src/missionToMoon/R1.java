package missionToMoon;

public class R1 extends Rocket {

	public R1() {
		super();
		this.rocketCost = 100;
		this.rocketWeight = 10000;// Converted to KG
		this.maxWeight = 18000;
		this.chanceToLaunchExplosion = 0;
		this.chanceToLandCrash = 0;

	}

	@Override
	public boolean hasLaunch() {
		
		double randomNumber= Math.random()*100+1;

		chanceToLaunchExplosion = 5.0 * (rocketWeight - currentWeight) / (maxWeight - rocketWeight);
		
//		System.out.println("Chances of Launch Explosion: "+chanceToLaunchExplosion);
//		System.out.println("Random number: "+randomNumber);
	
		if (chanceToLaunchExplosion <= randomNumber) {

			return true;
		} else {
			return false;
		}

	}

	@Override
	public boolean hasLand() {
		double randomNumber= Math.random()*100+1;

		chanceToLandCrash = 1.0 * (rocketWeight - currentWeight) / (maxWeight - rocketWeight);
		
//		System.out.println("Chances of Land Crash: "+chanceToLandCrash);
//		System.out.println("Random number: "+randomNumber);
	
		if (chanceToLandCrash <= randomNumber) {

			return true;
		} else {
			return false;
		}

	}

}
