package br.com.daniel.oliveira.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String listaArray[] = new String[]{
                "Auto Complete",
                "Button e ImageButton",
                "CheckBox",
                "EditText",
                "RadioButton",
                "Spinner",
                "ToggleButton"};

        //Recupera o componente do XML
        listView = (ListView) findViewById(R.id.lvLista);

        //Configura um adaptador e adiciona o Array
        listView.setAdapter(new ArrayAdapter(this, R.layout.activity_lista, listaArray));

        //Eventos OnItemClick da ListView
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View view, int posicao, long arg3) {

                switch (posicao) {

                    case 0:
                        inicarAtividade(AutoCompleteActivity.class);
                        break;

                    case 1:
                        inicarAtividade(ButtonActivity.class);
                        break;

                }
            }
        });
    }

    private void inicarAtividade(Class classe) {
        Intent intencao = new Intent(this, classe);
        startActivity(intencao);
    }
}
