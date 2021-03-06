package co.in.parking;

public class parked_Owner_Details {

	private String ownerName;
	private String carModel;
	private String carNo;
	private String ownerMobileNo;
	private String ownerAddress;

	@Override
	public String toString() {
		return "Parked_Owner_Details [ownerName=" + ownerName + ", carModel=" + carModel + ", carNo=" + carNo
				+ ", ownerMobileNo=" + ownerMobileNo + ", ownerAddress=" + ownerAddress + "]";
	}

	public parked_Owner_Details(String ownerName, String carModel, String carNo, String ownerMobileNo,
			String ownerAddress) {
		super();

		this.ownerName = ownerName;
		this.carModel = carModel;
		this.carNo = carNo;
		this.ownerMobileNo = ownerMobileNo;
		this.ownerAddress = ownerAddress;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getCarModel() {
		return carModel;
	}

	public String getCarNo() {
		return carNo;
	}

	public String getOwnerMobileNo() {
		return ownerMobileNo;
	}

	public String getOwnerAddress() {
		return ownerAddress;
	}

}
