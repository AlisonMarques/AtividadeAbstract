package quest01;

public class GuardaRoupa extends Madeira {

	private int numPortas;
	private float largura;
	private float altura;

	public int getNumPortas() {
		return this.numPortas;
	}

	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}

	public float getLargura() {
		return this.largura;
	}

	public void setLargura(float largura) {
		this.largura = largura;
	}

	public float getAltura() {
		return this.altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	@Override
	public void aumentarPreco(float percentual) {
		percentual = 1.5f;
		System.out.println("O valor aumentou para: R$ " + this.getPrecoVenda() * percentual);

	}

	@Override
	public String toString() {
		return "GuardaRoupa [numPortas=" + numPortas + ", largura=" + largura + ", altura=" + altura
				+ ", getTipoMadeira()=" + getTipoMadeira() + ", getMaterial()=" + getMaterial() + ", getDescricao()="
				+ getDescricao() + ", getCusto()=" + getCusto() + ", getPrecoVenda()=" + getPrecoVenda() + "]";
	}
}