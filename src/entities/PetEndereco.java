package entities;

public class PetEndereco {
    private String cidade;
    private String rua;
    private String numero;

    @Override
    public String toString() {
        return "\n"+rua + ", "+ numero + ", "+ cidade;
    }

    public PetEndereco(String cidade, String rua, String numero) {
        this.cidade = cidade;
        this.rua = rua;
        this.numero = numero;
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

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
