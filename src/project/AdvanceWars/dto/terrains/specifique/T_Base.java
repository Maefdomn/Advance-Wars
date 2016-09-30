package project.AdvanceWars.dto.terrains.specifique;

import project.AdvanceWars.dto.terrains.Batiment;
import project.AdvanceWars.enumValues.ListeTerrains;

public class T_Base extends Batiment {

	public T_Base() {
		super(ListeTerrains.BASE);
	}

	@Override
	public String toString() {
		return "Base";
	}
}
