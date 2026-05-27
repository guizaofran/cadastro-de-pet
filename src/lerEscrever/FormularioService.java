package lerEscrever;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FormularioService {

    public List<String> lerFormulario(){
        String path = "src/formulario.txt";

        List<String> perguntas = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while (line != null) {

                if(!line.trim().isEmpty()){
                    perguntas.add(line);
                }
                line = br.readLine();
            }
        }catch(IOException e){
            e.getMessage();
        }
        return perguntas;
    }
}