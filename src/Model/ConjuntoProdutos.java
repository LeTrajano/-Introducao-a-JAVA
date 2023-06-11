package Model;

import java.util.ArrayList;

public class ConjuntoProdutos {

	 private ArrayList <Produto> produtos;
	 public ConjuntoProdutos() {
	        produtos = new ArrayList<>();
	    }
	 public boolean inserirProduto(Produto produto) {
	        if (existeProduto(produto.getCodigo())) {
	            System.out.println("Erro: Já existe um produto com o código " + produto.getCodigo());
	            return false;
	        }
	        
	        produtos.add(produto);
	        return true;
	    }

	    public boolean removerProduto(int codigo) {
	        for (int i = 0; i < produtos.size(); i++) {
	            if (produtos.get(i).getCodigo() == codigo) {
	                produtos.remove(i);
	                return true;
	            }
	        }

	        System.out.println("Erro: Produto com o código " + codigo + " não encontrado.");
	        return false;
	    }

	    public boolean atualizarProduto(int codigo, Produto novoProduto) {
	        if (existeProduto(novoProduto.getCodigo()) && novoProduto.getCodigo() != codigo) {
	            System.out.println("Erro: Já existe um produto com o código " + novoProduto.getCodigo());
	            return false;
	        }

	        for (int i = 0; i < produtos.size(); i++) {
	            if (produtos.get(i).getCodigo() == codigo) {
	                produtos.set(i, novoProduto);
	                return true;
	            }
	        }

	        System.out.println("Erro: Produto com o código " + codigo + " não encontrado.");
	        return false;
	    }

	    public void mostrarProdutos() {
	        if (produtos.isEmpty()) {
	            System.out.println("Não há produtos cadastrados.");
	            return;
	        }

	        System.out.println("Lista de produtos:");
	        for (Produto produto : produtos) {
	        System.out.println("Código: " + produto.getCodigo());
	        System.out.println("Nome: " + produto.getNome());
	        System.out.println("Valor: " + produto.getValor());
	        System.out.println("Fornecedor: " + produto.getFornecedor().getNome());
	        System.out.println("CNPJ do Fornecedor: " + produto.getFornecedor().getCnpj());
	        System.out.println("-----------------------");
	        }
	    }

	    public boolean atualizarPrecoProduto(int codigo, float percentual) {
	    for (Produto produto : produtos) {
	    if (produto.getCodigo() == codigo) {
	        produto.atualizarPreco(percentual);
	    return true;
	            }
	        }

	    System.out.println("Erro: Produto com o código " + codigo + " não encontrado.");
	    return false;
	    }

	    private boolean existeProduto(int codigo) {
	        for (Produto produto : produtos) {
	        if (produto.getCodigo() == codigo) {
	        return true;
	            }
	        }
	        return false;
	    }
}