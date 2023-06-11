package Model;

public class TesteProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Fornecedores fornecedor1 = new Fornecedores("1234321", "Telefone do Fornecedor 1", "Zé Maria");
	       Fornecedores fornecedor2 = new Fornecedores("543212345", "Telefone do Fornecedor 2", "Cláudio");
	      
	       Produto produto1 = new Produto(1, "TV LCD", 3500.00f, fornecedor1);
	       Produto produto2 = new Produto(2, "notebook", 2000.00f, fornecedor2);
	       Produto produto3 = new Produto(3, "Impressora", 232.00f, fornecedor2);
	        
	        produto1.atualizarPreco(12.0f); 
	        produto1.mostrarProduto();
	        
	        System.out.println();
	        
	        produto2.atualizarPreco(10.0f); 
	        produto2.mostrarProduto();
	        
	        System.out.println();
	        
	        produto3.atualizarPreco(5.0f);
	        produto3.mostrarProduto();
	    }
	}