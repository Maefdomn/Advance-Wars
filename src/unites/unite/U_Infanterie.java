package unites.unite;

import unites.UniteContact;
import caracteristiques.ENUM;

public class U_Infanterie extends UniteContact {

	public U_Infanterie(int X, int Y) {
		super(X, Y, ENUM.ListeUnites.INFANTERIE);
	}

	public String toString() {
		return "Infanterie";
	}
}
