
package basics;

public class Team
{
	private int teamID;
	private int[] schedule;
	private double[] scores;
	
	public boolean shutup()
	{
		teamID -= (int) schedule[0] * scores[0];
		int var = 100 - teamID;
		return (var > 100);
	}
}
