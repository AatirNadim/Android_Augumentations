package com.example.handyman;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.content.Intent;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String key1="com.example.handyman.key1";
    private Button urllocate;
    private Button maillocate;
    private TextView prompt;
    private EditText address;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        prompt=findViewById(R.id.prompt);
        address=findViewById(R.id.address);
        maillocate=findViewById(R.id.maillocate);
        urllocate=findViewById(R.id.urllocate);
        urllocate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Rowing to the oars now", Toast.LENGTH_SHORT).show();
                String ur=address.getText().toString();
                Uri webpage = Uri.parse(ur);
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

    }
    public void secActivity(View v)
    {
        Intent intent=new Intent(this,MainActivity2.class);
        String ad=address.getText().toString();
        intent.putExtra(key1,ad);
        startActivity(intent);

    }

}