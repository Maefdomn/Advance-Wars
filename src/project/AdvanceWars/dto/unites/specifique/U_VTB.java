package project.AdvanceWars.dto.unites.specifique;

import project.AdvanceWars.enumValues.ListeUnites;
import project.AdvanceWars.dto.unites.UniteContactDto;

public class U_VTB extends UniteContactDto {

	public U_VTB(int X, int Y) {
		super(X, Y, ListeUnites.VTB);
	}

	public String toString() {
		return "VTB";
	}
}
