package project.AdvanceWars.dto.terrains;

import project.AdvanceWars.enumValues.ListeTerrains;

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

	public Terrain(ListeTerrains terrain) {
		switch (terrain) {
		case PLAINE:
			setDefense(1);
			setMvtInfanterie(1);
			setMvtInfanterieLourde(1);
			setMvtRoues(2);
			setMvtChar(1);
			setMvtAir(1);
			setMvtNavire(20);
			setMvtTransport(20);
			setMvtSub(20);
			setDescription("Plaine verdoyante. Facile a traverser, mais offrant peu de couverture.");
			setCamouflage(false);
		case FORET:
			setDefense(2);
			setMvtInfanterie(1);
			setMvtInfanterieLourde(1);
			setMvtRoues(3);
			setMvtChar(2);
			setMvtAir(1);
			setMvtNavire(20);
			setMvtTransport(20);
			setMvtSub(20);
			setDescription("En brouillard, les unites ne sont vues que par des troupes proches ou volantes.");
			setCamouflage(true);
		case MONTAGNE:
			setDefense(4);
			setMvtInfanterie(2);
			setMvtInfanterieLourde(1);
			setMvtRoues(20);
			setMvtChar(20);
			setMvtAir(1);
			setMvtNavire(20);
			setMvtTransport(20);
			setMvtSub(20);
			setDescription("Montagne abrupte. L'infanterie gagne 3 points a son champ de vision.");
			setCamouflage(true);
		case ROUTE:
			setDefense(0);
			setMvtInfanterie(1);
			setMvtInfanterieLourde(1);
			setMvtRoues(1);
			setMvtChar(1);
			setMvtAir(1);
			setMvtNavire(20);
			setMvtTransport(20);
			setMvtSub(20);
			setDescription("Une route en bitume. Facile a traverser, mais n'offrant aucune couverture.");
			setCamouflage(false);
		case PONT:
			setDefense(0);
			setMvtInfanterie(1);
			setMvtInfanterieLourde(1);
			setMvtRoues(1);
			setMvtChar(1);
			setMvtAir(1);
			setMvtNavire(20);
			setMvtTransport(20);
			setMvtSub(20);
			setDescription("Un pont permet aux unites de traverser un fleuve. Pas de bonus.");
			setCamouflage(false);
		case RIVIERE:
			setDefense(0);
			setMvtInfanterie(2);
			setMvtInfanterieLourde(1);
			setMvtRoues(20);
			setMvtChar(20);
			setMvtAir(20);
			setMvtNavire(20);
			setMvtTransport(20);
			setMvtSub(20);
			setDescription("Une riviere au faible courant. Seule l'infanterie peut la traverser.");
			setCamouflage(false);
		case PLAGE:
			setDefense(0);
			setMvtInfanterie(1);
			setMvtInfanterieLourde(1);
			setMvtRoues(1);
			setMvtChar(1);
			setMvtAir(1);
			setMvtNavire(20);
			setMvtTransport(1);
			setMvtSub(20);
			setDescription("Rivage sablonneux. La Barge permet d'y decharger et charger des unites.");
			setCamouflage(false);
		case MER:
			setDefense(0);
			setMvtInfanterie(20);
			setMvtInfanterieLourde(20);
			setMvtRoues(20);
			setMvtChar(20);
			setMvtAir(1);
			setMvtNavire(1);
			setMvtTransport(1);
			setMvtSub(1);
			setDescription("Une etendue d'eau. Seule une unite aerienne ou maritime peut la traverser.");
			setCamouflage(false);
		case RECIF:
			setDefense(1);
			setMvtInfanterie(20);
			setMvtInfanterieLourde(20);
			setMvtRoues(20);
			setMvtChar(20);
			setMvtAir(1);
			setMvtNavire(2);
			setMvtTransport(2);
			setMvtSub(2);
			setDescription("En brouillard, les unites ne sont vues que par des troupes proches ou volantes.");
			setCamouflage(true);
		case VILLE:
			setDefense(0);
			setMvtInfanterie(1);
			setMvtInfanterieLourde(1);
			setMvtRoues(1);
			setMvtChar(1);
			setMvtAir(1);
			setMvtNavire(20);
			setMvtTransport(20);
			setMvtSub(20);
			setDescription("Les unites au sol sont approvisionnees et soignees dans les villes alliees.");
			setCamouflage(false);
		case QG:
			setDefense(0);
			setMvtInfanterie(1);
			setMvtInfanterieLourde(1);
			setMvtRoues(1);
			setMvtChar(1);
			setMvtAir(1);
			setMvtNavire(20);
			setMvtTransport(20);
			setMvtSub(20);
			setDescription("Un Q.G. La bataille est finie s'il est capture. Rend des PV aux troupes.");
			setCamouflage(false);
		case BASE:
			setDefense(0);
			setMvtInfanterie(1);
			setMvtInfanterieLourde(1);
			setMvtRoues(1);
			setMvtChar(1);
			setMvtAir(1);
			setMvtNavire(20);
			setMvtTransport(20);
			setMvtSub(20);
			setDescription("Une base terrestre qui peut creer des unites terrestres et leur rendre des PV.");
			setCamouflage(false);
		case PORT:
			setDefense(0);
			setMvtInfanterie(1);
			setMvtInfanterieLourde(1);
			setMvtRoues(1);
			setMvtChar(1);
			setMvtAir(1);
			setMvtNavire(20);
			setMvtTransport(20);
			setMvtSub(20);
			setDescription("Une base maritime qui peut creer des unites navales et leur rendre des PV.");
			setCamouflage(false);
		case AEROPORT:
			setDefense(0);
			setMvtInfanterie(1);
			setMvtInfanterieLourde(1);
			setMvtRoues(1);
			setMvtChar(1);
			setMvtAir(1);
			setMvtNavire(20);
			setMvtTransport(20);
			setMvtSub(20);
			setDescription("Une base aerienne qui peut creer des unites aeriennes et leur rendre des PV.");
			setCamouflage(false);
		default:
			break;
		}

	}

	public int getDefense() {
		return defense;
	}

	private void setDefense(int defense) {
		this.defense = defense;
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
		result = prime * result + ((description == null) ? 0 : description.hashCode());
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
