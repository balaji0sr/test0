//$Id$
package justsolving;

public class QP {
	Questions 1: 
		N number of friends playing a game. Each one will be given a random number and 
		points for each player will be sum of the remaining players number. Print points of each 
		players. 
		 
		Input format: 
		First line contains number of players n. 
		Then n number of random number 
		 
		Constraints 
		-1000 <= n, a[i] <= 1000 
		 
		Output format 
		Print points of each n players. 
		 
		Sample Input: 
		5 
		21 54 11 34 24 
		 
		Sample Output: 
		123 90 133 110 120 
		 
		Explanation 
		The point for player 0 is 123 because the sum of remaining players is 54 + 11 + 34 + 24 
		is 123 
		Similarly for player 1 is the sum of remaining players is 21 + 11 + 34 + 24 is 90 
		And so on. 
		 
		 
		 
		Questions 2: 
		Madan is in his math class. His teacher giving task for each students. The task is find 
		sum of n unique intergers. As Madan is very bright student he quickly finish the task and 
		playing a game with the n integers. 
		 
		The game is to rearrange the integers in zig-zag fashion. The n integers should in the 
		following fashion. 
		 
		m < n > o < p > q < r  
		or 
		m > n < o > p < q > r  
		 
		Input format: 
		First line contains number of integers n. 
		Then n number of unique integers 
		 
		Constraints 
		-1000 <= n, a[i] <= 1000 
		 
		Output format 
		Print points of each n players. 
		 
		Sample Input: 
		7 
		5 4 8 9 7 3 2 
		 
		Sample Output: 
		4 8 5 9 3 7 2 
		 
		 
		 
		 
		 
		 
		 
		Questions 3: 
		There is a prison which has n number of cells. Each room has an non-zero integer and 
		the integers wants to escape from the prison.​
		​
		Varun is helping them to escape, but he cannot help everyone. Varun can help 2 integers 
		(a[i], a[i+1]) which are close to each others. ​
		​
		If any one of the following condition satisfies then two integers can escapes​
		a. a[i] is positive and a[i+1] is negative.​
		b. a[i] and a[i+1] are negative.​
		​
		Help Varun to find the shortest number of (unlucky)integers available after some pair of 
		integers escapes.​
		​
		Sample Input:​
		3​
		1 2 3​
		 ​
		Sample output:​
		3​
		​
		​
		Sample Input:​
		6​
		-1 4 -19  -1 -1 8​
		 ​
		Sample output:​
		2​
		​
		Sample Input:​
		10​
		1 6 -1 -3 -87 32 -12 -54 -67 -10 ​
		​
		Sample output:​
		0​
		 
		 
		​
		Explanation:​
		In third sample input​
		1 6 -1 -3 -87 32 -12 -54 -67 -10 ​
		-> 1 6 -1 -3 -87 32 -12  -10 (-54, -67 escapes)​
		-> 1 6 -1 -3 -87 -10 (32, -12 escapes)​
		-> 1 -3 -87 -10 (6, -1 escapes)​
		-> 1 -10 (-3, -87 escapes)​
		-> (1, -10 escapes)​
		All 10 integers escapes so count is 0. 
		 
		 
		 
		 
		Questions 4: 
		You are given a string A consisting of english alphabet. You’ve to remove at most one 
		(i.e. zero or one) character of this string in such a way that the string you obtain will be 
		lexicographically smallest among all strings that can be obtained using this operation. 
		 
		For example, "yyy" is smaller than "yyyy", "xyy" is smaller than "xyz", "ijk" is smaller than 
		"z". 
		 
		 
		Sample Input: 
		yyy 
		  
		Sample output: 
		yy 
		 
		 
		Sample Input: 
		ijkli 
		  
		Sample output: 
		ijki 
		 
		In the second example "ijki" < "ijkl" < "ijkli" < "ijlj" < "ikli" < "jkli" 
		 
		 
		 
		 
		Questions 5: 
		Salini found some paper in her home. The paper has random numbers. Salini thinks that 
		it has list of years. 
		Eg: if the paper has 1997 then the possible years are  
		"1997" 
		"1", "997" 
		"19", "97" and so on. 
		 
		Salini assumes following rules, 
		a. Years are listed in the strictly increasing order 
		b. There are no leading zeros. 
		 
		Help Salini to find the number of ways to split. 
		 
		Sample Input 
		20182019 
		 
		Sample Output 
		4 
		 
		Explanation: 
		There are 4 possible years for the given strings. 
		1.20182019 
		2.20 + 182019 
		3.201 + 82019 
		4.2018 + 2019 
		 
		 
		 
		 
		 
		 
		 
