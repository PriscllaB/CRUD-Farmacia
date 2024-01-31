package com.generation.farmacia.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

	@Entity
	@Table(name = "tb_produto")
		public class Produto {
	

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Size(min=2, max=50, message = "O nome deve ter no mínimo 2 caracteres e no máximo 50")
	    @NotBlank(message = "Atributo nome é obrigatório")
	    private String nome;

	    @NotNull(message = "Atributo preço é obrigatório")
	    private Double preco;

	    @Size(min=5, max=255, message = "O nome da descrição deve ter no mínimo 10 caracteres e no máximo 255")
	    private String descricao;

	    @Size( max=100, message = "O nome do laboratorio deve ter  máximo 100")
	    private String laboratiro; 

	    @NotBlank(message = "Data de validade")
	    private String dataDeValidade;
	    
	    @ManyToOne
		@JsonIgnoreProperties("produto")
		private Categoria categoria;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public Double getPreco() {
			return preco;
		}

		public void setPreco(Double preco) {
			this.preco = preco;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public String getLaboratiro() {
			return laboratiro;
		}

		public void setLaboratiro(String laboratiro) {
			this.laboratiro = laboratiro;
		}

		public String getDataDeValidade() {
			return dataDeValidade;
		}

		public void setDataDeValidade(String dataDeValidade) {
			this.dataDeValidade = dataDeValidade;
		}

		public Categoria getCategoria() {
			return categoria;
		}

		public void setCategoria(Categoria categoria) {
			this.categoria = categoria;
		}
	    
	    

}
