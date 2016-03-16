package com.app.cristian_mejia.rest2.Model;

/**
 * Created by alvei on 13/03/2016.
 */
public enum EnumEstado {
    PENDING("Pending", 0),
    APPROVED("Approved", 1),
    ACCEPTED("Accepted", 2),
    REJECTED("Rejected", 3),
    DISABLED("Disabled", 4);

    private String pEnumEstado;
    private int pValorEnumEstado;

    private EnumEstado(String toString, int value) {
        pEnumEstado = toString;
        pValorEnumEstado = value;
    }

    @Override
    public String toString() {
        return pEnumEstado;
    }
}
