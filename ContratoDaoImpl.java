package br.com.rpires.dao.impl;

import br.com.breno.dao.IContratoDao;
import br.com.rpires.model.Contrato;

// Implement database access logic (e.g., using JDBC, JPA, etc.)
public class ContratoDaoImpl implements IContratoDao {

    @Override
    public void salvar(Contrato contrato) {
        // Save the contract to the database
    }

    @Override
    public Contrato buscarPorId(Long id) {
        // Fetch the contract with the given ID from the database
    }

    @Override
    public void atualizar(Contrato contrato) {
        // Update the contract in the database
    }

    @Override
    public void excluir(Long id) {
        // Delete the contract with the given ID from the database
    }
}