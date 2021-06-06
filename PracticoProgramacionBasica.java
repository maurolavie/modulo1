import java.util.InputMismatchException;
import java.util.Scanner;

public class PracticoProgramacionBasica {

	// Variable global para ejercicios 11 y 12
	static int[] ultimos5ejercicios = new int[5];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Uso varios Scanner porque sino da error al usar el menú
		Scanner sn = new Scanner(System.in);
		Scanner entradaNro = new Scanner(System.in);
		Scanner entradaLinea = new Scanner(System.in);
		
		boolean salir = false;
		int opcion;
		
		while(!salir) {
			System.out.println("1. Un programa que recibe el sexo de una persona como un char y retorne true si el sexo de la persona es femenino (F) o  masculino (M) o false en cualquier otro caso.");
			System.out.println("2. Un programa que retorne true si la suma de la cantidad de los números en las posiciones“2” “3” y “4” de un arreglo de enteros es par, de lo contrario retorna false.");
			System.out.println("3. Un programa que retorne true si un arreglo de enteros contiene al menos un número par,de lo contrario retorna false.");
			System.out.println("4. Un programa que retorne true si dos palabras son iguales entre sí, de lo contrario retorna false.");
			System.out.println("5. Un programa que retorne true si un entero es capicúa (ej: 12321), de lo contrario retorna false.");
			System.out.println("6. Un programa que retorne true si el número a es menor que b, de lo contrario retorna false.");
			System.out.println("7. Un programa que retorne true si la multiplicación del número a con el número b es igual a la división del número a con el número b.");
			System.out.println("8. Un programa que retorne true si un arreglo de enteros A contiene al menos dos números que también contenga el arreglo de enteros B.");
			System.out.println("9. Un programa que retorne la palabra que recibe pero al revés. (ej: hola, retorno = aloh).");
			System.out.println("10. Un programa que retorne la palabra que recibe cambiando todas sus vocales por x. (Ej:azul, retorno: xzxl).");
			System.out.println("11. Implementar la opción de imprimir en pantalla los últimos 5 ejercicios ejecutados.");
			System.out.println("12. Salir.");
			
			try {
			
				System.out.println("Introduce un número del menú: ");
				opcion = sn.nextInt();
			
				switch(opcion) {
					case 1:
						System.out.println("Introduce M para masculino, F para femenino o cualquier otra letra: ");
						char sexo = entradaLinea.nextLine().charAt(0);				
						System.out.println("El resultado es: " + ejercicio1(sexo));
						ejercicio11(1);
						System.out.println("Presiona enter para continuar.");
						entradaLinea.nextLine();
						break;
					case 2:
						System.out.println("Introduce números hasta completar el arreglo primitivo. Con un arreglo de 5 números es suficiente para este ejercicio. Si la suma de la cantidad de los números en las posiciones“2” “3” y “4” es par retorna true, de lo contrario retorna false.");
						int[] numeros = new int[5];
						for (int i=0; i<5; i++) { 
							System.out.println("Introduce el siguiente número.");
							numeros[i] = entradaNro.nextInt();
						} 
						System.out.println("El resultado es: " + ejercicio2(numeros));
						ejercicio11(2);
						System.out.println("Presiona cero para continuar.");
						entradaNro.nextInt();
						break;
					case 3:
						System.out.println("Introduce un número entero que sera el tamaño del arreglo. Prueba con arreglos pequeños como consejo, aunque funcionara de todas formas con arreglos de muchos números enteros.");
						int num = entradaNro.nextInt();
						int[] numeros2 = new int[num+1];
						for (int i=0; i<numeros2.length-1; i++) { 
							System.out.println("Introduce el siguiente número entero hasta llenar el arreglo. Recuerda que tu elegiste el tamaño.");
							numeros2[i] = entradaNro.nextInt();
						}
						System.out.println("El resultado es: " + ejercicio3(numeros2));
						ejercicio11(3);
						System.out.println("Presiona cero para continuar.");
						entradaNro.nextInt();
						break;
					case 4:
						System.out.println("Introduce la primera palabra: ");
						String palabra1 = entradaLinea.nextLine();
						System.out.println("Introduce la segunda palabra: ");
						String palabra2 = entradaLinea.nextLine();
						System.out.println("Si las palabras son iguales retornara true de lo contrario false: ");
						System.out.println("El resultado es: " + ejercicio4(palabra1,palabra2));
						ejercicio11(4);
						System.out.println("Presiona enter para continuar.");
						entradaLinea.nextLine();
						break;
					case 5:
						System.out.println("Introduce un número entero, si es capicúa retornara true de lo contrario false.");
						int numCapicua = entradaNro.nextInt();
						System.out.println("El resultado es: " + ejercicio5(numCapicua));
						ejercicio11(5);
						System.out.println("Presiona cero para continuar.");
						entradaNro.nextInt();
						break;
					case 6:
						System.out.println("Introduce un número entero a para comparar con un entero b. Si a < b retornara true sino false.");
						int a = entradaNro.nextInt();
						System.out.println("Introduce un número entero b para comparar.");
						int b = entradaNro.nextInt();
						System.out.println("El resultado es: " + ejercicio6(a,b));
						ejercicio11(6);
						System.out.println("Presiona cero para continuar.");
						entradaNro.nextInt();
						break;
					case 7:
						System.out.println("Introduce un número entero a para multiplicar y dividir con un entero b.");
						int a2 = entradaNro.nextInt();
						System.out.println("Introduce un número entero b.");
						int b2 = entradaNro.nextInt();
						System.out.println("Si la multiplicación entre a y b es igual a la división entre a y b el resultado sera true, caso contrario false.");
						System.out.println("El resultado es: " + ejercicio7(a2,b2));
						ejercicio11(7);
						System.out.println("Presiona cero para continuar.");
						entradaNro.nextInt();
						break;
					case 8:
						System.out.println("Introduce un número entero que sera el tamaño del arreglo de enteros A.");
						int num2 = entradaNro.nextInt();
						int[] A = new int[num2+1];
						for (int i=0; i<A.length-1; i++) { 
							System.out.println("Introduce el siguiente número entero hasta llenar el arreglo A. Recuerda que tu elegiste el tamaño.");
							A[i] = entradaNro.nextInt();
						}
						
						System.out.println("Introduce un número entero que sera el tamaño del arreglo de enteros B.");
						int num3 = entradaNro.nextInt();
						int[] B = new int[num3+1];
						for (int i=0; i<B.length-1; i++) { 
							System.out.println("Introduce el siguiente número entero hasta llenar el arreglo B. Recuerda que tu elegiste el tamaño.");
							B[i] = entradaNro.nextInt();
						}
						System.out.println("Retornara true si el arreglo de enteros A contiene al menos dos números que también contenga el arreglo de enteros B.");
						System.out.println("El resultado es: " + ejercicio8(A,B));
						ejercicio11(8);
						System.out.println("Presiona cero para continuar.");
						entradaNro.nextInt();
						break;
					case 9:
						System.out.println("Introduce una palabra para obtener como resultado la palabra invertida: ");
						String palabra = entradaLinea.nextLine();				
						System.out.println("El resultado es: " + ejercicio9(palabra));
						ejercicio11(9);
						System.out.println("Presiona enter para continuar.");
						entradaLinea.nextLine();
						break;
					case 10:
						System.out.println("Introduce una palabra para cambiar todas sus vocales por x: ");
						String palabraX = entradaLinea.nextLine();				
						System.out.println("El resultado es: " + ejercicio10(palabraX));
						ejercicio11(10);
						System.out.println("Presiona enter para continuar.");
						entradaLinea.nextLine();
						break;
					case 11:
						System.out.println("El número 0 ocupa espacios por defecto en el arreglo de enteros, variable global. Luego se va reemplazando por números de ejercicios. Siempre se guarda los últimos 5 ejercicios ejecutados.");
						ejercicio12();
						System.out.println("Presiona enter para continuar.");
						entradaLinea.nextLine();
						break;
					case 12:
						salir=true;
						sn.close();
						entradaLinea.close();
						entradaNro.close();
						break;
					default:
						System.out.println("Las opciones son entre 1 y 12.");
				}
			
			}catch(InputMismatchException e) {
				System.out.println("Debes introducir un número.");
				sn.next();
			}
			
		}
		
