package com.bm.cosmic;

public class Player {
	int playerId;
	String plName;
	int jersy;

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlName() {
		return plName;
	}

	public void setPlName(String plName) {
		this.plName = plName;
	}

	public int getJersy() {
		return jersy;
	}

	public void setJersy(int jersy) {
		this.jersy = jersy;
	}

	public Player(int playerId, String plName, int jersy) {

		this.playerId = playerId;
		this.plName = plName;
		this.jersy = jersy;
	}

	public Player() {

	}

	public String toString() {
		return "[PlayerID :" + playerId + " Player Name : " + plName + "  Jersy No :  " + jersy + "]";
	}

	public boolean equals(Player p) {
//		if (this.plName.equals(p.getPlName()) && this.jersy == p.jersy && this.playerId == p.playerId) {  //Syantactically correcct
		if (this.playerId == p.playerId) {// Logicaly correct
			return true;
		}
		return false;
	}
}
