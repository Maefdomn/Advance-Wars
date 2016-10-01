package project.AdvanceWars.dto.unites.specifique;

import project.AdvanceWars.enumValues.ListeUnites;
import project.AdvanceWars.dto.unites.UniteDistanceDto;

public class U_LMiss extends UniteDistanceDto {

	public U_LMiss(int X, int Y) {
		super(X, Y, ListeUnites.LMISS);
	}

	public String toString() {
		return "L-miss";
	}
}
