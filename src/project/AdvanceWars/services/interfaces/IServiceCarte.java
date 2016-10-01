package project.AdvanceWars.services.interfaces;

import project.AdvanceWars.dto.CarteDto;
import project.AdvanceWars.dto.terrains.TerrainDto;

public interface IServiceCarte {

	TerrainDto getTerrain(Integer x, Integer y, CarteDto carte);

	CarteDto createDefaultCarte();
}
