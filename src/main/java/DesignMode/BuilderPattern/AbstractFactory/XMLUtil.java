package DesignMode.BuilderPattern.AbstractFactory;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.*;

import org.w3c.*;
import org.xml.sax.SAXException;
import java.io.*;

/**
 * @ClassName XMLUtil
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/18 17:17
 * @Version 1.0
 **/
public class XMLUtil {
//    public static String getBrandName() {
//    }
    // 该方法用于从XML配置文件中提取具体类类名，并返回一个实例对象
   /* public static Object getBean() {

        try {
            // 创建DOM文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("config.xml"));

            // 获取包含类名的文本节点
            NodeList nl = doc.getElementsByTagName("classNmae");
            Node classNode = n1.item(0).getFirstChild();
            String cName = classNode.getNodeValue();

            // 通过类名生成实例对象并将其返回
            Class c = Class.forName(cName);
            Object obj = c.newInstance();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;

        }
    }*/

}
