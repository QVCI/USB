package com.example.my_application;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Base extends SQLiteOpenHelper
{


    public Base(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase basesita) {
        basesita.execSQL("CREATE TABLE trabajadores (clave INTEGER PRIMARY KEY, nombre TEXT, area TEXT, turno TEXT, grupo TEXT, Web BOOLEAN, Android BOOLEAN, Diseño BOOLEAN, Mapeo BOOLEAN)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
    }
    }