package com.cursoceat.aplicacionalbaran.modell;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCliente;
    public LocalDate fecha;
    public int nPedido;
    private String nombreC;
    private String ciudad;
    private String direccion;
    private String direccionE;
    private String telefono;
    private String email;
    private LocalTime fechaE;
    private String referencia;
    private String descripcion;
    private int cantidad;
    private double precio;
    private double total;
    private String observaciones;
    private String empleado;


    //CONSTRUCTOR
    public Cliente() {}

    //GETTER AND SETTER


    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getnPedido() {
        return nPedido;
    }

    public void setnPedido(int nPedido) {
        this.nPedido = nPedido;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccionE() {
        return direccionE;
    }

    public void setDireccionE(String direccionE) {
        this.direccionE = direccionE;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalTime getFechaE() {
        return fechaE;
    }

    public void setFechaE(LocalTime fechaE) {
        this.fechaE = fechaE;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    //TO STRING

    @Override
    public String toString() {
        return "Cliente{" +
                "fecha=" + fecha +
                ", nPedido=" + nPedido +
                ", nombreC='" + nombreC + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", direccion='" + direccion + '\'' +
                ", direccionE='" + direccionE + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", fechaE=" + fechaE +
                ", referencia='" + referencia + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", cantidad=" + cantidad +
                ", precio=" + precio +
                ", total=" + total +
                ", observaciones='" + observaciones + '\'' +
                ", empleado=" + empleado +
                '}';
    }
}
