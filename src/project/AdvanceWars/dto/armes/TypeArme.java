package project.AdvanceWars.dto.armes;

import project.AdvanceWars.enumValues.ListeArmes;

public class TypeArme {

	private ListeArmes typeArme;

	public TypeArme(ListeArmes typeArme) {
		this.setTypeArme(typeArme);
	}

	public ListeArmes getTypeArme() {
		return this.typeArme;
	}

	public void setTypeArme(ListeArmes typeArme) {
		this.typeArme = typeArme;
	}

}
