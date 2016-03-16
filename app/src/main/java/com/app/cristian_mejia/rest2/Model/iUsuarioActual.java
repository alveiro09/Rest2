package com.app.cristian_mejia.rest2.Model;

import retrofit.http.POST;

/**
 * Created by alvei on 13/03/2016.
 */
public interface iUsuarioActual {
    @POST("/me")
    Usuario me();
}
