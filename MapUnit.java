package player;



public class MapUnit {

	protected String mapCoordinates;
	protected String mapUnitName;
	protected String mapUnitDescription;
	protected int mapX;
	protected int mapY;
	
		
	public MapUnit(String mapCoordinates, String mapUnitName, String mapUnitDescription, int mapX, int mapY) 
	{			
		this.mapCoordinates = mapCoordinates;
		this.mapUnitName = mapUnitName;
		this.mapUnitDescription = mapUnitDescription;
		this.mapX = mapX;
		this.mapY = mapY;
	}
	
	public String getMapCoordinates() {
		return mapCoordinates;
	}

	public String getMapUnitName() {
		return mapUnitName;
	}

	public int getMapX() {
		return mapX;
	}

	public int getMapY() {
		return mapY;
	}
	
	public String getMapUnitDescription(){
		return mapUnitDescription;
	}
	

	public String toString()
	{
		return ("Coordinates: " + this.mapX + "," + this.mapY + "\t MapUnitName: " + this.mapUnitName);
	}
		

}