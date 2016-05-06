/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author kai
 */
class Itinerario {
    private Estado origem;
    private Estado destino;
    private float kmTotal;

    public Estado getOrigem() {
        return origem;
    }

    public void setOrigem(Estado origem) {
        this.origem = origem;
    }

    public Estado getDestino() {
        return destino;
    }

    public void setDestino(Estado destino) {
        this.destino = destino;
    }

    public float getKmTotal() {
        return kmTotal;
    }

    public void setKmTotal(float kmTotal) {
        this.kmTotal = kmTotal;
    }
    
    
    
    public float calcularkmtotal(){
        return 0;
        
    }
}
