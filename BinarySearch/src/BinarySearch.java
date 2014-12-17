import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class BinarySearch
	{
	static int answer;
	static int answer2;
	static int answer3;
	static int answer4;
	static int answer5;
	static int answer6;
	static int answer7;
	static int question;
	static int num;
	static int counter = 0;
	static int counter2 = 0;
	static String score;
	static boolean playing = true;
	static ArrayList<Integer> elem = new ArrayList<Integer>();
	public static void main(String[] args)
		{
		System.out.println("This is a binary search quiz.");
		System.out.println("Enter in numbers only between 1 and 20 inclusive and when you want to stop entering in numbers type in -1.");
		System.out.println("Enter your numbers:");
		do
			{
			Scanner userInput = new Scanner(System.in);
			num = userInput.nextInt();
			elem.add(num);
			if(num == -1)
				{
				elem.remove(elem.size()-1);
				Collections.sort(elem);
				for(Object x : elem)
					{
					System.out.println(x);
					}
				binarySearch();
				}
			}
		while(playing);
		}
	
	public static int binarySearch()
		{
		//int [] elements = new int[elem.size()];
		Random r = new Random();
		int target = elem.get(r.nextInt(elem.size()));
		System.out.println("The target is: " + target);
		int left = 0;
		int right = elem.size() - 1;
		Scanner userInput2 = new Scanner(System.in);
		//Starting left
		System.out.println("What is left?");
		answer =  userInput2.nextInt();
		if(answer == left)
			{
			System.out.println("That is correct.");
			counter2++;
			}
		else
			{
			System.out.println("That is incorrect. The correct answer is: " + left);
			counter++;
			}
		//Starting right
		System.out.println("What is right?");
		answer2 = userInput2.nextInt();
		if(answer2 == right)
			{
			System.out.println("That is correct.");
			counter2++;
			}
		else
			{
			System.out.println("That is incorrect. The correct answer is: " + right);
			counter++;
			}
		while (left <= right)
			{
			//Middle
			int middle = (left + right) / 2;
			System.out.println("What is middle?");
			answer3 = userInput2.nextInt();
			if(answer3 == middle)
				{
				System.out.println("That is correct.");
				counter2++;
				}
			else
				{
				System.out.println("That is incorrect. The correct answer is: " + middle);
				counter++;
				}
			//Right
			if (target < elem.get(middle))
				{
				System.out.println("Target is < middle.");
				right = middle - 1;
				System.out.println("What is right now?");
				answer4 = userInput2.nextInt();
				if(answer4 == right)
					{
					System.out.println("That is correct.");
					counter2++;
					}
				else
					{
					System.out.println("That is incorrect. The correct answer is: " + right);
					}
				System.out.println("What is left?");
				answer5 = userInput2.nextInt();
				if(answer5 == left)
					{
					System.out.println("That is correct.");
					counter2++;
					}
				else
					{
					System.out.println("That is incorrect. The correct answer is: " + left);
					counter++;
					}
				}
			//Left
			else if (target > elem.get(middle))
				{
				System.out.println("Target is > middle.");
				left = middle + 1;
				System.out.println("What is right?");
				answer6 = userInput2.nextInt();
				if(answer6 == right)
					{
					System.out.println("That is correct.");
					counter2++;
					}
				else
					{
					System.out.println("That is incorrect. The correct answer is: " + right);
					counter++;
					}
				System.out.println("What is left now?");
				answer7 = userInput2.nextInt();
				if(answer7 == left)
					{
					System.out.println("That is correct.");
					counter2++;
					}
				else
					{
					System.out.println("That is incorrect. The correct answer is: " + left);
					counter++;
					}
				}
			//Win
			else
				{
				System.out.println("Congradulations you finished the game!");
				score = counter2 + "/" + (counter + counter2);
				System.out.println("Your score is: " + score);
				System.out.println("Would you like to finish? Yes(1) No(2)");
				Scanner userInput8 = new Scanner(System.in);
				question = userInput8.nextInt();
				if(question == 1)
					{
					System.out.println("Bye");
					System.exit(0);
					}
				else
					{
					main(null);
					}
				return middle;
				}
			}
		return - 1;
		}
	}


