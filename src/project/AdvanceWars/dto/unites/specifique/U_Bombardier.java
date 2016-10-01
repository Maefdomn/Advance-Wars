package project.AdvanceWars.dto.unites.specifique;

import project.AdvanceWars.enumValues.ListeUnites;
import project.AdvanceWars.dto.unites.UniteContactDto;

public class U_Bombardier extends UniteContactDto {

	public U_Bombardier(int X, int Y) {
		super(X, Y, ListeUnites.BOMBARDIER);
	}

	public String toString() {
		return "Bombardier";
	}
}
