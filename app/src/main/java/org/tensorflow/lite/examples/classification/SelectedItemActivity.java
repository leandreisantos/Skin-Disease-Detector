package org.tensorflow.lite.examples.classification;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class SelectedItemActivity extends AppCompatActivity {

    String recognitionkey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selected_item);

        Bundle extras = getIntent().getExtras();
        if (extras != null){
            recognitionkey = extras.getString("k");
        }else {
            Toast.makeText(this, "error no key", Toast.LENGTH_SHORT).show();
        }
        Toast.makeText(this, recognitionkey, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(SelectedItemActivity.this,ClassifierActivity.class);
        startActivity(intent);
    }
}