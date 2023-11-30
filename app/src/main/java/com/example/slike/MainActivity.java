package com.example.slike;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView imageViewSlika;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageViewSlika = findViewById(R.id.imageViewSlika);
    }
    public void clickButtonPrvi(View view){
        imageViewSlika.setImageResource(R.drawable.manutd);
        Toast.makeText(getApplicationContext(), "MANUTD", Toast.LENGTH_SHORT).show();
    }
    public void clickButtonDrugi(View view){
        imageViewSlika.setImageResource(R.drawable.osijek);
        Toast.makeText(getApplicationContext(), "OSIJEK", Toast.LENGTH_SHORT).show();
    }
}