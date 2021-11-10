
package supermercado;

public class Cliente {
    private CarrinhoDeCompras carrinho;
    
    public Cliente(){
        this.carrinho = new CarrinhoDeCompras();
    }

    public CarrinhoDeCompras getCarrinho() {
        return carrinho;
    }

    //Para realizar a compra, o cliente escolhe um caixa disponível
    public void realizarCompra(Caixa caixa){
        caixa.iniciarVenda(this);
    }
    
    public void consultarValor(String codigo){
        Leitor.mostrarValorProduto(codigo);
    }
}
