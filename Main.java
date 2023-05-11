import java.util.Scanner;
class Main {
  public static void main(String[] args) {
   Scanner in= new Scanner(System.in);
    int ordem;
    do{
    System.out.print("Digite a ordem da matriz : ");
    ordem = in.nextInt();
    }while (ordem <= 2);
    int[][] matriz = new int[ordem][ordem];
    preenchermatriz(matriz);
    boolean simetrica= verificarsimetria(matriz); 
   if(simetrica){
     System.out.println("A matriz é simetrica ");
    }  else{
      System.out.println("A matriz não é simetrica");
    }
    
  }
  public static void preenchermatriz(int[][]matriz){
    Scanner in= new Scanner(System.in);
    int valormatriz;
      System.out.println("Informe os valores da matriz");
        for(int i=0; i<matriz.length;i++){
          for(int j=0;j<matriz[i].length;j++){
            System.out.print("Informe o valor da posição ["+i+"] ["+j+"] :");
            matriz[i][j]= in.nextInt();
          }
        }
    
      }
  public static boolean verificarsimetria(int[][]matriz){
    for(int i=0; i<matriz.length;i++){
      for(int j=0;j<matriz[j].length;j++){
        if(matriz[i][j]!=matriz[j][i]){ 
        return false;
        }
      }
    }
    return true;
    
  }
  
  }
