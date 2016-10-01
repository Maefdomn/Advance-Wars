package project.AdvanceWars.services.interfaces;

import project.AdvanceWars.dto.unites.UniteDto;
import project.AdvanceWars.enumValues.TypeUnite;

public interface IUniteService {

	UniteDto createUnite(Integer x, Integer Y, TypeUnite unitType);

}
