package project.AdvanceWars.services.interfaces;

import project.AdvanceWars.controlleurs.MainWindowGame;
import project.AdvanceWars.dto.CarteDto;

public interface IServiceWindow {

	void createCasesPanelDefault(CarteDto carte, MainWindowGame mainWindowGame);

	void createPanelJoueur();

	void createPanelInfosCurseur();

}
