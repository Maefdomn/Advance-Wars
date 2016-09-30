package terrains.terrain;

import terrains.Terrain;
import caracteristiques.ENUM;

public class T_Montagne extends Terrain {

	public T_Montagne() {
		super(ENUM.ListeTerrains.MONTAGNE);
	}

	public String toString() {
		return "Montagne";
	}
}
