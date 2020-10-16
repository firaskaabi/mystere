/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author starinfo
 */
public class Boujnah {
  @SuppressWarnings("empty-statement")
  public static void main(String[] args) {
      int a ;
      System.out.println("Veuillez choisir le niveau");
      System.out.println("1:Niveau Facile");
      System.out.println("2:Niveau Moyen");
      System.out.println("3:Niveau Difficile");
      System.out.println("0 : Quitter");
      Scanner inp = new Scanner(System.in);
      a= inp.nextInt();
      switch (a) {
          case 0:
          { System.out.println("exit..."); 
            System.exit(0);}
   
    break;
      case 1:
      {
          Scanner input = new Scanner(System.in);
  Random rnd = new Random();
  int mystere = rnd.nextInt(100) + 1;
  int nessais = 15;
  int b = 15;
  int nj = -1;
  while ((nj != mystere)|| nessais==0)
  {
     do{
    System.out.print("donner un nombre entre 1 et 100 ");
    nj = input.nextInt();
      }while(nj<1||nj>100);
    --nessais;
 if (nj == mystere)
    {
      System.out.println("Bravo,vous avez gagne au bout de "+ (b-nessais ) +" tentatives");
    }
    else if (nj < mystere)
    {
      System.out.println("C'est plus,il vous reste"+ nessais +" tentatives");
    }
    else
    {
      System.out.println("C'est moins,il vous reste"+ nessais +" tentatives");
    }
}}
    
    break;
    case 2:
    {
  Scanner input = new Scanner(System.in);
  Random rnd = new Random();
  int mystere = rnd.nextInt(100) + 1;
  int nessais = 10;
  int b = 10;
  int nj = -1;
  while ((nj != mystere)|| nessais==0)
  {
      do{
    System.out.print("donner un nombre entre 1 et 10000 ");
    nj = input.nextInt();
      }while(nj<1||nj>10000);
    --nessais;
    if (nj == mystere)
    {
      System.out.println("Bravo,vous avez gagne au bout de "+ (b-nessais ) +" tentatives");
    }
    else if (nj < mystere)
    {
      System.out.println("C'est plus,il vous reste"+ nessais +" tentatives");
    }
    else
    {
      System.out.println("C'est moins,il vous reste"+ nessais +" tentatives");
    }
  
  
}
    }
    break;
    case 3:
      {
  Scanner input = new Scanner(System.in);
  Random rnd = new Random();
  int mystere = rnd.nextInt(100) + 1;
  char c = (char) ('a' + rnd.nextInt(26));
  int val=c;
  int nessais = 10;
  int b = 10;
  int d = 10;
  int nj = -1;
  char ch = 0 ;
  int ascii = ch;
  while ((nj != mystere)|| nessais==0||ascii != val)
  {  if(nj!=nessais){
     do{
    System.out.print("donner un nombre entre 1 et 100 ");
    nj = input.nextInt();
      }while(nj<10||nj>100);}
  if(val!=ascii){
     do{
    System.out.print("donner un caractere entre a et z ");
    ch = input.next().charAt(0); ;
     ascii = ch;
      }while(ascii<96||nj>122);}
    

 if (nj == mystere)
    {
      System.out.println("le nombre est correct,vous avez gagne au bout de "+ (b-nessais-1 ) +" tentatives");
    }
    else if (nj < mystere)
    {--nessais;
      System.out.println("C'est plus pour le nombre,il vous reste"+ nessais +" tentatives");
    }
    else
    {--nessais;
      System.out.println("C'est moins pour le nombre,il vous reste"+ nessais +" tentatives");
    }
  if (val == ascii)
    {
      System.out.println("Le caractere est correct ,vous avez gagne au bout de "+ (b-d-1 )+" tentatives");
    }
    else if (ascii < val)
    {
      System.out.println("C'est plus pour le caractere,il vous reste"+ d +" tentatives");
    --d;
    }
    else
    {
      System.out.println("C'est moins pour le caractere,il vous reste"+ d +" tentatives");
     --d;
    }
}}
    break;
    
      
      }
}
}
