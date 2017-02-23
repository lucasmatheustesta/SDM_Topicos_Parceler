package br.edu.ifspsaocarlos.myparcelable;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;

import org.parceler.Parcels;

import java.util.ArrayList;

import br.edu.ifspsaocarlos.myparcelable.model.Empresa;
import br.edu.ifspsaocarlos.myparcelable.model.Funcionarios;

public class MainActivity extends ListActivity {
    private ArrayList<Empresa> empresas;
    public static final String INTENT_EMPRESA = "IntentEmpresa";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        empresas = new ArrayList<>();
        carregaInfo();
        ArrayAdapter<Empresa> adapter = new ArrayAdapter<Empresa>(this, android.R.layout.simple_list_item_1, empresas);
        setListAdapter(adapter);
    }

    private void carregaInfo() {
        Empresa empresa1 = new Empresa();
        empresa1.setNomeEmpresa("Empresa 1");
        empresa1.addFuncionario(new Funcionarios("Lucas"));
        empresa1.addFuncionario(new Funcionarios("Matheus"));
        empresa1.addFuncionario(new Funcionarios("Robson"));
        empresa1.addFuncionario(new Funcionarios("Cristian"));
        empresa1.addFuncionario(new Funcionarios("Felipe"));

        Empresa empresa2 = new Empresa();
        empresa2.setNomeEmpresa("Empresa 2");
        empresa2.addFuncionario(new Funcionarios("Pablo"));

        empresas.add(empresa1);
        empresas.add(empresa2);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        // Recupera uma empresa de um list adapter
        Empresa e = (Empresa) this.getListAdapter().getItem(position);

        // Cria um intent para mostrar os detalhes da empresa
        Intent intent = new Intent(this, ShowActivity.class);
        // Adiciona a empresa na intent utilizando o método Parcels.wrap()
        intent.putExtra(INTENT_EMPRESA, Parcels.wrap(e));
        // Start na activity
        startActivity(intent);
    }
}
