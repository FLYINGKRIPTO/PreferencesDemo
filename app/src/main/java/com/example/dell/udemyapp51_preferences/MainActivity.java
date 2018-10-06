package com.example.dell.udemyapp51_preferences;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txt_1;
    TextView txt_2;
    TextView txt_3;

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


                break;

        }

        return super.onOptionsItemSelected(item);
    }
}
