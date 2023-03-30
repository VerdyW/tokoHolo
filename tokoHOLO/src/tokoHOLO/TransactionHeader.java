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

	public String getTransactionDate() {
		return transactionDate;
	}

	public int getTotalTransactionPrice() {
		return totalTransactionPrice;
	}

	public int getTotalSalesCommision() {
		return totalSalesCommision;
	}

	public int getTotalUntung() {
		return totalUntung;
	}

	public String getClerkName() {
		return clerkName;
	}

	public String getUserRole() {
		return userRole;
	}

	public String getClientStoreName() {
		return clientStoreName;
	}

	public String getClientStoreAddress() {
		return clientStoreAddress;
	}

	public String getSalesName() {
		return salesName;
	}

	public int getSalesCommisionPerBtg() {
		return salesCommisionPerBtg;
	}

	
	
}
