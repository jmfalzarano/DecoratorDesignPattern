package decoratordesignpattern;
/**
 * class that upgrades the armor for the
 * Player classes through PlayerDecorator
 * @author null
 *
 */
public class ArmorUpgrade extends PlayerDecorator{
	Player player;
	/**
	 * constructor for the class
	 * @param player
	 */
	public ArmorUpgrade(Player player) {
		this.player = player;
	}
	/**
	 * returns the power level for the player class
	 */
	@Override
	public double getPower() {
		return player.getPower() + 3.0;
	}
	/**
	 * returning the String with "Upgraded Armor"
	 */
	@Override
	public String toString() {
		return player.toString() + "\nUpgraded armor";
	}
}
