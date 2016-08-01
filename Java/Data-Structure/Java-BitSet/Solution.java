package Problem;

import java.util.BitSet;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nbit = sc.nextInt();
		int opCnt = sc.nextInt();

		BitSet b1 = new BitSet(nbit);
		BitSet b2 = new BitSet(nbit);

		for (int i = 0; i < opCnt; i++) {
			String cmd = sc.next();
			int op1 = sc.nextInt();
			int op2 = sc.nextInt();

			if (cmd.equals("AND")) {
				if (op1 == 1) {
					b1.and(b2);
				} else {
					b2.and(b1);
				}
			} else if (cmd.equals("SET")) {
				if (op1 == 1) {
					b1.set(op2);
				} else {
					b2.set(op2);
				}
			} else if (cmd.equals("FLIP")) {
				if (op1 == 1) {
					b1.flip(op2);
				} else {
					b2.flip(op2);
				}
			} else if (cmd.equals("XOR")) {
				if (op1 == 1) {
					b1.xor(b2);
				} else {
					b2.xor(b1);
				}	
			} else if (cmd.equals("OR")) {
				if (op1 == 1) {
					b1.or(b2);
				} else {
					b2.or(b1);
				}	
			}
			
			System.out.println(b1.cardinality() +" " + b2.cardinality());
			
		}

	}
}
