package project.AdvanceWars.dto.terrains;

import project.AdvanceWars.enumValues.ListeTerrains;

public class TerrainDto {

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
	private Boolean camouflage;
	private ListeTerrains typeTerrain;

	public TerrainDto() {
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public int getMvtInfanterie() {
		return mvtInfanterie;
	}

	public void setMvtInfanterie(int mvtInfanterie) {
		this.mvtInfanterie = mvtInfanterie;
	}

	public int getMvtInfanterieLourde() {
		return mvtInfanterieLourde;
	}

	public void setMvtInfanterieLourde(int mvtInfanterieLourde) {
		this.mvtInfanterieLourde = mvtInfanterieLourde;
	}

	public int getMvtRoues() {
		return mvtRoues;
	}

	public void setMvtRoues(int mvtRoues) {
		this.mvtRoues = mvtRoues;
	}

	public int getMvtChar() {
		return mvtChar;
	}

	public void setMvtChar(int mvtChar) {
		this.mvtChar = mvtChar;
	}

	public int getMvtAir() {
		return mvtAir;
	}

	public void setMvtAir(int mvtAir) {
		this.mvtAir = mvtAir;
	}

	public int getMvtNavire() {
		return mvtNavire;
	}

	public void setMvtNavire(int mvtNavire) {
		this.mvtNavire = mvtNavire;
	}

	public int getMvtTransport() {
		return mvtTransport;
	}

	public void setMvtTransport(int mvtTransport) {
		this.mvtTransport = mvtTransport;
	}

	public int getMvtSub() {
		return mvtSub;
	}

	public void setMvtSub(int mvtSub) {
		this.mvtSub = mvtSub;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getCamouflage() {
		return camouflage;
	}

	public void setCamouflage(Boolean camouflage) {
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
		TerrainDto other = (TerrainDto) obj;
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

	public ListeTerrains getTypeTerrain() {
		return typeTerrain;
	}

	public void setTypeTerrain(ListeTerrains typeTerrain) {
		this.typeTerrain = typeTerrain;
	}

}
