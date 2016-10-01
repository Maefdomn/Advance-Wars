package project.AdvanceWars.dto.unites.specifique;

import project.AdvanceWars.enumValues.ListeUnites;
import project.AdvanceWars.dto.unites.UniteContactDto;

public class U_Croiseur extends UniteContactDto {

	public U_Croiseur(int X, int Y) {
		super(X, Y, ListeUnites.CROISEUR);
	}

	public String toString() {
		return "Croiseur";
	}
}
