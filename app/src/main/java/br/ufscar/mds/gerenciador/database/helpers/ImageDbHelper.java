package br.ufscar.mds.gerenciador.database.helpers;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import br.ufscar.mds.gerenciador.database.GerenciadorContract;

/**
 * Created by gabri on 29/01/2017.
 */

public class ImageDbHelper extends SQLiteOpenHelper {
    private static final String TEXT_TYPE = " TEXT";
    private static final String INTEGER_TYPE = " INTEGER";
    private static final String NOT_NULL_ENTRY = " NOT NULL";
    private static final String COMMA_SEP = ",";
    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + GerenciadorContract.ImageEntry.TABLE_NAME + " (" +
                    GerenciadorContract.ImageEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    GerenciadorContract.ImageEntry.COLUMN_NAME_CAMINHO + TEXT_TYPE + COMMA_SEP +
                    GerenciadorContract.ImageEntry.COLUMN_NAME_CURSO_ID + TEXT_TYPE + NOT_NULL_ENTRY + COMMA_SEP +
                    "FOREIGN KEY(" + GerenciadorContract.ImageEntry.COLUMN_NAME_CURSO_ID + ") REFERENCES " +
                    GerenciadorContract.CursoEntry.TABLE_NAME + "(" + GerenciadorContract.CursoEntry._ID + ") )";

    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + GerenciadorContract.AtividadeEntry.TABLE_NAME;

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Imagens.db";

    public ImageDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }
}
