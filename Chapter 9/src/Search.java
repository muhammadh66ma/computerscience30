
public class Search {
	
	public static int linear(int[] array, int numToFind) {
		int index = 0;
		while ((array[index] != numToFind) && (index < array.length - 1)) {
			index += 1;
		}
		if (array[index] == numToFind) {
			return (index);
		} else {
			return (-1);
		}
	}
	public static int linear(String[] array, String strToFind) {
		int index = 0;
		while (true) {
			if (index == array.length) {
				break;
			}
			if (array[index].equals(strToFind)) {
				return index;
			}
			index++;
		}
		return -1;
	}
}

