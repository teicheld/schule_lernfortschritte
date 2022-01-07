## What Is an Interface?

As you've already learned, objects define their interaction with the outside world through the methods that they expose. Methods form the object's interface with the outside world; the buttons on the front of your television set, for example, are the interface between you and the electrical wiring on the other side of its plastic casing. You press the "power" button to turn the television on and off.

In its most common form, an interface is a group of related methods with empty bodies. A bicycle's behavior, if specified as an interface, might appear as follows:

	interface Bicycle {

	    //  wheel revolutions per minute
	    void changeCadence(int newValue);

	    void changeGear(int newValue);

	    void speedUp(int increment);

	    void applyBrakes(int decrement);
	}

To implement this interface, the name of your class would change (to a particular brand of bicycle, for example, such as ACMEBicycle), and you'd use the implements keyword in the class declaration:

	class ACMEBicycle implements Bicycle {

	    int cadence = 0;
	    int speed = 0;
	    int gear = 1;

	   // The compiler will now require that methods
	   // changeCadence, changeGear, speedUp, and applyBrakes
	   // all be implemented. Compilation will fail if those
	   // methods are missing from this class.

	    void changeCadence(int newValue) {
		 cadence = newValue;
	    }

	    void changeGear(int newValue) {
		 gear = newValue;
	    }

	    void speedUp(int increment) {
		 speed = speed + increment;   
	    }

	    void applyBrakes(int decrement) {
		 speed = speed - decrement;
	    }

	    void printStates() {
		 System.out.println("cadence:" +
		     cadence + " speed:" + 
		     speed + " gear:" + gear);
	    }
	}
