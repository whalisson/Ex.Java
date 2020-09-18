public class ProdutosParaVenda{
String código;
int quantidade;
double precoDeCompra;
double precoDeVenda;
}
public class ProdutosEmEstoque{
String código;
int quantidade;
double precoDeCompra;
double precoDeVenda;
}
public class Main {

    public static void main(String[] args) {
    
      ProdutosParaVenda sapato = new ProdutosParaVenda(“1214”,45,65.4,125.4);
      ProdutosEmEstoque chinelo = new ProdutosEmEstoque (“1865”,250,10.4,50.4);

    }       
}
