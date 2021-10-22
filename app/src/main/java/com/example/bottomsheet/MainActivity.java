package com.example.bottomsheet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               /* BottomSheetDialogFragment bottomSheetDialogFragment = new BottomDialogFragment();
                bottomSheetDialogFragment.show(getSupportFragmentManager(), BottomDialogFragment.class.getSimpleName());*/

                BottomSheetDialog bottomSheetDialog=new BottomSheetDialog(MainActivity.this,R.style.BottomSheetDialogTheme);
                View bottomSheetView= LayoutInflater.from(getApplicationContext()).inflate(R.layout.fragment_blank,findViewById(R.id.bottomSheet));

                bottomSheetDialog.setContentView(bottomSheetView);
                bottomSheetDialog.show();
            }
        });


    }
}