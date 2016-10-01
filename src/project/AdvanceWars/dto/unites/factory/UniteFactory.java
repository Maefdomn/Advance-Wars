package project.AdvanceWars.dto.unites.factory;

import project.AdvanceWars.dto.unites.UniteDto;
import project.AdvanceWars.dto.unites.specifique.U_AAir;
import project.AdvanceWars.dto.unites.specifique.U_Artillerie;
import project.AdvanceWars.dto.unites.specifique.U_Barge;
import project.AdvanceWars.dto.unites.specifique.U_Bazooka;
import project.AdvanceWars.dto.unites.specifique.U_Bombardier;
import project.AdvanceWars.dto.unites.specifique.U_Chasseur;
import project.AdvanceWars.dto.unites.specifique.U_Croiseur;
import project.AdvanceWars.dto.unites.specifique.U_DCA;
import project.AdvanceWars.dto.unites.specifique.U_Destroyer;
import project.AdvanceWars.dto.unites.specifique.U_Helico;
import project.AdvanceWars.dto.unites.specifique.U_HelicoTransport;
import project.AdvanceWars.dto.unites.specifique.U_Infanterie;
import project.AdvanceWars.dto.unites.specifique.U_LMiss;
import project.AdvanceWars.dto.unites.specifique.U_Recon;
import project.AdvanceWars.dto.unites.specifique.U_SousMarin;
import project.AdvanceWars.dto.unites.specifique.U_Tank;
import project.AdvanceWars.dto.unites.specifique.U_TankM;
import project.AdvanceWars.dto.unites.specifique.U_VTB;
import project.AdvanceWars.enumValues.TypeUnite;

public class UniteFactory {

	public UniteDto createUnite(TypeUnite typeUnite) {
		switch (typeUnite) {
		case INFANTERIE:
			return new U_Infanterie();
		case BAZOOKA:
			return new U_Bazooka();
		case TANK:
			return new U_Tank();
		case TANKM:
			return new U_TankM();
		case VTB:
			return new U_VTB();
		case DCA:
			return new U_DCA();
		case ARTILLERIE:
			return new U_Artillerie();
		case HELICO:
			return new U_Helico();
		case HELICOTRANSPORT:
			return new U_HelicoTransport();
		case CHASSEUR:
			return new U_Chasseur();
		case BOMBARDIER:
			return new U_Bombardier();
		case LMISS:
			return new U_LMiss();
		case AAIR:
			return new U_AAir();
		case BARGE:
			return new U_Barge();
		case CROISEUR:
			return new U_Croiseur();
		case SOUSMARIN:
			return new U_SousMarin();
		case DESTROYER:
			return new U_Destroyer();
		case RECON:
			return new U_Recon();
		default:
			return null;
		}
	}

}
