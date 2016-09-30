package terrains;

import caracteristiques.ENUM;

public class Terrain {

	private int defense;
	private int mvtInfanterie;
	private int mvtInfanterieLourde;
	private int mvtRoues;
	private int mvtChar;
	private int mvtAir;
	private int mvtNavire;
	private int mvtTransport;
	private int mvtSub;
	private String description;
	private boolean camouflage;

	public Terrain(ENUM.ListeTerrains terrain) {
		if (terrain == ENUM.ListeTerrains.PLAINE) {
			this.setDefense(1);
			this.setMvtInfanterie(1);
			this.setMvtInfanterieLourde(1);
			this.setMvtRoues(2);
			this.setMvtChar(1);
			this.setMvtAir(1);
			this.setMvtNavire(20);
			this.setMvtTransport(20);
			this.setMvtSub(20);
			this.setDescription("Plaine verdoyante. Facile à traverser, mais offrant peu de couverture.");
			this.setCamouflage(false);
		} else if (terrain == ENUM.ListeTerrains.FORET) {
			this.setDefense(2);
			this.setMvtInfanterie(1);
			this.setMvtInfanterieLourde(1);
			this.setMvtRoues(3);
			this.setMvtChar(2);
			this.setMvtAir(1);
			this.setMvtNavire(20);
			this.setMvtTransport(20);
			this.setMvtSub(20);
			this.setDescription("En brouillard, les unités ne sont vues que par des troupes proches ou volantes.");
			this.setCamouflage(true);
		} else if (terrain == ENUM.ListeTerrains.MONTAGNE) {
			this.setDefense(4);
			this.setMvtInfanterie(2);
			this.setMvtInfanterieLourde(1);
			this.setMvtRoues(20);
			this.setMvtChar(20);
			this.setMvtAir(1);
			this.setMvtNavire(20);
			this.setMvtTransport(20);
			this.setMvtSub(20);
			this.setDescription("Montagne abrupte. L'infanterie gagne 3 points à son champ de vision.");
			this.setCamouflage(true);
		} else if (terrain == ENUM.ListeTerrains.ROUTE) {
			this.setDefense(0);
			this.setMvtInfanterie(1);
			this.setMvtInfanterieLourde(1);
			this.setMvtRoues(1);
			this.setMvtChar(1);
			this.setMvtAir(1);
			this.setMvtNavire(20);
			this.setMvtTransport(20);
			this.setMvtSub(20);
			this.setDescription("Une route en bitume. Facile à traverser, mais n'offrant aucune couverture.");
			this.setCamouflage(false);
		} else if (terrain == ENUM.ListeTerrains.PONT) {
			this.setDefense(0);
			this.setMvtInfanterie(1);
			this.setMvtInfanterieLourde(1);
			this.setMvtRoues(1);
			this.setMvtChar(1);
			this.setMvtAir(1);
			this.setMvtNavire(20);
			this.setMvtTransport(20);
			this.setMvtSub(20);
			this.setDescription("Un pont permet aux unités de traverser un fleuve. Pas de bonus.");
			this.setCamouflage(false);
		} else if (terrain == ENUM.ListeTerrains.RIVIERE) {
			this.setDefense(0);
			this.setMvtInfanterie(2);
			this.setMvtInfanterieLourde(1);
			this.setMvtRoues(20);
			this.setMvtChar(20);
			this.setMvtAir(20);
			this.setMvtNavire(20);
			this.setMvtTransport(20);
			this.setMvtSub(20);
			this.setDescription("Une rivière au faible courant. Seule l'infanterie peut la traverser.");
			this.setCamouflage(false);
		} else if (terrain == ENUM.ListeTerrains.PLAGE) {
			this.setDefense(0);
			this.setMvtInfanterie(1);
			this.setMvtInfanterieLourde(1);
			this.setMvtRoues(1);
			this.setMvtChar(1);
			this.setMvtAir(1);
			this.setMvtNavire(20);
			this.setMvtTransport(1);
			this.setMvtSub(20);
			this.setDescription("Rivage sablonneux. La Barge permet d'y décharger et charger des unités.");
			this.setCamouflage(false);
		} else if (terrain == ENUM.ListeTerrains.MER) {
			this.setDefense(0);
			this.setMvtInfanterie(20);
			this.setMvtInfanterieLourde(20);
			this.setMvtRoues(20);
			this.setMvtChar(20);
			this.setMvtAir(1);
			this.setMvtNavire(1);
			this.setMvtTransport(1);
			this.setMvtSub(1);
			this.setDescription("Une étendue d'eau. Seule une unité aérienne ou maritime peut la traverser.");
			this.setCamouflage(false);
		} else if (terrain == ENUM.ListeTerrains.RECIF) {
			this.setDefense(1);
			this.setMvtInfanterie(20);
			this.setMvtInfanterieLourde(20);
			this.setMvtRoues(20);
			this.setMvtChar(20);
			this.setMvtAir(1);
			this.setMvtNavire(2);
			this.setMvtTransport(2);
			this.setMvtSub(2);
			this.setDescription("En brouillard, les unités ne sont vues que par des troupes proches ou volantes.");
			this.setCamouflage(true);
		} else if (terrain == ENUM.ListeTerrains.VILLE) {
			this.setDefense(0);
			this.setMvtInfanterie(1);
			this.setMvtInfanterieLourde(1);
			this.setMvtRoues(1);
			this.setMvtChar(1);
			this.setMvtAir(1);
			this.setMvtNavire(20);
			this.setMvtTransport(20);
			this.setMvtSub(20);
			this.setDescription("Les unités au sol sont approvisionnées et soignées dans les villes alliées.");
			this.setCamouflage(false);
		} else if (terrain == ENUM.ListeTerrains.QG) {
			this.setDefense(0);
			this.setMvtInfanterie(1);
			this.setMvtInfanterieLourde(1);
			this.setMvtRoues(1);
			this.setMvtChar(1);
			this.setMvtAir(1);
			this.setMvtNavire(20);
			this.setMvtTransport(20);
			this.setMvtSub(20);
			this.setDescription("Un Q.G. La bataille est finie s'il est capturé. Rend des PV aux troupes.");
			this.setCamouflage(false);
		} else if (terrain == ENUM.ListeTerrains.BASE) {
			this.setDefense(0);
			this.setMvtInfanterie(1);
			this.setMvtInfanterieLourde(1);
			this.setMvtRoues(1);
			this.setMvtChar(1);
			this.setMvtAir(1);
			this.setMvtNavire(20);
			this.setMvtTransport(20);
			this.setMvtSub(20);
			this.setDescription("Une base maritime qui peut créer des unités terrestres et leur rendre des PV.");
			this.setCamouflage(false);
		} else if (terrain == ENUM.ListeTerrains.PORT) {
			this.setDefense(0);
			this.setMvtInfanterie(1);
			this.setMvtInfanterieLourde(1);
			this.setMvtRoues(1);
			this.setMvtChar(1);
			this.setMvtAir(1);
			this.setMvtNavire(20);
			this.setMvtTransport(20);
			this.setMvtSub(20);
			this.setDescription("Une base maritime qui peut créer des unités navales et leur rendre des PV.");
			this.setCamouflage(false);
		} else if (terrain == ENUM.ListeTerrains.AEROPORT) {
			this.setDefense(0);
			this.setMvtInfanterie(1);
			this.setMvtInfanterieLourde(1);
			this.setMvtRoues(1);
			this.setMvtChar(1);
			this.setMvtAir(1);
			this.setMvtNavire(20);
			this.setMvtTransport(20);
			this.setMvtSub(20);
			this.setDescription("Une base maritime qui peut créer des unités aériennes et leur rendre des PV.");
			this.setCamouflage(false);
		}
	}

