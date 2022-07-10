/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;
import java.util.Scanner;
import User.*;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Sistema {
private ArrayList<Usuario> baseDatos= new ArrayList<>();
    private ArrayList<Servicio> serviciosEnLista= new ArrayList<>();
    private ArrayList<Cliente> clientesEnLista=new ArrayList<>();
    
    public static void main(String[]args){
        Sistema s1= new Sistema();
        s1.RegistoDatos();
        System.out.println(s1.baseDatos);
        
        System.out.println("BIENVENIDO AL SISTEMA");
        System.out.println("MENÚ PRINCIPAL");
        System.out.println("++++++++++++++++++++++++");
        System.out.println("Bienvenido al sistema");
        System.out.println("++++++++++++++++++++++++");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su usuario");
        String idX= sc.nextLine();
        System.out.println("Ingrese su contraseña");
        String pwX= sc.nextLine();
        s1.iniciarSesion(idX, pwX);
        
        for (Usuario userX: s1.baseDatos){
            if(idX.equals(userX.getUser()) && pwX.equals(userX.getContraseña())){
            System.out.println("HOla "+userX.getNombres());
            
            }

        }// fin del for externo
        for(Cliente clienteX: s1.clientesEnLista){
        if(idX.equals(clienteX.getUser()) && pwX.equals(clienteX.getContraseña()) &&clienteX.getNumCheque()!=001 && clienteX.getNumerotarjeta()!=001){
            System.out.println("Ingrese el numero de tarjeta");
            Scanner sc2 = new Scanner(System.in);
            int setNumCheque=sc.nextInt();
            clienteX.setNumCheque(setNumCheque);
        }//fin del if
            }//fin del for anidado
        
    }
    public  void RegistoDatos(){
    Usuario user1= new Usuario("0923547362","Luis","Mancero","lmancero","qwerty","0983637223",'C');
    Usuario user2= new Usuario("0986353323","Juan","Gómez","jgome","38373","093727266",'A');
    Usuario user3= new Usuario("0945698598","Marco","Cárdenas","mcarden","abcde","0975342533",'C');
    Usuario user4= new Usuario("0927733345","Carlos","Montalvo","cmontal","283fjw","0987652433",'V');
    // una base de datos
    baseDatos.add(user1);
    baseDatos.add(user2);
    baseDatos.add(user3);
    baseDatos.add(user4);
    Cliente c1= new Cliente("0923547362","Luis","Mancero","lmancero","qwerty","0983637223",'C');
    Cliente c2= new Cliente("0986353323","Juan","Gómez","jgome","38373","093727266",'A');
    Cliente c3= new Cliente("0945698598","Marco","Cárdenas","mcarden","abcde","0975342533",'C');
    Cliente c4= new Cliente("0927733345","Carlos","Montalvo","cmontal","283fjw","0987652433",'V');
    clientesEnLista.add(c1);
    clientesEnLista.add(c2);
    clientesEnLista.add(c3);
    clientesEnLista.add(c4);
    }
    public void convertidorCliente(ArrayList baseDatos){}

       
    public void iniciarSesion(String idX, String psX){
        
       
        }
        
        
        public void validarIngreso(){
        }
        public void mostrarMenu(){
        }    
    
    

}
