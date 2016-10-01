package project.AdvanceWars.services;

import project.AdvanceWars.dto.PartieDto;

public class ServicePartie {

	public final static ServiceCarte serviceCarte = new ServiceCarte();
	public final static ServiceJoueur serviceJoueur = new ServiceJoueur();

	public PartieDto createDefaultPartie() {
		PartieDto partieDto = new PartieDto();
		partieDto.setCarte(serviceCarte.createDefaultCarte());
		partieDto.setJoueurs(serviceJoueur.createFourDefaultPlayers());
		return partieDto;
	}

}
