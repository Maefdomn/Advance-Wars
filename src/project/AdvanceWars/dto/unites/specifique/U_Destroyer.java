package project.AdvanceWars.dto.unites.specifique;

import project.AdvanceWars.enumValues.TypeUnite;
import project.AdvanceWars.dto.unites.UniteDistanceDto;

public class U_Destroyer extends UniteDistanceDto {

	public U_Destroyer(int X, int Y) {
		super(X, Y, TypeUnite.DESTROYER);
	}

	public String toString() {
		return "Destroyer";
	}
}
