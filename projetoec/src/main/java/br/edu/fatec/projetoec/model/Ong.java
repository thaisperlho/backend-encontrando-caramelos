package br.edu.fatec.projetoec.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ongs")
public class Ong {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	private String nome;
	private String cnpj;
	private String telefone;
	private String site;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_id_usuario", referencedColumnName = "id" )
	private Usuario usuario;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_id_tipo_ajuda", referencedColumnName = "id" )
	private TipoAjuda tipoAjuda;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_id_responsavel", referencedColumnName = "id" )
	private ResponsavelOng responsavelOng;
	
	
	
	
	
	public Ong() {
	}

	public Ong(Integer id, String nome, String cnpj, String telefone, String site, Usuario usuario, TipoAjuda tipoAjuda,
			ResponsavelOng responsavelOng) {
		this.id = id;
		this.nome = nome;
		this.cnpj = cnpj;
		this.telefone = telefone;
		this.site = site;
		this.usuario = usuario;
		this.tipoAjuda = tipoAjuda;
		this.responsavelOng = responsavelOng;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public TipoAjuda getTipoAjuda() {
		return tipoAjuda;
	}
	public void setTipoAjuda(TipoAjuda tipoAjuda) {
		this.tipoAjuda = tipoAjuda;
	}
	public ResponsavelOng getResponsavelOng() {
		return responsavelOng;
	}
	public void setResponsavelOng(ResponsavelOng responsavelOng) {
		this.responsavelOng = responsavelOng;
	}
	
	

}
