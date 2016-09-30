package project.AdvanceWars.dto.unites.specifique;

import project.AdvanceWars.dto.unites.UniteContactDto;
import project.AdvanceWars.enumValues.ListeUnites;

public class U_Infanterie extends UniteContactDto {

	public U_Infanterie(int X, int Y) {
		super(X, Y, ListeUnites.INFANTERIE);
	}

	public String toString() {
		return "Infanterie";
	}
}
