package project.AdvanceWars.dto.unites.specifique;

import project.AdvanceWars.enumValues.TypeUnite;
import project.AdvanceWars.dto.unites.UniteContactDto;

public class U_Barge extends UniteContactDto {

	public U_Barge(int X, int Y) {
		super(X, Y, TypeUnite.BARGE);
	}

	public String toString() {
		return "Barge";
	}
}
