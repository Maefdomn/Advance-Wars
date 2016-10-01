package project.AdvanceWars.dto.unites.specifique;

import project.AdvanceWars.enumValues.TypeUnite;
import project.AdvanceWars.dto.unites.UniteContactDto;

public class U_SousMarin extends UniteContactDto {

	public U_SousMarin(int X, int Y) {
		super(X, Y, TypeUnite.SOUSMARIN);
	}

	public String toString() {
		return "SousMarin";
	}
}
