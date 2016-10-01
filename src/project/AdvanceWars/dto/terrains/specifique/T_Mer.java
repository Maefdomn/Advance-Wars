package project.AdvanceWars.dto.terrains.specifique;

import project.AdvanceWars.dto.terrains.TerrainDto;
import project.AdvanceWars.enumValues.TypeTerrain;

public class T_Mer extends TerrainDto {

	public T_Mer() {
		setDefense(0);
		setMvtInfanterie(20);
		setMvtInfanterieLourde(20);
		setMvtRoues(20);
		setMvtChar(20);
		setMvtAir(1);
		setMvtNavire(1);
		setMvtTransport(1);
		setMvtSub(1);
		setDescription("Une etendue d'eau. Seule une unite aerienne ou maritime peut la traverser.");
		setCamouflage(Boolean.FALSE);
		setTypeTerrain(TypeTerrain.MER);
	}

	@Override
	public String toString() {
		return "Mer";
	}
}
