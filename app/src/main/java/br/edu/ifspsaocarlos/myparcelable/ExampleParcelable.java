package br.edu.ifspsaocarlos.myparcelable;


import org.parceler.Parcel;

/**
 * Created by Lucas on 15/02/17.
 */

@Parcel
public class ExampleParcelable {
    private String name;
    private int idade;
    public ExampleParcelable() {}
    public ExampleParcelable(String name, int idade) {
        this.name = name;
        this.idade = idade;
    }
    public String getName() {
        return name;
    }
    public int getIdade() {
        return idade;
    }


}