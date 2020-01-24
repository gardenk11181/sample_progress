package com.gardenlab.sampleprogress;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ProgressBar progressBarHori = findViewById(R.id.progressBar);
        progressBarHori.setIndeterminate(false);
        progressBarHori.setProgress(0);

        Button btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBarHori.setProgress(80);
                showAlert();
            }
        });

        Button btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(builder !=null ) {
                    progressBarHori.setProgress(0);
                }
            }
        });
    }

    private void showAlert() {
        builder = new AlertDialog.Builder(this);
        builder.setView(R.layout.progress);
        builder.show();
    }
}
