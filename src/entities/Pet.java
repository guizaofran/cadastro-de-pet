package entities;

import entities.entitiesEnums.PetSexoEnum;
import entities.entitiesEnums.PetTipoEnum;

public class Pet {
    private String nome;
    private String idade;
    private String peso;
    private String raca;

    private PetSexoEnum petSexoEnum;
    private PetTipoEnum petTipoEnum;
    private PetEndereco petAddress;

    @Override
    public String toString() {
        return "1 - " + nome +
                "\n2 - " + petTipoEnum +
                "\n3 - " + petSexoEnum +
                "\n4 - " + petAddress +
                "\n5 - " + idade +
                "\n6 - " + peso +
                "\n7 - " + raca;
    }

    public Pet(String nome, PetTipoEnum petTipoEnum, PetSexoEnum petSexoEnum, PetEndereco petAddress, String idade, String peso, String raca) {
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

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
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
