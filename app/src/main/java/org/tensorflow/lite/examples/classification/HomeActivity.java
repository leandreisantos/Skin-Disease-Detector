package org.tensorflow.lite.examples.classification;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    TextView btn,btn_about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btn = findViewById(R.id.btn_detect);
        btn_about = findViewById(R.id.btn_about);

        btn.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this,ClassifierActivity.class);
            startActivity(intent);
        });
        btn_about.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this,AboutActivity.class);
            startActivity(intent);
        });
    }
}