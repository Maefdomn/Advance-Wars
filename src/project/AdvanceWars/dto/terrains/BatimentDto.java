package project.AdvanceWars.dto.terrains;

import project.AdvanceWars.enumValues.TypeCouleur;

public class BatimentDto extends TerrainDto {

	private TypeCouleur couleur;

	public BatimentDto() {
	}

	public TypeCouleur getCouleur() {
		return couleur;
	}

	public void setCouleur(TypeCouleur couleur) {
		this.couleur = couleur;
	}

}
