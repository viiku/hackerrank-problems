// Update the '_' in the code below to solve the problem
import java.util.*;
class Codechef
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
		    ArrayList<Integer> a = new ArrayList<Integer>();
		    int n = read.nextInt();
		    for(int j=1; j<=n; j++){
    		    int inputVal = read.nextInt(); 
    		    a.add(inputVal);
		    }
		    System.out.println(a);
		    Collections.sort(a, Collections.reverseOrder());
		    System.out.println(a);


		}
	}
}