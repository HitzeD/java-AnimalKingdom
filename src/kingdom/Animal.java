package kingdom;

public abstract class Animal
{

	public Animal(String name, int uni, int discovered)
	{
		this.name = name;
		this.uni = uni;
		this.discovered = discovered;
	}

	public abstract String move();
	public abstract String breathe();
	public abstract String reproduce();

	public String eat()
	{
		return "I eat food with my mouth";
	}


}