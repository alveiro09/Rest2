package com.app.cristian_mejia.rest2.View;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.app.cristian_mejia.rest2.Model.Prospecto;
import com.app.cristian_mejia.rest2.R;
import com.app.cristian_mejia.rest2.Model.Adaptadores.ProspectosAdaptador;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alvei on 13/03/2016.
 */
public class actListaProspectos extends Activity{
    private RecyclerView fRecycler;
    private List<Prospecto> fProspectoa;
    private RecyclerView.Adapter fAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lytlistaprospectos);
        fRecycler = (RecyclerView) findViewById(R.id.RecView);
        fRecycler.setLayoutManager(new LinearLayoutManager(this));
        fRecycler.setHasFixedSize(true);

        // Inicializar nuestra lista personas
        fProspectoa = new ArrayList<>();

        //Llenar nuestra lista personas
        for (int i = 0; i <= 10; i++) {
            Prospecto persona = new Prospecto();
            persona.pNombre("Nombre Ejemplo " + i);
            persona.pApellido("Mi edad es: " + i);
            fProspectoa.add(persona);
        }

        fAdapter = new ProspectosAdaptador(fProspectoa);
        fRecycler.setAdapter(fAdapter);
    }
}
