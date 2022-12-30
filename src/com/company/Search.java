package com.company;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Search {
    File file= new File("D:\\ELgam3a\\FCAI 7\\soa\\xmlfile.xml");
    Scanner input= new Scanner(System.in);
    private int numberOfBooks;
    public void searchById(String key){
        numberOfBooks=0;
        DocumentBuilderFactory documentFactory=DocumentBuilderFactory.newDefaultNSInstance();
        try {
            DocumentBuilder documentBuilder=documentFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(file);
            document.getDocumentElement().normalize();
            NodeList book=document.getElementsByTagName("Book");
            for (int i =0; i< book.getLength();i++){
                Node node = book.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE)
                {
                    Element eElement = (Element) node;
                    String id=eElement.getAttributes().item(0).getTextContent();
                    if (id.equals(key)){
                        numberOfBooks++;
                        System.out.println("id: "+ eElement.getAttributes().item(0).getTextContent());
                        System.out.println("Author: "+ eElement.getElementsByTagName("Author").item(0).getTextContent());
                        System.out.println("Title: "+ eElement.getElementsByTagName("Title").item(0).getTextContent());
                        System.out.println("Genre: "+ eElement.getElementsByTagName("Genre").item(0).getTextContent());
                        System.out.println("Price: "+ eElement.getElementsByTagName("Price").item(0).getTextContent());
                        System.out.println("Description: "+ eElement.getElementsByTagName("Description").item(0).getTextContent());
                        System.out.println();
                    }

                }
            }
            System.out.println("number of books :"+numberOfBooks);
        } catch (ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }
    }
    public void searchByAuthor(String key){
        numberOfBooks=0;
        DocumentBuilderFactory documentFactory=DocumentBuilderFactory.newDefaultNSInstance();
        try {
            DocumentBuilder documentBuilder=documentFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(file);
            document.getDocumentElement().normalize();
            NodeList book=document.getElementsByTagName("Book");
            for (int i =0; i< book.getLength();i++){
                Node node = book.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE)
                {
                    Element eElement = (Element) node;
                    String author=eElement.getElementsByTagName("Author").item(0).getTextContent();
                    if (author.equals(key)){
                        numberOfBooks++;
                        System.out.println("id: "+ eElement.getAttributes().item(0).getTextContent());
                        System.out.println("Author: "+ eElement.getElementsByTagName("Author").item(0).getTextContent());
                        System.out.println("Title: "+ eElement.getElementsByTagName("Title").item(0).getTextContent());
                        System.out.println("Genre: "+ eElement.getElementsByTagName("Genre").item(0).getTextContent());
                        System.out.println("Price: "+ eElement.getElementsByTagName("Price").item(0).getTextContent());
                        System.out.println("Description: "+ eElement.getElementsByTagName("Description").item(0).getTextContent());
                        System.out.println();
                    }

                }
            }
            System.out.println("number of books :"+numberOfBooks);
        } catch (ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }
    }
    public void searchByTitle(String key){
        numberOfBooks=0;
        DocumentBuilderFactory documentFactory=DocumentBuilderFactory.newDefaultNSInstance();
        try {
            DocumentBuilder documentBuilder=documentFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(file);
            document.getDocumentElement().normalize();
            NodeList book=document.getElementsByTagName("Book");
            for (int i =0; i< book.getLength();i++){
                Node node = book.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE)
                {
                    Element eElement = (Element) node;
                    String Title=eElement.getElementsByTagName("Title").item(0).getTextContent();
                    if (Title.equals(key)){
                        numberOfBooks++;
                        System.out.println("id: "+ eElement.getAttributes().item(0).getTextContent());
                        System.out.println("Author: "+ eElement.getElementsByTagName("Author").item(0).getTextContent());
                        System.out.println("Title: "+ eElement.getElementsByTagName("Title").item(0).getTextContent());
                        System.out.println("Genre: "+ eElement.getElementsByTagName("Genre").item(0).getTextContent());
                        System.out.println("Price: "+ eElement.getElementsByTagName("Price").item(0).getTextContent());
                        System.out.println("Description: "+ eElement.getElementsByTagName("Description").item(0).getTextContent());
                        System.out.println();
                    }

                }
            }
            System.out.println("number of books :"+numberOfBooks);
        } catch (ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }
    }
    public void searchByGenre(String key){
        numberOfBooks=0;
        DocumentBuilderFactory documentFactory=DocumentBuilderFactory.newDefaultNSInstance();
        try {
            DocumentBuilder documentBuilder=documentFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(file);
            document.getDocumentElement().normalize();
            NodeList book=document.getElementsByTagName("Book");
            for (int i =0; i< book.getLength();i++){
                Node node = book.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE)
                {
                    Element eElement = (Element) node;
                    String Genre=eElement.getElementsByTagName("Genre").item(0).getTextContent();
                    if (Genre.equals(key)){
                        numberOfBooks++;
                        System.out.println("id: "+ eElement.getAttributes().item(0).getTextContent());
                        System.out.println("Author: "+ eElement.getElementsByTagName("Author").item(0).getTextContent());
                        System.out.println("Title: "+ eElement.getElementsByTagName("Title").item(0).getTextContent());
                        System.out.println("Genre: "+ eElement.getElementsByTagName("Genre").item(0).getTextContent());
                        System.out.println("Price: "+ eElement.getElementsByTagName("Price").item(0).getTextContent());
                        System.out.println("Description: "+ eElement.getElementsByTagName("Description").item(0).getTextContent());
                        System.out.println();
                    }

                }
            }
            System.out.println("number of books :"+numberOfBooks);
        } catch (ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }
    }
    public void searchByPrice(String key){
        numberOfBooks=0;
        DocumentBuilderFactory documentFactory=DocumentBuilderFactory.newDefaultNSInstance();
        try {
            DocumentBuilder documentBuilder=documentFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(file);
            document.getDocumentElement().normalize();
            NodeList book=document.getElementsByTagName("Book");
            for (int i =0; i< book.getLength();i++){
                Node node = book.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE)
                {
                    Element eElement = (Element) node;
                    String Price=eElement.getElementsByTagName("Price").item(0).getTextContent();
                    double p=0.0;
                    double k=0.0;
                    try{
                        p = Double.parseDouble(Price);
                        k = Double.parseDouble(key);
                    } catch (NumberFormatException e) {
                        System.out.println("search key is not numerical try again ");
                        return;
                    }
                    if (p==k){
                        numberOfBooks++;
                        System.out.println("id: "+ eElement.getAttributes().item(0).getTextContent());
                        System.out.println("Author: "+ eElement.getElementsByTagName("Author").item(0).getTextContent());
                        System.out.println("Title: "+ eElement.getElementsByTagName("Title").item(0).getTextContent());
                        System.out.println("Genre: "+ eElement.getElementsByTagName("Genre").item(0).getTextContent());
                        System.out.println("Price: "+ eElement.getElementsByTagName("Price").item(0).getTextContent());
                        System.out.println("Description: "+ eElement.getElementsByTagName("Description").item(0).getTextContent());
                        System.out.println();
                    }

                }
            }
            System.out.println("number of books :"+numberOfBooks);
        } catch (ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }
    }
    public void searchByPublishDate(String key){
        numberOfBooks=0;
        DocumentBuilderFactory documentFactory=DocumentBuilderFactory.newDefaultNSInstance();
        try {
            DocumentBuilder documentBuilder=documentFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(file);
            document.getDocumentElement().normalize();
            NodeList book=document.getElementsByTagName("Book");
            for (int i =0; i< book.getLength();i++){
                Node node = book.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE)
                {
                    Element eElement = (Element) node;
                    String Publish_Date=eElement.getElementsByTagName("Publish_Date").item(0).getTextContent();
                    if (Publish_Date.equals(key)){
                        numberOfBooks++;
                        System.out.println("id: "+ eElement.getAttributes().item(0).getTextContent());
                        System.out.println("Author: "+ eElement.getElementsByTagName("Author").item(0).getTextContent());
                        System.out.println("Title: "+ eElement.getElementsByTagName("Title").item(0).getTextContent());
                        System.out.println("Genre: "+ eElement.getElementsByTagName("Genre").item(0).getTextContent());
                        System.out.println("Price: "+ eElement.getElementsByTagName("Price").item(0).getTextContent());
                        System.out.println("Description: "+ eElement.getElementsByTagName("Description").item(0).getTextContent());
                        System.out.println();
                    }

                }
            }
            System.out.println("number of books :"+numberOfBooks);
        } catch (ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }
    }
    public void searchByDescription(String key){
        numberOfBooks=0;
        DocumentBuilderFactory documentFactory=DocumentBuilderFactory.newDefaultNSInstance();
        try {
            DocumentBuilder documentBuilder=documentFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(file);
            document.getDocumentElement().normalize();
            NodeList book=document.getElementsByTagName("Book");
            for (int i =0; i< book.getLength();i++){
                Node node = book.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE)
                {
                    Element eElement = (Element) node;
                    String Description=eElement.getElementsByTagName("Description").item(0).getTextContent();
                    if (Description.equals(key)){
                        numberOfBooks++;
                        System.out.println("id: "+ eElement.getAttributes().item(0).getTextContent());
                        System.out.println("Author: "+ eElement.getElementsByTagName("Author").item(0).getTextContent());
                        System.out.println("Title: "+ eElement.getElementsByTagName("Title").item(0).getTextContent());
                        System.out.println("Genre: "+ eElement.getElementsByTagName("Genre").item(0).getTextContent());
                        System.out.println("Price: "+ eElement.getElementsByTagName("Price").item(0).getTextContent());
                        System.out.println("Description: "+ eElement.getElementsByTagName("Description").item(0).getTextContent());
                        System.out.println();
                    }

                }
            }
            System.out.println("number of books :"+numberOfBooks);
        } catch (ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }
    }
}
