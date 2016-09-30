package project.AdvanceWars.dto.terrains.specifique;

import project.AdvanceWars.dto.terrains.Batiment;
import project.AdvanceWars.enumValues.ListeTerrains;

public class T_Aeroport extends Batiment {

	public T_Aeroport() {
		super(ListeTerrains.AEROPORT);
	}

	@Override
	public String toString() {
		return "Aeroport";
	}

}
