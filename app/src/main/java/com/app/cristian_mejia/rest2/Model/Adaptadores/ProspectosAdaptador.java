package com.app.cristian_mejia.rest2.Model.Adaptadores;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.app.cristian_mejia.rest2.Model.Prospecto;
import com.app.cristian_mejia.rest2.R;

import java.util.List;

/**
 * Created by alvei on 13/03/2016.
 */
public class ProspectosAdaptador extends RecyclerView.Adapter<ProspectosAdaptador.AdaptadorViewHolder> {
    private static List<Prospecto> fProspectos;
    public static class AdaptadorViewHolder extends RecyclerView.ViewHolder {
        // Campos respectivos de una persona
        public TextView pNombre;
        public TextView pApellido;
        public TextView pTelefono;
        public TextView pCedula;
        public Button pEditar;


        public AdaptadorViewHolder(View v) {
            super(v);
            pNombre = (TextView) v.findViewById(R.id.nombre);
            pApellido = (TextView) v.findViewById(R.id.apellido);
            pCedula = (TextView) v.findViewById(R.id.cedula);
            pTelefono = (TextView) v.findViewById(R.id.telefono);
            pEditar  = (Button) v.findViewById(R.id.btnEditar);
            pEditar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                        mEditar(fProspectos.get(getAdapterPosition()), v.getContext());
                }
            });
        }
    }

    public ProspectosAdaptador(List<Prospecto> paramprospecto) {
            this.fProspectos = paramprospecto;
        }

    @Override
    public int getItemCount() {
        return fProspectos.size();
    }

    @Override
    public AdaptadorViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.lstlistaprospectos, viewGroup, false);
        return new AdaptadorViewHolder(v);
    }

    @Override
    public void onBindViewHolder(AdaptadorViewHolder viewHolder, int i) {

        Prospecto oProspecto = fProspectos.get(i);

        viewHolder.pNombre.setText(oProspecto.pNombre());
        viewHolder.pApellido.setText(oProspecto.pCedula());
        viewHolder.pTelefono.setText(oProspecto.pTelefono());
        viewHolder.pCedula.setText(oProspecto.pCedula());
    }

    public static void mEditar(Prospecto paramProspecto, Context paramContexto)
    {
        Toast.makeText(paramContexto, paramProspecto.pNombre() ,Toast.LENGTH_SHORT).show();
    }
}
