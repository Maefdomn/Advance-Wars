package project.AdvanceWars.dto.terrains.specifique;

import project.AdvanceWars.dto.terrains.Batiment;
import project.AdvanceWars.enumValues.ListeTerrains;

public class T_QG extends Batiment {

	public T_QG() {
		super(ListeTerrains.QG);
	}

	@Override
	public String toString() {
		return "QG";
	}
}
