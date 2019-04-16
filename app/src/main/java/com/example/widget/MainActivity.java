package com.example.widget;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 private Button showButton;
 private View view;
 private AlertDialog.Builder alertdialog;
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     showButton=(Button)findViewById(R.id.button);
     view=findViewById(R.id.view);
     showButton.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             alertdialog=new AlertDialog.Builder(MainActivity.this);
             alertdialog.setTitle(R.string.title);
             alertdialog.setMessage(R.string.message);
             alertdialog.setIcon(R.drawable.alert);
             alertdialog.setCancelable(false);
             alertdialog.setPositiveButton(getResources().getString(R.string.yes), new DialogInterface.OnClickListener() {
                 @Override
                 public void onClick(DialogInterface dialog, int which) {
                     MainActivity.this.finish();
                 }
             });
             alertdialog.setNegativeButton(getResources().getString(R.string.cancel), new DialogInterface.OnClickListener() {
                 @Override
                 public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
                 }
             });
             AlertDialog dialog=alertdialog.create();
             dialog.show();
         }
     });
    }
}
