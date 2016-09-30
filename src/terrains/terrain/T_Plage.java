package terrains.terrain;

import terrains.Terrain;
import caracteristiques.ENUM;

public class T_Plage extends Terrain {

	public T_Plage() {
		super(ENUM.ListeTerrains.PLAGE);
	}

	public String toString() {
		return "Plage";
	}
}
