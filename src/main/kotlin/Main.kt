fun main() {

    val tarefas = mutableListOf<String>()

    while (true) {
        println("1. Adicionar tarefa")
        println("2. Listar tarefa")
        println("3. Remover tarefa")
        println("4. Sair")
        print("Escolha uma opção: ")

        when (readln().toIntOrNull()) {
            1 -> {
                print("Digite a nova tarefa: ")
                val tarefa = readln()
                if (!tarefa.isNullOrEmpty()){
                    tarefas.add(tarefa)
                    println("Tarefa adicionada!")
                } else {
                    println("Tarefa inválida")
                }
            }
            2 -> {
                println("Suas Tarefas:")
                tarefas.forEachIndexed { index, tarefa -> println("${index +1}. $tarefa")}
            }
            3 -> {
                println("Digite o numero da tarefa a ser removida:")
                tarefas.forEachIndexed {index, tarefa -> println("${index +1}. $tarefa")}
                val numeroTarefa = readln().toIntOrNull()
                if (numeroTarefa != null && numeroTarefa in 1..tarefas.size) {
                    tarefas.removeAt(numeroTarefa - 1)
                    println("Tarefa removida!")
                } else {
                    println("Número inválido!")
                }
            }
            4 -> {
                println("Saindo...")
                break
            }
            else -> println("Opção inválida!")
        }

    }

}