
package supermercado;


interface IOperacoesDoEstoque {
    public void adicionarProduto(Produto produto, double quantidade);
    public void removerProduto(String codigo, double quantidade);
    public void mostrarEstoque();
}
