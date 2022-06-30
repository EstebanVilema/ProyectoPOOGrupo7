/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuario;
import java.util.Date;
import usuario.Enums.TipoCliente;
/**
 *
 * @author usuario
 */
public class reserva {
    private Double valorPorPagar;
    private Integer codigoReserva;
    private Date fechaReserva= new Date();
    private TipoCliente cliente;
    private String idServicio;
    public int contReserva;

    public Double getValorPorPagar() {
        return valorPorPagar;
    }

    public void setValorPorPagar(Double valorPorPagar) {
        this.valorPorPagar = valorPorPagar;
    }

    public Integer getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(Integer codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public TipoCliente getCliente() {
        return cliente;
    }

    public void setCliente(TipoCliente cliente) {
        this.cliente = cliente;
    }

    public String getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(String idServicio) {
        this.idServicio = idServicio;
    }

    public int getContReserva() {
        return contReserva;
    }

    public void setContReserva(int contReserva) {
        this.contReserva = contReserva;
    }
    
    
}
