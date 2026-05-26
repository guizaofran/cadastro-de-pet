package services;

import entities.entitiesEnums.PetSexoEnum;
import entities.entitiesEnums.PetTipoEnum;
import exceptions.ValidationException;

import java.util.Scanner;

public class ValidationsService {
    public void nomeValidation(String nome){
        if(nome == null || nome.trim().isEmpty()){
            throw new ValidationException("Campo não pode ser vazio");
        }else if(!nome.matches("^[\\p{L}'-]+(\\s[\\p{L}'-]+)+$")){
            throw new ValidationException("Somente nome e sobrenome");
        }
    }

    public void tipoValidation(String tipo) {
            try {
                PetTipoEnum.valueOf(tipo.toUpperCase());
            } catch (IllegalArgumentException e) {
                throw new ValidationException("Tipo inválido. Digite: 'cachorro' ou 'gato'");
            }
    }

    public void sexoValidation(String sexo) {
        try {
            PetSexoEnum.valueOf(sexo.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new ValidationException("Sexo inválido. Digite: 'macho' ou 'femea'");
        }
    }

    public void idadeValidation(Double valor){
       if(valor>20 || valor<=0) {
           throw new ValidationException("Digite uma idade entre 0.1 anos e 20 anos");
       }
    }

    public void pesoValidation(Double valor){
        if(valor<0.5 || valor>60){
            throw new ValidationException("Digite um peso entre 0.5kg e 60kg");
        }
    }

    public void racaValidation(String raca){
        if(!raca.matches("^[a-zA-ZÀ-ÿ\\s]+$")){
            throw new ValidationException("Informe somente letras!");
        }
    }
}
