package project.AdvanceWars.dto.terrains.specifique;

import project.AdvanceWars.dto.terrains.Batiment;
import project.AdvanceWars.enumValues.ListeTerrains;

public class T_Ville extends Batiment {

	public T_Ville() {
		super(ListeTerrains.VILLE);
	}

	@Override
	public String toString() {
		return "Ville";
	}
}
