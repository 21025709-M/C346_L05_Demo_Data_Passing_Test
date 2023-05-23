package sg.edu.rp.c346.id21025709.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    //Step 1
    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Step 2
        tvAnswer = findViewById(R.id.textView);

        Intent intentReceived = getIntent();
        double value = intentReceived.getDoubleExtra("value", 99.99);
        tvAnswer.setText("Double value received is: " + value);

    }
}