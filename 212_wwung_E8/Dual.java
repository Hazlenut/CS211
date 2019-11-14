//package animals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public class Dual {
	enum RESULT{
		DUAL,
		NONDUAL;
	}
/*	static RESULT isDual(int[] array) {
		boolean isEven = true;
		ArrayList<Integer> keys = new ArrayList<Integer>();
		for(int i: array) {
			if(!keys.contains(i)) {
				keys.add(i);
			}
		}
		int[] arr = new int[keys.size()];
		for(int i = 0; i < array.length; i++) {
			
			arr[keys.indexOf(array[i])]+=1;
			//System.out.println("run");
			//System.out.println(array[i]);
			//System.out.println(arr[keys.indexOf(array[i])]);
		}
		//System.out.println("res");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] %2 !=0) {
				isEven = false;
				break;
			}
		}
		
		if(isEven) {
			if(array.length == 0) {
				return RESULT.NONDUAL;
			}else {
			//System.out.println("even");
			return RESULT.DUAL;
			}
		}else {
			//System.out.println("odd");
			return RESULT.NONDUAL;
		}
	}*/
	static RESULT isDual(int[] array) {
		boolean isEven = true;
		HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
		for(int i: array) {
			if(!hash.containsKey(i)) {
				hash.put(i, 1);
				
			}else {
				int c = hash.get(i);
				hash.put(i, c+1);
			}
		}
		for(int i = 0; i < array.length; i++) {
			if(hash.get(array[i]) %2 !=0) {
				isEven = false;
				break;
			}
		}

		if(isEven) {
			if(array.length == 0) {
				return RESULT.NONDUAL;
			}else {
				return RESULT.DUAL;
			}
		}else {
			return RESULT.NONDUAL;
		}
		}
	}

