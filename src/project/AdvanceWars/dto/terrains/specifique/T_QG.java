package project.AdvanceWars.dto.terrains.specifique;

import project.AdvanceWars.dto.terrains.BatimentDto;
import project.AdvanceWars.enumValues.TypeTerrain;

public class T_QG extends BatimentDto {

	public T_QG() {
		setDefense(0);
		setMvtInfanterie(1);
		setMvtInfanterieLourde(1);
		setMvtRoues(1);
		setMvtChar(1);
		setMvtAir(1);
		setMvtNavire(20);
		setMvtTransport(20);
		setMvtSub(20);
		setDescription("Un Q.G. La bataille est finie s'il est capture. Rend des PV aux troupes.");
		setCamouflage(Boolean.FALSE);
		setTypeTerrain(TypeTerrain.QG);
	}

	@Override
	public String toString() {
		return "QG";
	}
}
