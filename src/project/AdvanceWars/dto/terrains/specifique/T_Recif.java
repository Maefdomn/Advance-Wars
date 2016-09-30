package project.AdvanceWars.dto.terrains.specifique;

import project.AdvanceWars.dto.terrains.Terrain;
import project.AdvanceWars.enumValues.ListeTerrains;

public class T_Recif extends Terrain {

	public T_Recif() {
		super(ListeTerrains.RECIF);
	}

	@Override
	public String toString() {
		return "Recif";
	}
}
