package terrains.terrain;

import terrains.Batiment;
import caracteristiques.ENUM;

public class T_Ville extends Batiment {

	public T_Ville() {
		super(ENUM.ListeTerrains.VILLE);
	}

	public String toString() {
		return "Ville";
	}
}
