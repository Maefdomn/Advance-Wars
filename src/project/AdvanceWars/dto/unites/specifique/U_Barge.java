package project.AdvanceWars.dto.unites.specifique;

import project.AdvanceWars.enumValues.ListeUnites;
import project.AdvanceWars.dto.unites.UniteContactDto;

public class U_Barge extends UniteContactDto {

	public U_Barge(int X, int Y) {
		super(X, Y, ListeUnites.BARGE);
	}

	public String toString() {
		return "Barge";
	}
}
