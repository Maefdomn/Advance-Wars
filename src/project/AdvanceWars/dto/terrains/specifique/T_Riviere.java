package project.AdvanceWars.dto.terrains.specifique;

import project.AdvanceWars.dto.terrains.TerrainDto;
import project.AdvanceWars.enumValues.TypeTerrain;

public class T_Riviere extends TerrainDto {

	public T_Riviere() {
		setDefense(0);
		setMvtInfanterie(2);
		setMvtInfanterieLourde(1);
		setMvtRoues(20);
		setMvtChar(20);
		setMvtAir(20);
		setMvtNavire(20);
		setMvtTransport(20);
		setMvtSub(20);
		setDescription("Une riviere au faible courant. Seule l'infanterie peut la traverser.");
		setCamouflage(Boolean.FALSE);
		setTypeTerrain(TypeTerrain.RIVIERE);
	}

	@Override
	public String toString() {
		return "Riviere";
	}
}
