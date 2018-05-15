package com.example.jts.svpi;

/**
 * Created by danie on 14/05/2018.
 */

public class Usuario {
    private String Nome;
    private String Senha;
    private String id;
    private String funcao;

    public Usuario() {
    }

    public Usuario(String nome, String senha, String id, String funcao) {
        Nome = nome;
        Senha = senha;
        this.id = id;
        this.funcao = funcao;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }



}
