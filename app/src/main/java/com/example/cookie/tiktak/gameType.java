package com.example.cookie.tiktak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class gameType extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_type);

    }
    public void buMulti(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void buSingle(View view){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
}
