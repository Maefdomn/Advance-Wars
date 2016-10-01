package project.AdvanceWars.dto.unites.specifique;

import project.AdvanceWars.dto.unites.UniteContactDto;
import project.AdvanceWars.enumValues.TypeDeplacement;
import project.AdvanceWars.enumValues.TypeUnite;

public class U_Bazooka extends UniteContactDto {

	public U_Bazooka() {
		setPv(10);
		setDefense(3);
		setDeplacement(4);
		setVision(5);
		setEssenceMax(50);
		setMunitionMax(6);
		setCout(12000);
		setPeutCapturer(false);
		setDescription("Les a-air sont essentiels lorsqu'il faut se defendre contre les unites aeriennes.");
		setTypeDeplacements(TypeDeplacement.ROUES);
		setTypeUnite(TypeUnite.AAIR);
	}

	@Override
	public String toString() {
		return "Bazooka";
	}
}
