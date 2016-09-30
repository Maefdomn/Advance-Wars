package project.AdvanceWars.dto.terrains.specifique;

import project.AdvanceWars.dto.terrains.Terrain;
import project.AdvanceWars.enumValues.ListeTerrains;

public class T_Route extends Terrain {

	public T_Route() {
		super(ListeTerrains.ROUTE);
	}

	@Override
	public String toString() {
		return "Route";
	}
}
