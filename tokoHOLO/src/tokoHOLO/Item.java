package tokoHOLO;

public class Item {
		private String itemID;
		private String itemName;
		
		public Item(String itemID, String itemName) {
			super();
			this.itemID = itemID;
			this.itemName = itemName;
		}

		public String getItemID() {
			return itemID;
		}

		public void setItemID(String itemID) {
			this.itemID = itemID;
		}

		public String getItemName() {
			return itemName;
		}

		public void setItemName(String itemName) {
			this.itemName = itemName;
		}
		
		
}
