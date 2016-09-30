package project.AdvanceWars.dto.terrains.specifique;

import project.AdvanceWars.dto.terrains.Terrain;
import project.AdvanceWars.enumValues.ListeTerrains;

public class T_Plage extends Terrain {

	public T_Plage() {
		super(ListeTerrains.PLAGE);
	}

	@Override
	public String toString() {
		return "Plage";
	}
}
