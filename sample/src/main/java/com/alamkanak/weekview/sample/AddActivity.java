package com.alamkanak.weekview.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/**
 * Created by Admin on 12/01/2018.
 */

public class AddActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        Button btn_SetDay =(Button) findViewById(R.id.btnSetDay);
        final DatePicker dp=(DatePicker) findViewById(R.id.datePicker);
        final LinearLayout LayoutButton=(LinearLayout) findViewById(R.id.setTimeLayout);
        final LinearLayout DayButton=(LinearLayout) findViewById(R.id.dateButton);
        //Khi nhấn vào btn Ngày sẽ hiện lên bảng datePicker
        btn_SetDay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dp.setVisibility(View.VISIBLE);
                DayButton.setVisibility(View.VISIBLE);
                LayoutButton.setVisibility(View.GONE);
            }
        });
        //----------------------------------------------------------

    }
}
