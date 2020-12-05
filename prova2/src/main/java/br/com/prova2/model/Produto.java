package br.com.prova2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//import br.com.prova2.model.GrupoProduto;

@Entity	
@Table(name = "produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "nome")
	private String nome;

	@Column(name = "und")
	private String und;

	@Column(name = "localestoque")
	private String localEstoque;

	@Column(name = "custo")
	private float custo;

	@Column(name = "precovenda")
	private float precoVenda;
	
	@ManyToOne
	@JoinColumn(name="grupo")
	private GrupoProduto grupo;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUnd() {
		return und;
	}

	public void setUnd(String und) {
		this.und = und;
	}

	public String getLocalEstoque() {
		return localEstoque;
	}

	public void setLocalEstoque(String localEstoque) {
		this.localEstoque = localEstoque;
	}

	public float getCusto() {
		return custo;
	}

	public void setCusto(float custo) {
		this.custo = custo;
	}

	public float getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(float precoVenda) {
		this.precoVenda = precoVenda;
	}

	public GrupoProduto getGrupo() {
		return grupo;
	}

	public void setGrupo(GrupoProduto grupo) {
		this.grupo = grupo;
	}


}
