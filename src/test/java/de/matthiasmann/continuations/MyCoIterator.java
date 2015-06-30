package de.matthiasmann.continuations;

@SuppressWarnings("serial")
public class MyCoIterator extends CoIterator<String>
{
	@Override
	public void run() throws SuspendExecution
	{
		for (int j = 0; j < 3; j++)
		{
			produce("Hugo " + j);
			produce("Test");
			for (int i = 1; i < 10; i++)
			{
				produce("Number " + i);
			}
			produce("Nix");
		}
	}
}
