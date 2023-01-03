package DesafioProduto;

public class Produto{
	private int codigo;
	private String nomePro;
	private double valorPro;
	private int qntdPro;

	public String mostrarProduto() {
		return "codigo :"+this.codigo
				+"\n nome do produto :"+this.nomePro
				+"\n valor do produto :"+this.valorPro
				+"\n quantidade no estoque :"+getQntdPro();

	}
	
	public int vizualizaEstoque(){
		
		return this.qntdPro;
	}

	public int Estoque(int produto) {
		

		this.qntdPro= this.qntdPro - produto;
		return produto;
	}

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNomePro() {
		return nomePro;
	}
	public void setNomePro(String nomePro) {
		this.nomePro = nomePro;
	}
	public double getValorPro() {
		return valorPro;
	}
	public void setValorPro(double valorPro) {
		this.valorPro = valorPro;
	}
	public double getQntdPro() {
		return qntdPro;
	}
	public void setQntdPro(int qntdPro) {
		this.qntdPro = qntdPro;
	}

}