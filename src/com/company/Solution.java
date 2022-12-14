package com.company;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.*;
import org.xml.sax.SAXException;


public class Solution {
    File file= new File("D:\\ELgam3a\\FCAI 7\\soa\\xmlfile.xml");
    Scanner input= new Scanner(System.in);
    public void create(){
        try{
            if (file.exists()){
                DocumentBuilderFactory documentFactory=DocumentBuilderFactory.newDefaultNSInstance();
                DocumentBuilder documentBuilder=documentFactory.newDocumentBuilder();
                //Document document = (Document) documentBuilder.newDocument();
                // root element
                Document document = documentBuilder.parse(file);
                Element Catalogue = document.getDocumentElement();
                // employee element
                Element Book = document.createElement("Book");
                Catalogue.appendChild(Book);
                Attr attr = document.createAttribute("id");
                System.out.println("enter book id");
                String id=input.nextLine();
                attr.setValue(id);
                Book.setAttributeNode(attr);
                //element 1
                Element Author = document.createElement("Author");
                System.out.println("enter auther");
                String auther=input.nextLine();
                Author.appendChild(document.createTextNode(auther));
                Book.appendChild(Author);
                //element 2
                Element Title = document.createElement("Title");
                System.out.println("enter title");
                String title=input.nextLine();
                Title.appendChild(document.createTextNode(title));
                Book.appendChild(Title);
                //element 3
                Element Genre = document.createElement("Genre");
                System.out.println("enter genre");
                String genre=input.nextLine();
                Genre.appendChild(document.createTextNode(genre));
                Book.appendChild(Genre);
                //element 4
                Element Price = document.createElement("Price");
                System.out.println("enter price");
                String price=input.nextLine();
                Price.appendChild(document.createTextNode(price));
                Book.appendChild(Price);
                //element 5
                Element Publish_Date = document.createElement("Publish_Date");
                System.out.println("enter publish date");
                String publish_date=input.nextLine();
                Publish_Date.appendChild(document.createTextNode(publish_date));
                Book.appendChild(Publish_Date);
                //element 6
                Element Description = document.createElement("Description");
                System.out.println("enter description");
                String description=input.nextLine();
                Description.appendChild(document.createTextNode(description));
                Book.appendChild(Description);
                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                DOMSource domSource = new DOMSource(document);
                StreamResult streamResult = new StreamResult(new File(String.valueOf(file)));
                transformer.transform(domSource,streamResult);
                System.out.println("Done add data");
            }else{
                DocumentBuilderFactory documentFactory=DocumentBuilderFactory.newDefaultNSInstance();
                DocumentBuilder documentBuilder=documentFactory.newDocumentBuilder();
                Document document = (Document) documentBuilder.newDocument();
                // root element
                Element Catalogue = document.createElement("Catalogue");
                document.appendChild(Catalogue);    
                // employee element
                Element Book = document.createElement("Book");
                Catalogue.appendChild(Book);
                Attr attr = document.createAttribute("id");
                System.out.println("enter book id");
                String id=input.nextLine();
                attr.setValue(id);
                Book.setAttributeNode(attr);
                //element 1
                Element Author = document.createElement("Author");
                System.out.println("enter auther");
                String auther=input.nextLine();
                Author.appendChild(document.createTextNode(auther));
                Book.appendChild(Author);
                //element 2
                Element Title = document.createElement("Title");
                System.out.println("enter title");
                String title=input.nextLine();
                Title.appendChild(document.createTextNode(title));
                Book.appendChild(Title);
                //element 3
                Element Genre = document.createElement("Genre");
                System.out.println("enter genre");
                String genre=input.nextLine();
                Genre.appendChild(document.createTextNode(genre));
                Book.appendChild(Genre);
                //element 4
                Element Price = document.createElement("Price");
                System.out.println("enter price");
                String price=input.nextLine();
                Price.appendChild(document.createTextNode(price));
                Book.appendChild(Price);
                //element 5
                Element Publish_Date = document.createElement("Publish_Date");
                System.out.println("enter publish date");
                String publish_date=input.nextLine();
                Publish_Date.appendChild(document.createTextNode(publish_date));
                Book.appendChild(Publish_Date);
                //element 6
                Element Description = document.createElement("Description");
                System.out.println("enter description");
                String description=input.nextLine();
                Description.appendChild(document.createTextNode(description));
                Book.appendChild(Description);
                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                DOMSource domSource = new DOMSource(document);
                StreamResult streamResult = new StreamResult(new File(String.valueOf(file)));
                transformer.transform(domSource, streamResult);
                System.out.println("file created");
            }


        }catch (ParserConfigurationException | TransformerException | SAXException | IOException pce) {
            pce.printStackTrace();
        }
    }
    public void search(String key){
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
                    String Title=eElement.getElementsByTagName("Title").item(0).getTextContent();
                    if (author.equals(key) || Title.equals(key)){
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
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }
    public void delete(String key){
        DocumentBuilderFactory documentFactory=DocumentBuilderFactory.newDefaultNSInstance();
        try {
            DocumentBuilder documentBuilder=documentFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(file);
            document.getDocumentElement().normalize();
            NodeList book=document.getElementsByTagName("Book");
            for (int i =0; i< book.getLength();i++){
                Element eElement = (Element) book.item(i);
                if (eElement.getAttribute("id").equals(key))
                {
                    eElement.getParentNode().removeChild(eElement);
                }
            }
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);
            StreamResult streamResult = new StreamResult(new File(String.valueOf(file)));
            transformer.transform(domSource, streamResult);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException | TransformerException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }

}
