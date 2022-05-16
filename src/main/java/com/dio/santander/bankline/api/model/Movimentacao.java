package com.dio.santander.bankline.api.model;

public class Movimentacao {
	private Integer id;
	/* Integer é uma classe Wrapper do tipo primitivo int, ou seja,
	  uma tipologia que quando você declara não é inicializada pela
	 linguagem. O integer aceita o mesmo tipo de valores que a int.
	 */
	private LocalDateTime dataHora;
	/*private. Os membros da classe definidos como nao podem ser acessados 
	 * ou usados por nenhuma outra classe. Esse modificador não se aplica
	 * às classes, somente para seus métodos e atributos. Esses atributos
	 * também náo podem ser visualizados pelas classes herdadas.
	 */
	private String descriçao;
	/*String são sequencias de caracteres
	 alfanúmericos (letras, números e/ou símbolos) amplamente
	 usadas em programação. em Javascript, uma "string" sempre estará entre aspas
	 */
	private Double valor; 
	/* o tipo de dados double é usado quando precisamos armazenar números de ponto-flutuante
	 * (com parte fracinária) na faixa 4.94065645841246544e-324 até 1.79769313486231570e+308,
	 * possui precisão de 14 ou 15 dígitos significativos.
	 * */
	private MovimentacaoTipo tipo;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDateTime getDataHora() {
		return dataHora;
	}
	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}
	public String getDescriçao() {
		return descriçao;
	}
	public void setDescriçao(String descriçao) {
		this.descriçao = descriçao;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public MovimentacaoTipo getTipo() {
		return tipo;
	}
	public void setTipo(MovimentacaoTipo tipo) {
		this.tipo = tipo;
	}
	
	

}
