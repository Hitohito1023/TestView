package com.example.testview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        TextView myTextView = (TextView)findViewById(R.id.myTextView);
//        myTextView.setText("こんにちはAndroid");

        Button myButton1 = (Button)findViewById(R.id.button);
        myButton1.setOnClickListener(new Button1ClickListener());

        Button myButton2 = (Button)findViewById(R.id.button2);
        myButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(MainActivity.this, "MY BUTTON2がクリックされました",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    private class Button1ClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v){
            Toast.makeText(MainActivity.this, "MY BUTTONがクリックされました",
                    Toast.LENGTH_SHORT).show();
        }
    }

    public void onButton3Click(View v){
        Toast.makeText(this, "MY BUTTON3がクリックされました", Toast.LENGTH_SHORT).show();
    }
}