package project.AdvanceWars.dto.unites;

public class UniteDistanceDto extends UniteDto {

	private Integer porteeMin;
	private Integer porteeMax;

	public UniteDistanceDto() {
	}

	public Integer getPorteeMin() {
		return porteeMin;
	}

	public void setPorteeMin(Integer porteeMin) {
		this.porteeMin = porteeMin;
	}

	public Integer getPorteeMax() {
		return porteeMax;
	}

	public void setPorteeMax(Integer porteeMax) {
		this.porteeMax = porteeMax;
	}

	/*
	 * public UniteDistanceDto(int X, int Y, TypeUnite unite) { if (unite ==
	 * TypeUnite.ARTILLERIE) { this.setPorteeMin(2); this.setPorteeMax(3); }
	 * else if (unite == TypeUnite.LMISS || unite == TypeUnite.AAIR) {
	 * this.setPorteeMin(3); this.setPorteeMax(5); } else if (unite ==
	 * TypeUnite.DESTROYER) { this.setPorteeMin(2); this.setPorteeMax(6); } }
	 */

}
