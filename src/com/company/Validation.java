package com.company;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Validation {
    File file= new File("D:\\ELgam3a\\FCAI 7\\soa\\xmlfile.xml");
    Scanner input= new Scanner(System.in);
    public String validateIsNull(){
        String key=input.nextLine();
        while (true){
            if (key.isEmpty()){
                System.out.println("empty is empty you have to enter value.");
                key=input.nextLine();
            }else{
                return key;
            }
        }
    }
    public String validateAuther(){
        while (true){
            String key =validateIsNull();
            boolean result = key.matches("[a-zA-Z]+");
            if (result){
                return key;
            }else {
                System.out.println("Author name is characters (a-z) only please try again.");
            }
        }
    }
    public boolean checkId(String Key) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory documentFactory=DocumentBuilderFactory.newDefaultNSInstance();
        DocumentBuilder documentBuilder=documentFactory.newDocumentBuilder();
        //Document document = (Document) documentBuilder.newDocument();
        // root element
        Document document = documentBuilder.parse(file);
        document.getDocumentElement().normalize();
        NodeList ListOfBooks = document.getElementsByTagName("Book");
        //System.out.println("----------------------------");
        boolean check=false;
        for (int temp = 0; temp < ListOfBooks.getLength(); temp++) {
            Node book = ListOfBooks.item(temp);

            if (book.getNodeType() == Node.ELEMENT_NODE) {
                //System.out.println("\nCurrent Element :" + nNode.getNodeName());
                System.out.println(book.getAttributes().getNamedItem("id").getTextContent());
                String id = book.getAttributes().getNamedItem("id").getTextContent();
                if (Key.equals(id)) {
                    check=true;
                    return check;
                }else{
                    check=false;
                }
            }
        }
        return check;
    }
    public String validateId() throws IOException, SAXException, ParserConfigurationException {
        while(true){
            String key=validateIsNull();
            if (checkId(key)){
                System.out.println("this id is exist");
            }else{
                return key;
            }
        }
    }
}
