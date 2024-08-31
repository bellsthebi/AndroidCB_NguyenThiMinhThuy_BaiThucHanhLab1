package com.example.baithuchanhlap1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.baithuchanhlap1.R;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageViewDice;
    private Button buttonRollDice;
    private Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewDice = findViewById(R.id.imageViewDice);
        buttonRollDice = findViewById(R.id.buttonRollDice);
        random = new Random();

        buttonRollDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int randomNumber = random.nextInt(6) + 1; // Tạo số ngẫu nhiên từ 1 đến 6
                int drawableResource = getResources().getIdentifier("xx" + randomNumber, "drawable", getPackageName());
                imageViewDice.setImageResource(drawableResource);

            }
        });
    }
}

