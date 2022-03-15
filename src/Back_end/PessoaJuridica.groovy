package Back_end

class PessoaJuridica extends Pessoa {
    String cnpj
    String pais
    List competencias = []

    PessoaJuridica (String nome, String email, String estado, String cep, String descricao, String cnpj, String pais, competencias) {
        super(nome, email, estado, cep, descricao)
        this.cnpj = cnpj
        this.pais = pais
        this.competencias = competencias
    }

    @Override
    public String toString() {
        return "PessoaJuridica {" +
                "CNPJ = " + cnpj  +
                " Pais = " + pais +
                " Competencias = " + competencias +
                " Nome = " + "$super.nome" +
                " Email = " + "$super.email" +
                " Estado = " + "$super.estado" +
                " CEP = " + "$super.cep" +
                " Descrição = " + "$super.descricao"
                ""
        '}';
    }

}