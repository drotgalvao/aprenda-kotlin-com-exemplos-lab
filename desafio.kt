// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, val nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("${usuario.nome} matriculado com sucesso em ${this.nome}.")
    }
}

fun main() {
    val usuario1 = Usuario("João")
    val usuario2 = Usuario("Maria")

    val conteudo1 = ConteudoEducacional("Introdução ao Kotlin", 120)
    val conteudo2 = ConteudoEducacional("Kotlin Avançado", 180)

    val formacao1 = Formacao("Formação Kotlin", listOf(conteudo1, conteudo2), Nivel.AVANCADO)

    formacao1.matricular(usuario1)
    formacao1.matricular(usuario2)

    println(" ${formacao1.inscritos.size} inscritos. ${formacao1.conteudos.size} conteudos. ${formacao1.nivel} nível.")
    println(formacao1)
}
