/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.canela.entidades;

import com.google.gson.Gson;
import java.util.List;
import mx.itson.canela.enumeradores.Dificultad;

/**
 * getters and setters de Receta
 * @author Emmanuel Rivas
 */


public class Receta {
  
    private String titulo;
    private String descripcion;
    private int numeroPorciones;
    private int tiempo;
    private List<Ingrediente> ingredientes;
    private List<Paso> pasos;
    private Dificultad dificultad;
    private Usuario usuario;
    
    /**
     * convierte una cadena JSON en un objeto
     * @param json busca el formato json
     * @return receta
     */
    public Receta deserializar (String json){
        Receta receta = new Receta();
        try{
            receta = new Gson().fromJson(json, Receta.class);
        }catch(Exception ex){
            System.err.print("Ocurrio un error: " + ex.getMessage());
        }
        return receta;
    } 
    

    

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNumeroPorciones() {
        return numeroPorciones;
    }

    public void setNumeroPorciones(int numeroPorciones) {
        this.numeroPorciones = numeroPorciones;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public List<Paso> getPasos() {
        return pasos;
    }

    public void setPasos(List<Paso> pasos) {
        this.pasos = pasos;
    }

    public Dificultad getDificultad() {
        return dificultad;
    }

    public void setDificultad(Dificultad dificultad) {
        this.dificultad = dificultad;
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
}
