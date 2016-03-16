package com.app.cristian_mejia.rest2.Model;

import java.util.List;

import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by alvei on 13/03/2016.
 */
public interface iProspecto {
    @GET("/sch/prospects.json")
    List<Prospecto> prospectos(
            @Path("nombre") String nombre,
            @Path("apellido") String apellido,
            @Path("cedula") String cedula,
            @Path("telefono") String telefono
    );
}
