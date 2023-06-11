package Model;

public class TesteProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Fornecedores fornecedor1 = new Fornecedores("1234321", "Telefone do Fornecedor 1", "Zé Maria");
	       Fornecedores fornecedor2 = new Fornecedores("543212345", "Telefone do Fornecedor 2", "Cláudio");
	      
	       Produto produto1 = new Produto(1, "TV LCD", 3500.00f, fornecedor1);
	       Produto produto2 = new Produto(2, "notebook", 2000.00f, fornecedor2);
	       Produto produto3 = new Produto(3, "Impressora", 232.00f, fornecedor2);
	        
	        System.out.println("Produto 1:");
	        System.out.println("Código: " + produto1.getCodigo());
	        System.out.println("Nome: " + produto1.getNome());
	        System.out.println("Valor: " + produto1.getValor());
	        System.out.println("Fornecedor: " + produto1.getFornecedor().getNome());
	        System.out.println("CNPJ do Fornecedor: " + produto1.getFornecedor().getCnpj());
	        
	        System.out.println("\nProduto 2:");
	        System.out.println("Código: " + produto2.getCodigo());
	        System.out.println("Nome: " + produto2.getNome());
	        System.out.println("Valor: " + produto2.getValor());
	        System.out.println("Fornecedor: " + produto2.getFornecedor().getNome());
	        System.out.println("CNPJ do Fornecedor: " + produto2.getFornecedor().getCnpj());
	        
	        System.out.println("\nProduto 3:");
	        System.out.println("Código: " + produto3.getCodigo());
	        System.out.println("Nome: " + produto3.getNome());
	        System.out.println("Valor: " + produto3.getValor());
	        System.out.println("Fornecedor: " + produto3.getFornecedor().getNome());
	        System.out.println("CNPJ do Fornecedor: " + produto3.getFornecedor().getCnpj());
	    }
	}