
package Principal;

import java.util.Date;
public class Hospedaje extends Servicio{
    private Date fechaEntrada; 
    private Date fechaSalida;
    
    //constructor hospedaje

    public Hospedaje(Date fechaEntrada, Date fechaSalida, String ciudad, double puntuacion, int identificador, double valorApagar) {
        super(ciudad, puntuacion, identificador, valorApagar);
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

}
