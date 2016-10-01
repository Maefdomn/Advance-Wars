package project.AdvanceWars.dto.unites.specifique;

import project.AdvanceWars.enumValues.ListeUnites;
import project.AdvanceWars.dto.unites.UniteContactDto;

public class U_TankM extends UniteContactDto {

	public U_TankM(int X, int Y) {
		super(X, Y, ListeUnites.TANKM);
	}

	public String toString() {
		return "TankM";
	}
}
