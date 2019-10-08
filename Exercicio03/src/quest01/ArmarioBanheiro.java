package quest01;

public class ArmarioBanheiro extends Plastico {

	private boolean comVidro;

	public boolean isComVidro() {
		return comVidro;
	}

	public void setComVidro(boolean comVidro) {
		this.comVidro = comVidro;
	}

	@Override
	public void aumentarPreco(float percentual) {

		if (comVidro) {

			percentual = 2.5f;
			System.out.println("O preço com vidro é de: R$ " + this.getPrecoVenda() * percentual);

		} else {

			percentual = 1.5f;
			System.out.println("O preço sem vidro é de: R$ " + this.getPrecoVenda() * percentual);
		}
	}

	@Override
	public String toString() {
		return "ArmarioBanheiro [comVidro=" + comVidro + ", getQualidade()=" + getQualidade() + ", getMaterial()="
				+ getMaterial() + ", getDescricao()=" + getDescricao() + ", getCusto()=" + getCusto()
				+ ", getPrecoVenda()=" + getPrecoVenda() + "]";
	}
}