package project.AdvanceWars.dto;

import java.util.Observable;

public class PartieDto extends Observable {

	private CarteDto carte;
	private JoueurDto[] joueurs;

	public PartieDto() {
		this(new CarteDto(), new JoueurDto(), new JoueurDto(), new JoueurDto(),
				new JoueurDto());
	}

	public PartieDto(CarteDto carte, JoueurDto j1, JoueurDto j2, JoueurDto j3,
			JoueurDto j4) {
		this.setCarte(carte);
		this.setJoueurs(j1, j2, j3, j4);
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

	public void setJoueurs(JoueurDto j1, JoueurDto j2, JoueurDto j3,
			JoueurDto j4) {
		setJoueurs(new JoueurDto[4]);
		for (int i=0; i<4; i++)
			this.joueurs[0] = j1;
	}
}
