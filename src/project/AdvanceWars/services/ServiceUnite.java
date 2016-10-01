package project.AdvanceWars.services;

import project.AdvanceWars.dto.unites.UniteDto;
import project.AdvanceWars.enumValues.TypeDeplacement;
import project.AdvanceWars.enumValues.TypeUnite;
import project.AdvanceWars.services.interfaces.IServiceUnite;

public class ServiceUnite implements IServiceUnite {

	@Override
	public UniteDto createUnite(Integer x, Integer y, TypeUnite unitType) {
		final UniteDto uniteDto = new UniteDto();

		uniteDto.setPv(10);
		uniteDto.setX(x);
		uniteDto.setY(y);
		uniteDto.setDefense(3);
		switch (unitType) {
		case INFANTERIE:
			uniteDto.setDeplacement(3);
			uniteDto.setVision(2);
			uniteDto.setEssenceMax(99);
			uniteDto.setMunitionMax(99);
			uniteDto.setCout(1000);
			uniteDto.setPeutCapturer(true);
			uniteDto.setDescription("L'infanterie a une faible puissance de feu, mais sert a capturer des bases.");
			uniteDto.setTypeDeplacements(TypeDeplacement.INF);
		case BAZOOKA:
			uniteDto.setDeplacement(2);
			uniteDto.setVision(2);
			uniteDto.setEssenceMax(70);
			uniteDto.setMunitionMax(3);
			uniteDto.setCout(3000);
			uniteDto.setPeutCapturer(true);
			uniteDto.setDescription("Les bazookas peuvent servir a capturer des bases. Ils ont une bonne puissance de feu.");
			uniteDto.setTypeDeplacements(TypeDeplacement.INFLOURDE);
		case TANK:
			uniteDto.setDeplacement(6);
			uniteDto.setVision(3);
			uniteDto.setEssenceMax(70);
			uniteDto.setMunitionMax(9);
			uniteDto.setCout(7000);
			uniteDto.setPeutCapturer(false);
			uniteDto.setDescription("Les tanks se deplacent rapidement, sont peu couteux et donc sont faciles a deployer.");
			uniteDto.setTypeDeplacements(TypeDeplacement.CHAR);
		case TANKM:
			uniteDto.setDeplacement(5);
			uniteDto.setVision(1);
			uniteDto.setEssenceMax(50);
			uniteDto.setMunitionMax(8);
			uniteDto.setCout(16000);
			uniteDto.setPeutCapturer(false);
			uniteDto.setDescription("Les capacites du tank m (moyen) sont les plus elevees des unites terrestres.");
			uniteDto.setTypeDeplacements(TypeDeplacement.CHAR);
		case VTB:
			uniteDto.setDeplacement(6);
			uniteDto.setVision(1);
			uniteDto.setEssenceMax(70);
			uniteDto.setMunitionMax(0);
			uniteDto.setCout(5000);
			uniteDto.setPeutCapturer(false);
			uniteDto.setDescription("Les VTB transportent de l'infanterie, des munitions, de l'essence et des rations.");
			uniteDto.setTypeDeplacements(TypeDeplacement.CHAR);
		case DCA:
			uniteDto.setDeplacement(6);
			uniteDto.setVision(2);
			uniteDto.setEssenceMax(60);
			uniteDto.setMunitionMax(9);
			uniteDto.setCout(8000);
			uniteDto.setPeutCapturer(false);
			uniteDto.setDescription("La D.C.A. est efficace contre l'infanterie et les unites aeriennes, mais est faible face au tank.");
			uniteDto.setTypeDeplacements(TypeDeplacement.CHAR);
		case ARTILLERIE:
			uniteDto.setDeplacement(5);
			uniteDto.setVision(1);
			uniteDto.setEssenceMax(50);
			uniteDto.setMunitionMax(9);
			uniteDto.setCout(6000);
			uniteDto.setPeutCapturer(false);
			uniteDto.setDescription("L'artillerie permet d'avoir une force de frappe utile et peu onereuse.");
			uniteDto.setTypeDeplacements(TypeDeplacement.CHAR);
		case HELICO:
			uniteDto.setDeplacement(6);
			uniteDto.setVision(3);
			uniteDto.setEssenceMax(99);
			uniteDto.setMunitionMax(6);
			uniteDto.setCout(9000);
			uniteDto.setPeutCapturer(false);
			uniteDto.setDescription("Les helicos peuvent tirer sur de nombreux types d'unites.");
			uniteDto.setTypeDeplacements(TypeDeplacement.AIR);
		case HELICOTRANSPORT:
			uniteDto.setDeplacement(6);
			uniteDto.setVision(2);
			uniteDto.setEssenceMax(99);
			uniteDto.setMunitionMax(0);
			uniteDto.setCout(5000);
			uniteDto.setPeutCapturer(false);
			uniteDto.setDescription("Les heli tr (transport) ont un bon deplacement et peuvent transporter de l'infanterie.");
			uniteDto.setTypeDeplacements(TypeDeplacement.AIR);
		case CHASSEUR:
			uniteDto.setDeplacement(9);
			uniteDto.setVision(2);
			uniteDto.setEssenceMax(99);
			uniteDto.setMunitionMax(9);
			uniteDto.setCout(20000);
			uniteDto.setPeutCapturer(false);
			uniteDto.setDescription("Les chasseurs peuvent seulement attaquer d'autres unites aeriennes.");
			uniteDto.setTypeDeplacements(TypeDeplacement.AIR);
		case BOMBARDIER:
			uniteDto.setDeplacement(7);
			uniteDto.setVision(2);
			uniteDto.setEssenceMax(99);
			uniteDto.setMunitionMax(9);
			uniteDto.setCout(22000);
			uniteDto.setPeutCapturer(false);
			uniteDto.setDescription("Les bombardiers peuvent tirer sur les unites terrestres et maritimes.");
			uniteDto.setTypeDeplacements(TypeDeplacement.AIR);
		case LMISS:
			uniteDto.setDeplacement(5);
			uniteDto.setVision(1);
			uniteDto.setEssenceMax(50);
			uniteDto.setMunitionMax(6);
			uniteDto.setCout(15000);
			uniteDto.setPeutCapturer(false);
			uniteDto.setDescription("Les lance-missiles peuvent tirer à la fois sur les unités terrestres et maritimes.");
			uniteDto.setTypeDeplacements(TypeDeplacement.ROUES);
		case AAIR:
			uniteDto.setDeplacement(4);
			uniteDto.setVision(5);
			uniteDto.setEssenceMax(50);
			uniteDto.setMunitionMax(6);
			uniteDto.setCout(12000);
			uniteDto.setPeutCapturer(false);
			uniteDto.setDescription("Les a-air sont essentiels lorsqu'il faut se defendre contre les unites aeriennes.");
			uniteDto.setTypeDeplacements(TypeDeplacement.ROUES);
		case BARGE:
			uniteDto.setDeplacement(6);
			uniteDto.setVision(1);
			uniteDto.setEssenceMax(99);
			uniteDto.setMunitionMax(0);
			uniteDto.setCout(12000);
			uniteDto.setPeutCapturer(false);
			uniteDto.setDescription("La barge peut transporter deux unites terrestres. Si elle coule, les unites sont detruites.");
			uniteDto.setTypeDeplacements(TypeDeplacement.TRANSPORT);
		case CROISEUR:
			uniteDto.setDeplacement(6);
			uniteDto.setVision(3);
			uniteDto.setEssenceMax(99);
			uniteDto.setMunitionMax(9);
			uniteDto.setCout(18000);
			uniteDto.setPeutCapturer(false);
			uniteDto.setDescription("Les croiseurs sont bons contre sub et unites volantes. Ils peuvent embarquer deux helicos.");
			uniteDto.setTypeDeplacements(TypeDeplacement.NAVIRE);
		case SOUSMARIN:
			uniteDto.setDeplacement(5);
			uniteDto.setVision(5);
			uniteDto.setEssenceMax(60);
			uniteDto.setMunitionMax(6);
			uniteDto.setCout(22000);
			uniteDto.setPeutCapturer(false);
			uniteDto.setDescription("Seuls les croiseurs et les sous-marins peuvent tirer sur un sous-marin en plongee.");
			uniteDto.setTypeDeplacements(project.AdvanceWars.enumValues.TypeDeplacement.SUB);
		case DESTROYER:
			uniteDto.setDeplacement(5);
			uniteDto.setVision(2);
			uniteDto.setEssenceMax(99);
			uniteDto.setMunitionMax(9);
			uniteDto.setCout(28000);
			uniteDto.setPeutCapturer(false);
			uniteDto.setDescription("Les destroyers ont une portee de tir plus grande que celle des lance-missiles.");
			uniteDto.setTypeDeplacements(TypeDeplacement.NAVIRE);
		case RECON:
			uniteDto.setDeplacement(8);
			uniteDto.setVision(5);
			uniteDto.setEssenceMax(80);
			uniteDto.setMunitionMax(99);
			uniteDto.setCout(4000);
			uniteDto.setPeutCapturer(false);
			uniteDto.setDescription("Le Recon se deplace loin et resiste aux tirs de l'infanterie.");
			uniteDto.setTypeDeplacements(TypeDeplacement.ROUES);
		default:
			break;
		}
		return uniteDto;
	}

}
