package sumamvc.model;

public class modelo {

	private int num1 = 0;
	private int num2 = 0;
	private int resultado = 0;

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getResultado() {
		return resultado;
	}

	public void sumar() {
		this.resultado = this.num1 + this.num2;
	}

	

}
