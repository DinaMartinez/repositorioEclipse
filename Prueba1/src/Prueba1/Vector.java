package Prueba1;

public class Vector {

	public static void main(String[] args) {
		//TODO Esbozo de método generado automáticamente
		int n=5, result=0;
		int a[]=new int[n];
		for(int i= 0; i<a.length; i++)
		{
			a[i]=(i+1)*10;
		}
		for(int i= 0; i<a.length; i++)
		{
			System.out.printf("Elemento %d=%d\n",i,a[i]);
		}
	}

}
