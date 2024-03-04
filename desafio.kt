// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

data class Usuario

enum class Nivel {BASICO,INTERMEDIARIO,AVANCADO}

data class ConteudoEducacional(val nome: List<String>, val duracao: List<Int>)

data class Formacao(val nome: String, val nivel: Nivel)

fun main() {

//Definições dos Conteúdos Educacionais

    val conteudoKotlin = ConteudoEducacional(
            nome = listOf(
                    "Aula 1: Introdução à Linguagem Kotlin",
                    "Aula 2: Estruturas Básicas em Kotlin",
                    "Aula 3: Manipulação de Dados em Kotlin",
                    "Aula 4: Programação Orientada a Objetos em Kotlin",
                    "Aula 5: Aplicações Avançadas de Kotlin",
                    "Aula 6: Trabalhando com APIs em Kotlin",
                    "Aula 7: Manipulação Avançada de Dados em Kotlin",
                    "Aula 8: Coroutines e Concorrência em Kotlin",
                    "Aula 9: Testes Avançados em Kotlin",
                    "Aula 10: Frameworks e Bibliotecas em Kotlin"
            ),
            duracao = listOf(2, 3, 2, 3, 5, 2, 4, 1, 3, 2)
    )
    val conteudoJava = ConteudoEducacional(
            nome = listOf(
                    "Aula 1: Introdução à Linguagem Java",
                    "Aula 2: Estruturas Básicas em Java",
                    "Aula 3: Manipulação de Dados em Java",
                    "Aula 4: Programação Orientada a Objetos em Java",
                    "Aula 5: Trabalhando com Coleções em Java",
                    "Aula 6: Concorrência e Threads em Java",
                    "Aula 7: Spring Framework e Injeção de Dependências",
                    "Aula 8: Microserviços em Java",
                    "Aula 9: Testes Avançados em Java",
                    "Aula 10: Projetos Empresariais em Java"
            ),
            duracao = listOf(3, 2, 1, 2, 5, 2, 4, 3, 3, 2)
    )
    val conteudoPython = ConteudoEducacional(
            nome = listOf(
                    "Aula 1: Introdução à Linguagem Python",
                    "Aula 2: Estruturas Básicas em Python",
                    "Aula 3: Manipulação de Dados em Python",
                    "Aula 4: Programação Funcional em Python",
                    "Aula 5: Trabalhando com Bibliotecas Científicas (NumPy, Pandas)",
                    "Aula 6: Automatização de Tarefas com Python",
                    "Aula 7: Integração de APIs em Python",
                    "Aula 8: Machine Learning e Data Science com Python",
                    "Aula 9: Testes e Depuração Avançados em Python",
                    "Aula 10: Projetos de Inteligência Artificial em Python"
            ),
            duracao = listOf(2, 3, 3, 2, 1, 3, 2, 5, 2, 4)
    )
    val cargaHorariaKotlinBasico = conteudoKotlin.duracao.subList(0, 3).sum()
    val cargaHorariaKotlinIntermediario = conteudoKotlin.duracao.subList(0, 5).sum()
    val cargaHorariaKotlinAvancado = conteudoKotlin.duracao.subList(0, 10).sum()

    val cargaHorariaJavaBasico = conteudoJava.duracao.subList(0, 3).sum()
    val cargaHorariaJavaIntermediario = conteudoJava.duracao.subList(0, 5).sum()
    val cargaHorariaJavaAvancado = conteudoJava.duracao.subList(0, 10).sum()

    val cargaHorariaPythonBasico = conteudoPython.duracao.subList(0, 3).sum()
    val cargaHorariaPythonIntermediario = conteudoPython.duracao.subList(0, 5).sum()
    val cargaHorariaPythonAvancado = conteudoPython.duracao.subList(0, 10).sum()

//Definição das Formações

    val formacaoKotlin = listOf(
            Formacao(nome = "Curso de Kotlin", nivel = Nivel.BASICO),
            Formacao(nome = "Curso de Kotlin", nivel = Nivel.INTERMEDIARIO),
            Formacao(nome = "Curso de Kotlin", nivel = Nivel.AVANCADO)
    )
    val formacaoJava = listOf(
            Formacao(nome = "Curso de Java", nivel = Nivel.BASICO),
            Formacao(nome = "Curso de Java", nivel = Nivel.INTERMEDIARIO),
            Formacao(nome = "Curso de Java", nivel = Nivel.AVANCADO)
    )
    val formacaoPython = listOf(
            Formacao(nome = "Curso de Python", nivel = Nivel.BASICO),
            Formacao(nome = "Curso de Python", nivel = Nivel.INTERMEDIARIO),
            Formacao(nome = "Curso de Python", nivel = Nivel.AVANCADO)
    )

//Atribuição de Nível Kotlin
    for (iteracao in formacaoKotlin) {
        val atribNivel = when (iteracao.nivel) {
            Nivel.BASICO -> "Básico"
            Nivel.INTERMEDIARIO -> "Intermediário"
            Nivel.AVANCADO -> "Avançado"
            null -> "Nível não definido"
        }
        val cargaHoraria = when (iteracao.nivel) {
            Nivel.BASICO -> cargaHorariaKotlinBasico
            Nivel.INTERMEDIARIO -> cargaHorariaKotlinIntermediario
            Nivel.AVANCADO -> cargaHorariaKotlinAvancado
            null -> 0
        }
        val selecaoAulas = when (iteracao.nivel) {
            Nivel.BASICO -> conteudoKotlin.nome.subList(0, 3)
            Nivel.INTERMEDIARIO -> conteudoKotlin.nome.subList(0, 5)
            Nivel.AVANCADO -> conteudoKotlin.nome.subList(0, 10)
        }

        println("--- ${iteracao.nome} $atribNivel | ${cargaHoraria} horas --- \n")

        for ((index, aula) in selecaoAulas.withIndex()) {
            val duracaoTotal = conteudoKotlin.duracao[index]
            println("$aula | $duracaoTotal horas")
        }
        println()
    }

//Atribuição de Nível Java
    for (iteracao in formacaoJava) {
        val atribNivel = when (iteracao.nivel) {
            Nivel.BASICO -> "Básico"
            Nivel.INTERMEDIARIO -> "Intermediário"
            Nivel.AVANCADO -> "Avançado"
            null -> "Nível não definido"
        }
        val cargaHoraria = when (iteracao.nivel) {
            Nivel.BASICO -> cargaHorariaJavaBasico
            Nivel.INTERMEDIARIO -> cargaHorariaJavaIntermediario
            Nivel.AVANCADO -> cargaHorariaJavaAvancado
            null -> 0
        }
        val selecaoAulas = when (iteracao.nivel) {
            Nivel.BASICO -> conteudoJava.nome.subList(0, 3)
            Nivel.INTERMEDIARIO -> conteudoJava.nome.subList(0, 5)
            Nivel.AVANCADO -> conteudoJava.nome.subList(0, 10)
        }

        println("--- ${iteracao.nome} $atribNivel | ${cargaHoraria} horas --- \n")

        for ((index, aula) in selecaoAulas.withIndex()) {
            val duracaoTotal = conteudoKotlin.duracao[index]
            println("$aula | $duracaoTotal horas")
        }
        println()
    }

//Atribuição de Nível Python
    for (iteracao in formacaoPython) {
        val atribNivel = when (iteracao.nivel) {
            Nivel.BASICO -> "Básico"
            Nivel.INTERMEDIARIO -> "Intermediário"
            Nivel.AVANCADO -> "Avançado"
            null -> "Nível não definido"
        }
        val cargaHoraria = when (iteracao.nivel) {
            Nivel.BASICO -> cargaHorariaPythonBasico
            Nivel.INTERMEDIARIO -> cargaHorariaPythonIntermediario
            Nivel.AVANCADO -> cargaHorariaPythonAvancado
            null -> 0
        }
        val selecaoAulas = when (iteracao.nivel) {
            Nivel.BASICO -> conteudoPython.nome.subList(0, 3)
            Nivel.INTERMEDIARIO -> conteudoPython.nome.subList(0, 5)
            Nivel.AVANCADO -> conteudoPython.nome.subList(0, 10)
        }

        println("--- ${iteracao.nome} $atribNivel | ${cargaHoraria} horas --- \n")

        for ((index, aula) in selecaoAulas.withIndex()) {
            val duracaoTotal = conteudoKotlin.duracao[index]
            println("$aula | $duracaoTotal horas")
        }
        println()
    }
}
