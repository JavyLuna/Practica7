package com.itchihuahuaii.ejemplo7;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText edit1,edit2;
    Button btn;
    TextView lbRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        edit1=(EditText)findViewById(R.id.edit1);
        edit2=(EditText)findViewById(R.id.edit2);
        btn=(Button)findViewById(R.id.btn);
        lbRes=(TextView)findViewById(R.id.lbRes);
        btn.setOnClickListener(this);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Que onda que pex", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void onClick(View v){
        if(v.getId()==R.id.btn){
            double cat1 = Double.parseDouble(edit1.getText().toString());
            double cat2 = Double.parseDouble(edit2.getText().toString());

            double hip=Math.sqrt(Math.pow(cat1,2)+Math.pow(cat2,2));
            double per=hip+cat1+cat2;
            double area=(cat1*cat2)/2;
            lbRes.setText("Hipotenusa= "+ hip+"\n" +
                    "Perimetro= "+ per+"\n" +
                    "Area= "+ area);
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
