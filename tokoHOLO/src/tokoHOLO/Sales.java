package tokoHOLO;

public class Sales {
	
	private String salesID;
	private String salesName;
	private String salesCommisionPerBtg;
	
	
	public Sales(String salesID, String salesName, String salesCommisionPerBtg) {
		super();
		this.salesID = salesID;
		this.salesName = salesName;
		this.salesCommisionPerBtg = salesCommisionPerBtg;
	}


	public String getSalesID() {
		return salesID;
	}


	public void setSalesID(String salesID) {
		this.salesID = salesID;
	}


	public String getSalesName() {
		return salesName;
	}


	public void setSalesName(String salesName) {
		this.salesName = salesName;
	}


	public String getSalesCommisionPerBtg() {
		return salesCommisionPerBtg;
	}


	public void setSalesCommisionPerBtg(String salesCommisionPerBtg) {
		this.salesCommisionPerBtg = salesCommisionPerBtg;
	}
	
}
