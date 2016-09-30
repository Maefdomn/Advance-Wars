package unites;

import caracteristiques.ENUM;
import caracteristiques.ENUM.TypeDeplacement;

public class Unite implements UniteInterface {

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
	private TypeDeplacement typeDeplacement;

	public Unite(int X, int Y, ENUM.ListeUnites unite) {
		this.setPV(10);
		this.setX(X);
		this.setY(Y);
		this.setDefense(3);

		if (unite == ENUM.ListeUnites.INFANTERIE) {
			this.setDeplacement(3);
			this.setVision(2);
			this.setEssenceMax(99);
			this.setMunitionMax(99);
			this.setCout(1000);
			this.setPeutCapturer(true);
			this.setDescription("L'infanterie a une faible puissance de feu, mais sert à capturer des bases.");
			this.setTypeDeplacement(ENUM.TypeDeplacement.INF);
		} else if (unite == ENUM.ListeUnites.BAZOOKA) {
			this.setDeplacement(2);
			this.setVision(2);
			this.setEssenceMax(70);
			this.setMunitionMax(3);
			this.setCout(3000);
			this.setPeutCapturer(true);
			this.setDescription("Les bazookas peuvent servir à capturer des bases. Ils ont une bonne puissance de feu.");
			this.setTypeDeplacement(ENUM.TypeDeplacement.INFLOURDE);
		} else if (unite == ENUM.ListeUnites.TANK) {
			this.setDeplacement(6);
			this.setVision(3);
			this.setEssenceMax(70);
			this.setMunitionMax(9);
			this.setCout(0000);
			this.setPeutCapturer(false);
			this.setDescription("Les tanks se déplacent rapidement, sont peu coûteux et donc sont faciles à déployer.");
			this.setTypeDeplacement(ENUM.TypeDeplacement.CHAR);
		} else if (unite == ENUM.ListeUnites.TANKM) {
			this.setDeplacement(5);
			this.setVision(1);
			this.setEssenceMax(50);
			this.setMunitionMax(8);
			this.setCout(0000);
			this.setPeutCapturer(false);
			this.setDescription("Les capacités du tank m (moyen) sont les plus élevées des unités terrestres.");
			this.setTypeDeplacement(ENUM.TypeDeplacement.CHAR);
		} else if (unite == ENUM.ListeUnites.VTB) {
			this.setDeplacement(6);
			this.setVision(1);
			this.setEssenceMax(70);
			this.setMunitionMax(0);
			this.setCout(0000);
			this.setPeutCapturer(false);
			this.setDescription("Les VTB transportent de l'infanterie, des munitions, de l'essence et des rations.");
			this.setTypeDeplacement(ENUM.TypeDeplacement.CHAR);
		} else if (unite == ENUM.ListeUnites.DCA) {
			this.setDeplacement(6);
			this.setVision(2);
			this.setEssenceMax(60);
			this.setMunitionMax(9);
			this.setCout(0000);
			this.setPeutCapturer(false);
			this.setDescription("La D.C.A. est efficace contre l'infanterie et les unités aériennes, mais est faible face au tank.");
			this.setTypeDeplacement(ENUM.TypeDeplacement.CHAR);
		} else if (unite == ENUM.ListeUnites.ARTILLERIE) {
			this.setDeplacement(5);
			this.setVision(1);
			this.setEssenceMax(50);
			this.setMunitionMax(9);
			this.setCout(0000);
			this.setPeutCapturer(false);
			this.setDescription("L'artillerie permet d'avoir une force de frappe utile et peu onéreuse.");
			this.setTypeDeplacement(ENUM.TypeDeplacement.CHAR);
		} else if (unite == ENUM.ListeUnites.HELICO) {
			this.setDeplacement(6);
			this.setVision(3);
			this.setEssenceMax(99);
			this.setMunitionMax(6);
			this.setCout(0000);
			this.setPeutCapturer(false);
			this.setDescription("Les hélicos peuvent tirer sur de nombreux types d'unités.");
			this.setTypeDeplacement(ENUM.TypeDeplacement.AIR);
		} else if (unite == ENUM.ListeUnites.HELICOTRANSPORT) {
			this.setDeplacement(6);
			this.setVision(2);
			this.setEssenceMax(99);
			this.setMunitionMax(0);
			this.setCout(0000);
			this.setPeutCapturer(false);
			this.setDescription("Les héli tr (transport) ont un bon déplacement et peuvent transporter de l'infanterie.");
			this.setTypeDeplacement(ENUM.TypeDeplacement.AIR);
		} else if (unite == ENUM.ListeUnites.CHASSEUR) {
			this.setDeplacement(9);
			this.setVision(2);
			this.setEssenceMax(99);
			this.setMunitionMax(9);
			this.setCout(0000);
			this.setPeutCapturer(false);
			this.setDescription("Les chasseurs peuvent seulement attaquer d'autres unités aériennes.");
			this.setTypeDeplacement(ENUM.TypeDeplacement.AIR);
		} else if (unite == ENUM.ListeUnites.BOMBARDIER) {
			this.setDeplacement(7);
			this.setVision(2);
			this.setEssenceMax(99);
			this.setMunitionMax(9);
			this.setCout(0000);
			this.setPeutCapturer(false);
			this.setDescription("Les bombardiers peuvent tirer sur les unités terrestres et maritimes.");
			this.setTypeDeplacement(ENUM.TypeDeplacement.AIR);
		} else if (unite == ENUM.ListeUnites.LMISS) {
			this.setDeplacement(5);
			this.setVision(1);
			this.setEssenceMax(50);
			this.setMunitionMax(6);
			this.setCout(0000);
			this.setPeutCapturer(false);
			this.setDescription("Les lance-missiles peuvent tirer à la fois sur les unités terrestres et maritimes.");
			this.setTypeDeplacement(ENUM.TypeDeplacement.ROUES);
		} else if (unite == ENUM.ListeUnites.AAIR) {
			this.setDeplacement(4);
			this.setVision(5);
			this.setEssenceMax(50);
			this.setMunitionMax(6);
			this.setCout(0000);
			this.setPeutCapturer(false);
			this.setDescription("Les a-air sont essentiels lorsqu'il faut se défendre contre les unités aériennes.");
			this.setTypeDeplacement(ENUM.TypeDeplacement.ROUES);
		} else if (unite == ENUM.ListeUnites.BARGE) {
			this.setDeplacement(6);
			this.setVision(1);
			this.setEssenceMax(99);
			this.setMunitionMax(0);
			this.setCout(0000);
			this.setPeutCapturer(false);
			this.setDescription("La barge peut transporter deux unités terrestres. Si elle coule, les unités sont détruites.");
			this.setTypeDeplacement(ENUM.TypeDeplacement.TRANSPORT);
		} else if (unite == ENUM.ListeUnites.CROISEUR) {
			this.setDeplacement(6);
			this.setVision(3);
			this.setEssenceMax(99);
			this.setMunitionMax(9);
			this.setCout(0000);
			this.setPeutCapturer(false);
			this.setDescription("Les croiseurs sont bons contre sub et unités volantes. Ils peuvent embarquer deux hélicos.");
			this.setTypeDeplacement(ENUM.TypeDeplacement.NAVIRE);
		} else if (unite == ENUM.ListeUnites.SOUSMARIN) {
			this.setDeplacement(5);
			this.setVision(5);
			this.setEssenceMax(60);
			this.setMunitionMax(6);
			this.setCout(0000);
			this.setPeutCapturer(false);
			this.setDescription("Seuls les croiseurs et les sous-marins peuvent tirer sur un sous-marin en plongée.");
			this.setTypeDeplacement(ENUM.TypeDeplacement.SUB);
		} else if (unite == ENUM.ListeUnites.DESTROYER) {
			this.setDeplacement(5);
			this.setVision(2);
			this.setEssenceMax(99);
			this.setMunitionMax(9);
			this.setCout(0000);
			this.setPeutCapturer(false);
			this.setDescription("Les destroyers ont une portée de tir plus grande que celle des lance-missiles.");
			this.setTypeDeplacement(ENUM.TypeDeplacement.NAVIRE);
		} else if (unite == ENUM.ListeUnites.RECON) {
			this.setDeplacement(8);
			this.setVision(5);
			this.setEssenceMax(80);
			this.setMunitionMax(99);
			this.setCout(0000);
			this.setPeutCapturer(false);
			this.setDescription("Le Recon se déplace loin et résiste aux tirs de l'infanterie.");
			this.setTypeDeplacement(ENUM.TypeDeplacement.ROUES);
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

	public TypeDeplacement getTypeDeplacement() {
		return typeDeplacement;
	}

	public void setTypeDeplacement(TypeDeplacement typeDep) {
		this.typeDeplacement = typeDep;
	}

}
