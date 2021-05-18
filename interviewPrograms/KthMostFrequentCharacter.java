package interviewPrograms;

import java.util.Scanner;
import java.util.HashMap;

public class KthMostFrequentCharacter {
	public static void main(String[] arg) {
		boolean continueLoop = true;
		while (continueLoop) {
			try {
				Scanner string = new Scanner(System.in);
				System.out.print("no of intervels : ");
				String s = string.nextLine();
				int sl = s.length();
				HashMap <Character , Integer> map = new HashMap<>() ;
				
				
				for (int i = 0 ; i < sl ; i++ ){
					char ch = s.charAt(i);
					
					if (map.containsKey(ch)){
						int a = map.get(ch);
						a++;
						map.put(ch , a);
					}else{
						map.put(ch , 1);
					}
				}
				
			} catch (Exception string) {
				System.out.println("can't process the given input");
			}
		}
	}
	}