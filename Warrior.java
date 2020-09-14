package decoratordesignpattern;
/**
 * Child of the Player parent class
 * @author null
 *
 */
public class Warrior extends Player {
	/**
	 * constructor
	 * @param name
	 */
	public Warrior(String name) {
		this.name = name;
		this.attack = 8;
		this.defence = 5;
		this.intellect = 2;
		this.weapon = "Sword";
		this.armor = "Breast Plate";
	}
	/**
	 * returns the data for the class of Player
	 */
	@Override
	public String toString() {
		return "Warrior: "+super.toString();
	}
}
