/**
 * 
 */
package tratardatos;

import java.util.Scanner;
import java.util.Random;

/**
 * @author Francisco
 *
 */
public class HundirLaFLota {

	// Constantes que nos sirven para representar algunos valores
	final static char AGUA_NO_TOCADO = '.';
	final static char AGUA = 'A';
	final static char TOCADO = 'X';
	
	// Tamaño del tablero
	final static int SIZE = 10;
	
	private static Scanner sc;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// La clase scanner nos permite leer desde teclado
		sc = new Scanner(System.in);
		
		System.out.println("Hola");
		
		// Mapas del juego
		char[][] mapaUsuario = new char[SIZE][SIZE];
		char[][] mapaOrdenador = new char[SIZE][SIZE];
		
		// Mapa para comprobar nuestras tiradas
		char[][] mapaParaUsuario= new char[SIZE][SIZE];
		
		// Puntos
		int puntosUsuario = 24;
		int puntosOrdenador = 24;
		
		// Juego terminado
		boolean juegoTerminado = false;
		
		// Tiro correcto
		boolean tiroCorrecto = false;
		
		// Posiciones de la tirada
		int[] tiro = new int[2];
		
		// Inicializamos los pamas
		inicializacion(mapaUsuario, mapaOrdenador);
		inicializaMapaRegistro(mapaParaUsuario);
		
		while(!juegoTerminado) {
			System.out.println("MAPA DEL USUARIO");
			imprimirMapa(mapaUsuario);
			
			System.out.printf("Puntos restantes del jugador: %d\n", puntosUsuario);
			System.out.println("TURNO DEL USUARIO");
			tiroCorrecto = false;
			while(!tiroCorrecto) {
				tiro = pedirCasilla();
				if(tiro[0] != -1 && tiro[1] != -1) {
					tiroCorrecto = evaluarTiro(mapaOrdenador, tiro);
					if(!tiroCorrecto) {
						System.out.println("TIRO INCORRECTO");
					}
				} else {
					System.out.println("TIRO INCORRECTO");
				}
				
			}
			
			// Actualizamos el mapa
			int puntosOrdenadorAnterior = puntosOrdenador;
			puntosOrdenador = actualizarMapa(mapaOrdenador, tiro, puntosOrdenador);
			
			// Actualizamos nuestro mapa
			char tipoTiro = ((puntosOrdenadorAnterior - puntosOrdenador) > 0 ? TOCADO : AGUA);
			actualizarMapaRegistro(mapaParaUsuario, tiro, tipoTiro);
			System.out.println("MAPA DEL ORDENADOR");
			imprimirMapa(mapaParaUsuario);
			
			// Comprobamos si ha ganado el jugarod
			juegoTerminado = (puntosOrdenador == 0);
			
			if(!juegoTerminado) {
				System.out.printf("Puntos restantes del ordenador: %d\n", puntosOrdenador);
				System.out.println("TURNO DEL ORDENADOR");
				tiroCorrecto = false;
				while(!tiroCorrecto) {
					tiro = generaDisparoAleatorio();
					tiroCorrecto = evaluarTiro(mapaUsuario, tiro);
				}
			}
			
			// Actualizamos el mapa del Usuario
			puntosUsuario = actualizarMapa(mapaUsuario, tiro, puntosUsuario);
			juegoTerminado = (puntosUsuario == 0);
			
		} // Fin de la partida
		
		if(puntosOrdenador == 0) {
			System.out.println("Ha ganado el usuario");
		} else {
			System.out.println("Ha ganado el ordenador");
		}
		
