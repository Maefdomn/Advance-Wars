package project.AdvanceWars.dto.unites.specifique;

import project.AdvanceWars.enumValues.TypeUnite;
import project.AdvanceWars.dto.unites.UniteContactDto;

public class U_Bazooka extends UniteContactDto {

	public U_Bazooka(int X, int Y) {
		super(X, Y, TypeUnite.BAZOOKA);
	}

	public String toString() {
		return "Bazooka";
	}
}
