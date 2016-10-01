package project.AdvanceWars.dto.unites.specifique;

import project.AdvanceWars.enumValues.TypeUnite;
import project.AdvanceWars.dto.unites.UniteDistanceDto;

public class U_Artillerie extends UniteDistanceDto {

	public U_Artillerie(int X, int Y) {
		super(X, Y, TypeUnite.ARTILLERIE);
	}

	public String toString() {
		return "Artillerie";
	}
}
