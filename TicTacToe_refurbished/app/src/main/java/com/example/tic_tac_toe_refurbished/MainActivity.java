package com.example.tic_tac_toe_refurbished;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int[] gamestate={2,2,2,2,2,2,2,2,2};
    int[][] winningpos={{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};
//0=0

    boolean f=true;
//1=X
    TextView textView;
    public int activePlayer=0;
    public void playerTap(View View)
    {
        if(!f){
            gameReset(View);
        }
        if(activePlayer==1 && f){
            textView.setText("First Player's turn");
        }
        else textView.setText("Second Player's turn");
        ImageView img= (ImageView) View;
        int tappedImage=Integer.parseInt(img.getTag().toString());
        if(gamestate[tappedImage-1]==2 && f){
            gamestate[tappedImage-1]=activePlayer;
            img.setTranslationY(-1000f);
            if(activePlayer==0){
                img.setImageResource(R.drawable.zero);
                activePlayer=1;
            }
            else if(activePlayer==1){
                img.setImageResource(R.drawable.one);
                activePlayer=0;
            }
            img.animate().translationYBy(1000f).setDuration(300);
        }

        for(int[] winPosition : winningpos){
            if(gamestate[winPosition[0]] == gamestate[winPosition[1]] && gamestate[winPosition[1]]== gamestate[winPosition[2]] && gamestate[winPosition[0]]!=2){
                if(activePlayer==1) {
                    textView.setText("Player 1 has won");

                }
                else textView.setText("Player 2 has won");
                f=false;
            }
        }
//        if(flg) return;


    }

    public void gameReset(View View){
        f=true;
        activePlayer=0;
        for(int i=0;i<9;i++) gamestate[i]=2;
        ((ImageView) findViewById(R.id.imageView1)).setImageResource(0);
        ((ImageView) findViewById(R.id.imageView2)).setImageResource(0);
        ((ImageView) findViewById(R.id.imageView3)).setImageResource(0);
        ((ImageView) findViewById(R.id.imageView4)).setImageResource(0);
        ((ImageView) findViewById(R.id.imageView5)).setImageResource(0);
        ((ImageView) findViewById(R.id.imageView6)).setImageResource(0);
        ((ImageView) findViewById(R.id.imageView7)).setImageResource(0);
        ((ImageView) findViewById(R.id.imageView8)).setImageResource(0);
        ((ImageView) findViewById(R.id.imageView9)).setImageResource(0);


    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.playerTurn);
    }

}