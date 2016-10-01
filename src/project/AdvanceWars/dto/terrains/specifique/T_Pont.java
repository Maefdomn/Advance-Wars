package project.AdvanceWars.dto.terrains.specifique;

import project.AdvanceWars.dto.terrains.TerrainDto;
import project.AdvanceWars.enumValues.TypeTerrain;

public class T_Pont extends TerrainDto {

	public T_Pont() {
		setDefense(0);
		setMvtInfanterie(1);
		setMvtInfanterieLourde(1);
		setMvtRoues(1);
		setMvtChar(1);
		setMvtAir(1);
		setMvtNavire(20);
		setMvtTransport(20);
		setMvtSub(20);
		setDescription("Un pont permet aux unites de traverser un fleuve. Pas de bonus.");
		setCamouflage(Boolean.FALSE);
		setTypeTerrain(TypeTerrain.PONT);
	}

	@Override
	public String toString() {
		return "Pont";
	}
}
