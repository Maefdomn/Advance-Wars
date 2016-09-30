package terrains.terrain;

import terrains.Terrain;
import caracteristiques.ENUM;

public class T_Route extends Terrain {

	public T_Route() {
		super(ENUM.ListeTerrains.ROUTE);
	}

	public String toString() {
		return "Route";
	}
}
