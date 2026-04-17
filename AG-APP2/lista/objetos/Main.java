package lista.objetos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import main.java.com.SGP.modelos.Moto;
import main.java.com.SGP.util.Validacoes;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static List<Moto> motos = new ArrayList<>();
    private static String marca;
    private static String modelo;
    public static String cor;
    private static int ano;

    public static void main(String[] args) {
        int op;
        do {
            exibirMenu();
            op = receberOp();

            switch (op) {
                case 1 -> {
                    if (receberMarca() && receberModelo() && receberCor() && receberAno()) {
                        Moto novoMoto = new Moto(marca, modelo, cor, ano);
                        motos.add(novoMoto);
                        System.out.println("Moto cadastrada com sucesso!");
                    } else {
                        op = -1;
                    }
                }
                case 2 -> listarMotos();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }

        } while (op != 0);

        scanner.close();
    }
    
        private static void exibirMenu() {
        System.out.println("Menu");
        System.out.println("0 - Sair");
        System.out.println("1 - Cadrastrar motos");
        System.out.println("2 - Listar motos");
    }

    private static int receberOp() {
        System.out.print("Escolha uma opção: ");
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private static boolean receberMarca() {
        System.out.print("Marca: ");
        marca = scanner.nextLine();
        if (!Validacoes.marcaValida(marca)) {
            System.out.println(Validacoes.mensagemErroMarca(marca));
            return false;
        }
        return true;
    }

    private static boolean receberModelo() {
        System.out.print("Modelo: ");
        modelo = scanner.nextLine();
        if (!Validacoes.modeloValida(modelo)) {
            System.out.println(Validacoes.mensagemErroModelo(modelo));
            return false;
        }
        return true;
    }

    private static boolean receberCor() {
        System.out.print("Cor: ");
        cor = scanner.nextLine();
        if (!Validacoes.corValida(cor)) {
            System.out.println(Validacoes.mensagemErroCor(cor));
            return false;
        }
        return true;
    }

    private static boolean receberAno() {
        System.out.print("Ano: ");
        try {
            ano = Integer.parseInt(scanner.nextLine());
            if (!Validacoes.anoValido(ano)) {
                System.out.println(Validacoes.mensagemErroAno(ano));
                return false;
            }
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Erro: Digite um número válido!");
            return false;
        }
    }

    private static void listarMotos() {
        if (motos.isEmpty()) {
            System.out.println("Nenhuma moto cadastrada!");
        } else {
            System.out.println("\n=== Motos Cadastradas ===");
            for (int i = 0; i < motos.size(); i++) {
                System.out.println((i + 1) + ". " + motos.get(i).toString());
            }
        }
    }
}