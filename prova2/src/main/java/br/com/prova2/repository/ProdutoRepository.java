package br.com.prova2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.prova2.model.Produto;

public interface ProdutoRepository  extends JpaRepository<Produto, Long> {

}
