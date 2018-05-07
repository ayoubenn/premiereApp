package com.example.mac.premiereapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by mac on 17/04/2018.
 */

public class DictionaryOpenelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 2;
    private static final String DICTIONARY_TABLE_NAME= "dictionary";
    private static final String KEY_MOD ="key";
    private static final String KEY_DEFINITION = "value";
    private static final String DATABASE_NAME="database";

    private static final String DICTIONARY_TABLE_CREATE = "CREATE_TABLE" + DICTIONARY_TABLE_NAME +"("+
                 KEY_MOD + "TEXT" +
                    KEY_DEFINITION + "TEXT);";



    DictionaryOpenelper(Context context){
    super(context,DATABASE_NAME,null,DATABASE_VERSION);

    }


@Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL(DICTIONARY_TABLE_CREATE);
}



@Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase,int i,int i1){

}

    public void inserer(String value){
        String INSERER = "INSERT INTO" + DICTIONARY_TABLE_NAME + "(" + KEY_MOD + "TEXT" + KEY_DEFINITION + value + ");";
    }

}
