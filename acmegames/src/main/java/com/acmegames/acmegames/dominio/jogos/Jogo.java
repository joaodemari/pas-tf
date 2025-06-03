
package com.acmegames.acmegames.dominio.jogos;

import jakarta.persistence.Entity;

@Entity
public abstract class Jogo{
    private int codigo;
    private String nome;
    private double valorBase;
}