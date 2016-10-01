package project.AdvanceWars.dto.terrains.specifique;

import project.AdvanceWars.dto.terrains.TerrainDto;
import project.AdvanceWars.enumValues.TypeTerrain;

public class T_Plaine extends TerrainDto {

	public T_Plaine() {
		setDefense(1);
		setMvtInfanterie(1);
		setMvtInfanterieLourde(1);
		setMvtRoues(2);
		setMvtChar(1);
		setMvtAir(1);
		setMvtNavire(20);
		setMvtTransport(20);
		setMvtSub(20);
		setDescription("Plaine verdoyante. Facile a traverser, mais offrant peu de couverture.");
		setCamouflage(Boolean.FALSE);
		setTypeTerrain(TypeTerrain.PLAINE);
	}

	@Override
	public String toString() {
		return "Plaine";
	}
}
