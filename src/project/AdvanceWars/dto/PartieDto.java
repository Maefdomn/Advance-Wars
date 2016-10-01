package project.AdvanceWars.dto;

import java.util.Observable;

public class PartieDto extends Observable {

	private CarteDto carte;
	private JoueurDto[] joueurs;

	public PartieDto() {
	}

	public CarteDto getCarte() {
		return carte;
	}

	public void setCarte(CarteDto carte) {
		this.carte = carte;
	}

	public JoueurDto[] getJoueurs() {
		return joueurs;
	}

	public void setJoueurs(JoueurDto[] joueurs) {
		this.joueurs = joueurs;
	}
}
