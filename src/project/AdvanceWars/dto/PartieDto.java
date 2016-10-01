package project.AdvanceWars.dto;

import java.util.Observable;

public class PartieDto extends Observable {

	private CarteDto carte;
	private JoueurDto[] joueurs;

	public PartieDto() {
	}

	public PartieDto(CarteDto carte, JoueurDto[] joueurs) {
		setCarte(carte);
		setJoueurs(joueurs);
	}

	public CarteDto getCarte() {
		return carte;
	}

	public void setCarte(CarteDto carte) {
		this.carte = carte;
	}

	public JoueurDto[] getJoueurs() {
		return this.joueurs;
	}

	public void setJoueurs(JoueurDto[] joueurs) {
		this.joueurs = joueurs;
	}

	public void setJoueurs(JoueurDto j1, JoueurDto j2, JoueurDto j3, JoueurDto j4) {
		setJoueurs(new JoueurDto[4]);
		for (int i = 0; i < 4; i++)
			this.joueurs[0] = j1;
	}
}
