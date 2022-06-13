package com.example.jyawalk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
//import android.widget.
public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText editText1;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        editText1=findViewById(R.id.editTextTextPersonName);
        textView=findViewById(R.id.textView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s = editText1.getText().toString(), s1="";
                int a = Integer.parseInt(s);
                int a1 = 0;
                int i;
                //textView.setText("give no give\nsprue no give");


                for(i = 1; i<=10; i++)
              {
                  //textView.setText("give no give");
                  a1=a*i;s1=s1+s+" * "+i+" = "+a1+"\n";
              }
                textView.setText(s1);
            }
        });









}}