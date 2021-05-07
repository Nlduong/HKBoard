
public class Player {

	private String playerName ;
    
    private String playerNumber;
    
    private int fail;
    
    private boolean InOut;
    
    private int score;
    
    private String Team;		
    
	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getPlayerNumber() {
		return playerNumber;
	}

	public void setPlayerNumber(String playerNumber) {
		this.playerNumber = playerNumber;
	}

	public int getFail() {
		return fail;
	}

	public void setFail(int fail) {
		this.fail = fail;
	}

	public boolean isInOut() {
		return InOut;
	}

	public void setInOut(boolean inOut) {
		InOut = inOut;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getTeam() {
		return Team;
	}

	public void setTeam(String team) {
		Team = team;
	}

	
	
}
