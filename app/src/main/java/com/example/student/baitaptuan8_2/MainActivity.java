package com.example.student.baitaptuan8_2;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnOpen;
    private EditText txtFrag;
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOpen = (Button)findViewById(R.id.btnOpen);
         txtFrag = (EditText)findViewById(R.id.txtFragment);
        btnOpen.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnOpen:
                Fragment fragment = new Fragment();
                Bundle bundle = new Bundle();
                bundle.putString("text", txtFrag.getText().toString());
                fragment.setArguments(bundle);
                getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
                break;
        }
    }
}
