package quest01;

public abstract class Metal extends Movel {

	private float espessura;
	private String cor;

	public float getEspessura() {
		return espessura;
	}

	public void setEspessura(float espessura) {
		this.espessura = espessura;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void pintar(int numMaos) {
		System.out.println("Passando duas mãos de tinta");
	}
}
