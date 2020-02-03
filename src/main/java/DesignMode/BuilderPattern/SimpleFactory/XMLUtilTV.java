package DesignMode.BuilderPattern.SimpleFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * @ClassName XMLUtilYV
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/19 8:47
 * @Version 1.0
 **/
public class XMLUtilTV {
    // 该方法从XML配置文件中提取品牌名称，并返回该产品品牌名称
    public static String getBrandName() {
        try {
            // 创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("configTV.xml"));

            // 获取包含品牌名称的文本节点
            NodeList n1 = doc.getElementsByTagName("brandName");
            Node className = n1.item(0).getFirstChild();
            String brandName = className.getNodeValue().trim();
            return brandName;


        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

}
