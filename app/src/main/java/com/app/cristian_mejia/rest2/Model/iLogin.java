package com.app.cristian_mejia.rest2.Model;

import com.app.cristian_mejia.rest2.Controller.AccessToken;

import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.PATCH;
import retrofit.http.POST;
import retrofit.http.Path;

/**
 * Created by alvei on 13/03/2016.
 */
public interface iLogin {
    @GET("/Email/{Email}")
    Usuario optenerUsuario(@Path("Email") String Email);

    //@POST("/login")
    //Uuario basicLogin();
    //@FormUrlEncoded
    // @POST("/token")
    //AccessToken getAccessToken(
    //            @Field("code") String code,
    //        @Field("grant_type") String grantType);
}
