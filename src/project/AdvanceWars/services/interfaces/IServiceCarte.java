package project.AdvanceWars.services.interfaces;

import project.AdvanceWars.dto.CarteDto;
import project.AdvanceWars.dto.terrains.Terrain;

public interface IServiceCarte {
	
	Terrain getTerrain(Integer x, Integer y, CarteDto carte);
}
