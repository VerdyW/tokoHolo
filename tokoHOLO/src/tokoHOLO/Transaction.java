package tokoHOLO;

public class Transaction {
		private String transactionID;
		private String clerkID;
		private String saleID;
		private String clientStoreID;
		private String transactionDate;
		private int totalTransactionPrice;
		private int totalSalesCommision;
		private int totalUntung;
		
		public Transaction(String transactionID, String clerkID, String saleID, String clientStoreID,
				String transactionDate, int totalTransactionPrice, int totalSalesCommision, int totalUntung) {
			super();
			this.transactionID = transactionID;
			this.clerkID = clerkID;
			this.saleID = saleID;
			this.clientStoreID = clientStoreID;
			this.transactionDate = transactionDate;
			this.totalTransactionPrice = totalTransactionPrice;
			this.totalSalesCommision = totalSalesCommision;
			this.totalUntung = totalUntung;
		}

		public String getTransactionID() {
			return transactionID;
		}

		public void setTransactionID(String transactionID) {
			this.transactionID = transactionID;
		}

		public String getClerkID() {
			return clerkID;
		}

		public void setClerkID(String clerkID) {
			this.clerkID = clerkID;
		}

		public String getSaleID() {
			return saleID;
		}

		public void setSaleID(String saleID) {
			this.saleID = saleID;
		}

		public String getClientStoreID() {
			return clientStoreID;
		}

		public void setClientStoreID(String clientStoreID) {
			this.clientStoreID = clientStoreID;
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
		
		
		
}
