// Abaixo segue um exemplo de código que você pode ou não utilizar:

import java.util.Scanner; 

public class App {
    
  public static void main(String[] args){ 
    
    Scanner leitor = new Scanner(System.in); 
    int T = leitor.nextInt(); 
   
    int i;
    int j;

    for(i = 0 ; i < 1000;){
          
      for(j = 0; j < T; j++){
            
        if(2 <= T && T <=50 && i < 1000){
                
          System.out.println("N[" + i + "] = "+ j);
          i++;
            
        }
      }
    }
  }
}