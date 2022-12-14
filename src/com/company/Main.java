package com.company;

import java.util.Scanner;

public class Main {

    public static void menu(){
        System.out.println("1-add new book");
        System.out.println("2-delete book");
        System.out.println("3-search book");
        System.out.println("4-exit");
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner input=new Scanner(System.in);
        while(true){
            menu();
            String choice=input.nextLine();
            if (choice.equals("1")){
                System.out.println("enter number of books you want to add.");
                int numberOfBooks=input.nextInt();
                for (int i = 0;i<numberOfBooks;i++){
                    solution.create();
                }
            }else if(choice.equals("2")){
                System.out.println("enter book id ");
                String search=input.nextLine();
                solution.delete(search);
            }else if(choice.equals("3")){
                System.out.println("enter author name or title");
                String search=input.nextLine();
                solution.search(search);
            }else if(choice.equals("4")){
                    break;
            }else{
                System.out.println("wrong input");
            }
        }
    }
}
