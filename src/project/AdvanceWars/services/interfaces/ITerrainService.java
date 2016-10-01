package project.AdvanceWars.services.interfaces;

import project.AdvanceWars.dto.terrains.TerrainDto;
import project.AdvanceWars.enumValues.ListeTerrains;

public interface ITerrainService {

	TerrainDto createTerrain(ListeTerrains terrain);

}
