package project.AdvanceWars.dto.unites.specifique;

import project.AdvanceWars.enumValues.TypeUnite;
import project.AdvanceWars.dto.unites.UniteContactDto;

public class U_TankM extends UniteContactDto {

	public U_TankM(int X, int Y) {
		super(X, Y, TypeUnite.TANKM);
	}

	public String toString() {
		return "TankM";
	}
}
