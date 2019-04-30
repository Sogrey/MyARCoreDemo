package top.sogrey.arcore.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * @author Sogrey
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonAR = findViewById(R.id.button_ar);
        buttonAR.setOnClickListener(v -> startActivity(new Intent(MainActivity.this,ArActivity.class)));
    }
}
