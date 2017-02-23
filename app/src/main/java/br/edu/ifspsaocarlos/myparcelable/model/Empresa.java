package br.edu.ifspsaocarlos.myparcelable.model;

import org.parceler.Parcel;

import java.util.ArrayList;

/**
 * Created by lucas on 15/02/17.
 */
/*
    Link para a biblioteca: https://github.com/johncarl81/parceler
    Após a instalação do framework vide build.gradle (app)
    Para transformar um POJO em um Parcelable, somente é preciso
    inserir o decorador @Parcel na classe.

    A grande vantagem é que não é preciso criar tanto "boilerplate"
    e o resultado é o mesmo. Não é preciso implementar interface alguma,
    nem sobreescrever o método writeToParcel ou createFromParcel e nem mesmo
    declarar uma classe aninhada.

    Uma desvantagem é que é preciso inserir mais uma dependência no projeto.
    Somente alguns tipos de campos podem ser utilizados com esse decorador
    a lista se encontra nesse link: https://github.com/johncarl81/parceler#parcel-attribute-types
    Atributos private são penalizados em performance, mas ainda sim é muito mais rápido que Serialization
*/
@Parcel
public class Empresa {
    private String nomeEmpresa;
    private ArrayList<Funcionarios> funcionarios = new ArrayList<>();

    public Empresa() {
    }

    public Empresa(String nomeEmpresa, ArrayList<Funcionarios> funcionarios) {
        this.nomeEmpresa = nomeEmpresa;
        this.funcionarios = funcionarios;
    }


    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public ArrayList<Funcionarios> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionarios> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void addFuncionario(Funcionarios f) {
        funcionarios.add(f);
    }


    @Override
    public String toString() {
        return nomeEmpresa;
    }
}
