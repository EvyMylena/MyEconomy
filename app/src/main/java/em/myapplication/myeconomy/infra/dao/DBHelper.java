package em.myapplication.myeconomy.infra.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    private static String NOME = "economy.db";
    private static int VERSAO = 1;

    public DBHelper(Context context){
        super(context,NOME,null,VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(
                "CREATE TABLE [usuario] (\n" +
                        "[codigo] INTEGER  NOT NULL PRIMARY KEY AUTOINCREMENT,\n" +
                        "[nome] VARCHAR(60)  NOT NULL,\n" +
                        "[email] VARCHAR(60)  NOT NULL,\n" +
                        "[senha] VARCHAR(60)  NOT NULL\n" +
                        ")"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}