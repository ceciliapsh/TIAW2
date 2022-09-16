package model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Produto implements Serializable {
	private static final long serialVersionUID = 1L;
	public static final String DESCRICAO_PADRAO = "Novo Produto";
	public static final int MAX_ESTOQUE = 1000;
	private int id;
	private String descricao;
	private String fabricante;
	private int quantidade;
	private LocalDateTime dataFabricacao;	
	private LocalDate dataValidade;
	
	public Produto() {
		id = -1;
		descricao = DESCRICAO_PADRAO;
		fabricante=new fabricante;
				quantidade = 0;
		dataFabricacao = LocalDateTime.now();
		dataValidade = LocalDate.now().plusMonths(6); // o default é uma validade de 6 meses.
	}

	public Produto(int id, String descricao, String fabricante, int quantidade, LocalDateTime fabricacao, LocalDate v) {
		setId(id);
		setDescricao(descricao);
		setFabricante(fabricante);
		setQuant(quantidade);
		setDataFabricacao(fabricacao);
		setDataValidade(v);
	}		
	
	public void setFabricante(String fabricante2) {
		// TODO Auto-generated method stub
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		if (descricao.length() >= 3)
			this.descricao = descricao;
	}

	

	public int getQuant() {
		return quantidade;
	}
	
	public void setQuant(int quantidade) {
		if (quantidade >= 0 && quantidade <= MAX_ESTOQUE)
			this.quantidade = quantidade;
	}
	
	public LocalDate getDataValidade() {
		return dataValidade;
	}

	public LocalDateTime getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(LocalDateTime dataFabricacao) {
		// Pega a Data Atual
		LocalDateTime agora = LocalDateTime.now();
		// Garante que a data de fabricação não pode ser futura
		if (agora.compareTo(dataFabricacao) >= 0)
			this.dataFabricacao = dataFabricacao;
	}

	public void setDataValidade(LocalDate dataValidade) {
		// a data de fabricação deve ser anterior é data de validade.
		if (getDataFabricacao().isBefore(dataValidade.atStartOfDay()))
			this.dataValidade = dataValidade;
	}

	public boolean emValidade() {
		return LocalDateTime.now().isBefore(this.getDataValidade().atTime(23, 59));
	}


	/**
	 * Método sobreposto da classe Object. É executado quando um objeto precisa
	 * ser exibido na forma de String.
	 */
	@Override
	public String toString() {
		return "Produto: " + descricao + "  Fabricante" + fabricante + "   Quant.: " + quantidade + "   Fabricação: "
				+ dataFabricacao  + "   Data de Validade: " + dataValidade;
	}
	
	@Override
	public boolean equals(Object obj) {
		return (this.getId() == ((Produto) obj).getId());
	}

	public String fabricante() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getFabricante() {
		// TODO Auto-generated method stub
		return null;
	}	
}