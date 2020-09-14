package decoratordesignpattern;
/**
 * child of the PlayerDecorator class
 * @author null
 *
 */
public class WeaponUpgrade extends PlayerDecorator {
	Player player;
	/**
	 * constructor
	 * @param player
	 */
	public WeaponUpgrade(Player player) {
		this.player = player;
	}
	/**
	 * returns the power level for the Player class
	 */
	@Override
	public double getPower() {
		return player.getPower() + 5.0;
	}
	/**
	 * returns the data for the player with the
	 * added String "Upgraded weapon"
	 */
	@Override
	public String toString() {
		return player.toString() + "\nUpgraded weapon";
	}
}
