
package Autos;

import javax.swing.JOptionPane;

public class Almacen {
    
    Automovil []autos = new Automovil[10];
    String []contador_autos = new String[10];
    Automovil Carro = new Automovil();
    
    int Identificador = 0;
    int Numero_de_ejes = 0;
    String Fabricante = " ";
    String Modelo = " ";
    char Combustible = ' ';
    
    public void PuestoVacio(){
        
        for(int i=0; i<contador_autos.length; i++){
        contador_autos[i] = "PUESTO VACÍO";
        } 
    }
    
    public void PuestoOcupado(){
        autos[0] = new Automovil(193, "Hyundai", "i10", 2, 'D');
        autos[3] = new Automovil(314, "Toyota", "Corolla", 2, 'G');
        autos[5] = new Automovil(145, "Nissan", "LEAF", 2, 'L');
        autos[7] = new Automovil(556, "Toyota", "Corolla", 2, 'D');
        autos[9] = new Automovil(204, "Hyundai", "i20", 3, 'G');
        
        contador_autos[0] = "PUESTO OCUPADO";
        
        for(int i=3; i<autos.length; i+=2){
        contador_autos[i] = "PUESTO OCUPADO";
        }
    }
    
    public void Guardar(int Posicion, Automovil Carro){
        if(contador_autos[Posicion]=="PUESTO VACÍO"){
        
        Identificador = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el identificador: "));
        Carro.setIdentificador(Identificador);
        
        Fabricante = JOptionPane.showInputDialog("Ingrese el fabricante: ");
        Carro.setFabricante(Fabricante);
        
        Modelo = JOptionPane.showInputDialog("Ingrese el modelo: ");
        Carro.setModelo(Modelo);
        
        Numero_de_ejes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de ejes: "));
        Carro.setNumero_de_ejes(Numero_de_ejes);
        
        do{Combustible = JOptionPane.showInputDialog("Ingrese el tipo de combustible: "
                + "\nGasolina = G"
                + "\nDiesel = D"
                + "\nGas LPG = L").charAt(0);
        Carro.setCombustible(Combustible);
        } while(Combustible !='G' && Combustible != 'D' && Combustible != 'L');
        contador_autos[Posicion]="PUESTO OCUPADO";
        
        autos[Posicion] = new Automovil(Carro.getIdentificador(), Carro.getFabricante(), Carro.getModelo(), Carro.getNumero_de_ejes(), Carro.getCombustible());
        
        JOptionPane.showMessageDialog(null, "    Objeto creado con éxito");
        }
        
        else{JOptionPane.showMessageDialog(null, "       PUESTO OCUPADO");}
        
        Menu();
    }
    
    public void Listar_Almacen(){
        
        for(int i=0; i<autos.length; i++){
            
        if(contador_autos[i]=="PUESTO VACÍO"){
            JOptionPane.showMessageDialog(null, "                Puesto "+i+
                                                "\n          PUESTO VACÍO");
        }
        
        else{JOptionPane.showMessageDialog(null, "Puesto "+i+
                                                 "\n"+autos[i].toString());}
        }
        
        Menu();
    }
    
    public void Menu(){
        int Menu;
        int W;
        
        try{
        Menu = Integer.parseInt(JOptionPane.showInputDialog("                           MENÚ"
                + "\n               Ingrese un número"
                + "\n\n1. Ingresar auto"
                + "\n2. Listar autos"
                + "\n3. Salir\n"));
        
        switch(Menu){
            case 1: do{W = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posición en la que desea almacenar el nuevo Automovil: (0-9)"));}
                    while(W<0 || W>9);
                    Guardar(W, Carro);
            
            case 2: Listar_Almacen();
            
            case 3: JOptionPane.showMessageDialog(null, "           Salió con éxito");
                    System.exit(0);
                    
            default: JOptionPane.showMessageDialog(null, "Ingrese un número del menú (1, 2, 3)");
                     Menu();
        }
    }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ingrese datos válidos"
                    + "\n\nEjemplo"
                    + "\nMenú: 1"
                    + "\nIdentificador: 234"
                    + "\nFabricante: Toyota"
                    + "\nModelo: Corolla"
                    + "\nEjes: 2"
                    + "\nCombustible: D");
            
         Menu();
        }
    }
}
