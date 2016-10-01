package project.AdvanceWars.dto.unites.specifique;

import project.AdvanceWars.enumValues.TypeUnite;
import project.AdvanceWars.dto.unites.UniteContactDto;

public class U_Tank extends UniteContactDto {

	public U_Tank(int X, int Y) {
		super(X, Y, TypeUnite.TANK);
	}

	public String toString() {
		return "Tank";
	}
}
