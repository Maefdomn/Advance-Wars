package project.AdvanceWars.dto.unites.specifique;

import project.AdvanceWars.enumValues.ListeUnites;
import project.AdvanceWars.dto.unites.UniteContactDto;

public class U_DCA extends UniteContactDto {

	public U_DCA(int X, int Y) {
		super(X, Y, ListeUnites.DCA);
	}

	public String toString() {
		return "DCA";
	}
}
