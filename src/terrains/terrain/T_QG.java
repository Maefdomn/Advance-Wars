package terrains.terrain;

import terrains.Batiment;
import caracteristiques.ENUM;

public class T_QG extends Batiment {

	public T_QG() {
		super(ENUM.ListeTerrains.QG);
	}

	public String toString() {
		return "QG";
	}
}
