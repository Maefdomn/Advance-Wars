package project.AdvanceWars.dto.unites.specifique;

import project.AdvanceWars.enumValues.ListeUnites;
import project.AdvanceWars.dto.unites.UniteDistanceDto;

public class U_AAir extends UniteDistanceDto {

	public U_AAir(int X, int Y) {
		super(X, Y, ListeUnites.AAIR);
	}

	public String toString() {
		return "A-air";
	}
}
