import java.util.Scanner;
public class TotalBelanja
{
	static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);
		int i;
		int j;
		int jumlah[]= 0;
		int matriksBudi[][] = new int [2][3];
		int matriksRudi[][] = new int [2][3];
		int jumlahBelanjaBudi[];
		int jumlahBelanjaRudi[];
		for (i=0;i<2;i++)
		{
			for (j=0;j<2;j++)
			{
				System.out.print("Belanja ibu Budi: "+i+"	"+j);
				matriksBudi[i][j]=input.nextInt();
			}
		}
		for (i=0;i<2;i++)
		{
			for (j=0;j<2;j++)
			{
				System.out.print("Belanja ibu Rudi: "+i+"	"+j);
				matriksRudi[i][j] = input.nextInt();
			}
		}
		
		for (j=0;j<2;j++)
		{
			jumlahBelanjaBudi[j] = jumlah[]+matriksBudi[j];
		}
		System.out.println ("Jumlah biaya belanja ibu Budi adalah Rp."+jumlahBelanjaBudi);
		
		for (j=0;j<2;j++)
		{
			jumlahBelanjaRudi[j] = jumlah[]+matriksRudi[];
		}
		System.out.println ("Jumlah biaya belanja ibu Rudi adalah Rp."+jumlahBelanjaRudi);
	}
}