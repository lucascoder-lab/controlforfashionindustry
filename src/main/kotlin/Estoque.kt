class Estoque {
    private val produtos = mutableListOf<Produto>()

    fun adicionarProduto(produto: Produto) {
        produtos.add(produto)
    }

    fun listarProdutos() {
        println("Lista de Produtos no Estoque:")
        for (produto in produtos) {
            println(produto)
        }
    }

    fun pesquisarProdutoPorNome(nome: String) {
        println("Produtos com o nome '$nome':")
        val produtosEncontrados = produtos.filter { it.nome.contains(nome, ignoreCase = true) }
        for (produto in produtosEncontrados) {
            println(produto)
        }
    }

    fun atualizarPreco(codigo: Int, novoPreco: Double) {
        val produto = produtos.find { it.codigo == codigo }
        if (produto != null) {
            produto.preco = novoPreco
            println("Preço atualizado com sucesso!")
        } else {
            println("Produto não encontrado.")
        }
    }

    fun atualizarQuantidade(codigo: Int, novaQuantidade: Int) {
        val produto = produtos.find { it.codigo == codigo }
        if (produto != null) {
            produto.quantidadeEstoque = novaQuantidade
            println("Quantidade em estoque atualizada com sucesso!")
        } else {
            println("Produto não encontrado.")
        }
    }

    fun listarProdutosPorCategoria(categoria: String) {
        println("Produtos da categoria '$categoria':")
        val produtosFiltrados = produtos.filter { it.categoria.equals(categoria, ignoreCase = true) }
        for (produto in produtosFiltrados) {
            println(produto)
        }
    }

    fun listarProdutosPorMarca(marca: String) {
        println("Produtos da marca '$marca':")
        val produtosFiltrados = produtos.filter { it.marca.equals(marca, ignoreCase = true) }
        for (produto in produtosFiltrados) {
            println(produto)
        }
    }

    fun removerProduto(codigo: Int) {
        val produto = produtos.find { it.codigo == codigo }
        if (produto != null) {
            produtos.remove(produto)
            println("Produto removido com sucesso!")
        } else {
            println("Produto não encontrado.")
        }
    }

    fun realizarVenda(codigo: Int, quantidadeVendida: Int) {
        val produto = produtos.find { it.codigo == codigo }
        if (produto != null) {
            if (produto.quantidadeEstoque >= quantidadeVendida) {
                produto.quantidadeEstoque -= quantidadeVendida
                println("Venda realizada com sucesso!")
            } else {
                println("Estoque insuficiente.")
            }
        } else {
            println("Produto não encontrado.")
        }
    }
}
