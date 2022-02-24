package Back_end

import groovy.transform.ToString

import java.util.Scanner;

class LinkeTinder {

    public void run() {

        def candidatos = []
        def empresas = []


        //Informações referentes aos candidatos (Pessoas Fisicas)

        def pessoa_fisica_1 = new PessoaFisica("Celine Frantz Timm", "celitimm@zgmail.com", "RS", "98685-000",
                "Bacharel em Direito com ênfase em Direito Penal", "039.856.659-80", 43)

        ["Proatividade", "Organização", "Empatia", "Responsabilidade", "Direito Penal", "Direito Social", "Ética"].each{
            pessoa_fisica_1.competencias.add(it)
        }

        candidatos.add(pessoa_fisica_1)

        def pessoa_fisica_2 = new PessoaFisica("Roberta Sanchez Voiggt", "roberta_sanchez97@zgmail.com", "RS", "96600-000",
                "Engenheira de Cibersegurança com ênfase em Segurança de Redes", "036.325.000-88", 28)

        ["Python", "Segurança de Redes", "C++", "Java", "Pentest", "Bancos de Dados", "Infraestrura de Redes", "Metodologias Ágeis", "Responsável"].each{
            pessoa_fisica_2.competencias.add(it)
        }

        candidatos.add(pessoa_fisica_2)

        def pessoa_fisica_3 = new PessoaFisica("Fabiano Marques e Santos", "fabiano_pernambuco@zgmail.com", "PE", "98758-000",
                "Cientista da Computação e programador JAVA", "033.587.000-99", 29)

        ["Java", "Spring Boot", "Testes Unitários", "Banco de Dados", "Clean Code", "Python", "C", "Organização"].each{
            pessoa_fisica_3.competencias.add(it)
        }

        candidatos.add(pessoa_fisica_3)

        def pessoa_fisica_4 = new PessoaFisica("Marcio Bernardo Amaral", "marcio_bernardo@zgmail.com", "BA", "87954-600",
                'Engenheiro Aeroespacial e apaixonado por pássaros', "022.987.698-88", 34)

        ["Engenharia Estrutural", "Python", "Proatividade", "Data Science", "Metodologias Ágeis", "Organização"].each{
            pessoa_fisica_4.competencias.add(it)
        }

        candidatos.add(pessoa_fisica_4)

        def pessoa_fisica_5 = new PessoaFisica("Cristiane Knoop Heichel", "crisheichel@zgmail.com", "RS", "96600-000",
                "Engenheira de Alimentos e mestre em Ciência e Tecnologia de Alimentos", "133.968.658-88", 27)

        ["Química de Alimentos", "Boas práticas em industrias alimentícias", "Metodologias Ágeis", "Segurança do Trabalho", "Engenharia de Processos", "Qualidade de Alimentos", "Responsabilidade"].each{
            pessoa_fisica_5.competencias.add(it)
        }

        candidatos.add(pessoa_fisica_5)

        //Informações referentes as empresas (Pessoas Jurídicas)

        def pessoa_juridica_1 = new PessoaJuridica("Arroz Gostoso SA", "arrozgostoso@zgmail.com", "RS", "96600-000", "Empresa do setor de alimentos com mais de 100 anos de atuação no mercado brasileiro e internacional.",
                "00.365.158/0000-98", "Brasil")

        ["Metodologias Ágeis", "Química de Alimentos", "Segurança do Trabalho", "Responsabilidade", "Dedicação"].each{
            pessoa_juridica_1.competencias.add(it)
        }

        empresas.add(pessoa_juridica_1)

        def pessoa_juridica_2 = new PessoaJuridica("Império do Boliche", "imperiobol@zgmail.com", "GO", "87955-989", "Empresa do setor de entreterimento que presta serviços a população goiana a mais de uma década",
                "00.985.564/9999-98", "Brasil")

        ["Metodologias Ágeis", "Organização", "Comprometimento", "Responsabilidade", "Contabilidade Básica"].each{
            pessoa_juridica_2.competencias.add(it)
        }

        empresas.add(pessoa_juridica_2)

        def pessoa_juridica_3 = new PessoaJuridica("Paçoca Software", "pacocasoftware@zgmail.com","SC", "38577-99", "Empresa de tecnologia especializada em desenvolvimento de soluções para o setor de logística e vendas",
                "00.986.222/0005-77", "Brasil")

        ["Metodologias Ágeis", "Comprometimento", "Python", "Java", "Go", "Banco de Dados", "Versionamento de Código", "Regex"].each{
            pessoa_juridica_3.competencias.add(it)
        }

        empresas.add(pessoa_juridica_3)

        def pessoa_juridica_4 = new PessoaJuridica("Joalheria Precioso", "preciosojoalheria@zgmail.com", "SP", "68759-32", "Empresa que produz e comercializa jóias e semijóias",
                "00.985.657/5898-87", "Brasil")

        ["Metodologias Ágeis", "Organização", "Experiência com Vendas", "Contabilidade Básica", "Responsabilidade", "Comunicação Pessoal"].each{
            pessoa_juridica_4.competencias.add(it)
        }

        empresas.add(pessoa_juridica_4)

        def pessoa_juridica_5 = new PessoaJuridica("Criative Data", "criativedata@zgmail.com", "RS", "85748-69", "Empresa de técnologia com foco em inteligência de mercado.",
                "00.685.9587/2585-99", "Brasil")

        ["Metodologias Ágeis", "Python", "Banco de Dados", "Organização", "Código Limpo", "Data Science", "Data Engineer", "Responsabilidade", "Comunicação Pessoal"].each{
            pessoa_juridica_5.competencias.add(it)
        }

        empresas.add(pessoa_juridica_5)

        boolean acao = true

        while (acao) {
            println()
            println()
            println "Seja Bem Vindo ao LinkeTinder"
            println "Agora você está a um click do seu próximo emprego"
            println "Escolha uma opção"
            println "[1] --> Para listar as empresas cadastradas."
            println "[2] --> Para listar os candidatos cadastrados."
            println "[3] --> Para sair."
            println()

            Scanner sc = new Scanner(System.in)
            String opcao = sc.nextLine();

            switch (opcao) {
                case "1":
                    candidatos.each {println it.toString()}
                    break
                case "2":
                    empresas.each {println it.toString()}
                    break
                case "3":
                    acao = false
                default:
                    break
            }
        }


        //candidatos.each {println it}
        }
}
