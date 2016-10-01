package project.AdvanceWars.services;

import project.AdvanceWars.dto.CarteDto;
import project.AdvanceWars.dto.terrains.Terrain;
import project.AdvanceWars.dto.terrains.specifique.T_Foret;
import project.AdvanceWars.dto.terrains.specifique.T_Mer;
import project.AdvanceWars.dto.terrains.specifique.T_Montagne;
import project.AdvanceWars.dto.terrains.specifique.T_Plaine;
import project.AdvanceWars.services.interfaces.IServiceCarte;

public class ServiceCarte implements IServiceCarte {

	@Override
	public Terrain getTerrain(Integer x, Integer y, CarteDto carte) {
		return carte.getTerrains()[x][y];
	}

	@Override
	public CarteDto createDefaultCarte() {
		CarteDto carteDto = new CarteDto();
		carteDto.setTerrains(new Terrain[10][15]);
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
