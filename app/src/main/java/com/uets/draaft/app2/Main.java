package com.uets.draaft.app2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main extends AppCompatActivity implements View.OnClickListener {

    Button b,b2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b = (Button)findViewById(R.id.b1);
        b2 = (Button)findViewById(R.id.b2);

        b.setOnClickListener(this);
        b2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.b2:
                System.exit(0);
                break;
            case R.id.b1:
                startActivity(new Intent(Main.this, Scene.class));
                finish();
                break;
        }
    }
}
