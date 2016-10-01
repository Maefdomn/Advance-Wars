package project.AdvanceWars.dto.terrains.specifique;

import project.AdvanceWars.dto.terrains.TerrainDto;
import project.AdvanceWars.enumValues.TypeTerrain;

public class T_Montagne extends TerrainDto {

	public T_Montagne() {
		setDefense(4);
		setMvtInfanterie(2);
		setMvtInfanterieLourde(1);
		setMvtRoues(20);
		setMvtChar(20);
		setMvtAir(1);
		setMvtNavire(20);
		setMvtTransport(20);
		setMvtSub(20);
		setDescription("Montagne abrupte. L'infanterie gagne 3 points a son champ de vision.");
		setCamouflage(Boolean.TRUE);
		setTypeTerrain(TypeTerrain.MONTAGNE);
	}

	@Override
	public String toString() {
		return "Montagne";
	}
}
