package Model;

public class Produto {

	private int codigo;
    private String nome;
    private float valor;
    private Fornecedores fornecedores;
    
    public Produto(int codigo, String nome, float valor, Fornecedores fornecedores) {
        
    	this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.fornecedores = fornecedores;
    }
    
   

   
    public void atualizarPreco(float percentual) {
        float aumento = valor * (percentual / 100);
        valor += aumento;
    }
    
    
    
    
    public int getCodigo() {
        return codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public float getValor() {
        return valor;
    }
    
    public void setValor(float valor) {
        this.valor = valor;
    }
    
    public Fornecedores getFornecedor() {
        return fornecedores;
    }
    
    public void setFornecedor(Fornecedores fornecedores) {
        this.fornecedores = fornecedores;
    }
}