package project.AdvanceWars.dto.unites.specifique;

import project.AdvanceWars.enumValues.ListeUnites;
import project.AdvanceWars.dto.unites.UniteContactDto;

public class U_Chasseur extends UniteContactDto {

	public U_Chasseur(int X, int Y) {
		super(X, Y, ListeUnites.CHASSEUR);
	}

	public String toString() {
		return "Chasseur";
	}
}
