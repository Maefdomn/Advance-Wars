package project.AdvanceWars.dto.terrains.specifique;

import project.AdvanceWars.dto.terrains.Batiment;
import project.AdvanceWars.enumValues.TypeTerrain;

public class T_Port extends Batiment {

	public T_Port() {
		setDefense(0);
		setMvtInfanterie(1);
		setMvtInfanterieLourde(1);
		setMvtRoues(1);
		setMvtChar(1);
		setMvtAir(1);
		setMvtNavire(20);
		setMvtTransport(20);
		setMvtSub(20);
		setDescription("Une base maritime qui peut creer des unites navales et leur rendre des PV.");
		setCamouflage(Boolean.FALSE);
		setTypeTerrain(TypeTerrain.PORT);
	}

	@Override
	public String toString() {
		return "Port";
	}
}
