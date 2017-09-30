package player;

public class Item {

	protected String itemID;
	protected String itemType;
	protected String itemName; 
	
	public Item(String itemID, String itemType, String itemName)
	{
		this.itemID = itemID;
		this.itemType = itemType;
		this.itemName = itemName;
	}
	
	/**
	 * Getters located below.
	 */
	
	public String getItemID()
	{
		return this.itemID;
	}
	
	public String getItemType()
	{
		return this.itemType;
	}
	
	public String getItemName()
	{
		return this.itemName;
	}



}
