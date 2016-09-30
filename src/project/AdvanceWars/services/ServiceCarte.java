package project.AdvanceWars.services;

import project.AdvanceWars.dto.CarteDto;
import project.AdvanceWars.dto.terrains.Terrain;
import project.AdvanceWars.services.interfaces.IServiceCarte;

public class ServiceCarte implements IServiceCarte{

	@Override
	public Terrain getTerrain(Integer x, Integer y, CarteDto carte) {
		return carte.getTerrains()[x][y];
	}

}
