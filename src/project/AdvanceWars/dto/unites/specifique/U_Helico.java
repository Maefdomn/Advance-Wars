package project.AdvanceWars.dto.unites.specifique;

import project.AdvanceWars.enumValues.ListeUnites;
import project.AdvanceWars.dto.unites.UniteContactDto;

public class U_Helico extends UniteContactDto {

	public U_Helico(int X, int Y) {
		super(X, Y, ListeUnites.HELICO);
	}

	public String toString() {
		return "Helico";
	}
}
