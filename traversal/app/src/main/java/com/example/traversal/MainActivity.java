package com.example.traversal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView nameprompt;
    private EditText nametext;
    private ImageButton imageButton;

    public static final String extra_name="com.example.traversal.key1";
    String s="";
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameprompt=findViewById(R.id.nameprompt);
        nametext=findViewById(R.id.nametext);
        imageButton=findViewById(R.id.imageButton);



    }
    public void setActivity(View v)
    {
        Toast.makeText(this, "Opening second screen now", Toast.LENGTH_SHORT).show();
        String s=nametext.getText().toString();
        Intent intent=new Intent(this,MainActivity2.class);
        intent.putExtra(extra_name,s);
        startActivity(intent);

    }

}