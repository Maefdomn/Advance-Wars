package project.AdvanceWars.dto.unites.specifique;

import project.AdvanceWars.enumValues.ListeUnites;
import project.AdvanceWars.dto.unites.UniteContactDto;

public class U_SousMarin extends UniteContactDto {

	public U_SousMarin(int X, int Y) {
		super(X, Y, ListeUnites.SOUSMARIN);
	}

	public String toString() {
		return "SousMarin";
	}
}
