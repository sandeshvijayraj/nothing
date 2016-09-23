package com.example.sandeshbafna.greetingcard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    String bboy;
    String myname;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button done = (Button) findViewById(R.id.done);
        final EditText from1 = (EditText) findViewById(R.id.from1);
        final EditText bb = (EditText) findViewById(R.id.bboy);

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                bboy =bb.getText().toString();
                myname = from1.getText().toString();
                intent.putExtra("bb", bboy);
                intent.putExtra("my", myname);
                startActivity(intent);
            }
        });
    }
}
