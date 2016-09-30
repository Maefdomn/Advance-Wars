package project.AdvanceWars.dto.terrains.specifique;

import project.AdvanceWars.dto.terrains.Terrain;
import project.AdvanceWars.enumValues.ListeTerrains;

public class T_Foret extends Terrain {

	public T_Foret() {
		super(ListeTerrains.FORET);
	}

	@Override
	public String toString() {
		return "Foret";
	}
}
