package project.AdvanceWars.dto.unites.specifique;

import project.AdvanceWars.enumValues.TypeUnite;
import project.AdvanceWars.dto.unites.UniteContactDto;

public class U_Chasseur extends UniteContactDto {

	public U_Chasseur(int X, int Y) {
		super(X, Y, TypeUnite.CHASSEUR);
	}

	public String toString() {
		return "Chasseur";
	}
}
