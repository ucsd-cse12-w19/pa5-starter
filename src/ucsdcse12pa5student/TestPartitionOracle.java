package ucsdcse12pa5student;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * There are two ways to write partition methods to use for testing. One is to
 * make individual classes with a partition() method that implement Partitioner
 *
 */
class PartitionFromClass implements Partitioner {
	public void swap(String[] array, int i1, int i2) {
		String temp = array[i1];
		array[i1] = array[i2];
		array[i2] = temp;
	}
	public int partition(String[] array, int low, int high) {
		int pivotIndex = high - 1;
		String pivot = array[pivotIndex];
		int smallerBefore = low;
		int largerAfter = high - 2;
		while (smallerBefore < largerAfter) {
			if (array[smallerBefore].compareTo(pivot) < 0) {
				smallerBefore += 1;
			} else {
				swap(array, smallerBefore, largerAfter);
				largerAfter -= 1;
			}
		}
		if (array[smallerBefore].compareTo(pivot) < 0) {
			swap(array, smallerBefore + 1, pivotIndex);
			return smallerBefore + 1;
		} else {
			swap(array, smallerBefore, pivotIndex);
			return smallerBefore;
		}
	}

}

class CopyFirstElementPartition implements Partitioner {
	public int partition(String[] strs, int low, int high) {
		if (high - low < 1)
			return 0;
		for (int i = 0; i < strs.length; i += 1) {
			strs[i] = strs[0];
		}
		return 0;
	}
}

public class TestPartitionOracle {

	@Test
	public void testClassPartition() {
		CounterExample ce = PartitionOracle.findCounterExample(new PartitionFromClass());
		System.out.println(ce);
		assertNull(ce);
	}

	@Test
	public void testCopyFirstElementPartition() {
		CounterExample ce = PartitionOracle.findCounterExample(new CopyFirstElementPartition());
		System.out.println(ce);
		assertNotNull(ce);
	}

}
