package com.example.harishs1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public Button b1;
    public EditText e1;
    public TextView t1;
    public View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            double c = 300000000;
            if(((EditText) findViewById(R.id.e1)).getText().toString().equals(""))
                toast1();
            else{
                double d= Double.valueOf(((EditText) findViewById(R.id.e1)).getText().toString());
                if(c<d)
                    toast2();
                else
                {
                    double e= 1/(Math.sqrt(1-Math.pow((d/c),2)));
                    ((TextView) findViewById(R.id.textView3)).setText(""+e);
                }
            }

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = (TextView) findViewById(R.id.textView3);
        b1 = (Button) findViewById(R.id.button);
        e1 = (EditText) findViewById(R.id.e1);
        b1.setOnClickListener(clickListener);
    }

    public void toast1(){
        Toast.makeText(MainActivity.this,"Enter Velocity",Toast.LENGTH_SHORT).show();
    }
    public void toast2(){
        Toast.makeText(MainActivity.this,"Invalid Input",Toast.LENGTH_SHORT).show();
    }
}
