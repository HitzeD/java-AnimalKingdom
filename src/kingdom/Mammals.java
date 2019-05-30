package kingdom;

public class Mammals extends Animal
{

	public Mammals(String name, int uni, int discovered)
	{
		this.name = name;
		this.uni = uni;
		this.discovered = discovered;
	}

	public String getName()
	{
		return this.name;
	}

	public String move()
	{
		return "I walk with Legs";
	}

	public String breathe()
	{
		return "I breathe with my Lungs";
	}

	public String reproduce()
	{
		return "I give live birth";
	}
}