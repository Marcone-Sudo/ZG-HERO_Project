package Back_end

import groovy.transform.ToString

@ToString
class Pessoa {
    String nome
    String email
    String estado
    String cep
    String descricao

    //construtor
    Pessoa (String nome, String email, String estado, String cep, String descricao){
        this.nome = nome
        this.email = email
        this.estado = estado
        this.cep = cep
        this.descricao = descricao

    }

    @Override
    String toString() {
        return super.toString()
    }
}
