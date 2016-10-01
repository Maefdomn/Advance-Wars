package project.AdvanceWars.services.interfaces;

import project.AdvanceWars.dto.terrains.TerrainDto;
import project.AdvanceWars.enumValues.TypeTerrain;

public interface IServiceTerrain {

	TerrainDto createTerrain(TypeTerrain terrain);

}
