package project.AdvanceWars.dto.terrains.factory;

import project.AdvanceWars.dto.terrains.TerrainDto;
import project.AdvanceWars.dto.terrains.specifique.T_Aeroport;
import project.AdvanceWars.dto.terrains.specifique.T_Base;
import project.AdvanceWars.dto.terrains.specifique.T_Foret;
import project.AdvanceWars.dto.terrains.specifique.T_Mer;
import project.AdvanceWars.dto.terrains.specifique.T_Montagne;
import project.AdvanceWars.dto.terrains.specifique.T_Plage;
import project.AdvanceWars.dto.terrains.specifique.T_Plaine;
import project.AdvanceWars.dto.terrains.specifique.T_Pont;
import project.AdvanceWars.dto.terrains.specifique.T_Port;
import project.AdvanceWars.dto.terrains.specifique.T_QG;
import project.AdvanceWars.dto.terrains.specifique.T_Recif;
import project.AdvanceWars.dto.terrains.specifique.T_Riviere;
import project.AdvanceWars.dto.terrains.specifique.T_Route;
import project.AdvanceWars.dto.terrains.specifique.T_Ville;
import project.AdvanceWars.enumValues.TypeTerrain;

public class TerrainFactory {

	public TerrainDto createTerrain(TypeTerrain typeTerrain) {
		switch (typeTerrain) {
		case PLAINE:
			return new T_Plaine();
		case FORET:
			return new T_Foret();
		case MONTAGNE:
			return new T_Montagne();
		case ROUTE:
			return new T_Route();
		case PONT:
			return new T_Pont();
		case RIVIERE:
			return new T_Riviere();
		case PLAGE:
			return new T_Plage();
		case MER:
			return new T_Mer();
		case RECIF:
			return new T_Recif();
		case VILLE:
			return new T_Ville();
		case QG:
			return new T_QG();
		case BASE:
			return new T_Base();
		case PORT:
			return new T_Port();
		case AEROPORT:
			return new T_Aeroport();
		default:
			return null;
		}
	}
}
