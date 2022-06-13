package com.example.sycophant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    private Button button3;
    private TextView textView;
    private EditText princi,rati,timi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button3=findViewById(R.id.button3);
        textView=findViewById(R.id.textView);
        princi=findViewById(R.id.princi);
        rati=findViewById(R.id.rati);
        timi=findViewById(R.id.timi);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int p1=Integer.parseInt(princi.getText().toString());
                int t1=Integer.parseInt(timi.getText().toString());
                double r1=Double.parseDouble(rati.getText().toString());
                double ci=Math.pow(p1*(1+r1/100),t1);
                ci=(double)Math.round(ci*100)/100;
                textView.setText(""+ci);
            }
        });

    }
}