package tokoHOLO;

public class TransactionHeader {
	private String transactionID;
	private String transactionDate;
	private int totalTransactionPrice;
	private int totalSalesCommision;
	private int totalUntung;
	private String clerkName;
	private String userRole;
	private String clientStoreName;
	private String clientStoreAddress;
	private String salesName;
	private int salesCommisionPerBtg;
	
	public TransactionHeader(String transactionID, String transactionDate, int totalTransactionPrice,
			int totalSalesCommision, int totalUntung, String clerkName, String userRole, String clientStoreName,
			String clientStoreAddress, String salesName, int salesCommisionPerBtg) {
		super();
		this.transactionID = transactionID;
		this.transactionDate = transactionDate;
		this.totalTransactionPrice = totalTransactionPrice;
		this.totalSalesCommision = totalSalesCommision;
		this.totalUntung = totalUntung;
		this.clerkName = clerkName;
		this.userRole = userRole;
		this.clientStoreName = clientStoreName;
		this.clientStoreAddress = clientStoreAddress;
		this.salesName = salesName;
		this.salesCommisionPerBtg = salesCommisionPerBtg;
	}

	public String getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public int getTotalTransactionPrice() {
		return totalTransactionPrice;
	}

	public void setTotalTransactionPrice(int totalTransactionPrice) {
		this.totalTransactionPrice = totalTransactionPrice;
	}

	public int getTotalSalesCommision() {
		return totalSalesCommision;
	}

	public void setTotalSalesCommision(int totalSalesCommision) {
		this.totalSalesCommision = totalSalesCommision;
	}

	public int getTotalUntung() {
		return totalUntung;
	}

	public void setTotalUntung(int totalUntung) {
		this.totalUntung = totalUntung;
	}

	public String getClerkName() {
		return clerkName;
	}

	public void setClerkName(String clerkName) {
		this.clerkName = clerkName;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public String getClientStoreName() {
		return clientStoreName;
	}

	public void setClientStoreName(String clientStoreName) {
		this.clientStoreName = clientStoreName;
	}

	public String getClientStoreAddress() {
		return clientStoreAddress;
	}

	public void setClientStoreAddress(String clientStoreAddress) {
		this.clientStoreAddress = clientStoreAddress;
	}

	public String getSalesName() {
		return salesName;
	}

	public void setSalesName(String salesName) {
		this.salesName = salesName;
	}

	public int getSalesCommisionPerBtg() {
		return salesCommisionPerBtg;
	}

	public void setSalesCommisionPerBtg(int salesCommisionPerBtg) {
		this.salesCommisionPerBtg = salesCommisionPerBtg;
	}
	
	
}
