package services;

import exceptions.ValidationException;

import java.util.Scanner;

public class ValidarPergunta {
    ValidationsService validationsService = new ValidationsService();
    public static final String NAO_INFORMADO = "NÃO INFORMADO";

    public String validarNome(String pergunta, Scanner sc) {
        while (true) {
            System.out.println(pergunta);
            String nome = sc.nextLine();
            try {
                validationsService.nomeValidation(nome);
                return nome;
            } catch (ValidationException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public String validarTipo(String pergunta, Scanner sc){
        while(true){
            System.out.println(pergunta);
            String tipo= sc.nextLine();
            try{
                validationsService.tipoValidation(tipo);
                return tipo;
            }catch (ValidationException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public String validarSexo(String pergunta, Scanner sc){
        while(true){
            System.out.println(pergunta);
            String sexo= sc.nextLine();
            try{
                validationsService.sexoValidation(sexo);
                return sexo;
            }catch (ValidationException e){
                System.out.println(e.getMessage());
            }
        }
    }
    public String validarCidade(String pergunta, Scanner sc) {
        System.out.println(pergunta);
        System.out.println("Cidade: ");
        String cidade = sc.nextLine();
        if (cidade == null || cidade.isBlank()) {
            return NAO_INFORMADO;
        } else {
            return cidade;
        }
    }

    public String validarRua(Scanner sc) {
        System.out.println("Rua: ");
        String rua = sc.nextLine();
        if(rua == null || rua.isBlank()){
            return NAO_INFORMADO;
        }else{
            return rua;
        }

    }

    public String validarNumero(Scanner sc) {
        System.out.println("Número: ");
        String numero = sc.nextLine();
        if(numero == null || numero.isBlank()){
            return NAO_INFORMADO;
        }else{
            return numero;
        }
    }
}



