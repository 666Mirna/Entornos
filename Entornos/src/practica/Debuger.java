package practica;

import java.util.Scanner;

public class Debuger {


			Scanner scanner;

			public static void main(String[] args) {

				Scanner scanner = new Scanner(System.in);

				int max = scanner.nextInt();

				int i=0,j=0;

				

				if(max > 0) {

			        for(i=1;i<=max;i=i+1)

			        {

			            // Mostramos los asteriscos en cada fila

			            for(j=0;j<i;j++)

			            {

			                System.out.print("*");

			            }

			            System.out.println();

			        }

				}

				else if(max < 0) {

					for(i=max;i>0;i--)

			        {

			            // Mostramos los asteriscos en cada fila

			            for(j=0;j<i;j++)

			            {

			                System.out.print("*");

			            }

			            System.out.println();

			        }

				}

			}


}
