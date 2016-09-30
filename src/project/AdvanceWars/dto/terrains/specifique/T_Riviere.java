package project.AdvanceWars.dto.terrains.specifique;

import project.AdvanceWars.dto.terrains.Terrain;
import project.AdvanceWars.enumValues.ListeTerrains;

public class T_Riviere extends Terrain {

	public T_Riviere() {
		super(ListeTerrains.RIVIERE);
	}

	@Override
	public String toString() {
		return "Riviere";
	}
}
