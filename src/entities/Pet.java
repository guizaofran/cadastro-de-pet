package entities;

import entities.entitiesEnums.PetSexoEnum;
import entities.entitiesEnums.PetTipoEnum;

public class Pet {
    private String nome;
    private Double idade;
    private Double peso;
    private String raca;

    private PetSexoEnum petSexoEnum;
    private PetTipoEnum petTipoEnum;
    private PetEndereco petAddress;

    public Pet(String nome, PetTipoEnum petTipoEnum, PetSexoEnum petSexoEnum,PetEndereco petAddress, Double idade, Double peso, String raca) {
        this.nome = nome;
        this.petTipoEnum = petTipoEnum;
        this.petSexoEnum = petSexoEnum;
        this.petAddress = petAddress;
        this.idade = idade;
        this.peso = peso;
        this.raca = raca;
    }

    public Pet(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getIdade() {
        return idade;
    }

    public void setIdade(Double idade) {
        this.idade = idade;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public PetSexoEnum getPetSexoEnum() {
        return petSexoEnum;
    }

    public void setPetSexoEnum(PetSexoEnum petSexoEnum) {
        this.petSexoEnum = petSexoEnum;
    }

    public PetTipoEnum getPetTipoEnum() {
        return petTipoEnum;
    }

    public void setPetTipoEnum(PetTipoEnum petTipoEnum) {
        this.petTipoEnum = petTipoEnum;
    }

    public PetEndereco getPetAddress() {
        return petAddress;
    }

    public void setPetAddress(PetEndereco petAddress) {
        this.petAddress = petAddress;
    }
}
