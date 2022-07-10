/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import java.util.ArrayList;

public class Servicio {
    protected ArrayList<String> listaCiudades= new ArrayList<>();
    protected String ciudad;
    protected double puntuacion;
    protected int identificador;
    protected double valorApagar;
    //constructor clase padre
    
    public Servicio(String ciudad, double puntuacion,int identificador,double valorApagar){
        System.out.println("Seleccione el servicio...");
        
    
    }   
    public void confirmarReserva(){}
    public static void mostrarDatosReserva(String c, double p, int idServ, double valorPagar){

}   



    public String getCiudad() {
        return ciudad;
    }

    public double getPuntuacion() {
        return puntuacion;
    }

    public int getIdentificador() {
        return identificador;
    }

    public double getValorApagar() {
        return valorApagar;
    }
}
