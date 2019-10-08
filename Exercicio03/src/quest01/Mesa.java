package quest01;

public class Mesa extends Plastico {

	private int qtdeCadeiras;
	private String cor;

	public int getQtdeCadeiras() {
		return qtdeCadeiras;
	}

	public void setQtdeCadeiras(int qtdeCadeiras) {
		this.qtdeCadeiras = qtdeCadeiras;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "Mesa [" + "Qnt Cadeiras:" + qtdeCadeiras + "Cor:" + cor + "]";
	}

	@Override
	public void aumentarPreco(float percentual) {
		percentual = 0.5f;
		System.out.println("O preço é de: R$ " + this.getPrecoVenda() * percentual);
	}


}
