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
public class Cliente {
    private int numeroTarjeta;
    private int numCheque;
    private boolean registro;
    private String edad;
    ArrayList<String> listaServicios = new ArrayList<>();
    private Date fechaVencimiento = new Date();
    private Enums.TipoCliente cliente;
}

