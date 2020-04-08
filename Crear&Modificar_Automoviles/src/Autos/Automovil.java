
package Autos;

public class Automovil {
        private int Identificador, Numero_de_ejes;
        private String Fabricante, Modelo;
        private char Combustible;
        
        public Automovil(){
        Identificador = 0;
        Numero_de_ejes = 0;
        Fabricante = " ";
        Modelo = " ";
        Combustible = ' ';
        }

    public int getIdentificador() {
        return Identificador;
    }

    public void setIdentificador(int Identificador) {
        this.Identificador = Identificador;
    }

    public int getNumero_de_ejes() {
        return Numero_de_ejes;
    }

    public void setNumero_de_ejes(int Numero_de_ejes) {
        this.Numero_de_ejes = Numero_de_ejes;
    }

    public String getFabricante() {
        return Fabricante;
    }

    public void setFabricante(String Fabricante) {
        this.Fabricante = Fabricante;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public char getCombustible() {
        return Combustible;
    }

    public void setCombustible(char Combustible) {
        this.Combustible = Combustible;
    }
        
    public Automovil(int Identificador, String Fabricante, String Modelo, int Numero_de_ejes, char Combustible){
        this.Identificador = Identificador;
        this.Numero_de_ejes = Numero_de_ejes;
        this.Fabricante = Fabricante;
        this.Modelo = Modelo;
        this.Combustible = Combustible;  
    }
    
    public String toString(){
    String linea = "IDENTIFICADOR: "+Identificador+" | FABRICANTE: "+Fabricante+" | MODELO: "+Modelo+" | EJES: "+Numero_de_ejes+" | COMBUSTIBLE: "+Combustible;
    return linea;
    }
}
