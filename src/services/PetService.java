package services;

import entities.Pet;
import entities.PetEndereco;
import entities.entitiesEnums.PetSexoEnum;
import entities.entitiesEnums.PetTipoEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PetService {
    private List<Pet> pets = new ArrayList<>();

    public void cadastroPet(List<String> perguntas, Scanner sc) {

        System.out.println(perguntas.get(0));
        String nome = sc.nextLine();

        System.out.println(perguntas.get(1));
        String tipo = sc.nextLine();

        System.out.println(perguntas.get(2));
        String sexo = sc.nextLine();

        System.out.println(perguntas.get(3));
        System.out.print("Cidade: ");
        String cidade = sc.nextLine();
        System.out.print("Rua: ");
        String rua = sc.nextLine();
        System.out.print("Número: ");
        String numero = sc.nextLine();

        System.out.println(perguntas.get(4));
        double idade = Double.parseDouble(sc.nextLine());

        System.out.println(perguntas.get(5));
        double peso = Double.parseDouble(sc.nextLine());

        System.out.println(perguntas.get(6));
        String raca = sc.nextLine();

        Pet pet = new Pet(nome,
                PetTipoEnum.valueOf(tipo.toUpperCase()), PetSexoEnum.valueOf(sexo.toUpperCase()),
                new PetEndereco(rua,Integer.parseInt(numero),cidade),idade,peso,raca);

        pets.add(pet);
        System.out.println("Pet cadastrado com sucesso");
    }

}
