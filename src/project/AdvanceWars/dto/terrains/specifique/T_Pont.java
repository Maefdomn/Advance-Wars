package project.AdvanceWars.dto.terrains.specifique;

import project.AdvanceWars.dto.terrains.Terrain;
import project.AdvanceWars.enumValues.ListeTerrains;

public class T_Pont extends Terrain {

	public T_Pont() {
		super(ListeTerrains.PONT);
	}

	@Override
	public String toString() {
		return "Pont";
	}
}
