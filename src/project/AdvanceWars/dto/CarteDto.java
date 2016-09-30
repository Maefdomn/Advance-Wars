package project.AdvanceWars.dto;

import project.AdvanceWars.dto.terrains.Terrain;

public class CarteDto {

	private Terrain[][] terrains;

	public CarteDto() {
	}

	public Terrain[][] getTerrains() {
		return terrains;
	}

	public void setTerrains(Terrain[][] terrains) {
		this.terrains = terrains;
	}

	@Override
	public String toString() {
		String str = "";
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				str = str + " " + this.getTerrains().toString();
			}
			str = str + "\n;
		}

		return str;
	}
}
