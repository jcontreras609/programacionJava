/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinal1;

import java.util.Date;

/**
 *
 * @author salones
 */
public class Lote {

    //Atributos
    public String Lote_codigo;
    private Date Fecha_fabricacion;
    private Date Feha_vencimiento;
    private int Cantidad_inicial;
    private int Cantidad_actual;

    //Constructor
    // 1 -> constructor - vacio
    public Lote() {
    }

    // 1 -> constructor - completo
    public Lote(String Lote_codigo, Date Fecha_fabricacion, Date Feha_vencimiento, int Cantidad_inicial, int Cantidad_actual) {
        this.Lote_codigo = Lote_codigo;
        this.Fecha_fabricacion = Fecha_fabricacion;
        this.Feha_vencimiento = Feha_vencimiento;
        this.Cantidad_inicial = Cantidad_inicial;
        this.Cantidad_actual = Cantidad_actual;
    }

    // 1 -> constructor - parcial
    public Lote(Date Fecha_fabricacion, Date Feha_vencimiento, int Cantidad_inicial, int Cantidad_actual) {
        this.Fecha_fabricacion = Fecha_fabricacion;
        this.Feha_vencimiento = Feha_vencimiento;
        this.Cantidad_inicial = Cantidad_inicial;
        this.Cantidad_actual = Cantidad_actual;
    }

    //Getters y setters
    public String getLote_codigo() {
        return Lote_codigo;
    }

    public void setLote_codigo(String Lote_codigo) {
        this.Lote_codigo = Lote_codigo;
    }

    public Date getFecha_fabricacion() {
        return Fecha_fabricacion;
    }

    public void setFecha_fabricacion(Date Fecha_fabricacion) {
        this.Fecha_fabricacion = Fecha_fabricacion;
    }

    public Date getFeha_vencimiento() {
        return Feha_vencimiento;
    }

    public void setFeha_vencimiento(Date Feha_vencimiento) {
        this.Feha_vencimiento = Feha_vencimiento;
    }

    public int getCantidad_inicial() {
        return Cantidad_inicial;
    }

    public void setCantidad_inicial(int Cantidad_inicial) {
        this.Cantidad_inicial = Cantidad_inicial;
    }

    public int getCantidad_actual() {
        return Cantidad_actual;
    }

    public void setCantidad_actual(int Cantidad_actual) {
        this.Cantidad_actual = Cantidad_actual;
    }
    
    //Metodo creado por mi
    public void imprimir() {
        System.out.println("El código de este lote es: " + Lote_codigo + " - Cantidad actual: " + Cantidad_actual);
    }

    //Metodo principal
    public static void main(String[] args) {
        
        //Voy a crear mi primer objeto
        Lote n1 = new Lote("LOT-001", new Date(), new Date(), 100, 80);
        Lote n2 = new Lote("LOT-002", new Date(), new Date(), 200, 150);
        Lote n3 = new Lote("LOT-003", new Date(), new Date(), 500, 500);

        //Uso del primer metodo creado por mi
        n1.imprimir();
        n2.imprimir();
        n3.imprimir();
    }   
}