import java.util.Scanner;
public class Comercio {
  String nome;
  String marca;
  String lote;
  double precoDeCompra;
  double precoDeVenda;
  
  public Comercio(){
    this("Sem Nome","Sem Marca","Sem Lote",0.0,0.0);
  }
  
  public Comercio(String nome, String marca, String lote, double precoDaCompra, double precoDeVenda){
    this.nome = nome;
    this.marca = marca;
    this.lote = lote;
    this.precoDeCompra = precoDaCompra;
    this.precoDeVenda = precoDeVenda;
  }
  
  void cadastrar(){
      Scanner teclado = new Scanner(System.in);
      System.out.println("Informe o nome do produto:");
      nome = teclado.nextLine();
      System.out.println("Informe a marca do produto:");
      marca = teclado.nextLine();
      System.out.println("Informe o lote do produto:");
      lote = teclado.nextLine();
      System.out.println("Informe o preço de compra do produto:");
      precoDeCompra = teclado.nextDouble();
      System.out.println("Informe o preço de venda do produto:");
      precoDeVenda = teclado.nextDouble();
  }
  
  void remover(){
      nome = "0";
      marca = "0";
      lote = "0";
      precoDeCompra = 0.0;
      precoDeVenda = 0.0;
      
  }
  void atualizar(){
     String continuar = "S";
      System.out.println("O que deseja atualizar?(nome;lote;precoDeCompra;precoDeVenda): ");
      Scanner teclado = new Scanner(System.in);
      String a = teclado.nextLine();
 
      do{
        switch(a){
          case "nome":
              Scanner t = new Scanner(System.in);
              System.out.println("Novo nome: ");
              nome = t.nextLine();
              break;
          case "marca":
              Scanner te = new Scanner(System.in);
              System.out.println("Nova marca: ");
              marca = te.nextLine();
              break;
          case "lote":
              Scanner tec = new Scanner(System.in);
              System.out.println("Novo lote: ");
              lote = tec.nextLine();
              break;
          case "precoDeCompra":
              Scanner tecl = new Scanner(System.in);
              System.out.println("Novo preço de compra: ");
              precoDeCompra = tecl.nextDouble();
              break;
          case "precoDeVenda":
              Scanner tecla = new Scanner(System.in);
              System.out.println("Novo preço de venda: ");
              precoDeVenda = tecla.nextDouble();
              break;
      }
          System.out.println("Deseja continuar a atualizar [S/N]?: ");
          continuar = teclado.nextLine();
      
     }while(continuar == "S");
      
    
    
  }
    public void mostrar(){
        System.out.println("\n"+nome+"\n"+marca+"\n"+lote+"\n"+precoDeCompra+"\n"+precoDeVenda);  
    }

}
      