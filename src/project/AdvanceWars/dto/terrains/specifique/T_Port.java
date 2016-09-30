package project.AdvanceWars.dto.terrains.specifique;

import project.AdvanceWars.dto.terrains.Batiment;
import project.AdvanceWars.enumValues.ListeTerrains;

public class T_Port extends Batiment {

	public T_Port() {
		super(ListeTerrains.PORT);
	}

	@Override
	public String toString() {
		return "Port";
	}
}
