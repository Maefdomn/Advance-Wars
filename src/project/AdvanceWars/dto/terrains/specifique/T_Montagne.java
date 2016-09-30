package project.AdvanceWars.dto.terrains.specifique;

import project.AdvanceWars.dto.terrains.Terrain;
import project.AdvanceWars.enumValues.ListeTerrains;

public class T_Montagne extends Terrain {

	public T_Montagne() {
		super(ListeTerrains.MONTAGNE);
	}

	@Override
	public String toString() {
		return "Montagne";
	}
}
