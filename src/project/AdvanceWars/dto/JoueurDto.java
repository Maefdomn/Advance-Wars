package project.AdvanceWars.dto;

import java.util.ArrayList;

import project.AdvanceWars.dto.terrains.BatimentDto;
import project.AdvanceWars.dto.unites.UniteDto;
import project.AdvanceWars.enumValues.TypeCouleur;
import project.AdvanceWars.enumValues.TypeGeneral;

public class JoueurDto {

	private TypeCouleur couleur;
	private TypeGeneral general;
	private int argent;
	private int jaugePouvoir;
	private ArrayList<UniteDto> listeUnites;
	private ArrayList<BatimentDto> listeBatiments;

	public JoueurDto() { // provisoire (pour tests)
		setCouleur(TypeCouleur.ROUGE);
		setGeneral(TypeGeneral.ANDY);
		setJaugePouvoir(0);
		setArgent(0);
		setListeUnites(new ArrayList<UniteDto>());
		setListeBatiments(new ArrayList<BatimentDto>());
	}

	public TypeCouleur getCouleur() {
		return couleur;
	}

	public void setCouleur(TypeCouleur couleur) {
		this.couleur = couleur;
	}

	public TypeGeneral getGeneral() {
		return general;
	}

	public void setGeneral(TypeGeneral general) {
		this.general = general;
	}

	public int getArgent() {
		return argent;
	}

	public void setArgent(int argent) {
		this.argent = argent;
	}

	public int getJaugePouvoir() {
		return jaugePouvoir;
	}

	public void setJaugePouvoir(int jaugePouvoir) {
		this.jaugePouvoir = jaugePouvoir;
	}

	public ArrayList<UniteDto> getListeUnites() {
		return listeUnites;
	}

	public void setListeUnites(ArrayList<UniteDto> listeUnites) {
		this.listeUnites = listeUnites;
	}

	public ArrayList<BatimentDto> getListeBatiments() {
		return listeBatiments;
	}

	public void setListeBatiments(ArrayList<BatimentDto> listeBatiments) {
		this.listeBatiments = listeBatiments;
	}

}
