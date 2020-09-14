package decoratordesignpattern;
/**
 * Abstract class that gives abstract
 * methods to it's children
 * @author null
 *
 */
public abstract class PlayerDecorator extends Player{
	public abstract String toString();
	public abstract double getPower();
}
