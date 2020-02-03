package DesignMode.BuilderPattern.FactoryMethodPattern;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;

/**
 * @ClassName XMLUtil
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/19 10:14
 * @Version 1.0
 **/
public class XMLUtilAll {
    public static Object getBean() {

        try {
            // 创建DOM文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("configTV.xml"));
            // 获取包含类名的文本节点
            NodeList n1 = doc.getElementsByTagName("className");
            Node className = n1.item(0).getFirstChild();
            String cName = className.getNodeValue();
            // 通过类名生成实例对象并将其返回
            Class c = Class.forName(cName);
            Object obj = c.newInstance();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }


    }

}
