/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author usuario
 */
public class Cliente extends Usuario{
    private boolean registro;
    private String edad;
    ArrayList<String> listaServicios = new ArrayList<>();
    private TipoCliente cliente;
    private ArrayList<Cliente> clientesEnLista=new ArrayList<>();
    private int numerotarjeta;
    private int numCheque;
    private Date fechaVencimiento;
    private int edadCliente;
    
    //CONSTRUCTOR DE CLIENTE/ DATOS COMPLETOS
    public Cliente(String cedula,String nombre,String apellido,String user,String contraseña,String celular,char tipoUsuario, 
        int numeroTarjeta,int numCheque,Date fechaVencimiento){
        super(cedula,nombre,apellido,user,contraseña,celular,tipoUsuario);
        this.numerotarjeta= 001;
        this.numCheque=001;
        this.fechaVencimiento=fechaVencimiento;
    }
    //CONSTRUCTOR DE CLIENTES SIMILAR AL USUARIO
    public Cliente(String cedula,String nombre,String apellido,String user,String contraseña,String celular,char tipoUsuario){
        super(cedula,nombre,apellido,user,contraseña,celular,tipoUsuario);
    }
    
  
    public void mostrarMenu(){}
    
    public void consultarReserva(){}

    public ArrayList<Cliente> getClientesEnLista() {
        return clientesEnLista;
    }

    public void setClientesEnLista(ArrayList<Cliente> clientesEnLista) {
        this.clientesEnLista = clientesEnLista;
    }

    public int getNumerotarjeta() {
        return numerotarjeta;
    }

    public void setNumerotarjeta(int numerotarjeta) {
        this.numerotarjeta = numerotarjeta;
    }

    public int getNumCheque() {
        return numCheque;
    }

    public void setNumCheque(int numCheque) {
        this.numCheque = numCheque;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getEdadCliente() {
        return edadCliente;
    }

    public void setEdadCliente(int edadCliente) {
        this.edadCliente = edadCliente;
    }
}

