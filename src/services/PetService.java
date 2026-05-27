package services;

import entities.Pet;
import entities.PetEndereco;
import entities.entitiesEnums.PetSexoEnum;
import entities.entitiesEnums.PetTipoEnum;
import exceptions.ValidationException;
import lerEscrever.SalvarPetService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PetService {
    private List<Pet> pets = new ArrayList<>();

    SalvarPetService salvarPetService = new SalvarPetService();

    ValidarPergunta validarPergunta = new ValidarPergunta();

    public void cadastroPet(List<String> perguntas, Scanner sc) {

        String nome = validarPergunta.validarNome(perguntas.get(0), sc);

        String tipo = validarPergunta.validarTipo(perguntas.get(1),sc);

        String sexo = validarPergunta.validarSexo(perguntas.get(2),sc);

        String cidade = validarPergunta.validarCidade(perguntas.get(3),sc);
        String rua = validarPergunta.validarRua(sc);
        String numero = validarPergunta.validarNumero(sc);

        String idade = validarPergunta.validarIdade(perguntas.get(4),sc);

        String peso = validarPergunta.validarPeso(perguntas.get(5), sc);

        String raca = validarPergunta.validarRaca(perguntas.get(6),sc);

        Pet pet = new Pet(nome,
                PetTipoEnum.valueOf(tipo.toUpperCase()), PetSexoEnum.valueOf(sexo.toUpperCase()),
                new PetEndereco(cidade,rua,numero), idade, peso, raca);

        pets.add(pet);
        System.out.println("Pet cadastrado com sucesso!\n");
        salvarPetService.cadastrarArquivoPet(pet);
        System.out.println(pet);


    }

}
