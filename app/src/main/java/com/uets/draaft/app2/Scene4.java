package com.uets.draaft.app2;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Scene4 extends AppCompatActivity implements View.OnClickListener {

    Button b,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene4);

        b = (Button)findViewById(R.id.b3);
        b2 = (Button)findViewById(R.id.b4);
        b3 = (Button)findViewById(R.id.b5);
        b4 = (Button)findViewById(R.id.b6);

        b.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.b4:
                Toast.makeText(this, "Incorrecto!", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Scene4.this,Perdedor.class));
                finish();
                break;
            case R.id.b3:
                Toast.makeText(this, "Correcto!", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Scene4.this,Main2Activity.class));
                finish();
                break;
            case R.id.b5:
                Toast.makeText(this, "Incorrecto!", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Scene4.this,Perdedor.class));
                finish();
                break;
            case R.id.b6:
                Toast.makeText(this, "Incorrecto!", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Scene4.this,Perdedor.class));
                finish();
                break;
        }
    }
}
