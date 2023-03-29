package tokoHOLO;

public class StockDetail {

	private String itemStockID;
	private String itemName;
	private int itemStockPrice;
	private int itemStockQty;
	
	public StockDetail(String itemStockID, String itemName, int itemStockPrice, int itemStockQty) {
		super();
		this.itemStockID = itemStockID;
		this.itemName = itemName;
		this.itemStockPrice = itemStockPrice;
		this.itemStockQty = itemStockQty;
	}
	
	public String getItemStockID() {
		return itemStockID;
	}
	public void setItemStockID(String itemStockID) {
		this.itemStockID = itemStockID;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemStockPrice() {
		return itemStockPrice;
	}
	public void setItemStockPrice(int itemStockPrice) {
		this.itemStockPrice = itemStockPrice;
	}
	public int getItemStockQty() {
		return itemStockQty;
	}
	public void setItemStockQty(int itemStockQty) {
		this.itemStockQty = itemStockQty;
	}
	
	
}
