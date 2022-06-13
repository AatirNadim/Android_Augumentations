package com.example.sycophant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText principal;
    private EditText rate;
    private EditText time;
    private TextView textView2;
    private TextView textView3;
    private Button button;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView3=findViewById(R.id.textView3);
        principal=findViewById(R.id.principal);
        button=findViewById(R.id.button);
        rate=findViewById(R.id.rate);
        time=findViewById(R.id.time);
        button2=findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "To display compound interest, doy, I lied!!!", Toast.LENGTH_SHORT).show();
                int p=Integer.parseInt(principal.getText().toString());
                double r=Double.parseDouble(rate.getText().toString());
                int t=Integer.parseInt(time.getText().toString());
                double si=p*r*t/100;
                si=(double)Math.round(si*100)/100;
                textView3.setText(""+si);

            }


            }





        );




    }
    public void openActivity2(View p)
    {
        Intent intent=new Intent(this,MainActivity2.class);
        startActivity(intent);

    }

}