package Back_end

class PessoaJuridica extends Pessoa {
    String cnpj
    String pais
    List competencias = []

    PessoaJuridica (String nome, String email, String estado, String cep, String descricao, String cnpj, String pais) {
        super(nome, email, estado, cep, descricao)
        this.cnpj = cnpj
        this.pais = pais
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" + '\'' +
                "cnpj='" + cnpj + '\'' +
                ", pais=" + pais + '\'' +
                ", competencias=" + competencias + '\'' +
                "$super.nome" + '\'' +
                "$super.email" + '\'' +
                "$super.estado" + '\'' +
                "$super.cep" + '\'' +
                "$super.descricao" + '\'' +
                ""
        '}';
    }

}