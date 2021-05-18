//$Id$
package justsolving;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;

public class paranthesis {

	public static void main(String[] args) {
		Scanner length = new Scanner(System.in);
		System.out.print("Input array length of 1st array : ");
		int n = length.nextInt();

		ArrayList<Integer> compansator = new ArrayList<Integer>();
		ArrayList<String> finallist = new ArrayList<String>();

		finallist.add("");
		compansator.add(0);

		for (int i = 0; i < 2 * n; i++) {
			ArrayList<Integer> listint = new ArrayList<Integer>();
			ArrayList<String> listpara = new ArrayList<String>();
			

			for (int j = 0; j < finallist.size(); j++) {
				String s = finallist.get(j);
				int k = compansator.get(j);

				if (i < (2 * n) - 1) {
					listpara.add(s + "(");
					listint.add(k + 1);
				}

				if ((k == 1 && i == 2 * n - 1) || (k > 0 && i < (2 * n) - 1)) {
					listpara.add(s + ")");
					listint.add(k - 1);
				}
			}
			finallist = listpara;
			compansator = listint;
		}
		System.out.print(finallist);
	}
}

/*
 * public static List<String> generateParenthesis(int n) { ArrayList<String> ans
 * = new ArrayList<String>(); if (n == 0) { ans.add(""); } else { for (int c =
 * 0; c < n; ++c) for (String left: generateParenthesis(c)) for (String right:
 * generateParenthesis(n-1-c)) ans.add("(" + left + ")" + right); } return ans;
 * }
 * 
 * 
 * /*static void print(char s[], int j, int n, int o, int c) { if (c == n) {
 * 
 * for (int i = 0; i < s.length; i++) System.out.print(s[i]);
 * System.out.println(); return; } else {
 * 
 * if (o < n) { s[j] = '{'; print(s, j + 1, n, o + 1, c); }
 * 
 * if (o > c) { s[j] = '}'; print(s, j + 1, n, o, c + 1); }
 * 
 * }
 * 
 * }
 */