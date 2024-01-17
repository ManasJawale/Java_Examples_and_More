import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;

public class Xmltojava {
    public static void main(String[] args) throws Exception{
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document d = builder.parse("Example\\people.xml");
        NodeList node = d.getElementsByTagName("person");
        for(int i=0;i<node.getLength();i++) {
            Node p = node.item(i);
            if(p.getNodeType()==Node.ELEMENT_NODE) {
                Element person = (Element)p;
                String id = person.getAttribute("id");
                NodeList nodes = person.getChildNodes();
                for (int index = 0; index < nodes.getLength(); index++) {
                    Node n = nodes.item(index);
                    if(n.getNodeType()==Node.ELEMENT_NODE) {
                        Element name = (Element) n;
                        System.out.println("Person "+ id + " : " + name.getTagName() + " = " + name.getTextContent());
                    }
                }
            }
        }
              
    }
}
