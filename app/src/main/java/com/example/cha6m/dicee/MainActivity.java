package com.example.cha6m.dicee;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;

        rollButton=findViewById(R.id.rollbutton);

        final ImageView leftdice=findViewById(R.id.leftdice);
        final ImageView rightdice=findViewById(R.id.rightdice);

        final int diceArray[]={R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Dicee","The button has been pressed");
                Random rng=new Random();
                int number=rng.nextInt(6);
                Log.d("Dicee","The random number is "+number);

                leftdice.setImageResource(diceArray[number]);

                int number1=rng.nextInt(6);
                rightdice.setImageResource(diceArray[number1]);
                if(number==number1){
                    Toast.makeText(MainActivity.this,"Bingoo",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
