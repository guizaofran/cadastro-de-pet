package services;

import exceptions.MenuOptionException;

public class OptionsService {

    public void optionMenuValidation(int option){
        if(option <= 0 || option>=7){
            throw new MenuOptionException("Opção inválida. Tente novamente!");
        }
    }

    public void validateInputType(String input){
            if (!input.matches("[0-9]+")) {
                throw new NumberFormatException("Digite apenas números!");
            }
    }
}
