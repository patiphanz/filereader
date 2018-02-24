
public class TaskTimer {

	public TaskTimer() {
		
	}
	
	public void measureAndPrint(Runnable task) {
		Stopwatch sw = new Stopwatch();
		sw.start();
		task.run();
		sw.stop();
		System.out.printf("%s in %f sec.\n",task.toString(),sw.getElapsed());
	}
}
