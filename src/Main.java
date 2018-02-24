
public class Main {

	public static void main(String[] args) {
		TaskTimer timer = new TaskTimer();
		String alice = "Alice-in-Wonderland.txt";
		Runnable task = new AppendStringTask(alice);
		Runnable task1 = new AppendStringBuilder(alice);
		Runnable task2 = new AppendLineString(alice);
		System.out.printf("Reading %s using FileReader, append to String.\n",alice);
		timer.measureAndPrint(task);
		System.out.printf("Reading %s using FileReader, append to StringBuilder.\n",alice);
		timer.measureAndPrint(task1);
		System.out.printf("Reading %s using BufferedReader, append lines to String.\n",alice);
		timer.measureAndPrint(task2);
	}
}
