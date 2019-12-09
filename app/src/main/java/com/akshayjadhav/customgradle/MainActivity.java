package com.akshayjadhav.customgradle;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View v){
        switch (v.getId()){
            case R.id.errorButton:
                Toasty.error(this,"Login Failed!", Toast.LENGTH_SHORT,true).show();
                break;
            case R.id.successButton:
                Toasty.success(this,"Login Successful...",Toast.LENGTH_SHORT,true).show();
                break;
            case  R.id.infoButton:
                Toasty.info(this,"Information",Toast.LENGTH_SHORT,true).show();
                break;
            case R.id.warningButton:
                Toasty.warning(this,"This is your last attempt",Toast.LENGTH_SHORT,true).show();
                break;
            case R.id.imageButton:
                // we can not reference drawable like normal way
                Toasty.normal(this,"Battery Low!!",Toast.LENGTH_SHORT, ContextCompat.getDrawable(this,R.drawable.ic_battery)).show();
                break;
        }

    }
}
