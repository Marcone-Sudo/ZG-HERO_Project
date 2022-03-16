package Back_end

import Back_end.LinkeTinderServices

boolean acao = true

LinkeTinderServices LTServices = new LinkeTinderServices()

while (acao) {

    println()
    println "Seja Bem Vindo ao LinkeTinder"
    println "Agora você está a um click do seu próximo emprego"
    println "Escolha uma opção"
    println()
    println "[1] --> Para efetuar um novo cadastro"
    println "[2] --> Para listar as empresas cadastradas"
    println "[3] --> Para listar os candidatos cadastrados"
    println()

    Scanner scanner = new Scanner(System.in)
    String opcao = scanner.nextLine()

    switch (opcao) {

        case "1":

            println()
            println "Informe a opção desejada"
            println()
            println "[1] --> Para cadastrar uma nova empresa"
            println "[2] --> Para cadastrar um novo funcionário"
            println()
            String tipoCadastro = scanner.nextLine()

            if (tipoCadastro == "1") {

                def competencias = []

                println "Informe o nome a ser cadastrado"
                String nome = scanner.nextLine()
                println "Informe o email a ser cadastrado"
                String email = scanner.nextLine()
                println "Informe o seu estado (Ex: Goias)"
                String estado = scanner.nextLine()
                println "Informe o seu cep"
                String cep = scanner.nextLine()
                println "Informe uma descrição a respeito de sua empresa"
                String descricao = scanner.nextLine()
                println "Informe o seu CNPJ"
                String cnpj = scanner.nextLine()
                println "Informe o país de origem de sua empresa"
                String pais = scanner.nextLine()

                while (true) {

                    println "Vamos cadastrar algumas competencias?"
                    println "Informe uma competência que estejas procurando em um candidato."
                    String auxCompetencia = scanner.nextLine()
                    competencias.add(auxCompetencia)
                    println "Deseja informar uma nova competência? [1] - SIM [2] - NÃO"
                    String resposta = scanner.nextLine()

                    if (resposta != "1") {
                        break
                    }

                }

                LTServices.CadastrarNovaEmpresa(nome, email, estado, cep, descricao, cnpj, pais, competencias)

            }
            if (tipoCadastro == "2") {

                def competencias = []

                println "Informe o nome a ser cadastrado"
                String nome = scanner.nextLine()
                println "Informe o email a ser cadastrado"
                String email = scanner.nextLine()
                println "Informe o seu estado (Ex: Goias)"
                String estado = scanner.nextLine()
                println "Informe o seu cep"
                String cep = scanner.nextLine()
                println "Informe uma descrição a respeito de você"
                String descricao = scanner.nextLine()
                println "Informe o número de seu CPF"
                String cpf = scanner.nextLine()
                println "Informe a sua idade"
                int idade = Integer.parseInt(scanner.nextLine())

                while (true) {

                    println "Vamos cadastrar suas competencias?"
                    println "Informe uma competência que acredite que possuas"
                    String auxCompetencia = scanner.nextLine()
                    competencias.add(auxCompetencia)
                    println "Deseja informar uma nova competência? [1] - SIM [2] - NÃO"
                    String resposta = scanner.nextLine()

                    if (resposta != "1") {
                        break
                    }

                }

                LTServices.CadastrarNovoCandidato(nome, email, estado, cep, descricao, cpf, idade, competencias)
            }
            break

        case "2":

            LTServices.empresas.each {println it.toString()}
            break

        case "3":

            LTServices.candidatos.each {println it.toString()}
            break

        default:
            break
    }


}