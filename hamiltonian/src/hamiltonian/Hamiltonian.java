package hamiltonian;

import java.util.Scanner;

public class Hamiltonian {
	
	static int[][] graph;
	 static int[] soln;
	 static int n, count = 0;

	public static void main(String[] args) {
	
		
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter Number of Vertices");
		 n = scanner.nextInt();
		
		 graph = new int[n + 1][n + 1];
		 System.out.println("Enter Adjacency Matrix");
		 for (int i = 1; i <= n; i++) {
		 for (int j = 1; j <= n; j++) {
		 graph[i][j] = scanner.nextInt();
		 }
		 }
		
		 soln = new int[n + 1];
		 System.out.println("Hamiltonian Cycle are");
		 // In a cycle source vertex doesn't matter
		 // Assign Starting Point to prevent repetitions
		 soln[1] = 1;
		
		 hamiltonian(2);
		 if (count == 0) {
		 System.out.println("No Hamiltonian Cycle");
		 }
		 }
		 static void hamiltonian(int k) {
		 while (true) {
		 nextValue(k);
		 // No next vertex so return
		 if (soln[k] == 0) {
		 return;
		 }
		 if (k == n) {
			 printArray();
			 } else {
			 hamiltonian(k + 1);
			 }
		 }
		 }
		 static void nextValue(int k) {
			 // Finds next feasible value
			 while (true) {
			 soln[k] = (soln[k] + 1) % (n + 1);
			 // If no next vertex is left, then return
			 if (soln[k] == 0) {
			 return;
			 }
			 // If there exists an edge
			 if (graph[soln[k - 1]][soln[k]] != 0) {
			 int j;
			 // Check if the vertex is not repeated
			 for (j = 1; j < k; j++) {
			 if (soln[j] == soln[k]) {
			 break;
			 }
			 }
			 // If vertex is not repeated
			 if (j == k) {
			 
			 if (k < n || (k == n && graph[soln[n]][soln[1]] != 
			0)) {
			 return;
			 }
			 }
			 }
			 }
			 }
			 static void printArray() {
			 count += 1;
			 // Print Solution Array
			 for (int i = 1; i <= n; i++) {
			 System.out.print(soln[i] + " ");
			 }
			 System.out.println(soln[1]);
			 }



	}


		 
