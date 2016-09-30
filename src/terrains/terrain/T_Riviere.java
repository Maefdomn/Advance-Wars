package terrains.terrain;

import terrains.Terrain;
import caracteristiques.ENUM;

public class T_Riviere extends Terrain {

	public T_Riviere() {
		super(ENUM.ListeTerrains.RIVIERE);
	}

	public String toString() {
		return "Riviere";
	}
}
