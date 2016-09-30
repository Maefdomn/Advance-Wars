package project.AdvanceWars.dto.unites;

import project.AdvanceWars.dto.unites.interfaces.IUnite;
import project.AdvanceWars.enumValues.ListeUnites;
import project.AdvanceWars.enumValues.TypeDeplacements;

public class UniteDto implements IUnite {

	private int PV;
	private int X;
	private int Y;
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
	private TypeDeplacements typeDeplacements;

	public UniteDto(int X, int Y, ListeUnites unite) {
		this.setPV(10);
		this.setX(X);
		this.setY(Y);
		this.setDefense(3);

		if (unite == ListeUnites.INFANTERIE) {
			this.setDeplacement(3);
			this.setVision(2);
			this.setEssenceMax(99);
			this.setMunitionMax(99);
			this.setCout(1000);
			this.setPeutCapturer(true);
			this.setDescription("L'infanterie a une faible puissance de feu, mais sert à capturer des bases.");
			this.setTypeDeplacements(TypeDeplacements.INF);
		} else if (unite == ListeUnites.BAZOOKA) {
			this.setDeplacement(2);
			this.setVision(2);
			this.setEssenceMax(70);
			this.setMunitionMax(3);
			this.setCout(3000);
			this.setPeutCapturer(true);
			this.setDescription("Les bazookas peuvent servir à capturer des bases. Ils ont une bonne puissance de feu.");
			this.setTypeDeplacements(TypeDeplacements.INFLOURDE);
		} else if (unite == ListeUnites.TANK) {
			this.setDeplacement(6);
			this.setVision(3);
			this.setEssenceMax(70);
			this.setMunitionMax(9);
			this.setCout(0000);
			this.setPeutCapturer(false);
			this.setDescription("Les tanks se déplacent rapidement, sont peu coûteux et donc sont faciles à déployer.");
			this.setTypeDeplacements(TypeDeplacements.CHAR);
		} else if (unite == ListeUnites.TANKM) {
			this.setDeplacement(5);
			this.setVision(1);
			this.setEssenceMax(50);
			this.setMunitionMax(8);
			this.setCout(0000);
			this.setPeutCapturer(false);
			this.setDescription("Les capacités du tank m (moyen) sont les plus élevées des unités terrestres.");
			this.setTypeDeplacements(TypeDeplacements.CHAR);
		} else if (unite == ListeUnites.VTB) {
			this.setDeplacement(6);
			this.setVision(1);
			this.setEssenceMax(70);
			this.setMunitionMax(0);
			this.setCout(0000);
			this.setPeutCapturer(false);
			this.setDescription("Les VTB transportent de l'infanterie, des munitions, de l'essence et des rations.");
			this.setTypeDeplacements(TypeDeplacements.CHAR);
		} else if (unite == ListeUnites.DCA) {
			this.setDeplacement(6);
			this.setVision(2);
			this.setEssenceMax(60);
			this.setMunitionMax(9);
			this.setCout(0000);
			this.setPeutCapturer(false);
			this.setDescription("La D.C.A. est efficace contre l'infanterie et les unités aériennes, mais est faible face au tank.");
			this.setTypeDeplacements(TypeDeplacements.CHAR);
		} else if (unite == ListeUnites.ARTILLERIE) {
			this.setDeplacement(5);
			this.setVision(1);
			this.setEssenceMax(50);
			this.setMunitionMax(9);
			this.setCout(0000);
			this.setPeutCapturer(false);
			this.setDescription("L'artillerie permet d'avoir une force de frappe utile et peu onéreuse.");
			this.setTypeDeplacements(TypeDeplacements.CHAR);
		} else if (unite == ListeUnites.HELICO) {
			this.setDeplacement(6);
			this.setVision(3);
			this.setEssenceMax(99);
			this.setMunitionMax(6);
			this.setCout(0000);
			this.setPeutCapturer(false);
			this.setDescription("Les hélicos peuvent tirer sur de nombreux types d'unités.");
			this.setTypeDeplacements(TypeDeplacements.AIR);
		} else if (unite == ListeUnites.HELICOTRANSPORT) {
			this.setDeplacement(6);
			this.setVision(2);
			this.setEssenceMax(99);
			this.setMunitionMax(0);
			this.setCout(0000);
			this.setPeutCapturer(false);
			this.setDescription("Les heli tr (transport) ont un bon déplacement et peuvent transporter de l'infanterie.");
			this.setTypeDeplacements(TypeDeplacements.AIR);
		} else if (unite == ListeUnites.CHASSEUR) {
			this.setDeplacement(9);
			this.setVision(2);
			this.setEssenceMax(99);
			this.setMunitionMax(9);
			this.setCout(0000);
			this.setPeutCapturer(false);
			this.setDescription("Les chasseurs peuvent seulement attaquer d'autres unités aériennes.");
			this.setTypeDeplacements(TypeDeplacements.AIR);
		} else if (unite == ListeUnites.BOMBARDIER) {
			this.setDeplacement(7);
			this.setVision(2);
			this.setEssenceMax(99);
			this.setMunitionMax(9);
			this.setCout(0000);
			this.setPeutCapturer(false);
			this.setDescription("Les bombardiers peuvent tirer sur les unités terrestres et maritimes.");
			this.setTypeDeplacements(TypeDeplacements.AIR);
		} else if (unite == ListeUnites.LMISS) {
			this.setDeplacement(5);
			this.setVision(1);
			this.setEssenceMax(50);
			this.setMunitionMax(6);
			this.setCout(0000);
			this.setPeutCapturer(false);
			this.setDescription("Les lance-missiles peuvent tirer à la fois sur les unités terrestres et maritimes.");
			this.setTypeDeplacements(TypeDeplacements.ROUES);
		} else if (unite == ListeUnites.AAIR) {
			this.setDeplacement(4);
			this.setVision(5);
			this.setEssenceMax(50);
			this.setMunitionMax(6);
			this.setCout(0000);
			this.setPeutCapturer(false);
			this.setDescription("Les a-air sont essentiels lorsqu'il faut se défendre contre les unités aériennes.");
			this.setTypeDeplacements(TypeDeplacements.ROUES);
		} else if (unite == ListeUnites.BARGE) {
			this.setDeplacement(6);
			this.setVision(1);
			this.setEssenceMax(99);
			this.setMunitionMax(0);
			this.setCout(0000);
			this.setPeutCapturer(false);
			this.setDescription("La barge peut transporter deux unités terrestres. Si elle coule, les unités sont détruites.");
			this.setTypeDeplacements(TypeDeplacements.TRANSPORT);
		} else if (unite == ListeUnites.CROISEUR) {
			this.setDeplacement(6);
			this.setVision(3);
			this.setEssenceMax(99);
			this.setMunitionMax(9);
			this.setCout(0000);
			this.setPeutCapturer(false);
			this.setDescription("Les croiseurs sont bons contre sub et unités volantes. Ils peuvent embarquer deux hélicos.");
			this.setTypeDeplacements(TypeDeplacements.NAVIRE);
		} else if (unite == ListeUnites.SOUSMARIN) {
			this.setDeplacement(5);
			this.setVision(5);
			this.setEssenceMax(60);
			this.setMunitionMax(6);
			this.setCout(0000);
			this.setPeutCapturer(false);
			this.setDescription("Seuls les croiseurs et les sous-marins peuvent tirer sur un sous-marin en plongée.");
			this.setTypeDeplacements(project.AdvanceWars.enumValues.TypeDeplacements.SUB);
		} else if (unite == ListeUnites.DESTROYER) {
			this.setDeplacement(5);
			this.setVision(2);
			this.setEssenceMax(99);
			this.setMunitionMax(9);
			this.setCout(0000);
			this.setPeutCapturer(false);
			this.setDescription("Les destroyers ont une portée de tir plus grande que celle des lance-missiles.");
			this.setTypeDeplacements(TypeDeplacements.NAVIRE);
		} else if (unite == ListeUnites.RECON) {
			this.setDeplacement(8);
			this.setVision(5);
			this.setEssenceMax(80);
			this.setMunitionMax(99);
			this.setCout(0000);
			this.setPeutCapturer(false);
			this.setDescription("Le Recon se déplace loin et résiste aux tirs de l'infanterie.");
			this.setTypeDeplacements(TypeDeplacements.ROUES);
		}

		this.setEssence(this.getEssenceMax());
		this.setMunition(this.getMunitionMax());
	}

	public int getPV() {
		return PV;
	}

	public void setPV(int pV) {
		PV = pV;
	}

	public int getX() {
		return X;
	}

	public void setX(int x) {
		X = x;
	}

	public int getY() {
		return Y;
	}

	public void setY(int y) {
		Y = y;
	}

	public int getDeplacement() {
		return deplacement;
	}

	public void setDeplacement(int dep) {
		this.deplacement = dep;
	}

	public int getVision() {
		return vision;
	}

	public void setVision(int vis) {
		this.vision = vis;
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

	public void setEssenceMax(int essMax) {
		this.essenceMax = essMax;
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

	public void setMunitionMax(int munMax) {
		this.munitionMax = munMax;
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

	public boolean getPeutCapturer() {
		return peutCapturer;
	}

	public void setPeutCapturer(boolean cap) {
		this.peutCapturer = cap;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String desc) {
		this.description = desc;
	}

	public TypeDeplacements getTypeDeplacements() {
		return typeDeplacements;
	}

	public void setTypeDeplacements(TypeDeplacements typeDeplacements) {
		this.typeDeplacements = typeDeplacements;
	}

}
