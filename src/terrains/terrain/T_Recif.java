package terrains.terrain;

import terrains.Terrain;
import caracteristiques.ENUM;

public class T_Recif extends Terrain {

	public T_Recif() {
		super(ENUM.ListeTerrains.RECIF);
	}

	public String toString() {
		return "Recif";
	}
}
