package terrains.terrain;

import terrains.Terrain;
import caracteristiques.ENUM;

public class T_Pont extends Terrain {

	public T_Pont() {
		super(ENUM.ListeTerrains.PONT);
	}

	public String toString() {
		return "Pont";
	}
}
