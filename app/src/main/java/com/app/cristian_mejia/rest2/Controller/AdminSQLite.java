package com.app.cristian_mejia.rest2.Controller;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by alvei on 13/03/2016.
 */
public class AdminSQLite extends SQLiteOpenHelper {

    public AdminSQLite(Context context, String nombre, CursorFactory factory, int version) {
        super(context, nombre, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table prospectos(dni integer primary key, nombre text, apellido text, cedula text, telefono text, estado  integer)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int versionAnte, int versionNue) {
        db.execSQL("drop table if exists prospectos");
        db.execSQL("create table prospectos(dni integer primary key, nombre text, apellido text, cedula text, telefono text, estado  integer)");
    }
}
