package project.AdvanceWars.dto.deplacement;

import project.AdvanceWars.enumValues.ListeDeplacements;

public class TypeDeplacement {

	private ListeDeplacements typeDep;

	public TypeDeplacement(ListeDeplacements typeDep) {
		this.setTypeDeplacement(typeDep);
	}

	public ListeDeplacements getTypeDeplacement() {
		return this.typeDep;
	}

	public void setTypeDeplacement(ListeDeplacements typeDep) {
		this.typeDep = typeDep;
	}

}
