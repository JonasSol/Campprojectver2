
public class VIPCustomer extends Client{
	int VIPCardNo;
	
	
	public VIPCustomer(int VIPCardNO, int ID, String name, int creditCardNo, int VIPCardNo) {
		super(ID, name, creditCardNo);
		
		this.VIPCardNo = VIPCardNo;
	}
	
	public void setVIPCardNo(int newVIPCardNo) {
		@SuppressWarnings("unused")
		int VIPCardNo = newVIPCardNo;
	}
}

