package project.AdvanceWars.services;

import project.AdvanceWars.dto.terrains.TerrainDto;
import project.AdvanceWars.enumValues.TypeTerrain;
import project.AdvanceWars.services.interfaces.IServiceTerrain;

public class ServiceTerrain implements IServiceTerrain {

	@Override
	public TerrainDto createTerrain(TypeTerrain terrain) {
		TerrainDto terrainDto = new TerrainDto();
		switch (terrain) {
		case PLAINE:
			terrainDto.setDefense(1);
			terrainDto.setMvtInfanterie(1);
			terrainDto.setMvtInfanterieLourde(1);
			terrainDto.setMvtRoues(2);
			terrainDto.setMvtChar(1);
			terrainDto.setMvtAir(1);
			terrainDto.setMvtNavire(20);
			terrainDto.setMvtTransport(20);
			terrainDto.setMvtSub(20);
			terrainDto.setDescription("Plaine verdoyante. Facile a traverser, mais offrant peu de couverture.");
			terrainDto.setCamouflage(Boolean.FALSE);
			terrainDto.setTypeTerrain(terrain);
		case FORET:
			terrainDto.setDefense(2);
			terrainDto.setMvtInfanterie(1);
			terrainDto.setMvtInfanterieLourde(1);
			terrainDto.setMvtRoues(3);
			terrainDto.setMvtChar(2);
			terrainDto.setMvtAir(1);
			terrainDto.setMvtNavire(20);
			terrainDto.setMvtTransport(20);
			terrainDto.setMvtSub(20);
			terrainDto.setDescription("En brouillard, les unites ne sont vues que par des troupes proches ou volantes.");
			terrainDto.setCamouflage(Boolean.TRUE);
			terrainDto.setTypeTerrain(terrain);
		case MONTAGNE:
			terrainDto.setDefense(4);
			terrainDto.setMvtInfanterie(2);
			terrainDto.setMvtInfanterieLourde(1);
			terrainDto.setMvtRoues(20);
			terrainDto.setMvtChar(20);
			terrainDto.setMvtAir(1);
			terrainDto.setMvtNavire(20);
			terrainDto.setMvtTransport(20);
			terrainDto.setMvtSub(20);
			terrainDto.setDescription("Montagne abrupte. L'infanterie gagne 3 points a son champ de vision.");
			terrainDto.setCamouflage(Boolean.TRUE);
			terrainDto.setTypeTerrain(terrain);
		case ROUTE:
			terrainDto.setDefense(0);
			terrainDto.setMvtInfanterie(1);
			terrainDto.setMvtInfanterieLourde(1);
			terrainDto.setMvtRoues(1);
			terrainDto.setMvtChar(1);
			terrainDto.setMvtAir(1);
			terrainDto.setMvtNavire(20);
			terrainDto.setMvtTransport(20);
			terrainDto.setMvtSub(20);
			terrainDto.setDescription("Une route en bitume. Facile a traverser, mais n'offrant aucune couverture.");
			terrainDto.setCamouflage(Boolean.FALSE);
			terrainDto.setTypeTerrain(terrain);
		case PONT:
			terrainDto.setDefense(0);
			terrainDto.setMvtInfanterie(1);
			terrainDto.setMvtInfanterieLourde(1);
			terrainDto.setMvtRoues(1);
			terrainDto.setMvtChar(1);
			terrainDto.setMvtAir(1);
			terrainDto.setMvtNavire(20);
			terrainDto.setMvtTransport(20);
			terrainDto.setMvtSub(20);
			terrainDto.setDescription("Un pont permet aux unites de traverser un fleuve. Pas de bonus.");
			terrainDto.setCamouflage(Boolean.FALSE);
			terrainDto.setTypeTerrain(terrain);
		case RIVIERE:
			terrainDto.setDefense(0);
			terrainDto.setMvtInfanterie(2);
			terrainDto.setMvtInfanterieLourde(1);
			terrainDto.setMvtRoues(20);
			terrainDto.setMvtChar(20);
			terrainDto.setMvtAir(20);
			terrainDto.setMvtNavire(20);
			terrainDto.setMvtTransport(20);
			terrainDto.setMvtSub(20);
			terrainDto.setDescription("Une riviere au faible courant. Seule l'infanterie peut la traverser.");
			terrainDto.setCamouflage(Boolean.FALSE);
			terrainDto.setTypeTerrain(terrain);
		case PLAGE:
			terrainDto.setDefense(0);
			terrainDto.setMvtInfanterie(1);
			terrainDto.setMvtInfanterieLourde(1);
			terrainDto.setMvtRoues(1);
			terrainDto.setMvtChar(1);
			terrainDto.setMvtAir(1);
			terrainDto.setMvtNavire(20);
			terrainDto.setMvtTransport(1);
			terrainDto.setMvtSub(20);
			terrainDto.setDescription("Rivage sablonneux. La Barge permet d'y decharger et charger des unites.");
			terrainDto.setCamouflage(Boolean.FALSE);
			terrainDto.setTypeTerrain(terrain);
		case MER:
			terrainDto.setDefense(0);
			terrainDto.setMvtInfanterie(20);
			terrainDto.setMvtInfanterieLourde(20);
			terrainDto.setMvtRoues(20);
			terrainDto.setMvtChar(20);
			terrainDto.setMvtAir(1);
			terrainDto.setMvtNavire(1);
			terrainDto.setMvtTransport(1);
			terrainDto.setMvtSub(1);
			terrainDto.setDescription("Une etendue d'eau. Seule une unite aerienne ou maritime peut la traverser.");
			terrainDto.setCamouflage(Boolean.FALSE);
			terrainDto.setTypeTerrain(terrain);
		case RECIF:
			terrainDto.setDefense(1);
			terrainDto.setMvtInfanterie(20);
			terrainDto.setMvtInfanterieLourde(20);
			terrainDto.setMvtRoues(20);
			terrainDto.setMvtChar(20);
			terrainDto.setMvtAir(1);
			terrainDto.setMvtNavire(2);
			terrainDto.setMvtTransport(2);
			terrainDto.setMvtSub(2);
			terrainDto.setDescription("En brouillard, les unites ne sont vues que par des troupes proches ou volantes.");
			terrainDto.setCamouflage(Boolean.TRUE);
			terrainDto.setTypeTerrain(terrain);
		case VILLE:
			terrainDto.setDefense(0);
			terrainDto.setMvtInfanterie(1);
			terrainDto.setMvtInfanterieLourde(1);
			terrainDto.setMvtRoues(1);
			terrainDto.setMvtChar(1);
			terrainDto.setMvtAir(1);
			terrainDto.setMvtNavire(20);
			terrainDto.setMvtTransport(20);
			terrainDto.setMvtSub(20);
			terrainDto.setDescription("Les unites au sol sont approvisionnees et soignees dans les villes alliees.");
			terrainDto.setCamouflage(Boolean.FALSE);
			terrainDto.setTypeTerrain(terrain);
		case QG:
			terrainDto.setDefense(0);
			terrainDto.setMvtInfanterie(1);
			terrainDto.setMvtInfanterieLourde(1);
			terrainDto.setMvtRoues(1);
			terrainDto.setMvtChar(1);
			terrainDto.setMvtAir(1);
			terrainDto.setMvtNavire(20);
			terrainDto.setMvtTransport(20);
			terrainDto.setMvtSub(20);
			terrainDto.setDescription("Un Q.G. La bataille est finie s'il est capture. Rend des PV aux troupes.");
			terrainDto.setCamouflage(Boolean.FALSE);
			terrainDto.setTypeTerrain(terrain);
		case BASE:
			terrainDto.setDefense(0);
			terrainDto.setMvtInfanterie(1);
			terrainDto.setMvtInfanterieLourde(1);
			terrainDto.setMvtRoues(1);
			terrainDto.setMvtChar(1);
			terrainDto.setMvtAir(1);
			terrainDto.setMvtNavire(20);
			terrainDto.setMvtTransport(20);
			terrainDto.setMvtSub(20);
			terrainDto.setDescription("Une base terrestre qui peut creer des unites terrestres et leur rendre des PV.");
			terrainDto.setCamouflage(Boolean.FALSE);
			terrainDto.setTypeTerrain(terrain);
		case PORT:
			terrainDto.setDefense(0);
			terrainDto.setMvtInfanterie(1);
			terrainDto.setMvtInfanterieLourde(1);
			terrainDto.setMvtRoues(1);
			terrainDto.setMvtChar(1);
			terrainDto.setMvtAir(1);
			terrainDto.setMvtNavire(20);
			terrainDto.setMvtTransport(20);
			terrainDto.setMvtSub(20);
			terrainDto.setDescription("Une base maritime qui peut creer des unites navales et leur rendre des PV.");
			terrainDto.setCamouflage(Boolean.FALSE);
			terrainDto.setTypeTerrain(terrain);
		case AEROPORT:
			terrainDto.setDefense(0);
			terrainDto.setMvtInfanterie(1);
			terrainDto.setMvtInfanterieLourde(1);
			terrainDto.setMvtRoues(1);
			terrainDto.setMvtChar(1);
			terrainDto.setMvtAir(1);
			terrainDto.setMvtNavire(20);
			terrainDto.setMvtTransport(20);
			terrainDto.setMvtSub(20);
			terrainDto.setDescription("Une base aerienne qui peut creer des unites aeriennes et leur rendre des PV.");
			terrainDto.setCamouflage(Boolean.FALSE);
			terrainDto.setTypeTerrain(terrain);
		default:
			break;
		}
		return terrainDto;
	}

}
