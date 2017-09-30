package player;

import java.util.ArrayList;

public class Map {
	
	static int maxMapSize = 10;
	public static ArrayList<MapUnit> worldMap;
	
	public Map()
	{
		worldMap = new ArrayList<MapUnit>();
	}
	
	public void populateMap()
	{
		for (int i = 0; i < maxMapSize; i++)
		{
			for (int j = 0; j < maxMapSize; j++)
			{				
				int mapX = i;
				int mapY = j;
				String mapCoordinates = (mapX + "," + mapY);
				String mapUnitName = mapCoordinates;
				String mapUnitDescription = null;
				if (mapCoordinates .contentEquals("0,0"))
					mapUnitDescription = "Southwest Corner of Map";
				else if (mapCoordinates .contentEquals("0,1"))
					mapUnitDescription = "First Column, 2nd Row from Bottom";
				else if (mapCoordinates .contentEquals("0,2"))
					mapUnitDescription = "First Column, 3rd Row from Bottom";
				else if (mapCoordinates .contentEquals("0,3"))
					mapUnitDescription = "First Column, 4th Row from Bottom";
				else if (mapCoordinates .contentEquals("0,4"))
					mapUnitDescription = "First Column, 5th Row from Bottom";
				else if (mapCoordinates .contentEquals("0,5"))
					mapUnitDescription = "First Column, 5th Row from Top";
				else if (mapCoordinates .contentEquals("0,6"))
					mapUnitDescription = "First Column, 4th Row from Top";
				else if (mapCoordinates .contentEquals("0,7"))
					mapUnitDescription = "First Column, 3rd Row from Top";
				else if (mapCoordinates .contentEquals("0,8"))
					mapUnitDescription = "First Column, 2nd Row from Top";
				else if (mapCoordinates .contentEquals("0,9"))
					mapUnitDescription = "Northwest Corner of Map";
				else if (mapCoordinates .contentEquals("1,0"))
					mapUnitDescription = "Second Column, Bottom Row";
				else if (mapCoordinates .contentEquals("1,1"))
					mapUnitDescription = "Second Column, 2nd Row from Bottom";
				else if (mapCoordinates .contentEquals("1,2"))
					mapUnitDescription = "Second Column, 3rd Row from Bottom";
				else if (mapCoordinates .contentEquals("1,3"))
					mapUnitDescription = "Second Column, 4th Row from Bottom";
				else if (mapCoordinates .contentEquals("1,4"))
					mapUnitDescription = "Second Column, 5th Row from Bottom";
				else if (mapCoordinates .contentEquals("1,5"))
					mapUnitDescription = "Second Column, 5th Row from Top";
				else if (mapCoordinates .contentEquals("1,6"))
					mapUnitDescription = "Second Column, 4th Row from Top";
				else if (mapCoordinates .contentEquals("1,7"))
					mapUnitDescription = "Second Column, 3rd Row from Top";
				else if (mapCoordinates .contentEquals("1,8"))
					mapUnitDescription = "Second Column, 2nd Row from Top";
				else if (mapCoordinates .contentEquals("1,9"))
					mapUnitDescription = "Second Column, Top Row";
				else if (mapCoordinates .contentEquals("2,0"))
					mapUnitDescription = "Third Column, Bottom Row";
				else if (mapCoordinates .contentEquals("2,1"))
					mapUnitDescription = "Third Column, 2nd Row from Bottom";
				else if (mapCoordinates .contentEquals("2,2"))
					mapUnitDescription = "Third Column, 3rd Row from Bottom";
				else if (mapCoordinates .contentEquals("2,3"))
					mapUnitDescription = "Third Column, 4th Row from Bottom";
				else if (mapCoordinates .contentEquals("2,4"))
					mapUnitDescription = "Third Column, 5th Row from Bottom";
				else if (mapCoordinates .contentEquals("2,5"))
					mapUnitDescription = "Third Column, 5th Row from Top";
				else if (mapCoordinates .contentEquals("2,6"))
					mapUnitDescription = "Third Column, 4th Row from Top";
				else if (mapCoordinates .contentEquals("2,7"))
					mapUnitDescription = "Third Column, 3rd Row from Top";
				else if (mapCoordinates .contentEquals("2,8"))
					mapUnitDescription = "Third Column, 2nd Row from Top";
				else if (mapCoordinates .contentEquals("2,9"))
					mapUnitDescription = "Third Column, Top Row";
				else if (mapCoordinates .contentEquals("3,0"))
					mapUnitDescription = "Fourth Column, Bottom Row";
				else if (mapCoordinates .contentEquals("3,1"))
					mapUnitDescription = "Fourth Column, 2nd Row from Bottom";
				else if (mapCoordinates .contentEquals("3,2"))
					mapUnitDescription = "Fourth Column, 3rd Row from Bottom";
				else if (mapCoordinates .contentEquals("3,3"))
					mapUnitDescription = "Fourth Column, 4th Row from Bottom";
				else if (mapCoordinates .contentEquals("3,4"))
					mapUnitDescription = "Fourth Column, 5th Row from Bottom";
				else if (mapCoordinates .contentEquals("3,5"))
					mapUnitDescription = "Fourth Column, 5th Row from Top";
				else if (mapCoordinates .contentEquals("3,6"))
					mapUnitDescription = "Fourth Column, 4th Row from Top";
				else if (mapCoordinates .contentEquals("3,7"))
					mapUnitDescription = "Fourth Column, 3rd Row from Top";
				else if (mapCoordinates .contentEquals("3,8"))
					mapUnitDescription = "Fourth Column, 2nd Row from Top";
				else if (mapCoordinates .contentEquals("3,9"))
					mapUnitDescription = "Fourth Column, Top Row";
				else if (mapCoordinates .contentEquals("4,0"))
					mapUnitDescription = "Fifth Column, Bottom Row";
				else if (mapCoordinates .contentEquals("4,1"))
					mapUnitDescription = "Fifth Column, 2nd Row from Bottom";
				else if (mapCoordinates .contentEquals("4,2"))
					mapUnitDescription = "Fifth Column, 3rd Row from Bottom";
				else if (mapCoordinates .contentEquals("4,3"))
					mapUnitDescription = "Fifth Column, 4th Row from Bottom";
				else if (mapCoordinates .contentEquals("4,4"))
					mapUnitDescription = "Fifth Column, 5th Row from Bottom";
				else if (mapCoordinates .contentEquals("4,5"))
					mapUnitDescription = "Fifth Column, 5th Row from Top";
				else if (mapCoordinates .contentEquals("4,6"))
					mapUnitDescription = "Fifth Column, 4th Row from Top";
				else if (mapCoordinates .contentEquals("4,7"))
					mapUnitDescription = "Fifth Column, 3rd Row from Top";
				else if (mapCoordinates .contentEquals("4,8"))
					mapUnitDescription = "Fifth Column, 2nd Row from Top";
				else if (mapCoordinates .contentEquals("4,9"))
					mapUnitDescription = "Fifth Column, Top Row";
				else if (mapCoordinates .contentEquals("5,0"))
					mapUnitDescription = "Sixth Column, Bottom Row";
				else if (mapCoordinates .contentEquals("5,1"))
					mapUnitDescription = "Sixth Column, 2nd Row from Bottom";
				else if (mapCoordinates .contentEquals("5,2"))
					mapUnitDescription = "Sixth Column, 3rd Row from Bottom";
				else if (mapCoordinates .contentEquals("5,3"))
					mapUnitDescription = "Sixth Column, 4th Row from Bottom";
				else if (mapCoordinates .contentEquals("5,4"))
					mapUnitDescription = "Sixth Column, 5th Row from Bottom";
				else if (mapCoordinates .contentEquals("5,5"))
					mapUnitDescription = "Sixth Column, 5th Row from Top";
				else if (mapCoordinates .contentEquals("5,6"))
					mapUnitDescription = "Sixth Column, 4th Row from Top";
				else if (mapCoordinates .contentEquals("5,7"))
					mapUnitDescription = "Sixth Column, 3rd Row from Top";
				else if (mapCoordinates .contentEquals("5,8"))
					mapUnitDescription = "Sixth Column, 2nd Row from Top";
				else if (mapCoordinates .contentEquals("5,9"))
					mapUnitDescription = "Sixth Column, Top Row";
				else if (mapCoordinates .contentEquals("6,0"))
					mapUnitDescription = "Seventh Column, Bottom Row";
				else if (mapCoordinates .contentEquals("6,1"))
					mapUnitDescription = "Seventh Column, 2nd Row from Bottom";
				else if (mapCoordinates .contentEquals("6,2"))
					mapUnitDescription = "Seventh Column, 3rd Row from Bottom";
				else if (mapCoordinates .contentEquals("6,3"))
					mapUnitDescription = "Seventh Column, 4th Row from Bottom";
				else if (mapCoordinates .contentEquals("6,4"))
					mapUnitDescription = "Seventh Column, 5th Row from Bottom";
				else if (mapCoordinates .contentEquals("6,5"))
					mapUnitDescription = "Seventh Column, 5th Row from Top";
				else if (mapCoordinates .contentEquals("6,6"))
					mapUnitDescription = "Seventh Column, 4th Row from Top";
				else if (mapCoordinates .contentEquals("6,7"))
					mapUnitDescription = "Seventh Column, 3rd Row from Top";
				else if (mapCoordinates .contentEquals("6,8"))
					mapUnitDescription = "Seventh Column, 2nd Row from Top";
				else if (mapCoordinates .contentEquals("6,9"))
					mapUnitDescription = "Seventh Column, Top Row";
				else if (mapCoordinates .contentEquals("7,0"))
					mapUnitDescription = "Eighth Column, Bottom Row";
				else if (mapCoordinates .contentEquals("7,1"))
					mapUnitDescription = "Eighth Column, 2nd Row from Bottom";
				else if (mapCoordinates .contentEquals("7,2"))
					mapUnitDescription = "Eighth Column, 3rd Row from Bottom";
				else if (mapCoordinates .contentEquals("7,3"))
					mapUnitDescription = "Eighth Column, 4th Row from Bottom";
				else if (mapCoordinates .contentEquals("7,4"))
					mapUnitDescription = "Eighth Column, 5th Row from Bottom";
				else if (mapCoordinates .contentEquals("7,5"))
					mapUnitDescription = "Eighth Column, 5th Row from Top";
				else if (mapCoordinates .contentEquals("7,6"))
					mapUnitDescription = "Eighth Column, 4th Row from Top";
				else if (mapCoordinates .contentEquals("7,7"))
					mapUnitDescription = "Eighth Column, 3rd Row from Top";
				else if (mapCoordinates .contentEquals("7,8"))
					mapUnitDescription = "Eighth Column, 2nd Row from Top";
				else if (mapCoordinates .contentEquals("7,9"))
					mapUnitDescription = "Eighth Column, Top Row";
				else if (mapCoordinates .contentEquals("8,0"))
					mapUnitDescription = "Ninth Column, Bottom Row";
				else if (mapCoordinates .contentEquals("8,1"))
					mapUnitDescription = "Ninth Column, 2nd Row from Bottom";
				else if (mapCoordinates .contentEquals("8,2"))
					mapUnitDescription = "Ninth Column, 3rd Row from Bottom";
				else if (mapCoordinates .contentEquals("8,3"))
					mapUnitDescription = "Ninth Column, 4th Row from Bottom";
				else if (mapCoordinates .contentEquals("8,4"))
					mapUnitDescription = "Ninth Column, 5th Row from Bottom";
				else if (mapCoordinates .contentEquals("8,5"))
					mapUnitDescription = "Ninth Column, 5th Row from Top";
				else if (mapCoordinates .contentEquals("8,6"))
					mapUnitDescription = "Ninth Column, 4th Row from Top";
				else if (mapCoordinates .contentEquals("8,7"))
					mapUnitDescription = "Ninth Column, 3rd Row from Top";
				else if (mapCoordinates .contentEquals("8,8"))
					mapUnitDescription = "Ninth Column, 2nd Row from Top";
				else if (mapCoordinates .contentEquals("8,9"))
					mapUnitDescription = "Ninth Column, Top Row";
				else if (mapCoordinates .contentEquals("9,0"))
					mapUnitDescription = "Southeast Corner of Map";
				else if (mapCoordinates .contentEquals("9,1"))
					mapUnitDescription = "Tenth Column, 2nd Row from Bottom";
				else if (mapCoordinates .contentEquals("9,2"))
					mapUnitDescription = "Tenth Column, 3rd Row from Bottom";
				else if (mapCoordinates .contentEquals("9,3"))
					mapUnitDescription = "Tenth Column, 4th Row from Bottom";
				else if (mapCoordinates .contentEquals("9,4"))
					mapUnitDescription = "Tenth Column, 5th Row from Bottom";
				else if (mapCoordinates .contentEquals("9,5"))
					mapUnitDescription = "Tenth Column, 5th Row from Top";
				else if (mapCoordinates .contentEquals("9,6"))
					mapUnitDescription = "Tenth Column, 4th Row from Top";
				else if (mapCoordinates .contentEquals("9,7"))
					mapUnitDescription = "Tenth Column, 3rd Row from Top";
				else if (mapCoordinates .contentEquals("9,8"))
					mapUnitDescription = "Tenth Column, 2nd Row from Top";
				else if (mapCoordinates .contentEquals("9,9"))
					mapUnitDescription = "Northeast Corner of Map";
				else
					mapUnitDescription = "Error";
				
				MapUnit mapUnit = new MapUnit(mapCoordinates, mapUnitName, mapUnitDescription, mapX, mapY);
				
				worldMap.add(mapUnit);
			}
		}
	}

	
/*	public static String getPlayerLocationInfo(Player player)
	{
		String playerCurrentLocation = player.getX() + "," + player.getY();
		if (playerCurrentLocation .equals ("5,5"))
			return "This is where you began your journey.";
		else if (playerCurrentLocation .equals ("5,6"))
			return "You are one unit North of the beginning.";
		else if (playerCurrentLocation .equals ("6,5"))
			return "You are one unit East of the beginning.";
		else if (playerCurrentLocation .equals ("5,4"))
			return "You are one unit to the South of the beginning.";
		else if (playerCurrentLocation .equals ("4,5"))
			return "You are one unit to the West of the beginning.";
		else
			return "Error";
*/	//}


	public static int getMaxMapSize(){
		return maxMapSize;
	}
	
	public static void getPlayerLocationDescription()
	{
		String playerCurrentLocation = Player.getPlayerCurrentLocation();
		for (int i = 0; i < worldMap.size(); i++)
		{ 
			String mapCoordinatesToMatch = worldMap.get(i).getMapCoordinates();
			//System.out.println(mapCoordinatesToMatch);
			if(mapCoordinatesToMatch .contentEquals(playerCurrentLocation))
			{
				System.out.println("\n\n" + worldMap.get(i).getMapUnitDescription());
				return;
			}
		}
			System.out.println("Error printing location description.");
					return;
	}
	
	public static void main(String args[])
	{
		Map newMap = new Map();
		newMap.populateMap();
/*		for (int i = 0; i < worldMap.size(); i++)
		{
			System.out.println(worldMap.get(i));
		}
*/		
		Warrior x = new Warrior ("Xena");
		System.out.println(x);
		x.movePlayer(1);
		Map.getPlayerLocationDescription();
	}
}