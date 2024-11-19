package br.com.breno.dao;

public interface IContratoDao {

    void salvar(br.com.rpires.model.Contrato contrato);

    br.com.rpires.model.Contrato buscarPorId(Long id);

    void atualizar(br.com.rpires.model.Contrato contrato);

    void excluir(Long id); 


}