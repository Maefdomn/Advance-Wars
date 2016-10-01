package project.AdvanceWars.dto.unites;

import project.AdvanceWars.dto.unites.interfaces.IUnite;
import project.AdvanceWars.enumValues.TypeDeplacement;

public class UniteDto implements IUnite {

	private int pv;
	private int x;
	private int y;
	private int deplacement;
	private int vision;
	private int essence;
	private int essenceMax;
	private int munition;
	private int munitionMax;
	private int cout;
	private int defense;
	private boolean peutCapturer;
	private String description;
	private TypeDeplacement typeDeplacements;

	public int getPv() {
		return pv;
	}

	public void setPv(int pv) {
		this.pv = pv;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getDeplacement() {
		return deplacement;
	}

	public void setDeplacement(int deplacement) {
		this.deplacement = deplacement;
	}

	public int getVision() {
		return vision;
	}

	public void setVision(int vision) {
		this.vision = vision;
	}

	public int getEssence() {
		return essence;
	}

	public void setEssence(int essence) {
		this.essence = essence;
	}

	public int getEssenceMax() {
		return essenceMax;
	}

	public void setEssenceMax(int essenceMax) {
		this.essenceMax = essenceMax;
	}

	public int getMunition() {
		return munition;
	}

	public void setMunition(int munition) {
		this.munition = munition;
	}

	public int getMunitionMax() {
		return munitionMax;
	}

	public void setMunitionMax(int munitionMax) {
		this.munitionMax = munitionMax;
	}

	public int getCout() {
		return cout;
	}

	public void setCout(int cout) {
		this.cout = cout;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
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
}