	public int getDefense() {
		return defense;
	}

	private void setDefense(int def) {
		this.defense = def;
	}

	public int getMvtInfanterie() {
		return mvtInfanterie;
	}

	private void setMvtInfanterie(int mvtInfanterie) {
		this.mvtInfanterie = mvtInfanterie;
	}

	public int getMvtInfanterieLourde() {
		return mvtInfanterieLourde;
	}

	private void setMvtInfanterieLourde(int mvtInfanterieLourde) {
		this.mvtInfanterieLourde = mvtInfanterieLourde;
	}

	public int getMvtRoues() {
		return mvtRoues;
	}

	private void setMvtRoues(int mvtRoues) {
		this.mvtRoues = mvtRoues;
	}

	public int getMvtChar() {
		return mvtChar;
	}

	private void setMvtChar(int mvtChar) {
		this.mvtChar = mvtChar;
	}

	public int getMvtAir() {
		return mvtAir;
	}

	private void setMvtAir(int mvtAir) {
		this.mvtAir = mvtAir;
	}

	public int getMvtNavire() {
		return mvtNavire;
	}

	private void setMvtNavire(int mvtNavire) {
		this.mvtNavire = mvtNavire;
	}

	public int getMvtTransport() {
		return mvtTransport;
	}

	private void setMvtTransport(int mvtTransport) {
		this.mvtTransport = mvtTransport;
	}

	public int getMvtSub() {
		return mvtSub;
	}

	private void setMvtSub(int mvtSub) {
		this.mvtSub = mvtSub;
	}

	public String getDescription() {
		return description;
	}

	private void setDescription(String description) {
		this.description = description;
	}

	public boolean isCamouflage() {
		return camouflage;
	}

	private void setCamouflage(boolean camouflage) {
		this.camouflage = camouflage;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (camouflage ? 1231 : 1237);
		result = prime * result + defense;
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + mvtAir;
		result = prime * result + mvtChar;
		result = prime * result + mvtInfanterie;
		result = prime * result + mvtInfanterieLourde;
		result = prime * result + mvtNavire;
		result = prime * result + mvtRoues;
		result = prime * result + mvtSub;
		result = prime * result + mvtTransport;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Terrain other = (Terrain) obj;
		if (camouflage != other.camouflage)
			return false;
		if (defense != other.defense)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (mvtAir != other.mvtAir)
			return false;
		if (mvtChar != other.mvtChar)
			return false;
		if (mvtInfanterie != other.mvtInfanterie)
			return false;
		if (mvtInfanterieLourde != other.mvtInfanterieLourde)
			return false;
		if (mvtNavire != other.mvtNavire)
			return false;
		if (mvtRoues != other.mvtRoues)
			return false;
		if (mvtSub != other.mvtSub)
			return false;
		if (mvtTransport != other.mvtTransport)
			return false;
		return true;
	}

}