		Questions 6: 
		For given array , find sum of minimum elements that present in every consecutive sub 
		array of given array 
		Input: [3,1,2,4] 
		Output: 17 
		Explanation: Sub arrays are [3], [1], [2], [4], [3,1], [1,2], [2,4], [3,1,2], [1,2,4], [3,1,2,4].  
		Minimums are 3, 1, 2, 4, 1, 1, 2, 1, 1, 1.  Sum is 17. 
		 
		Note: 
		1 <= A.length <= 100 
		1 <= A[i] <= 100 
		 
		 
		 
		 
		Questions 7: 
		Given a string, sort it in decreasing order based on the frequency of characters. 
		 
		Example 1: 
		Input: 
		"tree" 
		Output: 
		"eert" 
		 
		Explanation: 
		'e' appears twice while 'r' and 't' both appear once. 
		So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer. 
		 
		Example 2: 
		Input: 
		"cccaaa" 
		Output: 
		"cccaaa" 
		 
		Explanation: 
		Both 'c' and 'a' appear three times, so "aaaccc" is also a valid answer. 
		Note that "cacaca" is incorrect, as the same characters must be together 
		 
		 
		 
		Questions 8: 
		Given a string containing digits from 2-9 inclusive, return all possible letter 
		combinations that the number could represent. Return the answer in any order. 
		 
		A mapping of digit to letters (just like on the telephone buttons) is given below. Note 
		that 1 does not map to any letters. 
		 
		 
		 
		Example1 
		Input: digits = "23" 
		Output: ["a","b","c","d","e","f","ad","ae","af","bd","be","bf","cd","ce","cf"] 
		 
		Example2 
		Input: digits = "2" 
		Output: ["a","b","c"]​
		​
		Example3 
		Input: digits = "" 
		Output: [] 
		 
		 
		 
		 
		 
		 
		 
		Questions 9: 
		Given n pairs of parentheses, write a function to generate all combinations of 
		well-formed parentheses. 
		​
		Example 1: 
		Input: n = 3 
		Output: ["((()))","(()())","(())()","()(())","()()()"] 
		 
		Example 2: 
		Input: n = 1 
		Output: ["()"] 
		 
		 
		 
		 
		Questions 10: 
		Write a program  for the given n, how many unique BST's (binary search trees) that store 
		values 1, 2, 3 ... n? 
		 
		Binary Search Tree is a binary tree. 
		 
		* The left subtree of a node contains only nodes with keys lesser than the node’s key. 
		* The right subtree of a node contains only nodes with keys greater than the node’s key. 
		* The left and right subtree each must also be a binary search tree. 
		 
		Given n = 3, there are a total of 5 unique BST's:  
		 
		 
		 
		 
		APTITUDE: 
		 
		NOTE: Paste the answers in the form and make sure that the answer is pasted under the 
		correct question name. 
		 
		 
		Questions 11: 
		The present ages of A, B and C are in proportions 2:3:5. 5 years ago, sum of their ages 
		was 45 years. Find their present ages in years?  
		 
		 
		 
		Questions 12: 
		There are 3 ants sitting on three corners of a triangle. All ants randomly pick a direction 
		and start moving along the edge of the triangle. What is the probability that any two 
		ants collide? 
		 
		 
		Questions 13: 
		There is one scooter which has 2 tyres and one Stepney (i.e. total of 3 tyres). Each tyre 
		can run up to maximum of 5 km. How long will the scooter run? 
		 
		 
		 
		Questions 14: 
		Complete the series:  6, 14, 36, 98, ? 
		 
		 
		 
		Questions 15: 
		A delegation of 5 members has to be formed from 3 ladies and 5 gentlemen. In how 
		many ways the delegation can be formed, if 2 particular ladies are always included in 
		the delegation? 
		 
		 
		 
		 
		Questions 16: 
		Four people need to cross a dark river at night.They have only one torch and the river is 
		too risky to cross without the tourch. if all people cross simultanoesly then torch light 
		wont be sufficient. Speed of each person of crossing the river is different.cross time for 
		each person is 1 min, 2 mins, 7 mins and 10 mins. What is the shortest time needed for 
		all four of them to cross the river ? 
		 
		 
		Questions 17: 
		A and B started a business with 1500 and 2500 and got a profit 800 Rs. Half of the profit 
		is shared equally the remaining is shared according to their investment. Find their 
		profits respectively? 
		 
		 
		Questions 18: 
		If Varun  rows 16 km upstream and 24 km down steam  taking 4 hours each, then the 
		speed of the stream ? 
		 
		 
		Questions 19: 
		A person has to cover a distance of 6 km in 45 minutes. If he covers one-half of the 
		distance in two-thirds of the total time, to cover the remaining distance in the remaining 
		time, what should be his speed in km/hr? 
		 
		 
		Questions 20: 
		P, Q and R together earn Rs.1620 in 9 days. P and R can earn Rs.600 in 5 days. Q and R 
		in 7 days can earn Rs.910. How much amount does R can earn per day?
}
