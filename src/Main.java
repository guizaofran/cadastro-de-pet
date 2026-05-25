import exceptions.MenuOptionException;
import services.FormularioService;
import services.OptionsService;
import services.PetService;

import java.util.List;
import java.util.Scanner;

import static menus.MenuPrincipal.menu;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        FormularioService formularioService = new FormularioService();
        OptionsService validacao = new OptionsService();
        PetService petService = new PetService();

        int option = 0;

        do {
            menu();
            System.out.print("\nEscolha uma opção: ");
            try {

                String input = sc.nextLine();
                validacao.validateInputType(input);

                option = Integer.parseInt(input);
                validacao.optionMenuValidation(option);

                switch (option) {
                    case 1:
                       List<String> perguntas = formularioService.lerFormulario();
                       petService.cadastroPet(perguntas, sc);
                        break;
                    case 6:
                        System.out.println("Saindo...");
                        break;
                }
            } catch (MenuOptionException e) {
                System.out.println(e.getMessage());
            }

        } while (option != 6);

        sc.close();
    }



}