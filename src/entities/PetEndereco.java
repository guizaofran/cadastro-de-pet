package entities;

public class PetEndereco {
    private String cidade;
    private String rua;
    private Integer numero;

    public PetEndereco(String rua, Integer numero,String cidade) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
    }

    public PetEndereco(){

    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}
