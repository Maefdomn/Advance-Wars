package terrains.terrain;

import terrains.Batiment;
import caracteristiques.ENUM;

public class T_Aeroport extends Batiment {

	public T_Aeroport() {
		super(ENUM.ListeTerrains.AEROPORT);
	}

	public String toString() {
		return "Aeroport";
	}

}
