class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val estoque = Estoque()

            do {
                println("\n=== Controle de Estoque ===")
                println("1. Cadastrar Produto")
                println("2. Listar Produtos")
                println("3. Pesquisar Produto por Nome")
                println("4. Atualizar Preço de um Produto")
                println("5. Atualizar Quantidade em Estoque de um Produto")
                println("6. Listar Produtos por Categoria")
                println("7. Listar Produtos por Marca")
                println("8. Remover Produto do Estoque")
                println("9. Realizar Venda")
                println("10. Sair")
                print("Escolha uma opção: ")

                val opcao = readLine()?.toIntOrNull()

                when (opcao) {
                    1 -> {
                        println("\n=== Cadastrar Produto ===")
                        print("Código: ")
                        val codigo = readLine()?.toIntOrNull() ?: continue

                        print("Nome: ")
                        val nome = readLine() ?: continue

                        print("Descrição: ")
                        val descricao = readLine() ?: continue

                        print("Preço: ")
                        val preco = readLine()?.toDoubleOrNull() ?: continue

                        print("Quantidade em Estoque: ")
                        val quantidade = readLine()?.toIntOrNull() ?: continue

                        print("Tamanho: ")
                        val tamanho = readLine() ?: continue

                        print("Cor: ")
                        val cor = readLine() ?: continue

                        print("Material: ")
                        val material = readLine() ?: continue

                        print("Categoria: ")
                        val categoria = readLine() ?: continue

                        print("Marca: ")
                        val marca = readLine() ?: continue

                        val produto = Produto(codigo, nome, descricao, preco, quantidade, tamanho, cor, material, categoria, marca)
                        estoque.adicionarProduto(produto)

                        println("Produto cadastrado com sucesso!")
                    }

                    2 -> estoque.listarProdutos()
                    3 -> {
                        println("\n=== Pesquisar Produto por Nome ===")
                        print("Digite o nome do produto: ")
                        val nome = readLine() ?: continue
                        estoque.pesquisarProdutoPorNome(nome)
                    }
                    4 -> {
                        println("\n=== Atualizar Preço de um Produto ===")
                        print("Digite o código do produto: ")
                        val codigo = readLine()?.toIntOrNull() ?: continue
                        print("Digite o novo preço: ")
                        val novoPreco = readLine()?.toDoubleOrNull() ?: continue
                        estoque.atualizarPreco(codigo, novoPreco)
                    }
                    5 -> {
                        println("\n=== Atualizar Quantidade em Estoque de um Produto ===")
                        print("Digite o código do produto: ")
                        val codigo = readLine()?.toIntOrNull() ?: continue
                        print("Digite a nova quantidade em estoque: ")
                        val novaQuantidade = readLine()?.toIntOrNull() ?: continue
                        estoque.atualizarQuantidade(codigo, novaQuantidade)
                    }
                    6 -> {
                        println("\n=== Listar Produtos por Categoria ===")
                        print("Digite a categoria: ")
                        val categoria = readLine() ?: continue
                        estoque.listarProdutosPorCategoria(categoria)
                    }
                    7 -> {
                        println("\n=== Listar Produtos por Marca ===")
                        print("Digite a marca: ")
                        val marca = readLine() ?: continue
                        estoque.listarProdutosPorMarca(marca)
                    }
                    8 -> {
                        println("\n=== Remover Produto do Estoque ===")
                        print("Digite o código do produto: ")
                        val codigo = readLine()?.toIntOrNull() ?: continue
                        estoque.removerProduto(codigo)
                    }
                    9 -> {
                        println("\n=== Realizar Venda ===")
                        print("Digite o código do produto: ")
                        val codigo = readLine()?.toIntOrNull() ?: continue
                        print("Digite a quantidade vendida: ")
                        val quantidadeVendida = readLine()?.toIntOrNull() ?: continue
                        estoque.realizarVenda(codigo, quantidadeVendida)
                    }
                    10 -> println("Saindo do programa.")
                    else -> println("Opção inválida. Por favor, escolha uma opção válida.")
                }
            } while (opcao != 10)
        }
    }
}
