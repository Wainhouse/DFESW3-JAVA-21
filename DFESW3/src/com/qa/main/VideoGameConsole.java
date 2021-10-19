package com.qa.main;

// Classes and Methods

public class VideoGameConsole {
	
	//First we need attribute
	
	boolean ssd = true;
	int ssdSize = 650;
	String brand = "Sony";
	String color = "White";
	float hdmi = 2.1f; 
	float firmware = 21.02f;
	int yearOfRelease = 2020;
	
	//Methods - CAN DOS - Teaching the program what to do!!!
	
	public void bootTime() {
		if (ssd == true || yearOfRelease > 2019) {
			System.out.println("Fast Boottime");
		} else {
			System.out.println("Well Slow bud");
		}
	}
	
	
	
	



	public VideoGameConsole(int ssdSize, boolean ssd, String brand, String color, float hdmi, float firmware, int yearOfRelease) {
		this.ssd = ssd;
		this.ssdSize = ssdSize;
		this.brand = brand;
		this.color = color;
		this.hdmi = hdmi;
		this.firmware = firmware;
		this.yearOfRelease = yearOfRelease;
	}

	@Override
	public String toString() {
		return "VideoGameConsole [ssd=" + ssd + ", ssdSize=" + ssdSize + ", brand=" + brand + ", color=" + color
				+ ", hdmi=" + hdmi + ", firmware=" + firmware + ", yearOfRelease=" + yearOfRelease + "]";
	}
	
}
 

