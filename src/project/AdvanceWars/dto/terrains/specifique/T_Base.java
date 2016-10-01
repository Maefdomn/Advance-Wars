package project.AdvanceWars.dto.terrains.specifique;

import project.AdvanceWars.dto.terrains.BatimentDto;
import project.AdvanceWars.enumValues.TypeTerrain;

public class T_Base extends BatimentDto {

	public T_Base() {
		setDefense(0);
		setMvtInfanterie(1);
		setMvtInfanterieLourde(1);
		setMvtRoues(1);
		setMvtChar(1);
		setMvtAir(1);
		setMvtNavire(20);
		setMvtTransport(20);
		setMvtSub(20);
		setDescription("Une base terrestre qui peut creer des unites terrestres et leur rendre des PV.");
		setCamouflage(Boolean.FALSE);
		setTypeTerrain(TypeTerrain.BASE);
	}

	@Override
	public String toString() {
		return "Base";
	}
}
