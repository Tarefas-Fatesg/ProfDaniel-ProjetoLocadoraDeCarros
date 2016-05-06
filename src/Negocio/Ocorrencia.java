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
class Ocorrencia {
    private long id;
    private Calendar dataOc;
    private String descricao;
    private float valorOc;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Calendar getDataOc() {
        return dataOc;
    }

    public void setDataOc(Calendar dataOc) {
        this.dataOc = dataOc;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValorOc() {
        return valorOc;
    }

    public void setValorOc(float valorOc) {
        this.valorOc = valorOc;
    }
}
