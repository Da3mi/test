package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainTestPartition {

	public static void main(String[] args) {
		try {
			MainTestPartition.partition(Arrays.asList(1, 2, 3, 4, 5), 1);
			MainTestPartition.partition(Arrays.asList(1, 2, 3, 4, 5), 2);
			MainTestPartition.partition(Arrays.asList(1, 2, 3, 4, 5), 3);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param list
	 * @param size
	 * @return list of partioned lists
	 * @throws Exception
	 */
	public static <T> List<List<T>> partition(List<T> list, int size) throws Exception {

		if (size <= 0) {
			throw new Exception("Size of the list must be bigger than 0");
		}

		int listSize = list.size();
		int numberEqualPartitions = listSize / size;
		int lasPartitionSize = listSize % size;
		int index = 0;
		int start = 0;

		List<List<T>> result = new ArrayList<List<T>>();

		while (index < numberEqualPartitions) {
			List<T> arrayList = list.subList(start, start + size);
			result.add(arrayList);
			start = start + size;
			index++;
		}

		// add last partition
		if (lasPartitionSize > 0) {
			result.add(list.subList(start, start + lasPartitionSize));
		}
		System.out.println(result.toString());
		return result;
	}

}
