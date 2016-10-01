package project.AdvanceWars.dto.unites.specifique;

import project.AdvanceWars.enumValues.TypeUnite;
import project.AdvanceWars.dto.unites.UniteContactDto;

public class U_Helico extends UniteContactDto {

	public U_Helico(int X, int Y) {
		super(X, Y, TypeUnite.HELICO);
	}

	public String toString() {
		return "Helico";
	}
}
