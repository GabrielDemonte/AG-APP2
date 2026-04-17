package main.java.com.SGP.modelos;

public class Moto {

    private String marca;
    private String modelo;
    public String cor;
    private int ano;

    public Moto(String marca, String modelo, String cor, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    public Moto() {
        this.marca = "Yamaha";
        this.modelo = "Factor 150";
        this.cor = "branca";
        this.ano= 2025;
    }

    public String getmarca() {
        return marca;
    }

    public String getmodelo() {
        return modelo;
    }

    public String getcor() {
        return cor;
    }

    public int getano() {
        return ano;
    }

    public void setmarca(String marca) {
        this.marca = marca;
    }

    public void setmodelo(String modelo) {
        this.marca = modelo;
    }

    public void setcor(String cor) {
        this.cor = cor;
    }

    public void setano(int ano) {
        this.ano = ano;
    }

    @Override
    public int hashCode() {
        return marca.hashCode() + modelo.hashCode() + cor.hashCode() + ano;
    }

        public int compareTo(Moto outro) {
        if (this.ano > outro.ano) {
            return 1;
        } else if (this.ano < outro.ano) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Moto: Marca = " + marca + ", Modelo = " + modelo + ", Cor = " + cor + ", Ano = " + ano;
    }

}