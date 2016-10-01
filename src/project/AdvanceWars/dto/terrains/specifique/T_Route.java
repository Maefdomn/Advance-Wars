package project.AdvanceWars.dto.terrains.specifique;

import project.AdvanceWars.dto.terrains.TerrainDto;
import project.AdvanceWars.enumValues.TypeTerrain;

public class T_Route extends TerrainDto {

	public T_Route() {
		setDefense(0);
		setMvtInfanterie(1);
		setMvtInfanterieLourde(1);
		setMvtRoues(1);
		setMvtChar(1);
		setMvtAir(1);
		setMvtNavire(20);
		setMvtTransport(20);
		setMvtSub(20);
		setDescription("Une route en bitume. Facile a traverser, mais n'offrant aucune couverture.");
		setCamouflage(Boolean.FALSE);
		setTypeTerrain(TypeTerrain.ROUTE);
	}

	@Override
	public String toString() {
		return "Route";
	}
}
