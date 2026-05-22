import exceptions.MenuOptionException;
import services.FormularioService;
import services.OptionsValidation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        FormularioService formularioService = new FormularioService();
        OptionsValidation opValidation = new OptionsValidation();

        int option = 0;

        do {
            menu();
            System.out.print("\nEscolha uma opção: ");
            try {

                String input = sc.nextLine();
                opValidation.validateInputType(input);

                option = Integer.parseInt(input);
                opValidation.optionMenuValidation(option);

                switch (option) {
                    case 1:
                        formularioService.lerFormulario();
                        break;
                    case 6:
                        System.out.println("Saindo...");
                        break;
                }
            }catch (NumberFormatException e){
                System.out.println( e.getMessage());
            } catch (MenuOptionException e) {
                System.out.println(e.getMessage());
            }

        } while (option != 6);

        sc.close();
    }

    public static void menu() {
        System.out.println("");
        System.out.println("-----------MENU PRINCIPAL------------");
        System.out.println("1-Cadastrar um novo pet");
        System.out.println("2-Alterar os dados do pet cadastrado");
        System.out.println("3-Deletar um pet cadastrado");
        System.out.println("4-Listar todos os pets cadastrados");
        System.out.println("5-Listar pets por algum critério (idade, nome, raça)");
        System.out.println("6-Sair");
    }

}