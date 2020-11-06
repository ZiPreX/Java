/*
public class Ejercicio4{

	public static void main(String args[]) {
				
	}
}
*/


import java.util.Scanner;
	//Ejercicio 4 - Comparar 3 números y ordenarlos de menor a mayor
	/*public class Ejercicio4{
		public static void main(String args[]) {
			int n1;
			int n2;
			int n3;
			Scanner	sc = new Scanner(System.in);
			System.out.println("Introduce un número");
			n1 = sc.nextInt();
			System.out.println("Introduce otro número");
			n2 = sc.nextInt();
			System.out.println("Introduce otro número");
			n3 = sc.nextInt();



			if (n1>n2) {
				if (n2>n3) {
					System.out.print(n1);
					System.out.print(" Es mayor que ");
					System.out.print(n2);
					System.out.print(" y ");
					System.out.print(n2 );
					System.out.print(" es mayor que ");
					System.out.println(n3);
					
				}else{
					System.out.print(n1);
					System.out.print(" Es mayor que ");
					System.out.print(n3);
					System.out.print(" y ");
					System.out.print(n3 );
					System.out.print(" es mayor que ");
					System.out.println(n2);

				}
			}else{
				if (n2>n3) {
					if (n1>n3) {

					System.out.print(n2);
					System.out.print(" Es mayor que ");
					System.out.print(n1);
					System.out.print(" y ");
					System.out.print(n1 );
					System.out.print(" es mayor que ");
					System.out.println(n3);
						
					}else{
					System.out.print(n2);
					System.out.print(" Es mayor que ");
					System.out.print(n3);
					System.out.print(" y ");
					System.out.print(n3 );
					System.out.print(" es mayor que ");
					System.out.println(n1);
					}
					
				}else{
					System.out.print(n3);
					System.out.print(" Es mayor que ");
					System.out.print(n2);
					System.out.print(" y ");
					System.out.print(n2 );
					System.out.print(" es mayor que ");
					System.out.println(n1);

			}
		}
	}
}
*/
/*
//Ejercicio 6 - Pide un número y dice si es menor o mayor que 0
		public class Ejercicio4{

			public static void main(String args[]) {
				int n;

				Scanner	sc = new Scanner(System.in);
				System.out.println("Introduce un número");
				n = sc.nextInt();

					if (n > 0) {
						System.out.println("El número es mayor que 0");
					}else{
						System.out.println("El número no es mayor que 0");
					}


			}
		}
*/
/*	
//Ejercicio 7 - Pide un número y dice si son pares o impares	
		public class Ejercicio4{

		public static void main(String args[]) {
			int n1;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduce un número");
			n1 = sc.nextInt();

				if (n1%2 == 0) {

					System.out.println("El número es par");
						
				}else{

					System.out.println("El número es impar");
				}
		}
	}
*/
/*
//Ejercicio 8 - Pide un número y muestra divisores
		public class Ejercicio4{

			public static void main(String args[]) {

				int n;
				int m;
				int cont;

				Scanner sc = new Scanner(System.in);
				System.out.println("Introduce un número");
				n = sc.nextInt();
				cont = 1;

					while(cont <= n){

						if (n%cont == 0) {
							
							System.out.print("Divisor: ");
							System.out.println(cont);

						}

						cont = cont + 1;

					}
				
			}
		}
*/
//Ejercicio 12 - Pide un número y muestra la suma de ese número con el anterior hasta que se introduce número 0
/*

		public class Ejercicio4{

			public static void main(String args[]) {

				int n;
				int cont;

					Scanner sc = new Scanner(System.in);
					System.out.println("Introduce un número");
					System.out.print("---> ");
					n = sc.nextInt();
					cont = n;

						while(n != 0){

							System.out.println("Introduce otro número");
							System.out.print("---> ");
							n = sc.nextInt();
							cont = cont + n;
							System.out.print("Suma: ");
							System.out.println(cont);

						}

					System.out.print("El resultado es: ");
					System.out.println(cont);
				
			}
		}
*/
/*
//Ejercicio 21 - Suma de numeros pares e impares hasta 1000
			public class Ejercicio4{

				public static void main(String args[]) {

					int nPar;
					int nImpar;
					int cont;

						nPar = 0;
						cont = 1;
						nImpar = 0;
						System.out.println("La suma de los números impares y pares por separado es:");

							while(cont<=1000){

								if (cont%2 == 0) {

									//System.out.print("Par ");
									//System.out.println(cont);
									nPar = nPar + cont;
									cont = cont + 1;

								}else{

									//System.out.print("Impar ");
									//System.out.println(cont);
									nImpar = nImpar + cont;
									cont = cont + 1;

								}

							}

							System.out.print("Suma Impar: ");
							System.out.println(nImpar);

							System.out.print("Suma: ");
							System.out.println(nPar);
				
				}
			}
*/
/*
//Ejercicio 23 - Pide número 4 cifras y te las muestra una a una
			public class Ejercicio4			{

				public static void main(String args[]) {

					int n;
					int cont;
					int c;

						Scanner sc = new Scanner(System.in);
						System.out.println("Introduce un número de 4 cifras");
						System.out.print("---> ");
						n = sc.nextInt();

							while(n > 0){

								c = n%10;
								System.out.print("Cifra: ");
								System.out.println(c);
								n = n/10;

							}
							
				}
			}
*/
/*
//Ejercicio 24 - Pide un número de varias cifras y te da el número de cifras que tiene
			public class Ejercicio4			{

				public static void main(String args[]) {

					long n;
					long cont;

						Scanner sc = new Scanner(System.in);
						System.out.println("Introduce un número de varias cifras");
						System.out.print("---> ");
						n = sc.nextInt();
						cont = 0;

							while(n > 0){

								n = n/10;
								cont = cont + 1;


							}

						System.out.println("El número introducido tiene "+ cont +" cifras.");
							
				}
			}
*/
/*
//Ejercicio 29 - Pedir un número y decir si es capicúa			
			public class Ejercicio4{

				public static void main(String args[]) {

					int n;
					int i;

						Scanner sc = new Scanner(System.in);
						System.out.println("Introduce un número de varias cifras.");
						System.out.print("---> ");
						n = sc.nextInt();
						i = n;

							while(n < 0){

								n = n/10;
								i = i*10+(n%10);

							}

						if (n == i) {

							System.out.println("El número "+ n +" es capicúa.");
							
						}else{

							System.out.println("El número "+ n +" no es capicúa.");

						}
				
				}
			}
*/
/*
			public class Ejercicio4{

				public static void main(String args[]) {

					int n1;
					int cont;
					int g;

						Scanner sc = new Scanner(System.in);
						System.out.println("Introduce un número.");
						System.out.print("---> ");
						n1 = sc.nextInt();
						cont = 0;
						g = n1;

						while(n1 != -1){
							System.out.println("Introduce otro número.");
							System.out.print("---> ");
							n1 = sc.nextInt();
								if (n1 > g) {

									g = n1;
									
								}

						}

						System.out.println("El número más alto es "+g);

				
				}
			}
*/