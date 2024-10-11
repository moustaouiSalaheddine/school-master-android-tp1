package com.example.application01;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ActivitePrincipale extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        System.out.println("onCreate called");
        Log.d("Lifecycle", "onCreate called");
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button goToSecondActivity = findViewById(R.id.goToSecondActivityButton);
        goToSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivitePrincipale.this, SecondActivity.class);
                startActivity(intent); // Starts the SecondActivity
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("onStart called");
        Log.d("Lifecycle", "onStart called");
    }
    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("onStop called");
        Log.d("Lifecycle","onStop called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("onRestart called");
        Log.d("Lifecycle","onRestart called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("onResume called");
        Log.d("Lifecycle","onResume called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("onPause called");
        Log.d("Lifecycle","onPause called");
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        System.out.println("onSaveInstanceState called");
        Log.d("Lifecycle","onSaveInstanceState called");
        // Save additional state if necessary
    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        System.out.println("onRestoreInstanceState called");
        Log.d("Lifecycle","onRestoreInstanceState called");
        // Restore additional state if necessary
    }

}