package project.AdvanceWars.dto.unites;

import project.AdvanceWars.enumValues.TypeUnite;

public class UniteDistanceDto extends UniteDto {

	private int porteeMin;
	private int porteeMax;

	public UniteDistanceDto(int X, int Y, TypeUnite unite) {
		super(X, Y, unite);
		if (unite == TypeUnite.ARTILLERIE) {
			this.setPorteeMin(2);
			this.setPorteeMax(3);
		} else if (unite == TypeUnite.LMISS || unite == TypeUnite.AAIR) {
			this.setPorteeMin(3);
			this.setPorteeMax(5);
		} else if (unite == TypeUnite.DESTROYER) {
			this.setPorteeMin(2);
			this.setPorteeMax(6);
		}
	}

	public int getPorteeMin() {
		return this.porteeMin;
	}
	
	public void setPorteeMin(int portMin) {
		this.porteeMin = portMin;
	}

	public int getPorteeMax() {
		return this.porteeMax;
	}

	public void setPorteeMax(int portMax) {
		this.porteeMax = portMax;
	}
}
