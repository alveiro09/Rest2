package com.app.cristian_mejia.rest2.Model;

import com.google.gson.annotations.Expose;

/**
 * Created by alvei on 13/03/2016.
 */
public class Prospecto {
    @Expose
    private String fNombre;
    @Expose
    private String fApellido;
    @Expose
    private String fCedula;
    @Expose
    private String fTelefono;
    @Expose
    private int fEstado;

    public String pNombre() {
        return fNombre;
    }

    public void pNombre(String fNombre) {
        this.fNombre = fNombre;
    }

    public String pApellido() {
        return fApellido;
    }

    public void pApellido(String fApellido) {
        this.fApellido = fApellido;
    }

    public String pCedula() {
        return fCedula;
    }

    public void pCedula(String fCedula) {
        this.fCedula = fCedula;
    }

    public String pTelefono() {
        return fTelefono;
    }

    public void pTelefono(String fTelefono) {
        this.fTelefono = fTelefono;
    }

    public int getfEstado() {
        return fEstado;
    }

    public void setfEstado(int fEstado) {
        this.fEstado = fEstado;
    }
}
