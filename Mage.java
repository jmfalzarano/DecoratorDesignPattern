package decoratordesignpattern;
/**
 * Child class of the Player class
 * @author null
 *
 */
public class Mage extends Player{
	/**
	 * constructor
	 * @param name
	 */
	public Mage(String name) {
		this.name = name;
		this.attack = 3;
		this.defence = 4;
		this.intellect = 7;
		this.weapon = "Staf";
		this.armor = "Robe";
	}
	/**
	 * returns the data for the class of Player
	 */
	@Override
	public String toString() {
		return "Mage: "+super.toString();
	}
}
