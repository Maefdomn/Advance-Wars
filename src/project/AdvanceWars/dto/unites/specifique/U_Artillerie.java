package project.AdvanceWars.dto.unites.specifique;

import project.AdvanceWars.dto.unites.UniteDistanceDto;
import project.AdvanceWars.enumValues.TypeDeplacement;

public class U_Artillerie extends UniteDistanceDto {

	public U_Artillerie() {
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
		setPorteeMin(2);
		setPorteeMax(3);
	}

	@Override
	public String toString() {
		return "Artillerie";
	}
}
