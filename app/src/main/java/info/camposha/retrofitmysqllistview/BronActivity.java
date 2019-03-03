package info.camposha.retrofitmysqllistview;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SimpleCursorAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class BronActivity extends AppCompatActivity {

    private Button button, b2;
    private EditText t1, t2, t3, t4;
    private String sUsername;
    private TextView t5,t6;
    Spinner spinner;
    SimpleCursorAdapter userAdapter;
    SQLiteDatabase db;
    DB dbNum;
    Cursor userCursor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bron);
        // _____________________________
        button =(Button)findViewById(R.id.button4);
        b2=(Button)findViewById(R.id.button5);
        t1 = (EditText)findViewById(R.id.editText);
        t2 = (EditText)findViewById(R.id.editText2);
        t3 = (EditText)findViewById(R.id.editText3);
        t4 = (EditText)findViewById(R.id.editText4);
        t5 = (TextView)findViewById(R.id.textView4);
        t6 = (TextView)findViewById(R.id.textView5);
        // _____________________________
        spinner = (Spinner) findViewById(R.id.spinner);
        dbNum = new DB(this);
        db = dbNum.getReadableDatabase();
        userCursor = db.rawQuery("SELECT * FROM " + dbNum.TABLE, null);
        userAdapter = new SimpleCursorAdapter(this, android.R.layout.simple_dropdown_item_1line, userCursor, new String[] {"name"}, new int[] {android.R.id.text1}, 0);
        spinner.setAdapter(userAdapter);

    }


    public void newScreen(View v) {
        sUsername = t3.getText().toString();
        if (sUsername.matches("")){
            Toast toast = Toast.makeText(this, "Заплните поля!",Toast.LENGTH_SHORT);
            toast.show();

        }else {
            Toast toast = Toast.makeText(this, "Спасибо, что выбрали нас <3",Toast.LENGTH_LONG);
            toast.show();

            button.setVisibility(View.INVISIBLE);
            t1.setVisibility(View.INVISIBLE);t2.setVisibility(View.INVISIBLE);t3.setVisibility(View.INVISIBLE);t4.setVisibility(View.INVISIBLE);
            spinner.setVisibility(View.INVISIBLE); t6.setVisibility(View.INVISIBLE);
            t5.setVisibility(View.VISIBLE); b2.setVisibility(View.VISIBLE);

        }
    }
    public void newScreen2(View z) {
        Intent intObj = new Intent(this, StartActivity.class);
        startActivity(intObj);
    }


}
