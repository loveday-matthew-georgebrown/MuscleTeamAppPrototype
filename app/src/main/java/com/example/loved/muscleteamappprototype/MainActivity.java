package com.example.loved.muscleteamappprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button Begin_btn ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         Begin_btn = (Button)findViewById(R.id.Begin_btn);
         Begin_btn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                Select_Shift();
             }
         });

    }
        public void Select_Shift(){
            Intent intent = new Intent(this, Select_Shift.class);
               startActivity(intent);
    }

}
