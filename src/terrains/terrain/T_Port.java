package terrains.terrain;

import terrains.Batiment;
import caracteristiques.ENUM;

public class T_Port extends Batiment {

	public T_Port() {
		super(ENUM.ListeTerrains.PORT);
	}

	public String toString() {
		return "Port";
	}
}
