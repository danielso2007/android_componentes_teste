package br.com.daniel.oliveira.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class ButtonActivity extends Activity {

    private Button btn1;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Toast.makeText(ButtonActivity.this, "Teste do Botão", Toast.LENGTH_LONG).show();
            }
        });
    }

}
