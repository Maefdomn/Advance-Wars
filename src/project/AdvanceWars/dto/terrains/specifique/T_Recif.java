package project.AdvanceWars.dto.terrains.specifique;

import project.AdvanceWars.dto.terrains.TerrainDto;
import project.AdvanceWars.enumValues.TypeTerrain;

public class T_Recif extends TerrainDto {

	public T_Recif() {
		setDefense(1);
		setMvtInfanterie(20);
		setMvtInfanterieLourde(20);
		setMvtRoues(20);
		setMvtChar(20);
		setMvtAir(1);
		setMvtNavire(2);
		setMvtTransport(2);
		setMvtSub(2);
		setDescription("En brouillard, les unites ne sont vues que par des troupes proches ou volantes.");
		setCamouflage(Boolean.TRUE);
		setTypeTerrain(TypeTerrain.RECIF);
	}

	@Override
	public String toString() {
		return "Recif";
	}
}
