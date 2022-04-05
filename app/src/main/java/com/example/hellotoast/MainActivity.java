package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private Button zero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,
                Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        zero = (Button) findViewById(R.id.button_zero);
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));

        switch (mCount % 2){
            case 0: view.setBackgroundColor(Color.MAGENTA);
                break;
            case 1: view.setBackgroundColor(Color.BLUE);
                break;
        }
        zero.setBackgroundColor(Color.RED);
    }

    public void makeZero(View view) {
        mCount = 0;
        mShowCount.setText(Integer.toString(mCount));

        view.setBackgroundColor(Color.GRAY);
    }
}