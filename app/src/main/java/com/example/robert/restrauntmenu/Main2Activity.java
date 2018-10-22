package com.example.robert.restrauntmenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView recipeName = findViewById(R.id.rName);
        TextView recipeDesc = findViewById(R.id.desc);
        ImageView recipeImg = findViewById(R.id.rImg);

        Intent dIntent = getIntent();
        String rName = dIntent.getStringExtra("recipeName");
        String rDesc = dIntent.getStringExtra("recipeDesc");
        int rImg = dIntent.getIntExtra("recipeImg", 0);


        recipeName.setText(rName);
        recipeDesc.setText(rDesc);
        recipeImg.setImageResource(rImg);

    }
}
