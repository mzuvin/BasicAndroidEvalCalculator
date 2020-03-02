package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
public class MainActivity extends AppCompatActivity {

    private Button btn;
    private EditText edit;
    private TextView text;
    private Button bir, iki,uc,dort,bes,alti,yedi,sekiz,dokuz,sil,arti,eksi,bol,carp,nokta,sifir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ScriptEngineManager manager = new ScriptEngineManager();
                ScriptEngine engine = manager.getEngineByName("js");
                try{
                    edit = (EditText) findViewById(R.id.editText);
                    Object result = engine.eval(edit.getText().toString());
                    edit.setText(result.toString());
                }catch (ScriptException e) {
                    Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_LONG).show();
                    Log.d("Calculator", " ScriptEngine error: " + e.getMessage());
                }



            }
        });

        sifir = (Button) findViewById(R.id.sifir);
        sifir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                edit = (EditText) findViewById(R.id.editText);

                edit.setText(edit.getText()+"0");
            }
        });

        bir = (Button) findViewById(R.id.bir);
        bir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                edit = (EditText) findViewById(R.id.editText);

                edit.setText(edit.getText()+"1");
            }
        });

        iki = (Button) findViewById(R.id.iki);
        iki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit = (EditText) findViewById(R.id.editText);
                edit.setText(edit.getText()+"2");
            }
        });

        uc = (Button) findViewById(R.id.uc);
        uc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit = (EditText) findViewById(R.id.editText);
                edit.setText(edit.getText()+"3");
            }
        });

        dort = (Button) findViewById(R.id.dort);
        dort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit = (EditText) findViewById(R.id.editText);
                edit.setText(edit.getText()+"4");
            }
        });

        bes = (Button) findViewById(R.id.bes);
        bes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit = (EditText) findViewById(R.id.editText);
                edit.setText(edit.getText()+"5");
            }
        });

        alti = (Button) findViewById(R.id.alti);
        alti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit = (EditText) findViewById(R.id.editText);
                edit.setText(edit.getText()+"6");
            }
        });

        yedi = (Button) findViewById(R.id.yedi);
        yedi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit = (EditText) findViewById(R.id.editText);
                edit.setText(edit.getText()+"7");
            }
        });

        sekiz = (Button) findViewById(R.id.sekiz);
        sekiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit = (EditText) findViewById(R.id.editText);
                edit.setText(edit.getText()+"8");
            }
        });

        dokuz = (Button) findViewById(R.id.dokuz);
        dokuz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit = (EditText) findViewById(R.id.editText);
                edit.setText(edit.getText()+"8");
            }
        });

        arti = (Button) findViewById(R.id.arti);
        arti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit = (EditText) findViewById(R.id.editText);
                edit.setText(edit.getText()+"+");
            }
        });
        eksi = (Button) findViewById(R.id.eksi);
        eksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit = (EditText) findViewById(R.id.editText);
                edit.setText(edit.getText()+"-");
            }
        });

        bol = (Button) findViewById(R.id.bol);
        bol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit = (EditText) findViewById(R.id.editText);
                edit.setText(edit.getText()+"/");
            }
        });

        carp = (Button) findViewById(R.id.carp);
        carp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit = (EditText) findViewById(R.id.editText);
                edit.setText(edit.getText()+"*");
            }
        });
        sil = (Button) findViewById(R.id.sil);
        sil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit = (EditText) findViewById(R.id.editText);
                edit.setText("");
            }
        });
        nokta = (Button) findViewById(R.id.nokta);
        nokta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit = (EditText) findViewById(R.id.editText);
                edit.setText(edit.getText()+".");
            }
        });


    }
}
