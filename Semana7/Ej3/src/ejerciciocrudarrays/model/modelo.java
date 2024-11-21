package ejerciciocrudarrays.model;


public class modelo {

	private final int MAX_SIZE = 5;
    private int[] numeros = new int[MAX_SIZE];
	private int numCount = 0;
	@SuppressWarnings("unused")
	private int num;

	public  int getNum(int num) {
	
		return num;
	}

	public void setNum(int num) {
		if(numCount < MAX_SIZE){
			numeros[numCount++] = num;
		} else {
			System.out.println("Array de números está lleno.");
		}
	}

	public int getMAX_SIZE() {
		return MAX_SIZE;
	}

	public int[] getNumeros() {
		return numeros;
	}

	public int getNumCount() {
		return numCount;
	}

	public boolean eliminarNumero(int numAeliminar) {

		boolean encontrado = false;
		for (int i = 0; i < numCount; i++) {
			if (numeros[i] == numAeliminar) {
				for (int j = i; j < numCount - 1; j++) {
					numeros[j] = numeros[j + 1];
				}
				numeros[numCount - 1] = 0;
				numCount--;
				encontrado = true;
				break;
			}
		}
		return encontrado;
	}

	public void cambiarNumero(int i, int nuevoNum) {
		numeros[i] = nuevoNum;
	}

}