		System.out.println("Fin del menú.");
	}
	
	public static boolean ejercicio1(char sexo) {
		if(sexo == 'M' || sexo == 'F')  {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean ejercicio2(int[] numeros) {
		
		int suma = numeros[2] + numeros[3] + numeros[4];
		if(suma % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean ejercicio3(int[] numeros) {
		boolean salir = false;
		int i=0;
		
		do {
			if(numeros[i] % 2 == 0) {
				return true;
			}
			i++;
			if (i == numeros.length-1) {
				salir = true;
			}
		} while (!salir);

		return false;
	}
	
	public static boolean ejercicio4(String palabra1, String palabra2) {
		if (palabra1.equals(palabra2)) {
			return true;	
		} else {
			return false;
		}
	}
	
	public static boolean ejercicio5(int numero) {
		String palabra = String.valueOf(numero);
		
		for (int i = 0, j = palabra.length() - 1; i <= j; i++, j--) {
			if(palabra.charAt(i) != palabra.charAt(j)) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean ejercicio6(int a, int b) {
		if(a < b) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean ejercicio7(int a, int b) {
		if(a*b == a/b) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean ejercicio8(int[] A, int[] B) {
		int contiene = 0;
		for (int i=0; i<A.length-1; i++) {
			for (int j=0; j<B.length-1; j++) {
				if(B[j] == A[i]) {
					contiene++;
					if(contiene >= 2) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public static String ejercicio9(String palabra) {
		String palabraInvertida = "";
		for(int i=palabra.length()-1;i>=0;i--) {
			palabraInvertida = palabraInvertida + palabra.charAt(i);
		}
		return palabraInvertida;
	}
	
	public static String ejercicio10(String palabra) {
		palabra = palabra.replace('a', 'x').replace('e', 'x').replace('i', 'x').replace('o', 'x').replace('u', 'x');
		return palabra;
	}
	
	public static void ejercicio11(int numEjer) {
		for (int j=0; j < ultimos5ejercicios.length-1; j++) {
			ultimos5ejercicios[j] = ultimos5ejercicios[j + 1];
			if(j == ultimos5ejercicios.length-2) {
				ultimos5ejercicios[ultimos5ejercicios.length-1] = numEjer;
			}
		}	
	}
	
	public static void ejercicio12() {
		for (int k=0; k < ultimos5ejercicios.length; k++) {
			System.out.println("últimos 5 ejercicios ejecutados: " + ultimos5ejercicios[k]);	
		}
	}
}
