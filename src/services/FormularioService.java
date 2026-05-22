package services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FormularioService {

    public void lerFormulario(){
        String path = "G:\\Arquivos\\Guilherme\\Projetos\\Cadastro de Pet\\src\\formulario.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();

            while (line!=null){
                System.out.println(line);
                line = br.readLine();
            }
        }catch(IOException e){
            e.getMessage();
        }
    }

}
