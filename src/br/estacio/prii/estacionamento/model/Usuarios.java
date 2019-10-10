/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.prii.estacionamento.model;

/**
 *
 * @author alunoti
 */
public class Usuarios {
    private int codigo;
    private String nome, placa, telefone, cpf, login, senha, veiculo, cor;

    public String getPlaca(){  return placa; }
    public void setPlaca(String placa){ this.placa = placa; }
    public String getVeiculo(){ return veiculo;}
    public void setVeiculo(String veiculo){ this.veiculo = veiculo;}
    public String getCor(){ return cor; }
    public void setCor(String cor){ this.cor = cor; }
    private boolean ativo;
    public String getEmail(){ return placa; }
    public void setEmail(String email){ this.placa = email; }
    public String getTelefone(){ return telefone; }
    public void setTelefone(String telefone){ this.telefone = telefone; }
    public String getCpf(){ return cpf; }
    public void setCpf(String cpf){ this.cpf = cpf; }
    public String getLogin(){ return login; }
    public void setLogin(String login){ this.login = login; }
    public String getSenha() { return senha; }
    public void setSenha(String senha){ this.senha = senha; }   
    public boolean isAtivo(){ return ativo; }
    public void setAtivo(boolean ativo){ this.ativo = ativo; }
    public int getCodigo(){ return codigo; } 
    public void setCodigo(int codigo){ this.codigo = codigo; }
    public String getNome(){ return nome; }
    public void setNome(String nome){ this.nome = nome; }
    
}
