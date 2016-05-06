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
public class Locacao {
    private long id;
    private Calendar dataLoc;
    private Calendar dataDev;
    private float subtotal;
    private Ocorrencia ocorrencia[];
    private Veiculo veiculo;
    private Itinerario itinerario;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Calendar getDataLoc() {
        return dataLoc;
    }

    public void setDataLoc(Calendar dataLoc) {
        this.dataLoc = dataLoc;
    }

    public Calendar getDataDev() {
        return dataDev;
    }

    public void setDataDev(Calendar dataDev) {
        this.dataDev = dataDev;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public Ocorrencia[] getOcorrencia() {
        return ocorrencia;
    }

    public void setOcorrencia(Ocorrencia[] ocorrencia) {
        this.ocorrencia = ocorrencia;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Itinerario getItinerario() {
        return itinerario;
    }

    public void setItinerario(Itinerario itinerario) {
        this.itinerario = itinerario;
    }
    
}
