package project.AdvanceWars.dto.unites.specifique;

import project.AdvanceWars.enumValues.ListeUnites;
import project.AdvanceWars.dto.unites.UniteContactDto;

public class U_Recon extends UniteContactDto {

	public U_Recon(int X, int Y) {
		super(X, Y, ListeUnites.RECON);
	}

	public String toString() {
		return "Recon";
	}
}
