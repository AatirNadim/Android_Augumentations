package com.example.handyman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

import static com.example.handyman.MainActivity.key1;

public class MainActivity2 extends AppCompatActivity {

    private Button mailbutton;
    private EditText urlkeliye;
    private EditText mailbody;
    private EditText subject;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mailbody=findViewById(R.id.mailbody);
        urlkeliye=findViewById(R.id.urlkeliye);
        mailbutton=findViewById(R.id.mailbutton);
        subject=findViewById(R.id.subject);
        Intent intent=getIntent();
        String s1=intent.getStringExtra(key1);
        urlkeliye.setText(s1);
        mailbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity2.this, "Opening in new window, now", Toast.LENGTH_SHORT).show();
                String s2=mailbody.getText().toString();
                String s3=subject.getText().toString();
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType(s2);
                intent.putExtra(Intent.EXTRA_EMAIL, s1);
                intent.putExtra(Intent.EXTRA_SUBJECT, s3);
                //intent.putExtra(Intent.EXTRA_STREAM, attachment);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }

            }
        });



    }


}