package project.AdvanceWars.dto.unites.specifique;

import project.AdvanceWars.enumValues.ListeUnites;
import project.AdvanceWars.dto.unites.UniteContactDto;

public class U_Infanterie extends UniteContactDto {

	public U_Infanterie(int X, int Y) {
		super(X, Y, ListeUnites.INFANTERIE);
	}

	public String toString() {
		return "Infanterie";
	}
}
