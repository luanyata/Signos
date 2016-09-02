package br.com.luanyata.signos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView listaSignos;
    private String[] signos = {"Áres", "Touro", "Gêmeos", "Câncer", "Leão",
            "Virgem", "Libra", "Escorpião", "Sagitário", "Capricórnio", "Aquário",
            "Peixes"};

    private String[] perfis = {"Besterias Sobre Áres",
            "Besteiras Sobre Touro",
            "Besteiras Sobre Gêmeos",
            "Besteiras Sobre Câncer",
            "Besteiras Sobre Leão",
            "Besteiras Sobre Virgem",
            "Besteiras Sobre Libra",
            "Besteiras Sobre Escorpião",
            "Besteiras Sobre Sagitário",
            "Besteiras Sobre Capricórnio",
            "Besteiras Sobre Aquário",
            "Besteiras Sobre Peixes",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaSignos = (ListView) findViewById(R.id.listViewid);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, signos);
        listaSignos.setAdapter(adapter);

        listaSignos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int posicao, long l) {
                String perfil = perfis[posicao];
                Toast.makeText(getApplicationContext(), perfil, Toast.LENGTH_LONG).show();
            }
        });
    }
}
