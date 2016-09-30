import terrains.*;
import terrains.terrain.T_Plaine;

public class Carte {

	private Terrain[][] terrains;

	public Carte() {
		this.terrains = new Terrain[10][15];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				this.setTerrain(i, j, new T_Plaine());
			}
		}
	}

	public Carte(Terrain[][] terrains) {
		this.terrains = terrains;
	}

	public Terrain getTerrain(int i, int j) {
		return this.terrains[i][j];
	}

	public void setTerrain(int i, int j, Terrain terrain) {
		this.terrains[i][j] = terrain;
	}
	
	public String toString() {
		String str = "";
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				str = str + " " + this.getTerrain(i,j).toString();
			}
			str = str + "\n";
		}
		
		return str;
	}
}
