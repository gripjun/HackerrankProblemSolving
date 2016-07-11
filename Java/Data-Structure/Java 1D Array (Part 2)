import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	static int[] jump;
	static int[] dupCnt;
	static int m;
	static int n;
	public static boolean solution(int cur) {
		if(cur < 0 || jump[cur] == 1) return false;
		if(cur == jump.length - 1 || cur + m > jump.length - 1) return true;
		jump[cur] = 1;
		
		return solution(cur+1) || solution(cur-1) || solution(cur+m);
		
	}
	
	
	public static boolean solve(int cur) {
		if(cur+m >= n || cur+1 >= n) {
			System.out.println("YES");
			return true;
		}
		
		if(dupCnt[cur] == 2 || cur < 0) {
			System.out.println("NO");
			return true;
		}
		cur += m;
		if(cur < n && dupCnt[cur] == 0 && jump[cur] == 0) {
			dupCnt[cur]++;
			if(solve(cur)) {
				return true;
			}
			dupCnt[cur]--;
		}
		cur -= m;
		
		cur += 1;
		if(cur < n && dupCnt[cur] == 0 &&  jump[cur] == 0) {
			dupCnt[cur]++;
			if(solve(cur)) {
				return true;
			}
			dupCnt[cur]--;
		}
		cur -= 1;
		
		cur -= 1;
		if(cur >= 0 && dupCnt[cur] == 0 &&  jump[cur] == 0) {
			dupCnt[cur]++;
			if(solve(cur)) {
				return true;
			}
			dupCnt[cur]--;
		}
		cur += 1;
		
		
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int input = sc.nextInt();
		for (int i = 0; i < input; i++) {
			n = sc.nextInt();
			m = sc.nextInt();
			jump = new int[n];
			dupCnt = new int[n];
			for (int j = 0; j < n; j++) {
				jump[j] = sc.nextInt();
			}
			
			/*
			if(!solve(0)) {
				System.out.println("NO");
			}
			*/
			
			if(solution(0)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}

		sc.close();
	}
}
