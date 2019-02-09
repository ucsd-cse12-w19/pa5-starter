package ucsdcse12pa5student;

// These are some imports that the course staff found useful, feel free to use them
// along with other imports from java.util.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PartitionOracle {

	/**
	 * Feel free to use this method to call partition. It catches any exceptions or
	 * errors and returns a definitely-invalid pivot (-1) to turn errors into
	 * potential failures. For example, in testPartition, you may use
	 * 
	 * runPartition(p, someArray, someLow, someHigh)
	 * 
	 * instead of
	 * 
	 * p.partition(someArray, someLow, someHigh)
	 * 
	 * @param p
	 * @param strs
	 * @param low
	 * @param high
	 * @return
	 */
	public static int runPartition(Partitioner p, String[] strs, int low, int high) {
		try {
			return p.partition(strs, low, high);
		} catch (Throwable t) {
			return -1;
		}
	}

	// The three methods below are for you to fill in according to the PA writeup.
	// Feel free to make other helper methods as needed.

	public static String isValidPartitionResult(String[] before, int low, int high, int pivot, String[] after) {
		return null;
	}

	public static String[] generateInput(int n) {
		return new String[0];
	}

	public static CounterExample findCounterExample(Partitioner p) {
		return null;
	}

}
