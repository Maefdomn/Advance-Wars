package project.AdvanceWars.dto.unites;

import project.AdvanceWars.dto.unites.interfaces.IUnite;
import project.AdvanceWars.enumValues.TypeDeplacement;
import project.AdvanceWars.enumValues.TypeUnite;

public class UniteDto implements IUnite {

	private Integer pv;
	private Integer x;
	private Integer y;
	private Integer deplacement;
	private Integer vision;
	private Integer essence;
	private Integer essenceMax;
	private Integer munition;
	private Integer munitionMax;
	private Integer cout;
	private Integer defense;
	private boolean peutCapturer;
	private String description;
	private TypeDeplacement typeDeplacements;
	private TypeUnite typeUnite;

	public UniteDto() {

	}

	public Integer getPv() {
		return pv;
	}

	public void setPv(Integer pv) {
		this.pv = pv;
	}

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}

	public Integer getDeplacement() {
		return deplacement;
	}

	public void setDeplacement(Integer deplacement) {
		this.deplacement = deplacement;
	}

	public Integer getVision() {
		return vision;
	}

	public void setVision(Integer vision) {
		this.vision = vision;
	}

	public Integer getEssence() {
		return essence;
	}

	public void setEssence(Integer essence) {
		this.essence = essence;
	}

	public Integer getEssenceMax() {
		return essenceMax;
	}

	public void setEssenceMax(Integer essenceMax) {
		this.essenceMax = essenceMax;
	}

	public Integer getMunition() {
		return munition;
	}

	public void setMunition(Integer munition) {
		this.munition = munition;
	}

	public Integer getMunitionMax() {
		return munitionMax;
	}

	public void setMunitionMax(Integer munitionMax) {
		this.munitionMax = munitionMax;
	}

	public Integer getCout() {
		return cout;
	}

	public void setCout(Integer cout) {
		this.cout = cout;
	}

	public Integer getDefense() {
		return defense;
	}

	public void setDefense(Integer defense) {
		this.defense = defense;
	}

	public boolean isPeutCapturer() {
		return peutCapturer;
	}

	public void setPeutCapturer(boolean peutCapturer) {
		this.peutCapturer = peutCapturer;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public TypeDeplacement getTypeDeplacements() {
		return typeDeplacements;
	}

	public void setTypeDeplacements(TypeDeplacement typeDeplacements) {
		this.typeDeplacements = typeDeplacements;
	}

	public TypeUnite getTypeUnite() {
		return typeUnite;
	}

	public void setTypeUnite(TypeUnite typeUnite) {
		this.typeUnite = typeUnite;
	}
}
