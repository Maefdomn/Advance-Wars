package project.AdvanceWars.dto.terrains.specifique;

import project.AdvanceWars.dto.terrains.TerrainDto;
import project.AdvanceWars.enumValues.TypeTerrain;

public class T_Foret extends TerrainDto {

	public T_Foret() {
		setDefense(2);
		setMvtInfanterie(1);
		setMvtInfanterieLourde(1);
		setMvtRoues(3);
		setMvtChar(2);
		setMvtAir(1);
		setMvtNavire(20);
		setMvtTransport(20);
		setMvtSub(20);
		setDescription("En brouillard, les unites ne sont vues que par des troupes proches ou volantes.");
		setCamouflage(Boolean.TRUE);
		setTypeTerrain(TypeTerrain.FORET);
	}

	@Override
	public String toString() {
		return "Foret";
	}
}
