package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Integer count = 0;
    private TextView textCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.textCount = (TextView) findViewById(R.id.text_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this,"Bonjour Android", Toast.LENGTH_LONG);
        toast.show();
    }

    public void countUp(View view) {
        this.count++;
        this.textCount.setText(this.count.toString());
    }
}
