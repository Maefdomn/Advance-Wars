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
}
