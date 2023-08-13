class Produto(
    val codigo: Int,
    var nome: String,
    var descricao: String,
    var preco: Double,
    var quantidadeEstoque: Int,
    var tamanho: String,
    var cor: String,
    var material: String,
    var categoria: String,
    var marca: String
) {
    override fun toString(): String {
        return "Código: $codigo, Nome: $nome, Descrição: $descricao, " +
                "Preço: $preco, Quantidade em Estoque: $quantidadeEstoque, " +
                "Tamanho: $tamanho, Cor: $cor, Material: $material, " +
                "Categoria: $categoria, Marca: $marca"
    }
}
