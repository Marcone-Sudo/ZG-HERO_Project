package Back_end

class PessoaFisica extends Pessoa{
    String cpf
    int idade
    List competencias = []

    PessoaFisica (String nome, String email, String estado, String cep, String descricao, String cpf, int idade, competencias){
        super(nome, email, estado, cep, descricao)
        this.cpf = cpf
        this.idade = idade
        this.competencias = competencias
    }


    @Override
    public String toString() {
        return "PessoaFisica {" +
                " CPF ='" + cpf + '\'' +
                " Idade=" + idade +
                " Competencias=" + competencias +
                " Nome = " + "$super.nome" +
                " Email = " + "$super.email" +
                "Estado = " + "$super.estado" +
                "CEP = " + "$super.cep" +
                "Descrição = " + "$super.descricao"
                ""
                '}';

    }
}
