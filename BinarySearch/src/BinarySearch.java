import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
public class BinarySearch
	{
	static String answer;
	static int num;
	static boolean playing = true;
	public static void main(String[] args)
		{
		System.out.println("This is a binary search quiz.");
		System.out.println("Enter in numbers.");
		ArrayList elem = new ArrayList();
		do
			{
			Scanner userInput = new Scanner(System.in);
			num = userInput.nextInt();
			elem.add(num);
			if(num == -1)
				{
				for(Object x : elem)
					{
					System.out.println(x);
					}
				}
			Collections.sort(elem);
			}
		while(playing);
		}
	public static int BinarySearch(int[] elements, int target)
		{
		int left = 0;
		int right = elements.length - 1;
		while (left <= right)
			{
			int middle = (left + right) / 2;
			if (target < elements[middle])
				{
				right = middle - 1;
				}
			else if (target > elements[middle])
				{
				left = middle + 1;
				}
			else
				{
				return middle;
				}
			}
		return - 1;
		}
	}