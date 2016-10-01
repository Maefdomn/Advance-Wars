package project.AdvanceWars.services;

import java.util.ArrayList;

import project.AdvanceWars.dto.JoueurDto;
import project.AdvanceWars.dto.terrains.BatimentDto;
import project.AdvanceWars.dto.unites.UniteDto;
import project.AdvanceWars.enumValues.TypeCouleur;
import project.AdvanceWars.enumValues.TypeGeneral;
import project.AdvanceWars.services.interfaces.IServiceJoueur;

public class ServiceJoueur implements IServiceJoueur {

	@Override
	public JoueurDto createDefaultJoueur() {
		JoueurDto joueurDto = new JoueurDto();
		joueurDto.setCouleur(TypeCouleur.ROUGE);
		joueurDto.setGeneral(TypeGeneral.ANDY);
		joueurDto.setJaugePouvoir(0);
		joueurDto.setArgent(0);
		joueurDto.setListeUnites(new ArrayList<UniteDto>());
		joueurDto.setListeBatiments(new ArrayList<BatimentDto>());
		return joueurDto;
	}

	@Override
	public JoueurDto[] createFourDefaultPlayers() {
		final JoueurDto[] results = new JoueurDto[4];
		results[0] = createDefaultJoueur();
		results[1] = createDefaultJoueur();
		results[2] = createDefaultJoueur();
		results[3] = createDefaultJoueur();
		return results;
	}
}
