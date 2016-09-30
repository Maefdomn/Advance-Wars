package unites;

import caracteristiques.ENUM;

public class UniteDistance extends Unite {

	private int porteeMin;
	private int porteeMax;

	public UniteDistance(int X, int Y, ENUM.ListeUnites unite) {
		super(X, Y, unite);
		if (unite == ENUM.ListeUnites.ARTILLERIE) {
			this.porteeMin = 2;
			this.porteeMax = 3;
		} else if (unite == ENUM.ListeUnites.LMISS) {
			this.porteeMin = 3;
			this.porteeMax = 5;
		} else if (unite == ENUM.ListeUnites.AAIR) {
			this.porteeMin = 3;
			this.porteeMax = 5;
		} else if (unite == ENUM.ListeUnites.DESTROYER) {
			this.porteeMin = 2;
			this.porteeMax = 6;
		}
	}

	public int getPorteeMin() {
		return this.porteeMin;
	}

	public int getPorteeMax() {
		return this.porteeMax;
	}

}
