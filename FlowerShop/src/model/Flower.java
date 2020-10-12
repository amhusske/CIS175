package model;

import java.util.List;

public class Flower {
  private int id;
  private String flowerName;
  private String seasonality;
  private String sunNeeds;
  private String soilNeeds;
  private List<FlowerColor> colorList;
  
  
  
public Flower() {
	super();
	// TODO Auto-generated constructor stub
}



public Flower(int id, String flowerName, String seasonality, String sunNeeds, String soilNeeds, List<FlowerColor> colorList) {
	super();
	this.id = id;
	this.flowerName = flowerName;
	this.seasonality = seasonality;
	this.sunNeeds = sunNeeds;
	this.soilNeeds = soilNeeds;
	this.colorList = colorList;
}



public Flower(String flowerName, String seasonality, String sunNeeds, String soilNeeds, List<FlowerColor> colorList) {
	super();
	this.flowerName = flowerName;
	this.seasonality = seasonality;
	this.sunNeeds = sunNeeds;
	this.soilNeeds = soilNeeds;
	this.colorList = colorList;
}



public int getId() {
	return id;
}



public void setId(int id) {
	this.id = id;
}



public String getFlowerName() {
	return flowerName;
}



public void setFlowerName(String flowerName) {
	this.flowerName = flowerName;
}



public String getSeasonality() {
	return seasonality;
}



public void setSeasonality(String seasonality) {
	this.seasonality = seasonality;
}



public String getSunNeeds() {
	return sunNeeds;
}



public void setSunNeeds(String sunNeeds) {
	this.sunNeeds = sunNeeds;
}



public String getSoilNeeds() {
	return soilNeeds;
}



public void setSoilNeeds(String soilNeeds) {
	this.soilNeeds = soilNeeds;
}



public List<FlowerColor> getColorList() {
	return colorList;
}



public void setColorList(List<FlowerColor> colorList) {
	this.colorList = colorList;
}



}
