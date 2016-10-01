package project.AdvanceWars.dto;

import java.util.Observable;

import project.AdvanceWars.enumValues.TypeClimat;

public class PartieDto extends Observable {

	private CarteDto carte;
	private JoueurDto[] joueurs;
	private Integer jour;
	private TypeClimat climat;

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

	public Integer getJour() {
		return jour;
	}

	public void setJour(Integer jour) {
		this.jour = jour;
	}

	public TypeClimat getClimat() {
		return climat;
	}

	public void setClimat(TypeClimat climat) {
		this.climat = climat;
	}
}
