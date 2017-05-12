package iftikhar; 

import java.util.Scanner; 

public class GameOfLife { 

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in); 
		System.out.println("Choose the amount of coordinates you would like to enter"); 
		int CellNum = sc.nextInt(); 
		int[][] arr = new int[20][20]; 
		int[][] board = new int[20][20]; 
		System.out.println("Choose the coordinates for the alive cells (it must be 20,20)"); 
		int Rows = 0; 
		int Columns = 0; 
		String nextDay; 
		for (int x = 1; x <= CellNum; x++) { 
			System.out.println("Enter a coordinate for x between 0-20"); 
			Rows = sc.nextInt(); 
			System.out.println("Enter a coordinate for y between 0-20"); 
			Columns = sc.nextInt(); 
			arr[Rows][Columns] = 1; 
		} 
		System.out.println("Original:"); 
		for (int a = 0; a < arr.length; a++) { 
			for (int i = 0; i < arr[a].length; i++) { 
				System.out.print(arr[a][i]); 
			} 
			System.out.println(); 
		} 
		sc.nextLine(); 


		do { 
			for (int i = 0; i < arr.length; i++) { 
				for (int j = 0; j < arr[i].length; j++) { 


					if (arr[i][j] == 1) { 
						if (numAlive(arr, j, j) == 2 || numAlive(arr, j, i) == 3) { 
							board[i][j] = 1; 
						} else { 
							board[i][j] = 0; 
						} 
					} else if (arr[i][j] == 0) { 
						if (numDead(arr, i, j) == 3) { 
							board[i][j] = 1; 
						} else { 
							board[i][j] = 0; 
						} 


					} 


				} 
			} 


			System.out.println("Next Day:"); 
			for (int a = 0; a < arr.length; a++) { 
				for (int i = 0; i < arr[a].length; i++) { 
					System.out.print(arr[a][i]); 
				} 
				System.out.println(); 
			} 
			System.out.println("Want to continue to to the next day? (yes/no)"); 
			nextDay = sc.nextLine(); 
		} while (nextDay.equalsIgnoreCase("yes")); 
	} 


	public static int numAlive(int[][]arr,int i, int j){ 
		int AliveCells=0; 

		if(i !=0 && i!=19 && j!=0 &&j!=19){ 
			if(arr[i][j]==1){ 
				if(arr[i-1][j-1]==1){ 
					AliveCells=AliveCells+1; 
				} 
				if(arr[i][j-1]==1){ 
					AliveCells=AliveCells+1; 
				} 
				if(arr[i+1][j-1]==1){ 
					AliveCells=AliveCells+1; 
				} 
				if(arr[i-1][j]==1){ 
					AliveCells=AliveCells+1; 
				} 
				if(arr[i+1][j]==1){ 
					AliveCells=AliveCells+1; 
				} 
				if(arr[i-1][j+1]==1){ 
					AliveCells=AliveCells+1; 
				} 
				if(arr[i][j+1]==1){ 
					AliveCells=AliveCells+1; 
				} 
				if(arr[i+1][j+1]==1){ 
					AliveCells=AliveCells+1; 
				} 
			} 
		} 
		else if(j == 0 && i!=0&& j!=19){ 
			if (arr[i][j] == 1) { 
				if (arr[i - 1][j] == 1) { 
					AliveCells = AliveCells + 1; 
				} 
				if (arr[i + 1][j] == 1) { 
					AliveCells = AliveCells + 1; 
				} 
				if (arr[i - 1][j + 1] == 1) { 
					AliveCells = AliveCells + 1; 
				} 
				if (arr[i][j + 1] == 1) { 
					AliveCells = AliveCells + 1; 
				} 
				if (arr[i + 1][j + 1] == 1) { 
					AliveCells = AliveCells + 1; 
				} 
			} 
		} 
		else if (i == 0 && !(j == 0 && j == 19)){ 
			if (i != 0 && i != 20 && j != 0 && j!= 20){ 
				if (arr[i][j] == 1) { 
					if (arr[i][j - 1] == 1) { 
						AliveCells = AliveCells + 1; 
					} 
					if (arr[i + 1][j - 1] == 1) { 
						AliveCells = AliveCells + 1; 
					} 
					if (arr[i + 1][j] == 1) { 
						AliveCells = AliveCells + 1; 
					} 
					if (arr[i][j + 1] == 1) { 
						AliveCells = AliveCells + 1; 
					} 
					if (arr[i + 1][j + 1] == 1) { 
						AliveCells = AliveCells + 1; 
					} 
				} 


			} 







			else if (i == 19 && j != 0 && j != 19){ 
				if (i != 0 && i != 20 && j != 0 && j != 20){ 
					if (arr[i][j] == 1) { 
						if (arr[i][j - 1] == 1) { 
							AliveCells = AliveCells + 1; 
						} 
						if (arr[i - 1][j - 1] == 1) { 
							AliveCells = AliveCells + 1; 
						} 
						if (arr[i - 1][j] == 1) { 
							AliveCells = AliveCells + 1; 
						} 
						if (arr[i][j + 1] == 1) { 
							AliveCells = AliveCells + 1; 
						} 
						if (arr[i - 1][j+ 1] == 1) { 
							AliveCells = AliveCells + 1; 
						} 
					} 


				} 






				else if (j == 0 && i != 0 && i != 19){ 
					if (arr[i][j] == 1) { 
						if (arr[i - 1][j] == 1) { 
							AliveCells = AliveCells + 1; 
						} 
						if (arr[i + 1][j] == 1) { 
							AliveCells = AliveCells + 1; 
						} 
						if (arr[i - 1][j - 1] == 1) { 
							AliveCells = AliveCells + 1; 
						} 
						if (arr[i][j - 1] == 1) { 
							AliveCells = AliveCells + 1; 
						} 
						if (arr[i + 1][j - 1] == 1) { 
							AliveCells = AliveCells + 1; 
						} 
					} 




				} 

				else if (i == 0 && j == 0){ 
					if (arr[i][j] == 1) {	 
						if (arr[i + 1][j] == 1) { 
							AliveCells = AliveCells + 1; 
						} 
						if (arr[i][j + 1] == 1) { 
							AliveCells = AliveCells + 1; 
						} 
						if (arr[i + 1][j + 1] == 1) { 
							AliveCells = AliveCells + 1; 
						} 
					} 






				} 

				else if (i == 19 && j == 0){ 
					if (arr[i][j] == 1) {	 
						if (arr[i - 1][j] == 1) { 
							AliveCells = AliveCells + 1; 
						} 
						if (arr[i][j + 1] == 1) { 
							AliveCells = AliveCells + 1; 
						} 
						if (arr[i - 1][j + 1] == 1) { 
							AliveCells = AliveCells + 1; 
						} 
					} 




				} 

				else if (i == 0 && j == 19){ 
					if (arr[i][j] == 1) {	 
						if (arr[i + 1][j] == 1) { 
							AliveCells = AliveCells + 1; 
						} 
						if (arr[i][j - 1] == 1) { 
							AliveCells = AliveCells + 1; 
						} 
						if (arr[i + 1][j - 1] == 1) { 
							AliveCells = AliveCells + 1; 
						} 
					} 
				} 




				else if (i == 19 && j == 19){ 
					if (arr[i][j] == 1) {	 
						if (arr[i - 1][j] == 1) { 
							AliveCells = AliveCells + 1; 
						} 
						if (arr[i][j - 1] == 1) { 
							AliveCells = AliveCells + 1; 
						} 
						if (arr[i - 1][j- 1] == 1) { 
							AliveCells = AliveCells + 1; 
						} 
					} 


				} 



				return AliveCells; 
			} 
		} 











		public static int numDead(int[][] arr,int i,int j){ 
			int DeadCells = 0; 
			if(i !=0 && i!=19 && j!=0 &&j!=19){ 
				if(arr[i][j]==1){ 
					if(arr[i-1][j-1]==1){ 
						DeadCells=DeadCells+1; 
					} 
					if(arr[i][j-1]==1){ 
						DeadCells=DeadCells+1; 
					} 
					if(arr[i+1][j-1]==1){ 
						DeadCells=DeadCells+1; 
					} 
					if(arr[i-1][j]==1){ 
						DeadCells=DeadCells+1; 
					} 
					if(arr[i+1][j]==1){ 
						DeadCells=DeadCells+1; 
					} 
					if(arr[i-1][j+1]==1){ 
						DeadCells=DeadCells+1; 
					} 
					if(arr[i][j+1]==1){ 
						DeadCells=DeadCells+1; 
					} 
					if(arr[i+1][j+1]==1){ 
						DeadCells=DeadCells+1; 
					} 
				} 
				else if(j == 0 && i!=0&& j!=19){ 
					if (arr[i][j] == 1) { 
						if (arr[i - 1][j] == 1) { 
							DeadCells = DeadCells + 1; 
						} 
						if (arr[i + 1][j] == 1) { 
							DeadCells =DeadCells + 1; 
						} 
						if (arr[i - 1][j + 1] == 1) { 
							DeadCells = DeadCells + 1; 
						} 
						if (arr[i][j + 1] == 1) { 
							DeadCells = DeadCells + 1; 
						} 
						if (arr[i + 1][j + 1] == 1) { 
							DeadCells = DeadCells + 1; 
						} 
					} 
				} 
				else if (i == 0 && !(j == 0 && j == 19)){ 
					if (i != 0 && i != 20 && j != 0 && j!= 20){ 
						if (arr[i][j] == 1) { 
							if (arr[i][j - 1] == 1) { 
								DeadCells = DeadCells + 1; 
							} 
							if (arr[i + 1][j - 1] == 1) { 
								DeadCells = DeadCells + 1; 
							} 
							if (arr[i + 1][j] == 1) { 
								DeadCells = DeadCells + 1; 
							} 
							if (arr[i][j + 1] == 1) { 
								DeadCells = DeadCells + 1; 
							} 
							if (arr[i + 1][j + 1] == 1) { 
								DeadCells = DeadCells + 1; 
							} 
						} 


					} 







					else if (i == 19 && j != 0 && j != 19){ 
						if (i != 0 && i != 20 && j != 0 && j != 20){ 
							if (arr[i][j] == 1) { 
								if (arr[i][j - 1] == 1) { 
									DeadCells = DeadCells + 1; 
								} 
								if (arr[i - 1][j - 1] == 1) { 
									DeadCells = DeadCells + 1; 
								} 
								if (arr[i - 1][j] == 1) { 
									DeadCells = DeadCells + 1; 
								} 
								if (arr[i][j + 1] == 1) { 
									DeadCells = DeadCells + 1; 
								} 
								if (arr[i - 1][j+ 1] == 1) { 
									DeadCells = DeadCells + 1; 
								} 
							} 


						} 






						else if (j == 0 && i != 0 && i != 19){ 
							if (arr[i][j] == 1) { 
								if (arr[i - 1][j] == 1) { 
									DeadCells = DeadCells + 1; 
								} 
								if (arr[i + 1][j] == 1) { 
									DeadCells = DeadCells + 1; 
								} 
								if (arr[i - 1][j - 1] == 1) { 
									DeadCells = DeadCells + 1; 
								} 
								if (arr[i][j - 1] == 1) { 
									DeadCells = DeadCells + 1; 
								} 
								if (arr[i + 1][j - 1] == 1) { 
									DeadCells = DeadCells + 1; 
								} 
							} 






							else if (i == 0 && j == 0){ 
								if (arr[i][j] == 1) {	 
									if (arr[i + 1][j] == 1) { 
										DeadCells = DeadCells + 1; 
									} 
									if (arr[i][j + 1] == 1) { 
										DeadCells = DeadCells + 1; 
									} 
									if (arr[i + 1][j + 1] == 1) { 
										DeadCells = DeadCells + 1; 
									} 
								} 






							} 

							else if (i == 19 && j == 0){ 
								if (arr[i][j] == 1) {	 
									if (arr[i - 1][j] == 1) { 
										DeadCells = DeadCells + 1; 
									} 
									if (arr[i][j + 1] == 1) { 
										DeadCells = DeadCells + 1; 
									} 
									if (arr[i - 1][j + 1] == 1) { 
										DeadCells = DeadCells + 1; 
									} 
								} 




							} 

							else if (i == 0 && j == 19){ 
								if (arr[i][j] == 1) {	 
									if (arr[i + 1][j] == 1) { 
										DeadCells = DeadCells + 1; 
									} 
									if (arr[i][j - 1] == 1) { 
										DeadCells = DeadCells + 1; 
									} 
									if (arr[i + 1][j - 1] == 1) { 
										DeadCells = DeadCells + 1; 
									} 
								} 
							} 




							else if (i == 19 && j == 19){ 
								if (arr[i][j] == 1) {	 
									if (arr[i - 1][j] == 1) { 
										DeadCells = DeadCells + 1; 
									} 
									if (arr[i][j - 1] == 1) { 
										DeadCells = DeadCells + 1; 
									} 
									if (arr[i - 1][j- 1] == 1) { 
										DeadCells = DeadCells + 1; 
									} 
								} 


							} 


							return DeadCells; 
						} 
					} 
