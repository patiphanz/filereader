
/**
 * This class performs any Runnable task and prints results.
 * 
 * @author Patiphan Srisook
 *
 */
public class TaskTimer {
	
	/**
	 * Measure time for the task and then print the result.
	 * @param task
	 */
	public void measureAndPrint(Runnable task) {
		Stopwatch sw = new Stopwatch();
		sw.start();
		task.run();
		sw.stop();
		System.out.printf("%s in %f sec.\n",task.toString(),sw.getElapsed());
	}
}
