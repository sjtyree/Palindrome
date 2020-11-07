package Palindrome;

public class PalindromeMain 
{

	public static void main(String[] args) 
	{
		System.out.println(solution(200, 26));
	}

	public static String solution(int N, int K) 
	{
		String answer;
		//array of chars that we will convert to a string at the end 
		char [] charArray = new char[N];
		//letter counter will be used to determine when we have reached K
		int letterCounter = 1;
		//goingFowards will be used to determine if we are moving fowards through the alphabet OR backwards
		boolean goingFowards = true;
		//start with the letter 'a'
		char letter = 'a';
		//iterate through the array (from the front AND back) until we reach the middle 
		for (int front = 0, back = charArray.length; front < back; front++, back--)
		{
			charArray[front] = letter;
			charArray[back - 1] = letter;
			//if we have reached K, start moving backwards through the alphabet
			if ((letterCounter == K || goingFowards == false) && K != 1 && letterCounter != 1)
			{
				letter--;
				letterCounter--;
				goingFowards = false;
			}
			//if we have reached 1, start moving forwards through the alphabet
			else if((letterCounter == 1 || goingFowards == true) && K != 1)
			{
				letter++;
				letterCounter++;
				goingFowards = true;
			}
			
		}
		//turn the char array into a string
		answer = new String(charArray);
		return answer;
    }

}

