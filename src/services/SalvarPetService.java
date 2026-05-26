package services;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SalvarPetService {
    public void salvarArquivoPet(){

        String path = "src/petsCadastrados";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){

        }catch(IOException e){
            e.getMessage();
        }
    }
}
