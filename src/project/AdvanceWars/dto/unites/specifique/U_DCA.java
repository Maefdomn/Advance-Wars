package project.AdvanceWars.dto.unites.specifique;

import project.AdvanceWars.enumValues.TypeUnite;
import project.AdvanceWars.dto.unites.UniteContactDto;

public class U_DCA extends UniteContactDto {

	public U_DCA(int X, int Y) {
		super(X, Y, TypeUnite.DCA);
	}

	public String toString() {
		return "DCA";
	}
}
