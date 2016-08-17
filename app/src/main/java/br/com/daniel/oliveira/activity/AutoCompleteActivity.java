package br.com.daniel.oliveira.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class AutoCompleteActivity extends Activity {

    private AutoCompleteTextView componenteAutoComp;

    private static final String[] arrayEstados =
            new String[] {
                    "Acre",
                    "Alagoas",
                    "Amapá",
                    "Amazonas",
                    "Bahia",
                    "Ceará",
                    "Distrito Federal",
                    "Espírito Santo",
                    "Goiás",
                    "Maranhão",
                    "Mato Grosso",
                    "Mato Grosso do Sul",
                    "Minas Gerais",
                    "Pará",
                    "Paraíba",
                    "Paraná",
                    "Pernambuco",
                    "Piauí",
                    "Rio de Janeiro",
                    "Rio Grande do Norte",
                    "Rio Grande do Sul",
                    "Rondônia",
                    "Roraima",
                    "Santa Catarina",
                    "São Paulo",
                    "Sergipe",
                    "Tocantins"
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_comp);

        //Recupera o componente
        componenteAutoComp = (AutoCompleteTextView) findViewById(R.id.acEstados);

        //Cria um ArrayAdapter para exibir os estados
//        ArrayAdapter<String> adaptadorTimes = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, arrayEstados);
        ArrayAdapter<String> adaptadorTimes =  new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayEstados);

        //Insere o adaptador no componente
        componenteAutoComp.setAdapter(adaptadorTimes);
    }
}
