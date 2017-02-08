package lol.veikko;

import java.io.Serializable;

public class Weather implements Serializable {

	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	public int getWindSpeed() {
		return windSpeed;
	}
	public void setWindSpeed(int windSpeed) {
		this.windSpeed = windSpeed;
	}
	public Weather(int temperature, int windSpeed) {
		this.temperature = temperature;
		this.windSpeed = windSpeed;
	}
	int temperature;
	int windSpeed;
}
