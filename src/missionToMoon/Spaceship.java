package missionToMoon;

public interface Spaceship {

	public boolean hasLaunch();

	public boolean hasLand();

	public boolean canCarry(Item item);

	public void carry(Item item);

}
