package br.com.prova2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.prova2.model.GrupoProduto;

public interface GrupoProdutoRepository  extends JpaRepository<GrupoProduto, Long> {

}
