import java.util.*;
public class fibonacci1
{
	public static void main (String[] args)
	{
		int i;
		int j = 1;
		int k = 0;
		int l = 1;
		int n;
		Scanner scn = new Scanner (System.in);
		System.out.print ("Nama		: Siti Nurpadilah & Utami Budi Rahayu\n");
		System.out.print ("NIM		: 1127050148 & 1127050166\n");
		System.out.print ("Kelas		: IF 5 G\n\n");
		System.out.print ("Fibonacci\n");
		System.out.print ("_____________\n\n\n");
		System.out.print (" Masukan nilai n untuk fibonacci = ");
		n=scn.nextInt();
		System.out.println ("");
		System.out.print (" Nilai untuk fibonacci = ");
		for (i=0;i<n;i++)
		{
			System.out.print ("");
			l=j;
			j=k;
			k=k+l;
			System.out.print (" "+k);
		}
		System.out.println ("");
	}
}