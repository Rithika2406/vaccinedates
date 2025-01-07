import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner S=new Scanner(System.in);
		int t=S.nextInt();
		while(t-->0)
		{
		    int D=S.nextInt();
		    int L=S.nextInt();
		    int R=S.nextInt();
		    if(D<L)
		    {
		        System.out.println("Too Early");
		    }
		    else if(D>R)
		    {
		        System.out.println("Too Late");
		    }
		    else{
		        System.out.println("Take second dose now");
		    }
		}

	}
}
