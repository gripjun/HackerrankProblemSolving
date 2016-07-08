import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
    	ArrayList<ArrayList<Integer>> lines = new ArrayList<ArrayList<Integer>>();
    	Scanner sc = new Scanner(System.in);
    	
    	int input = sc.nextInt();
    	ArrayList<Integer> line; int element;
    	for(int i = 0; i < input; i++) {
    		element = sc.nextInt();
    		line = new ArrayList<Integer>();
    		for(int j = 0; j < element; j++) {
    			line.add(sc.nextInt());
    		}
    		lines.add(line);
    	}
    	
    	int query = sc.nextInt();
    	ArrayList<Integer> getLine;
    	int position; int lineNum;
    	for(int i = 0; i < query; i++) {
    		lineNum = sc.nextInt();
    		position = sc.nextInt();
    		
    		if(lineNum <= lines.size()) {
    			getLine = lines.get(lineNum-1);
    			
    			if(position <= getLine.size()) {
    				Integer result = (Integer) getLine.get(position-1); 
    				System.out.println(result);
    			}
    			else {
    				System.out.println("ERROR!");
    			}
    		} else {
    			System.out.println("ERROR!");
    		}
    	}
    	
    	sc.close();
    }
}
