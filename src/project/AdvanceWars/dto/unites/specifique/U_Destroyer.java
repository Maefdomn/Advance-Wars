package project.AdvanceWars.dto.unites.specifique;

import project.AdvanceWars.enumValues.ListeUnites;
import project.AdvanceWars.dto.unites.UniteDistanceDto;

public class U_Destroyer extends UniteDistanceDto {

	public U_Destroyer(int X, int Y) {
		super(X, Y, ListeUnites.DESTROYER);
	}

	public String toString() {
		return "Destroyer";
	}
}
