package lerEscrever;

import entities.Pet;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SalvarPetService {
    public void cadastrarArquivoPet(Pet pet) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmm");
        String dataHora = LocalDateTime.now().format(formatter);

        String nomePet = pet.getNome().toUpperCase().replace(" ","");

        String nomeDoArquivo = dataHora + "-" + nomePet;
        String path = "src/petsCadastrados/" + nomeDoArquivo + ".TXT";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            bw.write(pet.toString());
        } catch (IOException e) {
            e.getMessage();
        }
    }
}

