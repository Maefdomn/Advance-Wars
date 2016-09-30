package project.AdvanceWars.dto.terrains.specifique;

import project.AdvanceWars.dto.terrains.Terrain;
import project.AdvanceWars.enumValues.ListeTerrains;

public class T_Plaine extends Terrain {

	public T_Plaine() {
		super(ListeTerrains.PLAINE);
	}

	@Override
	public String toString() {
		return "Plaine";
	}
}
