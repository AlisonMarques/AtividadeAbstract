package quest01;

import java.util.ArrayList;
import java.util.Scanner;

public class Loja {

	private static int opcaoMenu = -1;
	private static Scanner leia = new Scanner(System.in);
	private static ArrayList <Movel> moveis = new ArrayList<Movel>();

	public static void main(String[] args) {

		boolean continuaAplicacao = true;

		do {

			System.out.println("=========================================================================== ");
			System.out.println("                     L O J A    D E    M O V E I S");
			System.out.println("=========================================================================== ");
			System.out.println("\n");
			System.out.println("[1] - I N S E R I R															");
			System.out.println("\n");
			System.out.println("[2] - L I S T A R															");
			System.out.println("\n");
			System.out.println("[3] - S A I R 																");
			System.out.println("\n");
			System.out.println("===========================================================================	");
			System.out.println("D I G I T E    U M A    O P Ç Ã O:");
			opcaoMenu = leia.nextInt();

			switch(opcaoMenu) {

				case 1:

					inserirMovel();
					break;

				case 2:

					listarMoveis();
					break;

				case 3:

					System.out.println("===========================================================================");
					System.out.println("                     S A I N D O   D A   A P L I C A Ç Ã O 				   ");
					System.out.println("===========================================================================");

					continuaAplicacao = false;

					break;

				default:
					System.out.println("Opção invalida");
			}

		} while(continuaAplicacao);
	}

	private static void inserirMovel() {

		menuTipoMaterial();

		int material = leia.nextInt();

		do {

			System.out.println("===========================================================================");
			System.out.println("                      O P Ç Ã O    I N V Á L I D A   					   ");
			System.out.println("===========================================================================");
			System.out.println("\n\n\n");

		} while(material == 0 || material > 4);

		int tipoMovelPorMaterial = -1;

		switch (material) {

			case 1:

				menuComMateriaisDoTipoMadeira();
				tipoMovelPorMaterial = leia.nextInt();

				break;

			case 2:

				menuComMateriaisDoTipoPlastico();
				tipoMovelPorMaterial = leia.nextInt();

				break;

			case 3:

				menuComMateriaisDoTipoPlastico();
				tipoMovelPorMaterial= leia.nextInt();

				break;
		}
	}

	private static void listarMoveis() {

		moveis.forEach(System.out::println);
	}

	private static void menuTipoMaterial() {

		System.out.println("=========================================================================== ");
		System.out.println("                      C O M P R A    D E    M Ó V E I S	 				    ");
		System.out.println("=========================================================================== ");
		System.out.println("																			");
		System.out.println("																			");
		System.out.println("																			");
		System.out.println(" I N F O R M E    O    M A T E R I A L     D O     M Ó V E L: 				");
		System.out.println("																			");
		System.out.println(" 1.  M A D E I R A															");
		System.out.println("																			");
		System.out.println(" 2.  M E T A L																");
		System.out.println("																			");
		System.out.println(" 3.  P L Á S T I C O														");

	}

	private static void menuComMateriaisDoTipoMadeira() {

		System.out.println("=========================================================================== ");
		System.out.println("              M E N U     M Ó V E I S    D E    M A D E I R A	 			");
		System.out.println("=========================================================================== ");
		System.out.println("\n																			");
		System.out.println(" 1.     C A M A																");
		System.out.println("\n																			");
		System.out.println(" 2.     G U A R D A    R O U P A											");
	}

	private static void menuComMateriaisDoTipoMetal() {

		System.out.println("=========================================================================== ");
		System.out.println("             M E N U      M Ó V E I S    D E    M E T A L		 			");
		System.out.println("=========================================================================== ");
		System.out.println("\n																			");
		System.out.println(" 1.     E S T A N T E 														");
		System.out.println("\n");
	}

	private static void menuComMateriaisDoTipoPlastico() {

		System.out.println("=========================================================================== ");
		System.out.println("             M E N U      M Ó V E I S    D E    P L Á S T I C O	 			");
		System.out.println("=========================================================================== ");
		System.out.println("\n																			");
		System.out.println(" 1.     A R M Á R I O 	 B A N H E I R O									");
		System.out.println("\n																			");
		System.out.println(" 2.     M E S A																");
	}
	
	private static void gravarMovelComMaterialDeMadeira() {
		
	}

	private static void gravarMovelComMaterialDeMetal() {
		
	}

	private static void gravarMovelComMaterialDePlastico() {
		
	}
}