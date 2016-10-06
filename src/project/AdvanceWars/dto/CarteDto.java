package project.AdvanceWars.dto;

import project.AdvanceWars.dto.terrains.TerrainDto;
import project.AdvanceWars.persistance.dao.CST;

public class CarteDto {

	private TerrainDto[][] terrains;

	public CarteDto() {
	}

	public CarteDto(TerrainDto[][] terrains) {
		this.terrains = terrains;
	}

	public TerrainDto[][] getTerrains() {
		return terrains;
	}

	public void setTerrains(TerrainDto[][] terrains) {
		this.terrains = terrains;
	}

	public void setTerrain(Integer x, Integer y, TerrainDto terrain) {
		this.getTerrains()[x][y] = terrain;
	}

	public String toString() {
		String str = "";
		for (int i = 0; i < CST.HAUTEURCARTE; i++) {
			for (int j = 0; j < CST.LARGEURCARTE; j++) {
				str = str + " " + this.getTerrains().toString();
			}
			str = str + "\n";
		}
		return str;
	}
}
