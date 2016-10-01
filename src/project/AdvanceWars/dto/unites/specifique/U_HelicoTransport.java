package project.AdvanceWars.dto.unites.specifique;

import project.AdvanceWars.enumValues.ListeUnites;
import project.AdvanceWars.dto.unites.UniteContactDto;

public class U_HelicoTransport extends UniteContactDto {

	public U_HelicoTransport(int X, int Y) {
		super(X, Y, ListeUnites.HELICOTRANSPORT);
	}

	public String toString() {
		return "HelicoTransport";
	}
}
