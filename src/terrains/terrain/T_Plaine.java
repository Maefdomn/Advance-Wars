package terrains.terrain;

import terrains.Terrain;
import caracteristiques.ENUM;

public class T_Plaine extends Terrain {

	public T_Plaine() {
		super(ENUM.ListeTerrains.PLAINE);
	}

	public String toString() {
		return "Plaine";
	}
}
