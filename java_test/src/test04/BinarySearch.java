package test04;

public class BinarySearch {
	public static int binarySearch(int key, int[] list, int low, int up) {
		int mid = (low + up) / 2;
		while (low <= up) {
			if (key < list[mid]) {
				up = mid;
				binarySearch(key, list, low, up);
			} else if (key > list[mid]) {
				low = mid;
				binarySearch(key, list, low, up);
			} else {
				return mid;
			}
		}
		return -1;
	}

	public static void binarySearch(int key, int[] list) {
		int result = binarySearch(key, list, 0, list.length-1);
		if (result != -1) {
			System.out.println("��Ԫ�ص������±�Ϊ: "+result);
		} else {
			System.out.println("������Ϊ�ҵ���keyֵ��ȵ�Ԫ��");
		}
	}
}
