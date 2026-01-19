import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        List<User> usuarios = new ArrayList<>();
        boolean continuar = true;


        do {
            if (continuar) {
                User.contador++;
                System.out.println("Digite seu nome: ");
                String nome = input.nextLine();
                System.out.println("Digite sua idade: ");
                int idade = input.nextInt();
                System.out.println("Digite seu email: ");
                String email = input.next();
                usuarios.add(new User(nome, idade, email));

                boolean continuar2 = true;

                while (continuar2) {
                    System.out.println("Gostaria de cadastrar um novo usuario? Digite [s/n]");
                    String resposta = input.next();

                    switch (resposta) {
                        case "s":
                            continuar2 = false;
                            break;
                        case "n":
                            continuar = false ;
                            continuar2 = false;
                            break;
                        default:
                            System.out.println("invalido! Digite [s/n]");
                    }
                }
            }    else {
                break;
            }
        } while (continuar);

        System.out.println("Usuarios cadastrados: ");
        for (User u : usuarios)
            System.out.println(u);



    }
}