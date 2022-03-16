package Back_end

class LinkeTinderServices {

    List<PessoaFisica> candidatos = []
    List<PessoaJuridica> empresas = []

    PessoaFisica CadastrarNovoCandidato(nome, email, estado, cep, descricao, cpf, idade, competencias) {

        def novoCandidato = new PessoaFisica(nome, email, estado, cep, descricao, cpf, idade, competencias)
        candidatos.add(novoCandidato)

        return novoCandidato

    }

    PessoaJuridica CadastrarNovaEmpresa(nome, email, estado, cep, descricao, cnpj, pais, competencias) {

        def novaEmpresa = new PessoaJuridica(nome, email, estado, cep, descricao, cnpj, pais, competencias)
        empresas.add(novaEmpresa)

        return novaEmpresa

    }

    PessoaFisica FindCandidatoByCpf(cpf) {

        for(PessoaFisica c : this.candidatos) {
            if(c.cpf == cpf) {
                return c
            }
        }
        return null
    }

    PessoaJuridica FindEmpresaByCnpj(cnpj) {

        for(PessoaJuridica c : this.empresas) {
            if(c.cnpj == cnpj) {
                return c
            }
        }
        return null
    }

}
