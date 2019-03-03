package info.camposha.retrofitmysqllistview;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DB extends SQLiteOpenHelper{
    private static final String DB_NAME = "hotel.db";
    private static final int SCHEMA = 1;
    public static final String TABLE = "numbers";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_NAME = "name";
    public DB(Context context) { super(context, DB_NAME, null, SCHEMA);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS " + TABLE + " ( " + COLUMN_ID + " INTEGER PRIMARY KEY ASC AUTOINCREMENT UNIQUE NOT NULL, " + COLUMN_NAME + " TEXT);");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE + " (" + COLUMN_NAME +") VALUES ('Стандартный');");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE + " (" + COLUMN_NAME +") VALUES ('Улучшенный двухместный');");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE + " (" + COLUMN_NAME +") VALUES ('Люкс');");
    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE);
        onCreate(sqLiteDatabase); }
}
