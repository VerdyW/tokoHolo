package tokoHOLO;

public class ClientStore {

	private String clientStoreID;
	private String clientName;
	private String clientStoreAddress;
	
	public ClientStore(String clientStoreID, String clientName, String clientStoreAddress) {
		super();
		this.clientStoreID = clientStoreID;
		this.clientName = clientName;
		this.clientStoreAddress = clientStoreAddress;
	}

	public String getClientStoreID() {
		return clientStoreID;
	}

	public void setClientStoreID(String clientStoreID) {
		this.clientStoreID = clientStoreID;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientStoreAddress() {
		return clientStoreAddress;
	}

	public void setClientStoreAddress(String clientStoreAddress) {
		this.clientStoreAddress = clientStoreAddress;
	}
	
	
}
