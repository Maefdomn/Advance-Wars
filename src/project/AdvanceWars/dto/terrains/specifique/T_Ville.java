package project.AdvanceWars.dto.terrains.specifique;

import project.AdvanceWars.dto.terrains.Batiment;
import project.AdvanceWars.enumValues.TypeTerrain;

public class T_Ville extends Batiment {

	public T_Ville() {
		setDefense(0);
		setMvtInfanterie(1);
		setMvtInfanterieLourde(1);
		setMvtRoues(1);
		setMvtChar(1);
		setMvtAir(1);
		setMvtNavire(20);
		setMvtTransport(20);
		setMvtSub(20);
		setDescription("Les unites au sol sont approvisionnees et soignees dans les villes alliees.");
		setCamouflage(Boolean.FALSE);
		setTypeTerrain(TypeTerrain.VILLE);
	}

	@Override
	public String toString() {
		return "Ville";
	}
}
