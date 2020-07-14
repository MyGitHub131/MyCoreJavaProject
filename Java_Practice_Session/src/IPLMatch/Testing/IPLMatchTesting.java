package IPLMatch.Testing;

public class IPLMatchTesting {
	public static void main(String[] args) {
		//IIPLMatch m = new BatsMan();
		//IIPLMatch m = new Bowler();
		IIPLMatch m = FactoryIplMatch.calledFactory("Bowler");
			m.country();
			m.batName();
			m.balName();
			m.runs();
			m.wickets();
			m.bestScores();
			m.bestWickets();
			m.strikeAvg();
			m.bowlingAvg();
			m.batRecords();
			m.balRecords();
			m.batRanking();
			m.balRanking();
	}
}
