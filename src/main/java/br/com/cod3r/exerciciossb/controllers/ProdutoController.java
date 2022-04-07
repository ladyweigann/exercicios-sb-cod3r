package br.com.cod3r.exerciciossb.controllers;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.cod3r.exerciciossb.model.entities.Produto;
import br.com.cod3r.exerciciossb.model.repositories.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	@RequestMapping(method= {RequestMethod.POST, RequestMethod.PUT})
	public @ResponseBody Produto novoProduto(@Valid Produto produto) { //criação de produtos e/ou alteração completa ou parcial
		produtoRepository.save(produto); //método save vem do CrudRepository
		return produto;		
	}
	
	@GetMapping
	public Iterable<Produto> obterProdutos() { //leitura de todos os produtos
		return produtoRepository.findAll();
	}
	
	@GetMapping(path="/nome/{parteNome}")
	public Iterable<Produto> obterProdutosPorNome(@PathVariable String parteNome) { // 
		return produtoRepository.findByNomeContainingIgnoreCase(parteNome);
	}
	
	@GetMapping(path="/pagina/{numeroPagina}/{qtdPagina}") 
	public Iterable<Produto> obterProdutosPorPagina(@PathVariable int numeroPagina, @PathVariable int qtdPagina) { //leitura de produtos por páginas
		if(qtdPagina > 10) qtdPagina = 10; //máximo de 10 elementos por pág
		PageRequest page = PageRequest.of(numeroPagina,  qtdPagina); //segundo parâmetro recebe a quantidade de elementos por pág
		return produtoRepository.findAll(page);
	}
	
	@GetMapping(path="/{id}") 
	public Optional<Produto> obterProdutoPorId(@PathVariable int id) { //leitura de produtos específicos por id
		return produtoRepository.findById(id);
	}

	@DeleteMapping(path="/{id}") 
	public void excluirProduto(@PathVariable int id) {
		produtoRepository.deleteById(id); //deletar produto
	}
	
	
	
}
