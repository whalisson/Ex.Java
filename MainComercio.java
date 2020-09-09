import java.util.Scanner;

public class MainComercio {
    public static void main(String[] args){
        int opcao = 0, x = 0;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantos produtos deseja cadastrar?: ");
        x = teclado.nextInt();
      
        if(x > 0){
            Comercio[] produto = new Comercio[x];
            
            while(opcao != 5){
                System.out.println("\n1.Cadastrar Produto \n2.Remover Produto \n3.Atualizar Produto\n4.Listar\n5.Sair");
                System.out.println("Informe sua opção: ");
                opcao = teclado.nextInt();
                switch(opcao){
                    case 1:
                        System.out.println("Cadastrando produtos... "); 
                        for(int i = 0; i < x; i++){
                            System.out.println("Produto "+(i+1));
                           produto[i] = new Comercio();
                           produto[i].cadastrar();
                        }
                        break;
                    case 2:
                        System.out.println("Qual produto deseja remover?: ");
                        Scanner tecl = new Scanner(System.in);
                        x = tecl.nextInt();
                        produto[x-1].remover();                       
                        break;
                    case 3:
                        System.out.println("Qual produto deseja atualizar?: ");
                        Scanner tec = new Scanner(System.in);
                        x = tec.nextInt();
                        produto[x-1].atualizar();
                        break;
                    case 4:
                        for(int i = 0 ; i < x; i++){
                            produto[i].mostrar(); 
                        }
                        break;
                }

            } 
        }
        
        
    }
           

}
