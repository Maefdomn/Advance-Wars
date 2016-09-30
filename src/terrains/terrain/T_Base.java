package terrains.terrain;

import terrains.Batiment;
import caracteristiques.ENUM;

public class T_Base extends Batiment {

	public T_Base() {
		super(ENUM.ListeTerrains.BASE);
	}

	public String toString() {
		return "Base";
	}
}
