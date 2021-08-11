/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author Invitado
 */
public class Vehiculo {
    private String placa;
    private Propietario propietario;
    private String fechaFabricacion;
    private String marca;
    private String color;
    private Double precio;
    private String chasis;
    private Tipovehiculo tipovehiculo;

    public Vehiculo() {
    }

    public Vehiculo(String placa, Propietario propietario, String fechaFabricacion, String marca, String color, Double precio, String chasis, Tipovehiculo tipovehiculo) {
        this.placa = placa;
        this.propietario = propietario;
        this.fechaFabricacion = fechaFabricacion;
        this.marca = marca;
        this.color = color;
        this.precio = precio;
        this.chasis = chasis;
        this.tipovehiculo = tipovehiculo;
    }

    public Tipovehiculo getTipovehiculo() {
        return tipovehiculo;
    }

    public void setTipovehiculo(Tipovehiculo tipovehiculo) {
        this.tipovehiculo = tipovehiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public String getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(String fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }
    
    
  
}
    
    
