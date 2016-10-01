package project.AdvanceWars.services;

import project.AdvanceWars.dto.CarteDto;
import project.AdvanceWars.dto.terrains.TerrainDto;
import project.AdvanceWars.dto.terrains.specifique.T_Foret;
import project.AdvanceWars.dto.terrains.specifique.T_Mer;
import project.AdvanceWars.dto.terrains.specifique.T_Montagne;
import project.AdvanceWars.dto.terrains.specifique.T_Plaine;
import project.AdvanceWars.services.interfaces.IServiceCarte;

public class ServiceCarte implements IServiceCarte {

	public TerrainDto[][] getTerrains(CarteDto carte) {
		return carte.getTerrains();
	}

	public TerrainDto getTerrain(Integer x, Integer y, CarteDto carte) {
		return carte.getTerrains()[x][y];
	}

	public void setTerrains(TerrainDto[][] terrains, CarteDto carte) {
		carte.setTerrains(terrains);
	}

	public void setTerrain(Integer x, Integer y, TerrainDto terrain, CarteDto carte) {
		carte.setTerrain(x, y, terrain);
	}

	@Override
	public CarteDto createDefaultCarte() {
		CarteDto carteDto = new CarteDto();
		carteDto.setTerrains(new TerrainDto[10][15]);
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++)
				carteDto.getTerrains()[i][j] = new T_Plaine();
			for (int j = 7; j < 15; j++)
				carteDto.getTerrains()[i][j] = new T_Montagne();
		}
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++)
				carteDto.getTerrains()[i][j] = new T_Mer();
			for (int j = 7; j < 15; j++)
				carteDto.getTerrains()[i][j] = new T_Foret();
		}
		return carteDto;
	}
}
