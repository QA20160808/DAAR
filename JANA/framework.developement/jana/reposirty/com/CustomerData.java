package jana.reposirty.com;

public interface CustomerData {

	public static String tabnotdisplayed(String tab) {

		String message = "Failed :" + " " + tab + " " + "is not found on customer360 page ";
		return message;

	}
	
	public static String Logsteps(int step, String tab) {

		String message = "Step"+" "+step+" "+"Validate that"+" "+tab+" "+"is displayed on customer 360page";
		return message;

	}

}
