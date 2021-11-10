
package supermercado;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Gerente extends Funcionario {
    
    public Gerente(String nome, String userName, String senha) {
        super(nome, userName, senha);
        EstoqueDeProdutos.copiarEstoque();
    }

    public void emitirRelatorioDeEstoque() {
        Scanner scanner = new Scanner(System.in);
        Utilitario.ImprimaMensagem("*                     RELATÓRIO DE ESTOQUE                      *", 
                "*                    Estoque no INÍCIO do dia                   *");
        EstoqueDeProdutos.exibirCopiaInicialDoEstoque();

        Utilitario.ImprimaMensagem("*                  Estoque no FINAL do dia                      *");
        EstoqueDeProdutos.mostrarEstoque(1);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Aperte ENTER para continuar ...");
        scanner.nextLine();
    }
    
    public void emitirRelatorioDeVendas(List<Caixa> caixas){
        Iterator i = caixas.iterator();
        // acessa caixa por caixa
        while (i.hasNext()) { 
            Caixa caixa = (Caixa)i.next();
            Utilitario.ImprimaMensagem(
                  "*                   Relatório do Caixa: "+ caixa.getNumeroDoCaixa() +"                  *");
            caixa.relatorioCaixa();
            Utilitario.Continuar();
        }
    }
}
