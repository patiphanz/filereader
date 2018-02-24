
public class Stopwatch {
	private static final double NANOSECOND = 1.0E-9;
	private long startTime = 0;
	private long stopTime = 0;
	private boolean running = false;
	
	/**
	 * Reset the stopwatch and start it if stopwatch
	 * is not running. If the stopwatch is already running
	 * then start does nothing.
	 */
	public void start() {
		if(isRunning()) return;
		this.running = true;
		this.startTime = System.nanoTime();
	}
	
	/**
	 * Stop the stopwatch. If the stopwatch is already
	 * stopped, then stop does nothing.
	 */
	public void stop() {
		if(!isRunning()) return;
		this.stopTime = System.nanoTime();
		this.running = false;
	}
	
	/**
	 * Return true if the stopwatch is running, false if 
	 * stopwatch is stopped.
	 * @return true if the stopwatch is running, false if 
	 * stopwatch is stopped.
	 */
	public boolean isRunning() {
		return running;
	}
	
	/**
	 * Return the elapsed time in seconds,
	 * @return
	 */
	public double getElapsed() {
		if(isRunning()) return (System.nanoTime() - startTime)*NANOSECOND;
		else return (stopTime - startTime)*NANOSECOND;
	}
	
	public static void main(String[] args) {
		Stopwatch s = new Stopwatch();
		s.start();
		for(int i = 0 ; i < 100 ; i++) {
			System.out.println(i);
		}
		s.stop();
		System.out.println(s.getElapsed());
	}
}
