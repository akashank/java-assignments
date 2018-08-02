package co.in.parking;

public class parkedTest {

	public static void main(String[] args) {
		parked_Owner_List pl = new parked_Owner_List();
		// adding new object in the list
		pl.add_new_car(new parked_Owner_Details("ankit", "dezire", "MH02AL2053", "54156135", "SEAWOODS"));
		pl.add_new_car(new parked_Owner_Details("lokesh", "Audi", "MH02AM4154", "82566465529", "ANDHERI,MUMBAI"));
		pl.add_new_car(new parked_Owner_Details("RAMU", "Dezire", "DL03K6518", "86234654635", "AIROLI,MUMBAI"));
		pl.add_new_car(new parked_Owner_Details("Amit", "Bolero", "WB02AL6516", "8697421339", "TURBHE,MUMBAI"));
		pl.add_new_car(new parked_Owner_Details("RAHUL", "Bullet", "MHAL0236513", "3274555339", "GHANSOLI,MUMBAI"));
		pl.add_new_car(new parked_Owner_Details("RAM", "Swift", "MH02AL66450", "8697445339", "RAIGAD,THANE"));
		pl.add_new_car(new parked_Owner_Details("GAURAV", "Zantro", "MH02555453", "2547036339", "RUPASPUR,MUMBAI"));
		pl.add_new_car(new parked_Owner_Details("SaMPREETU", "WagonR", "UP02AL6993", "2527036339", "KHAJPURA,AZIMABAD"));
		// showing all
		// pl.showAll();
		// removing the car at slot 3
		pl.removeCar(3);
		// showing all
	    //pl.showAll();
		// checking a valid slot and an empty slot
		pl.get_parked_location(5);
		pl.get_parked_location(3);
		// adding to an empty slot and checking whether it was entered in an
		// intermediately emptied slot
		pl.add_new_car(new parked_Owner_Details("BunOS MARS", "Bolero", "UP02OP6517", "8697852339", "BALLIA,DEORIA"));
		pl.get_parked_location(3);
		// pl.showAll();
	}
}
