package project.AdvanceWars.dto.terrains.specifique;

import project.AdvanceWars.dto.terrains.BatimentDto;
import project.AdvanceWars.enumValues.TypeTerrain;

public class T_Aeroport extends BatimentDto {

	public T_Aeroport() {
		setDefense(0);
		setMvtInfanterie(1);
		setMvtInfanterieLourde(1);
		setMvtRoues(1);
		setMvtChar(1);
		setMvtAir(1);
		setMvtNavire(20);
		setMvtTransport(20);
		setMvtSub(20);
		setDescription("Une base aerienne qui peut creer des unites aeriennes et leur rendre des PV.");
		setCamouflage(Boolean.FALSE);
		setTypeTerrain(TypeTerrain.AEROPORT);
	}

	@Override
	public String toString() {
		return "Aeroport";
	}

}
