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
    Validation validation=new Validation();
    int n=0;
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
                String id=validation.validateId();
                attr.setValue(id);
                Book.setAttributeNode(attr);
                //element 1
                Element Author = document.createElement("Author");
                System.out.println("enter auther");
                String auther= validation.validateAuther();
                Author.appendChild(document.createTextNode(auther));
                Book.appendChild(Author);
                //element 2
                Element Title = document.createElement("Title");
                System.out.println("enter title");
                String title=validation.validateIsNull();
                Title.appendChild(document.createTextNode(title));
                Book.appendChild(Title);
                //element 3
                Element Genre = document.createElement("Genre");
                System.out.println("choose genre:");
                System.out.println("1-Science");
                System.out.println("2-Fiction");
                System.out.println("3-Drama");
                String choice=input.nextLine();
                String genre;
                while (true){
                    if (choice.equals("1")) {
                        genre = "Science";
                        break;
                    }
                    else if (choice.equals("2")) {
                        genre = "Fiction";
                        break;
                    }
                    else if (choice.equals("3")) {
                        genre = "Drama";
                        break;
                    }else{
                        System.out.println("wrong input try again");
                    }
                }
                Genre.appendChild(document.createTextNode(genre));
                Book.appendChild(Genre);
                //element 4
                Element Price = document.createElement("Price");
                System.out.println("enter price");
                String price;
                while(true){
                    try {
                        price=input.nextLine();
                        Double.parseDouble(price);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("enter numerical value");
                    }
                }
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
                String description=validation.validateIsNull();
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
                String id;
                if (n==0){
                     id=validation.validateIsNull();
                     n++;
                }else{
                    id= validation.validateId();
                }
                attr.setValue(id);
                Book.setAttributeNode(attr);
                //element 1
                Element Author = document.createElement("Author");
                System.out.println("enter auther");
                String auther= validation.validateAuther();
                Author.appendChild(document.createTextNode(auther));
                Book.appendChild(Author);
                //element 2
                Element Title = document.createElement("Title");
                System.out.println("enter title");
                String title=validation.validateIsNull();
                Title.appendChild(document.createTextNode(title));
                Book.appendChild(Title);
                //element 3
                Element Genre = document.createElement("Genre");
                System.out.println("enter genre");
                System.out.println("choose genre:");
                System.out.println("1-Science");
                System.out.println("2-Fiction");
                System.out.println("3-Drama");
                String choice=input.nextLine();
                String genre;
                while (true){
                    if (choice.equals("1")) {
                        genre = "Science";
                        break;
                    }
                    else if (choice.equals("2")) {
                        genre = "Fiction";
                        break;
                    }
                    else if (choice.equals("3")) {
                        genre = "Drama";
                        break;
                    }else{
                        System.out.println("wrong input try again");
                    }
                }
                Genre.appendChild(document.createTextNode(genre));
                Book.appendChild(Genre);
                //element 4
                Element Price = document.createElement("Price");
                System.out.println("enter price");
                String price;
                double p=0.0;
                while(true){
                    try {
                        price=validation.validateIsNull();
                        Double.parseDouble(price);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("enter numerical value");
                    }
                }
                Price.appendChild(document.createTextNode(price));
                Book.appendChild(Price);
                //element 5
                Element Publish_Date = document.createElement("Publish_Date");
                System.out.println("enter publish date");
                String publish_date=validation.validateIsNull();
                Publish_Date.appendChild(document.createTextNode(publish_date));
                Book.appendChild(Publish_Date);
                //element 6
                Element Description = document.createElement("Description");
                System.out.println("enter description");
                String description=validation.validateIsNull();
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
    public void update(String id,String key ,String data){
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
                    String Id=eElement.getAttributes().item(0).getTextContent();
                    if (Id.equals(id)){
                        NodeList childNodes=node.getChildNodes();
                        for (int j = 0; j < childNodes.getLength(); j++) {
                            Node item = childNodes.item(j);
                            if (item.getNodeType() == Node.ELEMENT_NODE){
                                if (key.equalsIgnoreCase(item.getNodeName())) {
                                    // update xml element role text
                                    item.setTextContent(data);
                                }
                            }
                        }
                    }
                }
            }
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);
            StreamResult streamResult = new StreamResult(new File(String.valueOf(file)));
            transformer.transform(domSource, streamResult);
            System.out.println("file updated");
        } catch (ParserConfigurationException | IOException | SAXException | TransformerException e) {
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
        } catch (ParserConfigurationException | IOException | TransformerException | SAXException e) {
            e.printStackTrace();
        }
    }
}
