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

    public String validarTipo(String pergunta, Scanner sc) {
        while (true) {
            System.out.println(pergunta);
            String tipo = sc.nextLine();
            try {
                validationsService.tipoValidation(tipo);
                return tipo;
            } catch (ValidationException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public String validarSexo(String pergunta, Scanner sc) {
        while (true) {
            System.out.println(pergunta);
            String sexo = sc.nextLine();
            try {
                validationsService.sexoValidation(sexo);
                return sexo;
            } catch (ValidationException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public String validarCidade(String pergunta, Scanner sc) {
        System.out.println(pergunta);
        System.out.println("Cidade: ");
        String cidade = sc.nextLine();
        if (cidade.isBlank()) {
            return NAO_INFORMADO;
        } else {
            return cidade;
        }
    }

    public String validarRua(Scanner sc) {
        System.out.println("Rua: ");
        String rua = sc.nextLine();
        if (rua.isBlank()) {
            return NAO_INFORMADO;
        } else {
            return rua;
        }

    }

    public String validarNumero(Scanner sc) {
        System.out.println("Número: ");
        String numero = sc.nextLine();
        if (numero.isBlank()) {
            return NAO_INFORMADO;
        } else {
            return numero;
        }
    }

    public String validarIdade(String pergunta, Scanner sc) {
        while (true) {
            System.out.println(pergunta);
            String idade = sc.nextLine();
            try {
                if (idade.isBlank()) {
                    return NAO_INFORMADO;
                } else {
                    Double valor = Double.parseDouble(idade);
                    validationsService.idadeValidation(valor);
                    if (valor < 1) {
                        return String.format("%.0f", valor * 12) + " meses";
                    } else {
                        return idade;
                    }
                }
            } catch (ValidationException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Digite somente somente números!");
            }
        }
    }

    public String validarPeso(String pergunta, Scanner sc) {
        while (true) {
            System.out.println(pergunta);
            String peso = sc.nextLine();
            try {
                if (peso.isBlank()) {
                    return NAO_INFORMADO;
                } else {
                    Double valor = Double.parseDouble(peso);
                    validationsService.pesoValidation(valor);
                    return peso + "kg";
                }
            } catch (ValidationException e) {
                System.out.println(e.getMessage());
            }catch (NumberFormatException e){
                System.out.println("Digite somente somente números!");
            }
        }
    }

    public String validarRaca(String pergunta, Scanner sc){
        while (true) {
            System.out.println(pergunta);
            String raca = sc.nextLine();
            try {
                validationsService.racaValidation(raca);
                return raca;
            } catch (ValidationException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}



