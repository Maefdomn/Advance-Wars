package project.AdvanceWars.dto.unites.specifique;

import project.AdvanceWars.enumValues.TypeUnite;
import project.AdvanceWars.dto.unites.UniteDistanceDto;

public class U_LMiss extends UniteDistanceDto {

	public U_LMiss(int X, int Y) {
		super(X, Y, TypeUnite.LMISS);
	}

	public String toString() {
		return "L-miss";
	}
}
