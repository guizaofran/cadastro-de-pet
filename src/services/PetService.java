package services;

import entities.Pet;
import entities.PetEndereco;
import entities.entitiesEnums.PetSexoEnum;
import entities.entitiesEnums.PetTipoEnum;
import exceptions.ValidationException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PetService {
    private List<Pet> pets = new ArrayList<>();

    ValidarPergunta validarPergunta = new ValidarPergunta();




    public void cadastroPet(List<String> perguntas, Scanner sc) {

        String nome = validarPergunta.validarNome(perguntas.get(0), sc);

        String tipo = validarPergunta.validarTipo(perguntas.get(1),sc);

        String sexo = validarPergunta.validarSexo(perguntas.get(2),sc);

        String cidade = validarPergunta.validarCidade(perguntas.get(3),sc);
        String rua = validarPergunta.validarRua(sc);
        String numero = validarPergunta.validarNumero(sc);

        System.out.println(perguntas.get(4));
        double idade = Double.parseDouble(sc.nextLine());

        System.out.println(perguntas.get(5));
        double peso = Double.parseDouble(sc.nextLine());

        System.out.println(perguntas.get(6));
        String raca = sc.nextLine();

        Pet pet = new Pet(nome,
                PetTipoEnum.valueOf(tipo.toUpperCase()), PetSexoEnum.valueOf(sexo.toUpperCase()),
                new PetEndereco(rua, numero, cidade), idade, peso, raca);


        pets.add(pet);
        System.out.println("Pet cadastrado com sucesso");
        System.out.println(pet);


    }

}
