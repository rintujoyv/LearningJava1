package missionToMoon;

public class R2 extends Rocket {
	public R2() {
		super();
		this.rocketCost = 120;
		this.rocketWeight = 18000;// Converted to KG
		this.maxWeight = 29000;
		this.chanceToLaunchExplosion = 0;
		this.chanceToLandCrash = 0;

	}

	@Override
	public boolean hasLaunch() {

		double randomNumber = Math.random() * 100 + 1;
		chanceToLaunchExplosion = 4.0 * (rocketWeight - currentWeight) / (maxWeight - rocketWeight);

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
		double randomNumber = Math.random() * 100 + 1;
		chanceToLandCrash = 8.0 * (rocketWeight - currentWeight) / (maxWeight - rocketWeight);

//		System.out.println("Chances of Land Crash: "+chanceToLandCrash);
//		System.out.println("Random number: "+randomNumber);

		if (chanceToLandCrash <= randomNumber) {

			return true;
		} else {
			return false;
		}

	}

}
