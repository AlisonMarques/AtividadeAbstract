package quest01;

public class ArmarioBanheiro extends Plastico{

	private boolean comVidro;


	public boolean isComVidro() {
		return comVidro;
	}

	public void setComVidro(boolean comVidro) {
		this.comVidro = comVidro;
	}

	@Override
	public String toString() {
		return "Armario/Banheiro [" + "Com vidro:" + this.isComVidro();
	}

	@Override
	public void aumentarPreco(float percentual) {
		if(comVidro = true) {
			percentual = 2.5f;
			System.out.println("O preço com vidro é de: R$ " + this.getPrecoVenda() * percentual);
		}
		if(comVidro = false) {
			percentual= 1.5f;
			System.out.println("O preço sem vidro é de: R$ " + this.getPrecoVenda() * percentual);
		}
	}

}
