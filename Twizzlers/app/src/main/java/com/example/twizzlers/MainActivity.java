package com.example.twizzlers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import java.util.Random;
public class MainActivity extends AppCompatActivity {


    private Random rnum=new Random();
    private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img=findViewById(R.id.imgid);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=rnum.nextInt(6)+1;
                switch(a) {
                    case 1:
                        img.setImageResource(R.drawable.one);
                        break;
                    case 2:
                        img.setImageResource(R.drawable.two);
                        break;
                    case 3:
                        img.setImageResource(R.drawable.one);
                        break;
                    case 4:
                        img.setImageResource(R.drawable.four);
                        break;
                    case 5:
                        img.setImageResource(R.drawable.fiveone);
                        break;
                    case 6:
                        img.setImageResource(R.drawable.six);
                        break;
                }

            }
        });
    }

}