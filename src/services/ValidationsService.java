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
}
