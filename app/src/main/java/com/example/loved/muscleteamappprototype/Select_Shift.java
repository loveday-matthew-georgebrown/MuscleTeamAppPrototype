package com.example.loved.muscleteamappprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Select_Shift extends AppCompatActivity {
    private RadioGroup radioGroup;
    private RadioButton WestRadio_btn,EastRadio_btn,SetUP_btn,TearDown_btn,Team1_btn,Team2_btn,Team3_btn,Team4_btn;
    private Button Select_Shift_Continue_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select__shift);
        EastRadio_btn =(RadioButton) findViewById(R.id.EastRadio_btn);
        WestRadio_btn =(RadioButton) findViewById(R.id.WestRadio_btn);
        Select_Shift_Continue_btn = (Button) findViewById(R.id.Select_Shift_Continue_btn);
        SetUP_btn = (RadioButton) findViewById(R.id.SetUP_btn);
        TearDown_btn = (RadioButton) findViewById(R.id.TearDown_btn);
        Team1_btn = (RadioButton) findViewById(R.id.Team1_btn);
        Team2_btn = (RadioButton) findViewById(R.id.Team2_btn);
        Team3_btn = (RadioButton) findViewById(R.id.Team3_btn);
        Team4_btn = (RadioButton) findViewById(R.id.Team4_btn);


        Select_Shift_Continue_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //East Campus Setup
                if (EastRadio_btn.isChecked() && SetUP_btn.isChecked() && Team1_btn.isChecked()) {
                    startActivity(new Intent(Select_Shift.this, east_campus_set_team_1.class));
                }
                 if (EastRadio_btn.isChecked() && SetUP_btn.isChecked() && Team2_btn.isChecked()) {
                    startActivity(new Intent(Select_Shift.this, East_Campus_Set_Team2.class));
                }
                  if (EastRadio_btn.isChecked() && SetUP_btn.isChecked() && Team3_btn.isChecked()) {
                    startActivity(new Intent(Select_Shift.this, East_Campus_Set_Team3.class));
                }
                 if (EastRadio_btn.isChecked() && SetUP_btn.isChecked() && Team4_btn.isChecked()) {
                    startActivity(new Intent(Select_Shift.this, east_campus_set_team4.class));
                }

                //East Campus Teardown
                if (EastRadio_btn.isChecked() && TearDown_btn.isChecked() && Team1_btn.isChecked()) {
                    startActivity(new Intent(Select_Shift.this, East_Campus_TearDown_Team1.class));
                }
                if (EastRadio_btn.isChecked() && TearDown_btn.isChecked() && Team2_btn.isChecked()) {
                    startActivity(new Intent(Select_Shift.this, East_Campus_TearDown_Team2.class));
                }
                if (EastRadio_btn.isChecked() && TearDown_btn.isChecked() && Team3_btn.isChecked()) {
                    startActivity(new Intent(Select_Shift.this, East_Campus_TearDown_Team3.class));
                }
                if (EastRadio_btn.isChecked() && TearDown_btn.isChecked() && Team4_btn.isChecked()) {
                    startActivity(new Intent(Select_Shift.this, East_Campus_TearDown_Team4.class));
                }

                //West Campus Setup
                if (WestRadio_btn.isChecked() && SetUP_btn.isChecked() && Team1_btn.isChecked()) {
                    startActivity(new Intent(Select_Shift.this, West_Campus_set_Team1.class));
                }
                if (WestRadio_btn.isChecked() && SetUP_btn.isChecked() && Team2_btn.isChecked()) {
                    startActivity(new Intent(Select_Shift.this, West_Campus_set_Team2.class));
                }
                if (WestRadio_btn.isChecked() && SetUP_btn.isChecked() && Team3_btn.isChecked()) {
                    startActivity(new Intent(Select_Shift.this, West_Campus_set_Team3.class));
                }
                if (WestRadio_btn.isChecked() && SetUP_btn.isChecked() && Team4_btn.isChecked()) {
                    startActivity(new Intent(Select_Shift.this, West_Campus_set_Team4.class));
                }

                //West Campus teardown
                if (WestRadio_btn.isChecked() && TearDown_btn.isChecked() && Team1_btn.isChecked()) {
                    startActivity(new Intent(Select_Shift.this, West_Campus_Teardown_Team1.class));
                }
                if (WestRadio_btn.isChecked() && TearDown_btn.isChecked() && Team2_btn.isChecked()) {
                    startActivity(new Intent(Select_Shift.this, West_Campus_Teardown_Team2.class));
                }
                if (WestRadio_btn.isChecked() && TearDown_btn.isChecked() && Team3_btn.isChecked()) {
                    startActivity(new Intent(Select_Shift.this, West_Campus_Teardown_Team3.class));
                }
                if (WestRadio_btn.isChecked() && TearDown_btn.isChecked() && Team4_btn.isChecked()) {
                    startActivity(new Intent(Select_Shift.this, West_Campus_Teardown_Team4.class));
                }

            }
        });


    }
}
