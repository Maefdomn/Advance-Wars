package project.AdvanceWars.dto.unites;

import project.AdvanceWars.dto.unites.interfaces.IUnite;
import project.AdvanceWars.enumValues.ListeUnites;
import project.AdvanceWars.enumValues.ListeDeplacements;

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
	private ListeDeplacements typeDeplacements;

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
			this.setDescription("L'infanterie a une faible puissance de feu, mais sert a capturer des bases.");
			this.setTypeDeplacements(ListeDeplacements.INF);
		} else if (unite == ListeUnites.BAZOOKA) {
			this.setDeplacement(2);
			this.setVision(2);
			this.setEssenceMax(70);
			this.setMunitionMax(3);
			this.setCout(3000);
			this.setPeutCapturer(true);
			this.setDescription("Les bazookas peuvent servir a capturer des bases. Ils ont une bonne puissance de feu.");
			this.setTypeDeplacements(ListeDeplacements.INFLOURDE);
		} else if (unite == ListeUnites.TANK) {
			this.setDeplacement(6);
			this.setVision(3);
			this.setEssenceMax(70);
			this.setMunitionMax(9);
			this.setCout(7000);
			this.setPeutCapturer(false);
			this.setDescription("Les tanks se deplacent rapidement, sont peu couteux et donc sont faciles a deployer.");
			this.setTypeDeplacements(ListeDeplacements.CHAR);
		} else if (unite == ListeUnites.TANKM) {
			this.setDeplacement(5);
			this.setVision(1);
			this.setEssenceMax(50);
			this.setMunitionMax(8);
			this.setCout(16000);
			this.setPeutCapturer(false);
			this.setDescription("Les capacites du tank m (moyen) sont les plus elevees des unites terrestres.");
			this.setTypeDeplacements(ListeDeplacements.CHAR);
		} else if (unite == ListeUnites.VTB) {
			this.setDeplacement(6);
			this.setVision(1);
			this.setEssenceMax(70);
			this.setMunitionMax(0);
			this.setCout(5000);
			this.setPeutCapturer(false);
			this.setDescription("Les VTB transportent de l'infanterie, des munitions, de l'essence et des rations.");
			this.setTypeDeplacements(ListeDeplacements.CHAR);
		} else if (unite == ListeUnites.DCA) {
			this.setDeplacement(6);
			this.setVision(2);
			this.setEssenceMax(60);
			this.setMunitionMax(9);
			this.setCout(8000);
			this.setPeutCapturer(false);
			this.setDescription("La D.C.A. est efficace contre l'infanterie et les unites aeriennes, mais est faible face au tank.");
			this.setTypeDeplacements(ListeDeplacements.CHAR);
		} else if (unite == ListeUnites.ARTILLERIE) {
			this.setDeplacement(5);
			this.setVision(1);
			this.setEssenceMax(50);
			this.setMunitionMax(9);
			this.setCout(6000);
			this.setPeutCapturer(false);
			this.setDescription("L'artillerie permet d'avoir une force de frappe utile et peu onereuse.");
			this.setTypeDeplacements(ListeDeplacements.CHAR);
		} else if (unite == ListeUnites.HELICO) {
			this.setDeplacement(6);
			this.setVision(3);
			this.setEssenceMax(99);
			this.setMunitionMax(6);
			this.setCout(9000);
			this.setPeutCapturer(false);
			this.setDescription("Les helicos peuvent tirer sur de nombreux types d'unites.");
			this.setTypeDeplacements(ListeDeplacements.AIR);
		} else if (unite == ListeUnites.HELICOTRANSPORT) {
			this.setDeplacement(6);
			this.setVision(2);
			this.setEssenceMax(99);
			this.setMunitionMax(0);
			this.setCout(5000);
			this.setPeutCapturer(false);
			this.setDescription("Les heli tr (transport) ont un bon deplacement et peuvent transporter de l'infanterie.");
			this.setTypeDeplacements(ListeDeplacements.AIR);
		} else if (unite == ListeUnites.CHASSEUR) {
			this.setDeplacement(9);
			this.setVision(2);
			this.setEssenceMax(99);
			this.setMunitionMax(9);
			this.setCout(20000);
			this.setPeutCapturer(false);
			this.setDescription("Les chasseurs peuvent seulement attaquer d'autres unites aeriennes.");
			this.setTypeDeplacements(ListeDeplacements.AIR);
		} else if (unite == ListeUnites.BOMBARDIER) {
			this.setDeplacement(7);
			this.setVision(2);
			this.setEssenceMax(99);
			this.setMunitionMax(9);
			this.setCout(22000);
			this.setPeutCapturer(false);
			this.setDescription("Les bombardiers peuvent tirer sur les unites terrestres et maritimes.");
			this.setTypeDeplacements(ListeDeplacements.AIR);
		} else if (unite == ListeUnites.LMISS) {
			this.setDeplacement(5);
			this.setVision(1);
			this.setEssenceMax(50);
			this.setMunitionMax(6);
			this.setCout(15000);
			this.setPeutCapturer(false);
			this.setDescription("Les lance-missiles peuvent tirer à la fois sur les unités terrestres et maritimes.");
			this.setTypeDeplacements(ListeDeplacements.ROUES);
		} else if (unite == ListeUnites.AAIR) {
			this.setDeplacement(4);
			this.setVision(5);
			this.setEssenceMax(50);
			this.setMunitionMax(6);
			this.setCout(12000);
			this.setPeutCapturer(false);
			this.setDescription("Les a-air sont essentiels lorsqu'il faut se defendre contre les unites aeriennes.");
			this.setTypeDeplacements(ListeDeplacements.ROUES);
		} else if (unite == ListeUnites.BARGE) {
			this.setDeplacement(6);
			this.setVision(1);
			this.setEssenceMax(99);
			this.setMunitionMax(0);
			this.setCout(12000);
			this.setPeutCapturer(false);
			this.setDescription("La barge peut transporter deux unites terrestres. Si elle coule, les unites sont detruites.");
			this.setTypeDeplacements(ListeDeplacements.TRANSPORT);
		} else if (unite == ListeUnites.CROISEUR) {
			this.setDeplacement(6);
			this.setVision(3);
			this.setEssenceMax(99);
			this.setMunitionMax(9);
			this.setCout(18000);
			this.setPeutCapturer(false);
			this.setDescription("Les croiseurs sont bons contre sub et unites volantes. Ils peuvent embarquer deux helicos.");
			this.setTypeDeplacements(ListeDeplacements.NAVIRE);
		} else if (unite == ListeUnites.SOUSMARIN) {
			this.setDeplacement(5);
			this.setVision(5);
			this.setEssenceMax(60);
			this.setMunitionMax(6);
			this.setCout(22000);
			this.setPeutCapturer(false);
			this.setDescription("Seuls les croiseurs et les sous-marins peuvent tirer sur un sous-marin en plongee.");
			this.setTypeDeplacements(project.AdvanceWars.enumValues.ListeDeplacements.SUB);
		} else if (unite == ListeUnites.DESTROYER) {
			this.setDeplacement(5);
			this.setVision(2);
			this.setEssenceMax(99);
			this.setMunitionMax(9);
			this.setCout(28000);
			this.setPeutCapturer(false);
			this.setDescription("Les destroyers ont une portee de tir plus grande que celle des lance-missiles.");
			this.setTypeDeplacements(ListeDeplacements.NAVIRE);
		} else if (unite == ListeUnites.RECON) {
			this.setDeplacement(8);
			this.setVision(5);
			this.setEssenceMax(80);
			this.setMunitionMax(99);
			this.setCout(4000);
			this.setPeutCapturer(false);
			this.setDescription("Le Recon se deplace loin et resiste aux tirs de l'infanterie.");
			this.setTypeDeplacements(ListeDeplacements.ROUES);
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

	public ListeDeplacements getTypeDeplacements() {
		return typeDeplacements;
	}

	public void setTypeDeplacements(ListeDeplacements typeDeplacements) {
		this.typeDeplacements = typeDeplacements;
	}

}