		sc.close();

	}
	
	private static int[] generaDisparoAleatorio() {
		return new int[] {aleatorio(), aleatorio()};
	}
	
	public static void inicializacion(char[][] m1, char[][] m2) {
		inicializarMapa(m1);
		inicializarMapa(m2);
	}
	
	public static void inicializaMapaRegistro(char[][] mapa) {
		for(int i = 0; i < mapa.length; i++) {
			for(int j = 0; j < mapa[i].length; j++) {
				mapa[i][j] = AGUA_NO_TOCADO;
			}	
		}
	}
	
	public static void inicializarMapa(char[][] mapa) {
		inicializaMapaRegistro(mapa);
		
		// 5 (portaaviones), 3 (buques), 1 (lanchas)
		int[] barcos = {5, 5, 3, 3, 3, 1, 1, 1, 1, 1};
		
		// Posible direccion de colocacion del barco
		char[] direccion = {'V', 'H'};
		
		// Para cada barco
		for (int b : barcos) {
			
			boolean colocado = false;
			while(!colocado) {
				int fila = aleatorio();
				int columna = aleatorio();
				int direcc = direccion[aleatorio() % 2];
				// Variable auxiliar para ver si hay otro barco
				boolean otro = false;
				if(direcc == 'V') { // En vertical
					if(fila + b < SIZE) {
						for(int i = fila; (i <= fila + b) && !otro; i++) {
							if(mapa[i][columna] != AGUA_NO_TOCADO) {
								otro = true;
							}
						}
						if(!otro) {
							for(int i = fila; i < fila + b; i++) {
								mapa[i][columna] = Integer.toString(b).charAt(0);
							}
							colocado = true;
						}
					}
				} else { // En horizontal
					if(columna + b < SIZE) {
						otro = false;
						for(int i = columna; (i <= columna + b) && !otro; i++) {
							if(mapa[fila][i] != AGUA_NO_TOCADO) {
								otro = true;
							}
						}
						if(!otro) {
							for(int i = columna; i < columna + b; i++) {
								mapa[fila][i] = Integer.toString(b).charAt(0);
							}
							colocado = true;
						}
					}
				}
			}
		}
		
	}
	
	public static int aleatorio() { 
		Random r = new Random(System.currentTimeMillis());
		return r.nextInt(SIZE);
	}
	
	public static void imprimirMapa(char[][] mapa) {
		System.out.print("\t");
		for (int i = 0; i < SIZE; i++) {
			System.out.print("[" + i + "]\t");
		}
		
		System.out.print("\n");
		for(int i = 0; i < mapa.length; i++) {
			System.out.print("[" + ((char) ('A' + i)) + "]\t");
			for(int j = 0; j < mapa[i].length; j++) {
				System.out.print(mapa[i][j] + "\t");
			}	
			System.out.print("\n");
		}
		
	}
	
	private static int[] pedirCasilla() {
		System.out.println("Introduzca una casilla (Ej. B4): ");
		String linea = sc.nextLine().toUpperCase();
		
		// Comprobamos con regex si ha escrito una coordenada correcta
		if(linea.matches("^[A-J][0-9]$")) {
			char letra = linea.charAt(0);
			int fila = Character.getNumericValue(letra) - Character.getNumericValue('A');
			int columna = Integer.parseInt(linea.substring(1, linea.length()));
			if(fila >= 0 && fila < SIZE && columna >= 0 && columna < SIZE) {
				return new int[] {fila, columna};
			} else {
				return new int[] {-1, -1};				
			}
		}
		
		return new int[] {-1, -1};
	}
	
	public static boolean evaluarTiro(char[][] mapa, int[] t) {
		int fila = t[0];
		int columna = t[1];
		return (mapa[fila][columna] == AGUA_NO_TOCADO || (mapa[fila][columna] > '0' && mapa[fila][columna] < '6'));
	}
	
	private static int actualizarMapa(char[][] mapa, int[] t, int puntos) {
		int fila = t[0];
		
		int columna = t[1];
		
		if(mapa[fila][columna] == AGUA_NO_TOCADO) {
			mapa[fila][columna] = AGUA;
			System.out.println("AGUA");
		} else {
			mapa[fila][columna] = TOCADO;
			System.out.println("BARCO ALCANZADO");
			--puntos;
		}
		
		return puntos;
	}
	
	private static void actualizarMapaRegistro(char[][] mapa, int[] t, char tipoTiro) {
		int fila = t[0];
		int columna = t[1];
		
		mapa[fila][columna] = tipoTiro;
	}
}
