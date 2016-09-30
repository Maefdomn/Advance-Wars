package terrains.terrain;

import terrains.Terrain;
import caracteristiques.ENUM;

public class T_Mer extends Terrain {

	public T_Mer() {
		super(ENUM.ListeTerrains.MER);
	}

	public String toString() {
		return "Mer";
	}
}
