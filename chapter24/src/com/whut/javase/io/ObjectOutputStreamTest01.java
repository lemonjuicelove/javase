package com.whut.javase.io;

import com.whut.javase.bean.Student;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
* 1、java.io.NotSerializableException
*       在没有实现Serializable接口的时候，Student对象不支持序列化
*
* 2、参与序列化和反序列化的对象，必须实现Serializable接口
*
* 3、注意：通过源代码发现，Serializable接口只是一个标识接口：
*       这个接口中什么代码都没有，它的作用是：
*           起到标识的作用，java虚拟机看到这个类实现了这个接口，可能会对这个类进行特殊待遇。
*           Serializable这个标识接口是给java虚拟机参考的，java虚拟机看到这个接口之后，
*           会为该类自动生成一个序列化版本号
*
* 4、序列化版本号有什么用
*       java.io.InvalidClassException:
*            com.whut.javase.bean.Student;
*            local class incompatible:
*               stream classdesc serialVersionUID = 557516288811128276, (修改之后代码的序列化版本号)
*               local class serialVersionUID = 4036133689400766745 (修改之前代码的序列化版本号)
*
*       java语言中是采用什么机制来区分类的：
*           第一：首先通过类名进行比对，如果类名不一样，肯定不是同一个类
*           第二：如果类名一样，通过序列化版本号进行区分
*
*       jack编写了一个类：com.whut.javase.bean.Student implements Serializable
*       Tom编写了一个类：com.whut.javase.bean.Student implements Serializable
*       不同的人编写了同一个类，但是这两个类确实不是一个类，这个时候序列化版本号就起作用了
*       对于java虚拟机来说，java虚拟机可以区分开这两个类，因为这两个类都实现了Serializable接口，
*       都有默认的序列化版本号，它们的序列化版本号不一样，所以区分开了。(这是自动生成序列化版本号的好处)
*
*       思考：自动化生成序列化版本号有什么缺点：
*               一旦代码确定之后，不能进行后续的修改，因为只要修改，必然会重新编译，此时会生成全新的序列化版本号，
*               这个时候java虚拟机会认为这是一个全新的类
*
*       结论：
*           凡是一个类实现了Serializable接口，建议给该类提供一个固定不变的序列化版本号。
*           这样以后这个类即使代码修改了，但是版本号不变，java虚拟机会认为是同一个类
*/
public class ObjectOutputStreamTest01 {
    public static void main(String[] args) throws IOException {

        // 创建java对象
        Student s = new Student(111,"zhangsan");
        // 创建序列化对象 (先把序列化文件给创建出来)
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("chapter24/src/com/whut/javase/bean/studens"));
        // 将java对象进行序列化 (将对象给序列化到文件当中去)
        oos.writeObject(s);

        oos.flush();
        oos.close();

    }
}
