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
public class Pedido {
    private long id;
    private float valorTotal;
    private Locacao locacao[];
    private Enum status;
    private Cliente cliente;
    private float caucao;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Locacao[] getLocacao() {
        return locacao;
    }

    public void setLocacao(Locacao[] locacao) {
        this.locacao = locacao;
    }

    public Enum getStatus() {
        return status;
    }

    public void setStatus(Enum status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public float getCaucao() {
        return caucao;
    }

    public void setCaucao(float caucao) {
        this.caucao = caucao;
    }
    
}
