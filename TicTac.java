import java.util.Scanner;

public class TicTac
{
	char[] playBoard = new char[10];
	int index;
	String userValue;
	Scanner input = new Scanner(System.in);
		/* UC 1*/
		public void board()
		{
			for(index = 1; index<10 ; index++)
			{
				playBoard[index] = '\0';
			}
		}
		/* UC 2 */
		public void readPlayer()
		{
			String computerChar;
			System.out.println("Enter a character X or O ");
			String playerChoice = input.nextLine();
			if (playerChoice.equals("X"))
			{
				System.out.println("user has written X");
				computerChar = "O";
				System.out.println(" computer has " +computerChar);
				
			}
			else
			{
				System.out.println("user has written O");
				computerChar = "X";
				System.out.println("computer has " + computerChar);
			}
			input.close();
			
		}
		/* UC 3 */
		public void showBoard()
		{
			System.out.println(" The board is \n");
			System.out.println(playBoard[1]+ " | " + playBoard[2] + " | "+ playBoard[3]);
			System.out.println(playBoard[4] + " | " + playBoard[5] + " | " + playBoard[6]);
			System.out.println(playBoard[7] + " | " + playBoard[8] + " | " + playBoard[9]);
			Selectingindex();
			
		}
		/* UC 4 & UC 5 */
		public void Selectingindex()
		{
			Scanner position = new Scanner(System.in);
			Scanner values = new Scanner(System.in);
			System.out.println(" Take any positions from 1 to 9 index ");
			int selection = position.nextInt();
			if (selection > 0 && selection <= 9)
			{
				if( playBoard[selection] == '\0')
				{
					System.out.println(" playBoard is free ");
					System.out.println(" Enter values X or O ");
					userValue = values.next();
					playBoard[selection] = userValue.charAt(0);
					System.out.println(playBoard[selection]);
				}
				else
				{
					System.out.println(" playboard is not free");
				}
			}
			else
			{
				System.out.println(" Enter values between 1 to 9 ");
				Selectingindex();
			}
			showBoard();
			position.close();
			values.close();
		}
		public static void main(String args[])
		{
			TicTac tic = new  TicTac();
			tic.board();
			/*tic.readPlayer(); */
			tic.showBoard();
			tic.Selectingindex();	
			
		}
}
