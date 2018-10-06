package com.example.dell.udemyapp51_preferences;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txt_1;
    TextView txt_2;
    TextView txt_3;

    Typeface fontNumber1;
    Typeface fontNumber2;
    Typeface fontNumber3;

    String textView1Size;
    String textView2Size;
    String textView3Size;

    SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_1 = findViewById(R.id.txtno1);
        txt_2 = findViewById(R.id.txtno2);
        txt_3 = findViewById(R.id.txtno3);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
          getMenuInflater().inflate(R.menu.menu_main,menu);
          return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.settings:
                Intent intent = new Intent(MainActivity.this,PreferencesActivity.class);
                startActivity(intent);
                break;

        }

        return super.onOptionsItemSelected(item);
    }
}
