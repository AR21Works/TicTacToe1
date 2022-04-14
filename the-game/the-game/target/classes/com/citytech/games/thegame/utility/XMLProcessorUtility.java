package com.citytech.games.thegame.utility;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class XMLProcessorUtility {


    public static <T> List<T> processXML(Function<Element, T> function, String fileName, String elementName) {

        List<T> returnList = new ArrayList<>();

        // Instantiate the Factory
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        try {

            // optional, but recommended
            // process XML securely, avoid attacks like XML External Entities (XXE)
            dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);

            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File(fileName));


            doc.getDocumentElement().normalize();

            NodeList list = doc.getElementsByTagName(elementName);

            for (int temp = 0; temp < list.getLength(); temp++) {

                Node node = list.item(temp);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    T model = function.apply(element);
                    returnList.add(model);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return returnList;
    }
}