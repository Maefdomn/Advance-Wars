package project.AdvanceWars.services.interfaces;

import project.AdvanceWars.controlleurs.MainWindowGame;
import project.AdvanceWars.dto.CarteDto;
import project.AdvanceWars.dto.unites.UniteDto;

public interface IServiceWindow {

	void createCasesPanelDefault(CarteDto carte, MainWindowGame mainWindowGame);

	void createPanelJoueur();

	void createPanelInfosCurseur();

	public void affichageZoneDeplacement(UniteDto unite);
}
