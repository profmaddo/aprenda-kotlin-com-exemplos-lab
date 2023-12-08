// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(nome: String, email: String) {

    val nome = nome
    val email = email

    override fun toString(): String {
        return String.format(
            "Nome %s, Email: %s",
            nome, email
        )
    }

}

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")

        inscritos.add(usuario)
    }
}

fun main() {
    // TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    // TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")

    val listaDeConteudos = listOf(
        ConteudoEducacional("Java Básico", 120),
        ConteudoEducacional("Java Intermediáro", 160)
    )

    var novoAluno = Usuario("Joao", "joao@teste.com")

    var matriculaFormacao = Formacao("Java I", listaDeConteudos)

    matriculaFormacao.matricular(novoAluno)

    println("Nova Inscrição: "+matriculaFormacao.inscritos.toString())
    println("Conteúdos: "+matriculaFormacao.conteudos)

}
