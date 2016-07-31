import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Deque<Integer> deque = new LinkedList<>();
		int n = in.nextInt();
		int m = in.nextInt();
		Map<Integer, Integer> map = new HashMap<>();

		int max = 0;
		for (int i = 0; i < n; i++) {
			int target = in.nextInt();
			deque.add(target);

			if (map.containsKey(target)) {
				map.put(target, map.get(target) + 1);
			} else {
				map.put(target, 1);
			}

			if (deque.size() == m + 1) {
				int fir = deque.removeFirst();
				int getFir = map.get(fir);
				if (getFir == 1) {
					map.remove(fir);
				} else {
					map.put(fir, getFir - 1);
				}

			}

			if (deque.size() == m) {
				max = max > map.size() ? max : map.size();

			}
		}

		System.out.println(max);

	}
}
