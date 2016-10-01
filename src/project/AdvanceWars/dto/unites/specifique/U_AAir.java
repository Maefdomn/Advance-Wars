package project.AdvanceWars.dto.unites.specifique;

import project.AdvanceWars.enumValues.TypeUnite;
import project.AdvanceWars.dto.unites.UniteDistanceDto;

public class U_AAir extends UniteDistanceDto {

	public U_AAir(int X, int Y) {
		super(X, Y, TypeUnite.AAIR);
	}

	public String toString() {
		return "A-air";
	}
}
