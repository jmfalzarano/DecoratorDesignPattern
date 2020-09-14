package decoratordesignpattern;
/**
 * Child class of PlayerDecorator
 * @author null
 *
 */
public class Skill extends PlayerDecorator{
	Player player;
	/**
	 * constructor
	 * @param player
	 */
	public Skill(Player player) {
		this.player = player;
	}
	/**
	 * returns the power level of the player class
	 */
	@Override
	public double getPower() {
		return player.getPower() + 2.0;
	}
	/**
	 * returns the information on the player with
	 * the added "Gained a skill" String
	 */
	@Override
	public String toString() {
		return player.toString() + "\nGained a skill";
	}
	
}
