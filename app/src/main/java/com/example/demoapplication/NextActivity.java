package com.example.demoapplication;

import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        //To enable back button in action bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button btnSubmit = (Button) findViewById(R.id.btnSubmit);
        EditText etEnterName = (EditText) findViewById(R.id.etEnterName);
        TextView tvNextHeader = (TextView) findViewById(R.id.tvNextHeader);


        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etEnterName.getText().toString();
                if (!name.isEmpty()){
                    tvNextHeader.setText("Hello, "+name+"!");
                }
            }
        });
    }

    //One way to do to finish this activity when back button on actionbar was clicked
//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        switch (item.getItemId()) {
//            case android.R.id.home:
//                finish();
//                return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

    //Second way to do it is to add parentActivityName in AndroidManifest
}