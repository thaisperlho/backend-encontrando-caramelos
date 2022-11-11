package br.edu.fatec.projetoec.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Endereco_ongs")
public class EnderecoOng {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    private String cep;
    private String bairro;
    private String logadouro;
    private String cidade;
    private String estado;
    private String complemento;
    private Integer numero;

    @ManyToOne()
    @JoinColumn(name = "fk_id_ong")
    private Ong ong;


    //CONSTRUTOR VAZIO

    public EnderecoOng(){

    }

    //CONSTRUTOR QUE RECEBE PARAMETROS

    public EnderecoOng(Integer id, String cep, String bairro, String logadouro, String cidade, String estado, String complemento, Integer numero, Ong ong){
    this.id = id;
    this.cep = cep;
    this.bairro = bairro;
    this.logadouro = logadouro;
    this.cidade = cidade;
    this.estado = estado;
    this.complemento = complemento;
    this.numero = numero;
    this.ong = ong;
    }


    //GETTERS E SETTERS
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getLogadouro() {
        return logadouro;
    }
    public void setLogadouro(String logadouro) {
        this.logadouro = logadouro;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public Ong getOng() {
        return ong;
    }
    public void setOng(Ong ong) {
        this.ong = ong;
    }
}
