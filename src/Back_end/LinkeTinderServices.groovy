package Back_end

class LinkeTinderServices {

    def candidatos = []
    def empresas = []


    void CadastrarNovoCandidato(nome, email, estado, cep, descricao, cpf, idade, competencias) {

        def novoCandidato = new PessoaFisica(nome, email, estado, cep, descricao, cpf, idade, competencias)
        candidatos.add(novoCandidato)

    }

    void CadastrarNovaEmpresa(nome, email, estado, cep, descricao, cnpj, pais, competencias) {

        def novaEmpresa = new PessoaJuridica(nome, email, estado, cep, descricao, cnpj, pais, competencias)
        empresas.add(novaEmpresa)

    }

    void FindCandidato(cpf) {

        //for()

    }

    void FindEmpresa(cnpj) {

        //for()

    }

}
