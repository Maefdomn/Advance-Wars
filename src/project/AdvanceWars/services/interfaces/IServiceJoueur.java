package project.AdvanceWars.services.interfaces;

import project.AdvanceWars.dto.JoueurDto;

public interface IServiceJoueur {

	JoueurDto createDefaultJoueur();

	JoueurDto[] createFourDefaultPlayers();

}
