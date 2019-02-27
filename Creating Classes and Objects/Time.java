package school;
	/**
	 * Represents a time of day.
	 */
	public class Time {

	    private int hour;
	    private int minute;
	    private double second;

	    /**
	     * Construct a Time object with default values.
	     */
	    public Time() {
	        this.hour = 0;
	        this.minute = 0;
	        this.second = 0.0;
	    }

	    /**
	     * Construct a Time object with given values.
	     */
	    public Time(int hour, int minute, double second) {
	        this.hour = hour;
	        this.minute = minute;
	        this.second = second;
	    }

	    /**
	     * Prints the time in a simple format.
	     */
	    public static void printTime(Time t) {
	        System.out.print(t.hour);
	        System.out.print(":");
	        System.out.println(t.minute);
	        System.out.print(":");
	        System.out.println(t.second);
	    }

	    /**
	     * Returns a String representation of the time.
	     */
	    public String toString() {
	        return String.format("%02d:%02d:%04.1f\n",
	                             this.hour, this.minute, this.second);
	    }

	    /**
	     * Tests whether two times are equivalent.
	     */
	    public boolean equals(Time that) {
	        return this.hour == that.hour
	            && this.minute == that.minute
	            && this.second == that.second;
	    }

	    /**
	     * Adds two Times and returns a new Time object (static method).
	     */
	    public static Time add(Time t1, Time t2) {
	        Time sum = new Time();
	        sum.hour = t1.hour + t2.hour;
	        sum.minute = t1.minute + t2.minute;
	        sum.second = t1.second + t2.second;
	        return sum;
	    }

	    /**
	     * Adds two Times and returns a new Time object (instance method).
	     */
	    public Time add(Time t2) {
	        Time sum = new Time();
	        sum.hour = this.hour + t2.hour;
	        sum.minute = this.minute + t2.minute;
	        sum.second = this.second + t2.second;


	        return sum;
	    }

	    /**
	     * Adds the given number of seconds to this object (modifier).
	     */
	    public void increment(double seconds) {
	        this.second += seconds;
	        while (this.second >= 60.0) {
	            this.second -= 60.0;
	            this.minute += 1;
	            System.out.println("second to minute " + this); //this print show how in inefficient this is for large numbers. Can you make it faster use % (mod)?
	        }
	        while (this.minute >= 60) {
	            this.minute -= 60;
	            this.hour += 1;
	            System.out.println("minute to hour " + this);
	        }
	    }


	public static void main(String[] args) {
		Time t = new Time(0,0,0.0);
		
		t.increment(3601); //outputs each iteration of the loops
		
		
		Time t1 = new Time(1,30,0.0);
		Time t2 = new Time(2,30,0.0);
		
		//Test Compare
		System.out.println("Compare");
        System.out.println(t1.equals(t2));
		
		
		//Test Static add
		Time tSum = Time.add(t1,t2); 

		System.out.println("Static add");
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(tSum);
		
      
        t1 = t2 = tSum = null;
		t1 = new Time(1,30,0.0);
		t2 = new Time(2,30,0.0);
		
		//Test instance add
		tSum = t1.add(t2);
		
		System.out.println("Instance add");
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(tSum);
		
	}
	
}
