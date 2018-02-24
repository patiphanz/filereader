
public class Main {

	public static void main(String[] args) {
		TaskTimer timer = new TaskTimer();
		String alice = "Alice-in-Wonderland.txt";
		Runnable task = new AppendStringTask(alice);
		Runnable task1 = new AppendStringBuilder(alice);
		Runnable task2 = new AppendLineString(alice);
		System.out.println("Reading Alice-in-Wonderland.txt using FileReader, append to String.");
		timer.measureAndPrint(task);
		System.out.println("Reading Alice-in-Wonderland.txt using FileReader, append to StringBuilder.");
		timer.measureAndPrint(task1);
		System.out.println("Reading Alice-in-Wonderland.txt using BufferedReader, append lines to String.");
		timer.measureAndPrint(task2);
	}
}
