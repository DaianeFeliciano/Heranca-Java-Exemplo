package Atvheranca;
import java.util.Scanner;

public class Pessoa extends Cliente
{
   public String cpf, rg; int idade; double salario;

    Pessoa (String tp)
   {
       super(tp);

   }

    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {

            String meutipo = "Pessoa Física";
            Pessoa obgp = new Pessoa(meutipo);

            int tecla = 0;
            String menu = "\n***MENU***\n1 Ler\n2 Exibir\n3 Sair\nItem:";

            do {
                System.out.println(menu);
                tecla = leitor.nextInt();
                switch (tecla) {

                    case 1:

                        System.out.println("Digite o CPF: ");
                        obgp.cpf = leitor.next();
                        System.out.println("Digite o RG: ");
                        obgp.rg = leitor.next();
                        System.out.println("Digite a idade: ");
                        obgp.idade = leitor.nextInt();
                        System.out.println("Digite o salário: R$ ");
                        obgp.salario = leitor.nextDouble();
                        break;

                    case 2:
                        obgp.tipo = meutipo;
                        obgp.exibir();
                        System.out.println(obgp.cpf);
                        System.out.println(obgp.rg);
                        System.out.println(obgp.idade);
                        System.out.println(obgp.salario);
                        break;

                    case 3:
                        System.exit(0);
                        break;

                }

            } while (tecla != 4);
        }

    }

    }

