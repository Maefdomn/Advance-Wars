package project.AdvanceWars.dto;

import project.AdvanceWars.dto.terrains.Terrain;
import project.AdvanceWars.dto.terrains.specifique.*;

public class CarteDto {

	private Terrain[][] terrains;

	public CarteDto() {
		// Construction de la carte test
		this.setTerrains(new Terrain[10][15]);
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++)
				this.setTerrainsis(i, j, new T_Plaine());
			for (int j = 7; j < 15; j++)
				this.setTerrainsis(i, j, new T_Montagne());
		}
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++)
				this.setTerrainsis(i, j, new T_Mer());
			for (int j = 7; j < 15; j++)
				this.setTerrainsis(i, j, new T_Foret());
		}
	}

	public CarteDto(Terrain[][] terrains) {
		this.setTerrains(terrains);
	}

	public Terrain[][] getTerrains() {
		return terrains;
	}

	public void setTerrains(Terrain[][] terrains) {
		this.terrains = terrains;
	}

	public void setTerrainsis(int i, int j, Terrain terrain) {
		this.terrains[i][j] = terrain;
	}

	@Override
	public String toString() {
		String str = "";
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				str = str + " " + this.getTerrains().toString();
			}
			str = str + "\n";
		}
		return str;
	}
}
