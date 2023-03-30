package tokoHOLO;

public class TransactionDetail {
		
		private String detailID;
		private String transactionID;
		private String itemID;
		private int qty;
		private int price;
		private int totalPrice;
		private int salesCommision;
		private int modal;
		private int untung;
		
		public TransactionDetail(String detailID, String transactionID, String itemID, int qty, int price,
				int totalPrice, int salesCommision, int modal, int untung) {
			super();
			this.detailID = detailID;
			this.transactionID = transactionID;
			this.itemID = itemID;
			this.qty = qty;
			this.price = price;
			this.totalPrice = totalPrice;
			this.salesCommision = salesCommision;
			this.modal = modal;
			this.untung = untung;
		}

		public String getDetailID() {
			return detailID;
		}

		public void setDetailID(String detailID) {
			this.detailID = detailID;
		}

		public String getTransactionID() {
			return transactionID;
		}

		public void setTransactionID(String transactionID) {
			this.transactionID = transactionID;
		}

		public String getItemID() {
			return itemID;
		}

		public void setItemID(String itemID) {
			this.itemID = itemID;
		}

		public int getQty() {
			return qty;
		}

		public void setQty(int qty) {
			this.qty = qty;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public int getTotalPrice() {
			return totalPrice;
		}

		public void setTotalPrice(int totalPrice) {
			this.totalPrice = totalPrice;
		}

		public int getSalesCommision() {
			return salesCommision;
		}

		public void setSalesCommision(int salesCommision) {
			this.salesCommision = salesCommision;
		}

		public int getModal() {
			return modal;
		}

		public void setModal(int modal) {
			this.modal = modal;
		}

		public int getUntung() {
			return untung;
		}

		public void setUntung(int untung) {
			this.untung = untung;
		}
		
		
		
}
