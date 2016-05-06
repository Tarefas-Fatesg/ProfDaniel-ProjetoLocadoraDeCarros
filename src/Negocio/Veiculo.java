/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.util.Calendar;

/**
 *
 * @author kai
 */
public class Veiculo {
    private long id;
    private Modelo modelo;
    private String placa;
    private String chassi;
    private String cor;
    private Calendar ano;
    private Acessorios acessorio[];
    private Manutencao manutencao[];

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Calendar getAno() {
        return ano;
    }

    public void setAno(Calendar ano) {
        this.ano = ano;
    }

    public Acessorios[] getAcessorio() {
        return acessorio;
    }

    public void setAcessorio(Acessorios[] acessorio) {
        this.acessorio = acessorio;
    }

    public Manutencao[] getManutencao() {
        return manutencao;
    }

    public void setManutencao(Manutencao[] manutencao) {
        this.manutencao = manutencao;
    }
    
}
