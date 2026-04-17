package main.java.com.SGP.util;

public class Validacoes {
    private Validacoes() {}

    
    public static boolean marcaValida(String marca) {
        return marca != null && !marca.trim().isEmpty() && !marca.matches(".*\\d+.*");
    }

    public static String mensagemErroMarca(String marca) {
        if (marca == null || marca.trim().isEmpty()) {
            return "Erro: A marca não pode estar vazia!";
        } else if (marca.matches(".*\\d+.*")) {
            return "Erro: A marca não pode conter números!";
        }
        return "";
    }
    
    public static boolean modeloValida(String modelo) {
        return modelo != null && !modelo.trim().isEmpty();
    }

    public static String mensagemErroModelo(String modelo) {
        if (modelo == null || modelo.trim().isEmpty()) {
            return "Erro: O modelo não pode estar vazio!";
        }
        return "";
    }

    public static boolean corValida(String cor) {
        return cor != null && !cor.trim().isEmpty() && !cor.matches(".*\\d+.*");
    }

    public static String mensagemErroCor(String cor) {
        if (cor == null || cor.trim().isEmpty()) {
            return "Erro: A cor não pode estar vazia!";
        } else if (cor.matches(".*\\d+.*")) {
            return "Erro: A cor não pode conter números!";
        }
        return "";
    }

    public static boolean anoValido(int ano) {
        return ano > 0 && ano <= 2100;
    }

    public static String mensagemErroAno(int ano) {
        if (ano <= 0) {
            return "Erro: Ano deve ser positivo!";
        } else if (ano > 2100) {
            return "Erro: Ano inválido!";
        }
        return "";
    }
}