package decoratordesignpattern;
/**
 * Child class of Player
 * @author null
 *
 */
public class Healer extends Player{
	/**
	 * constructor
	 * @param name
	 */
	public Healer(String name) {
		this.name = name;
		this.attack = 2;
		this.defence = 3;
		this.intellect = 8;
		this.weapon = "Staf";
		this.armor = "Robe";
	}
	/**
	 * returns the data for the class of Player
	 */
	@Override
	public String toString() {
		return "Healer: "+super.toString();
	}
}
