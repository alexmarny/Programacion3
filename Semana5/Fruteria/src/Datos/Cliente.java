package Datos;

public class Cliente {

	private int kgManzanas;
	private int kgPeras;

	public Cliente(int kgManzanas, int kgPeras) {
		this.kgManzanas = kgManzanas;
		this.kgPeras = kgPeras;
	}

	public Cliente() {
		this.kgManzanas = 0;
		this.kgPeras = 0;
	}

	public int getKgManzanas() {
		return kgManzanas;
	}

	public int getKgPeras() {
		return kgPeras;
	}

	public int setKgManzanas(int kgManzanas) {
		return this.kgManzanas = kgManzanas;
	}

	public int setKgPeras(int kgPeras) {
		return this.kgPeras = kgPeras;
	}

}


