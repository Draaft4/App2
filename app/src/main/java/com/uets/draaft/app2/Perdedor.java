package com.uets.draaft.app2;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Perdedor extends AppCompatActivity implements View.OnClickListener {

    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perdedor);

        AlertDialog.Builder fail = new AlertDialog.Builder(this);
        fail.setMessage("Perdiste!");
        fail.setCancelable(false);
        fail.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        fail.show();
        b=(Button)findViewById(R.id.bp);

        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.bp){
            System.exit(0);
        }
    }
}
