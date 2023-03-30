package tokoHOLO;

public class StockMasukDetail {
			private String stockMasukDetailID;
			private String itemID;
			private String stockMasukID;
			private int itemMasukQty;
			private int itemMasukPrice;
			private int itemMasukTotalPrice;
			
			public StockMasukDetail(String stockMasukDetailID, String itemID, String stockMasukID, int itemMasukQty,
					int itemMasukPrice, int itemMasukTotalPrice) {
				super();
				this.stockMasukDetailID = stockMasukDetailID;
				this.itemID = itemID;
				this.stockMasukID = stockMasukID;
				this.itemMasukQty = itemMasukQty;
				this.itemMasukPrice = itemMasukPrice;
				this.itemMasukTotalPrice = itemMasukTotalPrice;
			}

			public String getStockMasukDetailID() {
				return stockMasukDetailID;
			}

			public void setStockMasukDetailID(String stockMasukDetailID) {
				this.stockMasukDetailID = stockMasukDetailID;
			}

			public String getItemID() {
				return itemID;
			}

			public void setItemID(String itemID) {
				this.itemID = itemID;
			}

			public String getStockMasukID() {
				return stockMasukID;
			}

			public void setStockMasukID(String stockMasukID) {
				this.stockMasukID = stockMasukID;
			}

			public int getItemMasukQty() {
				return itemMasukQty;
			}

			public void setItemMasukQty(int itemMasukQty) {
				this.itemMasukQty = itemMasukQty;
			}

			public int getItemMasukPrice() {
				return itemMasukPrice;
			}

			public void setItemMasukPrice(int itemMasukPrice) {
				this.itemMasukPrice = itemMasukPrice;
			}

			public int getItemMasukTotalPrice() {
				return itemMasukTotalPrice;
			}

			public void setItemMasukTotalPrice(int itemMasukTotalPrice) {
				this.itemMasukTotalPrice = itemMasukTotalPrice;
			}
			
			
}
