/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author chave
 */
public class EstadoSolicitud {
    private int codigo;
    private String nombre;
    private String descripcion;

    public EstadoSolicitud(int cod,String nom,String descrip){
        this.codigo = cod;
        this.nombre  = nom;
        this.descripcion = descrip;
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }        
}
