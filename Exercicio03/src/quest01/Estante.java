package quest01;

public class Estante extends Metal {

	private float altura;
	private float largura;

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getLargura() {
		return largura;
	}

	public void setLargura(float largura) {
		this.largura = largura;
	}

	@Override
	public void aumentarPreco(float percentual) {

		percentual = 2.0f;
		System.out.println("Teve o aumento de preço de 2% pela quantidade de mãos de tinta que foi 3" + this.getPrecoVenda() * percentual);
	}

	@Override
	public String toString() {
		return "Estante [altura=" + altura + ", largura=" + largura + ", getEspessura()=" + getEspessura()
				+ ", getCor()=" + getCor() + ", getMaterial()=" + getMaterial() + ", getDescricao()=" + getDescricao()
				+ ", getCusto()=" + getCusto() + ", getPrecoVenda()=" + getPrecoVenda() + "]";
	}
}