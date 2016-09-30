package project.AdvanceWars.dto.terrains.specifique;

import project.AdvanceWars.dto.terrains.Terrain;
import project.AdvanceWars.enumValues.ListeTerrains;

public class T_Mer extends Terrain {

	public T_Mer() {
		super(ListeTerrains.MER);
	}

	@Override
	public String toString() {
		return "Mer";
	}
}
