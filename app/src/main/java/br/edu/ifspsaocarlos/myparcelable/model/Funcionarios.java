package br.edu.ifspsaocarlos.myparcelable.model;

import org.parceler.Parcel;

/**
 * Created by lucas on 15/02/17.
 */
/*
A classe funcionário também deve ser um @Parcel
por quê é serializada junto da classe Empresa.
 */
@Parcel
public class Funcionarios {
    private String nome;

    public Funcionarios(String nome) {
        this.nome = nome;
    }

    public Funcionarios() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
