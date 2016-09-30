package project.AdvanceWars.dto.unites;

import project.AdvanceWars.enumValues.ListeUnites;

public class UniteDistanceDto extends UniteDto {

	private int porteeMin;
	private int porteeMax;

	public UniteDistanceDto(int X, int Y, ListeUnites unite) {
		super(X, Y, unite);
		if (unite == ListeUnites.ARTILLERIE) {
			this.porteeMin = 2;
			this.porteeMax = 3;
		} else if (unite == ListeUnites.LMISS) {
			this.porteeMin = 3;
			this.porteeMax = 5;
		} else if (unite == ListeUnites.AAIR) {
			this.porteeMin = 3;
			this.porteeMax = 5;
		} else if (unite == ListeUnites.DESTROYER) {
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
