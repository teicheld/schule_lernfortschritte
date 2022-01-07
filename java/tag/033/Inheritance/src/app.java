public class app {
	public static void main(String[] argv) {
		MountainBike myBike = new MountainBike();
		myBike.printStates();
		myBike.changeGear(2);
		myBike.speedUp(2);
		myBike.printStates();
	}
}
