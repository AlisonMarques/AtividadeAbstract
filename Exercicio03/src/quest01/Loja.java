package quest01;

import java.util.Scanner;
import java.util.ArrayList;

public class Loja {

	private static ArrayList <Movel> listaMovel = new ArrayList<Movel>();
	private static Scanner leia = new Scanner(System.in);
	private static int op = -1;

	public static void main(String[] args) {
		boolean sair = true;


		do {
			System.out.println("===========================================================================");
			System.out.println("                     L O J A  D E  M O V E I S");
			System.out.println("===========================================================================");
			System.out.println("[1] - Inserir");
			System.out.println("[2] - Listar");
			System.out.println("[3] - Sair");
			System.out.println("===========================================================================");
			System.out.println("Digite a op��o:");
			op = leia.nextInt();

			switch(op) {
			case 1: 
				inserirMovel();
				break;
			case 2:
				listarMoveis();
				break;
			case 3:
				sair = false;
				break;
			default:
				System.out.println("Op��o invalida");
			}

		}while(sair);

		System.out.println("Saindo...");

	}

	private static void inserirMovel() {
		// TODO Auto-generated method stub
		System.out.println("===============================Compra de m�veis=======================");
		System.out.println("Informe o material do m�vel (Madeira, Metal ou Pl�stico): ");
		String material = leia.next();
		System.out.println("Informe o m�vel que deseja: ");
		String movel = leia.next();
	}

	private static void listarMoveis() {





	}
}
