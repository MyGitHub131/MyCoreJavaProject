package IPLMatch.Testing;

public class FactoryIplMatch {
	public static IIPLMatch calledFactory(String msg)
	{
		if (msg.equals("BatsMan")) {
			return new BatsMan();
		}
		else if (msg.equals("Bowler")) {
			return new Bowler();
		}
		else {
			return new BatsMan();
		}
	}

}
