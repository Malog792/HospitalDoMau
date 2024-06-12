/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filaatendimento;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author mauri
 */
public class TxtClass {
    private File arquivo;
    private List<String> senhas;
    private String primeiraSenha;
    

    public TxtClass(String nomeDoArquivo) {
        String diretorioAtual = System.getProperty("user.dir");
        arquivo = new File(diretorioAtual, nomeDoArquivo);
        senhas = new ArrayList<>();
        if (arquivo.exists()) {
//            lerSenhasDoArquivo();
        }
    }
    public List<String> lerSenhasDoArquivo() {
    try {
        BufferedReader leitor = new BufferedReader(new FileReader(arquivo));
        String linha;
        while ((linha = leitor.readLine()) != null) {
            senhas.add(linha);
        }
        leitor.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
    return senhas;
}


    public void adicionarSenha() {
    try {
        BufferedReader leitor = new BufferedReader(new FileReader(arquivo));
        String linha;
        int ultimoNumero = 0;

        while ((linha = leitor.readLine()) != null) {
            // Extrai o número da senha usando expressão regular
            String numeroStr = linha.replaceAll("[^0-9]", "");
            if (!numeroStr.isEmpty()) {
                int numero = Integer.parseInt(numeroStr);
                ultimoNumero = Math.max(ultimoNumero, numero);
            }
        }
        leitor.close();

        int novoNumero = ultimoNumero + 1;
        String novaSenha = "senha" + novoNumero;

        BufferedWriter escritor = new BufferedWriter(new FileWriter(arquivo, true));
        escritor.write(novaSenha);
        escritor.newLine();
        escritor.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}



    private void salvarSenhasNoArquivo() {
        try {
            BufferedWriter escritor = new BufferedWriter(new FileWriter(arquivo));
            escritor.write(senhas.toString());
            escritor.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public  void removerPrimeiraSenha() {
        try {
            BufferedReader leitor = new BufferedReader(new FileReader(arquivo));
            Queue<String> senhas = new LinkedList<>();

            String linha;
            while ((linha = leitor.readLine()) != null) {
                senhas.add(linha);
            }
            leitor.close();

            if (!senhas.isEmpty()) {
                senhas.poll(); // Remove a primeira senha
            }

            BufferedWriter escritor = new BufferedWriter(new FileWriter(arquivo));
            for (String senha : senhas) {
                escritor.write(senha);
                escritor.newLine();
            }
            escritor.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
       
    }
    
   public String lerPrimeiraSenhaDoArquivo() {
        try {
            BufferedReader leitor = new BufferedReader(new FileReader(arquivo));
            primeiraSenha = leitor.readLine(); // Lê apenas a primeira linha
            leitor.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return primeiraSenha;
       
    }
      public String lerUltimaSenhaDoArquivo() {
    String ultimaSenha = null;
    try {
        BufferedReader leitor = new BufferedReader(new FileReader(arquivo));
        String linha;
        while ((linha = leitor.readLine()) != null) {
            ultimaSenha = linha; // Atualiza a senha a cada linha lida
        }
        leitor.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
    return ultimaSenha;
    }
     
    
    public  void apagaSenha(String txt) {
      
         
           try {
            FileWriter writer = new FileWriter(txt);
            writer.write(""); // Escreve "null" no arquivo
            writer.close();
            System.out.println("Conteúdo do arquivo foi definido como \"null\" com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao definir o conteúdo como \"null\": " + e.getMessage());
        }
    
         
}
}



