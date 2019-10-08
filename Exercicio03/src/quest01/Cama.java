package quest01;

public class Cama extends Madeira {

	private boolean casal;

	public boolean isCasal() {
		return casal;
	}

	public void setCasal(boolean casal) {
		this.casal = casal;
	}

	@Override
	public void aumentarPreco(float percentual) {

		if (casal) {

			percentual = 1.5f;
			System.out.println("O preço da cama de casal é de: R$" + this.getPrecoVenda() * percentual);

		} else {

			percentual = 1.0f;
			System.out.println("O preço da cama de solteiro é de: R$ " + this.getPrecoVenda() * percentual);
		}
	}

	@Override
	public String toString() {
		return "Cama [casal=" + casal + ", getTipoMadeira()=" + getTipoMadeira() + ", getMaterial()=" + getMaterial()
				+ ", getDescricao()=" + getDescricao() + ", getCusto()=" + getCusto() + ", getPrecoVenda()="
				+ getPrecoVenda() + "]";
	}
}