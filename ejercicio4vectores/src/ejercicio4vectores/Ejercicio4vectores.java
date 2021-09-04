
package ejercicio4vectores;

import java.util.Scanner;
public class Ejercicio4vectores {

   
    public static void main(String[] args) {
    String[][] comuna = {{"Comuna","1"},
                        {"2","3"},
                        {"4","5"}};
    int [][] candidatoA ={{194,180},
                            {221,432},
                            {820}};
    int [][] candidatoB = {{48,20},
                            {90,50},
                            {61}};
    int [][] candidatoC = {{206,320},
                            {140,821},
                            {946}};
    int [][] candidatoD = {{45,16},
                            {20,14},
                            {946}};
    Imprimircomuna(comuna);
    ImprimirCandidatoa(candidatoA);
    ImprimirCandidatob(candidatoB);
    ImprimirCandidatoc(candidatoC);
    ImprimirCandidatod(candidatoD);
    }
    
    
    public static void Imprimircomuna(String[][] lista)
    {
        int i,j;
        
        for(i=0;i<lista.length;i++)
       {
         for(j=0;j<lista[i].length;j++)
         {
             System.out.println(lista[i][j]);
         }
       }
    
    }
    
    public static void ImprimirCandidatoa(int [][] lista2)
    {
        int i,j,suma=0;
        float votos = 5590,x;
        System.out.println("Candidato A");
        for(i=0;i<lista2.length;i++)
       {
        for(j=0;j<lista2[i].length;j++)
        {
         System.out.println(lista2[i][j]);
         suma = suma+lista2[i][j];
        }
       }
        System.out.println("El total de votos es de: "+suma);
        x =(suma*100)/votos;
        System.out.printf("El procentaje de votos es de:"+x);
        if(x>50)
        {
            System.out.println("Eres el Ganador");
        }
  
    }
    public static void ImprimirCandidatob(int [][] lista3)
    {
        int i,j,suma2=0;
        float x, votos = 5590;
        System.out.println("\nCandidato B");
        for(i=0;i<lista3.length;i++)
       {
        for(j=0;j<lista3[i].length;j++)
        {
         System.out.println(lista3[i][j]);
         suma2=suma2+lista3[i][j];
        }
       }
        System.out.println("El total de votos es de:"+suma2);
        x = (suma2*100)/votos;
        System.out.printf("El porcentaje de votos es de: "+x);
        if(x>50)
        {
            System.out.println("Eres el ganador");  
        }
                
    }
    public static void ImprimirCandidatoc(int [][] lista4)
    {
        int i,j,suma3=0;
        float x,votos = 5590;
        System.out.println("\nCandidato C");
        for(i=0;i<lista4.length;i++)
       {
        for(j=0;j<lista4[i].length;j++)
        {
         System.out.println(lista4[i][j]);
         suma3=suma3+lista4[i][j];
        }
       }
        System.out.println("El total de votos es de:"+suma3);
        x = (suma3*100)/votos;
        System.out.printf("El porcentaje de votos es de: "+x);
         if(x>50)
        {
            System.out.println("Eres el ganador");  
        }
        
    }
    public static void ImprimirCandidatod(int [][] lista5)
    {
        int i,j,suma4=0;
        float x, votos = 5590;
        System.out.println("\nCandidato D");
        for(i=0;i<lista5.length;i++)
       {
        for(j=0;j<lista5[i].length;j++)
        {
         System.out.println(lista5[i][j]);
         suma4=suma4+lista5[i][j];
        }
       }
        System.out.println("El total de votos es de:"+suma4);
        x = (suma4*100)/votos;
        System.out.printf("El porcentaje de votos es de:"+x);
         if(x>50)
        {
            System.out.println("Eres el ganador");  
        }
        
    }
}
