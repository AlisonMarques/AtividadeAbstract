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
	public String toString() {
		return "[ Cama:" + this.isCasal()  + "]";
	}

	@Override
	public void aumentarPreco(float percentual) {
		if(casal == true) {
			percentual = 1.5f;
			System.out.println("O preço da cama de casal é de: R$" + this.getPrecoVenda() * percentual);
		}
		if(casal == false) {
			percentual = 1.0f;
			System.out.println("O preço da cama de solteiro é de: R$ " + this.getPrecoVenda() * percentual);
		}
	}

}
