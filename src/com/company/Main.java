package com.company;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void menu(){
        System.out.println("1-add new book");
        System.out.println("2-delete book");
        System.out.println("3-search book");
        System.out.println("4-update book");
        System.out.println("5-sort books");
        System.out.println("6-exit");
    }
    public static void searchMenu(){
        System.out.println("1-search by Id");
        System.out.println("2-search by Author");
        System.out.println("3-search by Title");
        System.out.println("4-search by Genre");
        System.out.println("5-search by Price");
        System.out.println("6-search by Publish Date");
        System.out.println("7-search by Description");
    }
    public static void updateMenu(){
        System.out.println("1-Update Author");
        System.out.println("2-Update Title");
        System.out.println("3-Update Genre");
        System.out.println("4-Update Price");
        System.out.println("5-Update Publish Date");
        System.out.println("6-Update Description");
    }
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        Solution solution = new Solution();
        Search search=new Search();
        Scanner input=new Scanner(System.in);
        label:
        while(true){
            menu();
            String choice=input.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("enter number of books you want to add.");
                    int numberOfBooks = input.nextInt();
                    for (int i = 0; i < numberOfBooks; i++) {
                        solution.create();
                    }
                    break;
                case "2":
                    System.out.println("enter book id ");
                    String delete = input.nextLine();
                    solution.delete(delete);
                    break;
                case "3":
                    searchMenu();
                    choice = input.nextLine();
                    String searchKey;
                    switch (choice) {
                        case "1" -> {
                            System.out.println("enter id that you want to search");
                            searchKey = input.nextLine();
                            search.searchById(searchKey);
                        }
                        case "2" -> {
                            System.out.println("enter Author that you want to search");
                            searchKey = input.nextLine();
                            search.searchByAuthor(searchKey);
                        }
                        case "3" -> {
                            System.out.println("enter Title that you want to search");
                            searchKey = input.nextLine();
                            search.searchByTitle(searchKey);
                        }
                        case "4" -> {
                            System.out.println("enter Genre that you want to search");
                            searchKey = input.nextLine();
                            search.searchByGenre(searchKey);
                        }
                        case "5" -> {
                            System.out.println("enter Price that you want to search");
                            searchKey = input.nextLine();
                            search.searchByPrice(searchKey);
                        }
                        case "6" -> {
                            System.out.println("enter Publish Date that you want to search");
                            searchKey = input.nextLine();
                            search.searchByPublishDate(searchKey);
                        }
                        case "7" -> {
                            System.out.println("enter Description that you want to search");
                            searchKey = input.nextLine();
                            search.searchByDescription(searchKey);
                        }
                    }
                    break;
                case "4":
                    System.out.println("enter id that you want to edit");
                    String id = input.nextLine();
                    updateMenu();
                    String updateChoice = input.nextLine();
                    String data;
                    Validation validate=new Validation();
                    switch (updateChoice) {
                        case "1" -> {
                            System.out.println("enter Author that you want to update");
                            data = validate.validateAuther();
                            solution.update(id, "Author", data);
                        }
                        case "2" -> {
                            System.out.println("enter Title that you want to update");
                            data = validate.validateIsNull();
                            solution.update(id, "Title", data);
                        }
                        case "3" -> {
                            System.out.println("enter Genre that you want to update");
                            data = validate.validateIsNull();
                            solution.update(id, "Genre", data);
                        }
                        case "4" -> {

                            System.out.println("choose genre:");
                            System.out.println("1-Science");
                            System.out.println("2-Fiction");
                            System.out.println("3-Drama");
                            String gennum=input.nextLine();
                            String genre;
                            while (true){
                                if (gennum.equals("1")) {
                                    genre = "Science";
                                    break;
                                }
                                else if (gennum.equals("2")) {
                                    genre = "Fiction";
                                    break;
                                }
                                else if (gennum.equals("3")) {
                                    genre = "Drama";
                                    break;
                                }else{
                                    System.out.println("wrong input try again");
                                }
                            }
                            data = input.nextLine();
                            solution.update(id, "Price", data);
                        }
                        case "5" -> {
                            System.out.println("enter Publish Date that you want to update");
                            data = validate.validateIsNull();
                            solution.update(id, "Publish_Date", data);
                        }
                        case "6" -> {
                            System.out.println("enter Description that you want to update");
                            data = validate.validateIsNull();
                            solution.update(id, "Description", data);
                        }
                    }


                    break;
                case "5":
                    ArrayList<Book> Books= solution.sortِAscendingly();
                    for (int i=0;i<Books.size();i++){
                        System.out.println(Books.get(i).getId());
                        System.out.println(Books.get(i).getAuthor());
                        System.out.println(Books.get(i).getTitle());
                        System.out.println(Books.get(i).getPrice());
                        System.out.println(Books.get(i).getDescription());
                        System.out.println(Books.get(i).getPublish_Date());
                        System.out.println("");
                    }
                    break;
                case "6":
                    break label;
                default:
                    System.out.println("wrong input");

                    break;
            }
        }
    }
}
