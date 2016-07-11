import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int input = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < input; i++) {
			list.add(sc.nextInt());
		}
		int query = sc.nextInt();
		
		for(int i = 0; i < query; i++) {
			String cmp = sc.next();
			if(cmp.equals("Insert")) {
				list.add(sc.nextInt(), sc.nextInt());
			} else if(cmp.equals("Delete")) {
				list.remove(sc.nextInt());
			}
		}

		for(Integer item : list) {
			System.out.print(item + " ");
		}
		sc.close();
	}
}
