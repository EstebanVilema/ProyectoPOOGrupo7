/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

/**
 *
 * @author Usuario
 */
public class Usuario {
    
    private String cedula;
    private String nombres;
    private String apellidos;
    private String user;
    private String contraseña;
    private String celular;
    private char tipoUsuario;

    //constructor de Usuario, clase padre de cliente y administrador
    public Usuario(String cedula,String nombres,String apellidos,String user,String contraseña,String celular,char tipoUsuario){
    this.cedula=cedula;
    this.nombres=nombres;
    this.apellidos=apellidos;
    this.user=user;
    this.contraseña=contraseña;
    this.celular=celular;
    this.tipoUsuario=tipoUsuario;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public char getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(char tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }


    
}
