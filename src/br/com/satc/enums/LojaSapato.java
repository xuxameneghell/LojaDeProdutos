/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.enums;

/**
 *
 * @author luana.159917
 */
public enum LojaSapato {
    BotaCanoLongo("Bota cano longo", "Confortável e prático", 'I', (float)69.90, 1990),
    BotaCanoCurto("Bota cano curto","Confortável e prático", 'A', (float)59.90, 1991),
    BotaSaltoAlto("Bota salto alto", "Lindo e confortável", 'A', (float)119.99, 1992),
    BotaSaltoCurto("Bota salto curto", "Lindo e confortável", 'A', (float)99.99, 1993),
    BotaSaltoFino("Bota salto fino", "Lindo e confortável",'A', (float)199.90, 1994),
    TenisAllStar("Tênis All Star", "Lindo, prático e confortável",'A', (float)139.99, 1995),
    TenisAdidas("Tênis Adidas", "Lindo, prático e confortável", 'I', (float)129.99, 1996),
    TenisNike("Tênis Nike", "Lindo, prático e confortável", 'A', (float)110.99, 1997),
    Sapatenis("Sapatênis", "Lindo, prático e confortável", 'A', (float)49.99, 1998),
    SapatoSaltoAlto("Sapato salto alto", "Lindo e confortável", 'I', (float)135.90, 1999),
    SapatoSaltoCurto("Sapato salto curto", "Lindo e confortável", 'A', (float)109.90, 2000);
    private String nome;
    private String descricao;
    private char status;
    private float valor;
    private int id;

        private LojaSapato(String nome, String descricao, char status, float valor, int id) {
            this.nome = nome;
            this.descricao = descricao;
            this.status = status;
            this.valor = valor;
            this.id = id;
        }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public char getStatus() {
        return status;
    }

    public float getValor() {
        return valor;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "LojaSapato{" + "nome=" + nome + ", descricao=" + descricao + ", status=" + status + ", valor=" + valor + ", id=" + id + '}';
    }
    }
   

    

