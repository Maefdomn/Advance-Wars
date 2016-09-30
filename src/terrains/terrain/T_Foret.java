package terrains.terrain;

import terrains.Terrain;
import caracteristiques.ENUM;

public class T_Foret extends Terrain {

	public T_Foret() {
		super(ENUM.ListeTerrains.FORET);
	}

	public String toString() {
		return "Foret";
	}
}
