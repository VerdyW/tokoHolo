package tokoHOLO;

public class StockMasuk {
	
	private String stockMasukID;
	private String stockMasukNamaToko;
	private String stockMasukDate;
	private int stockMasukTotalPrice;
	
	public StockMasuk(String stockMasukID, String stockMasukNamaToko, String stockMasukDate, int stockMasukTotalPrice) {
		super();
		this.stockMasukID = stockMasukID;
		this.stockMasukNamaToko = stockMasukNamaToko;
		this.stockMasukDate = stockMasukDate;
		this.stockMasukTotalPrice = stockMasukTotalPrice;
	}

	public String getStockMasukID() {
		return stockMasukID;
	}

	public void setStockMasukID(String stockMasukID) {
		this.stockMasukID = stockMasukID;
	}

	public String getStockMasukNamaToko() {
		return stockMasukNamaToko;
	}

	public void setStockMasukNamaToko(String stockMasukNamaToko) {
		this.stockMasukNamaToko = stockMasukNamaToko;
	}

	public String getStockMasukDate() {
		return stockMasukDate;
	}

	public void setStockMasukDate(String stockMasukDate) {
		this.stockMasukDate = stockMasukDate;
	}

	public int getStockMasukTotalPrice() {
		return stockMasukTotalPrice;
	}

	public void setStockMasukTotalPrice(int stockMasukTotalPrice) {
		this.stockMasukTotalPrice = stockMasukTotalPrice;
	}
	
	
	
}
