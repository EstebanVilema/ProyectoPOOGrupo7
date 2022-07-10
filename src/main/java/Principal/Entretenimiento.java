/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Entretenimiento extends Servicio{
    private ArrayList<String> descripcionRecorrido;
    private int totalPersonas;
    private int diasRecorrido;
    
    public Entretenimiento(ArrayList descripcionRecorrido, int totalPersonas, int diasRecorrido){
    super("",0.0,45,78.0);
    this.totalPersonas=totalPersonas;
    this.diasRecorrido=diasRecorrido;
    }
}
