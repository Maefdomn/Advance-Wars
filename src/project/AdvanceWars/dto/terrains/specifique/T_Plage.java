package project.AdvanceWars.dto.terrains.specifique;

import project.AdvanceWars.dto.terrains.TerrainDto;
import project.AdvanceWars.enumValues.TypeTerrain;

public class T_Plage extends TerrainDto {

	public T_Plage() {
		setDefense(0);
		setMvtInfanterie(1);
		setMvtInfanterieLourde(1);
		setMvtRoues(1);
		setMvtChar(1);
		setMvtAir(1);
		setMvtNavire(20);
		setMvtTransport(1);
		setMvtSub(20);
		setDescription("Rivage sablonneux. La Barge permet d'y decharger et charger des unites.");
		setCamouflage(Boolean.FALSE);
		setTypeTerrain(TypeTerrain.PLAGE);
	}

	@Override
	public String toString() {
		return "Plage";
	}
}
