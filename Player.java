package decoratordesignpattern;
/**
 * Class that gives each of the player classes
 * their methods
 * @author null
 *
 */
public abstract class Player {
	protected String name;
	protected int attack;
	protected int defence;
	protected int intellect;
	protected String weapon;
	protected String armor;
	
	/**
	 * method that determines overall powerlevel
	 * via the given function
	 * @return
	 */
	public double getPower() {
		return attack * 3 + defence + intellect / 2;
	}
	/**
	 * The format to make the output appear
	 * as the instructors does
	 */
	public String toString() {
		return name + "\nCarries a " + this.weapon
				+ ", and wears a " + this.armor;
	}
}
