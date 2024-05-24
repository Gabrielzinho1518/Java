package pacote;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashSet;

public class HashString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> listaNomes = new ArrayList<>();
        HashSet<String> hashNomes = new HashSet<>();

        String nome;

        for(int i = 0; i < 3; i++){
            System.out.println("Digite um nome: ");
            nome = sc.nextLine();

            if(!hashNomes.add(nome)){
                System.out.println("Nome ja foi cadastrado!!!");
            }
        }

        listaNomes.addAll(hashNomes);

        StringBuilder resultado = new StringBuilder();

        for(int i = 0; i < listaNomes.size(); i++){
            resultado.append(listaNomes.get(i)).append(". Armazenado na posicao ") .append(i) .append("\n");
        }

        System.out.println(resultado.toString());

        sc.close();
    }
}
