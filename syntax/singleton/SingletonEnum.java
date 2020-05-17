package basic.syntax.singleton;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

enum Singleton{
    INSTANCE; // works like private constructor

    int i;
    public void whoami(){
        System.out.println("obj created: " + i);
    }

}

public class SingletonEnum {

    public static void main(String[] args) {
        Singleton obj1 = Singleton.INSTANCE;
        obj1.i = 0;
        Singleton obj2 = Singleton.INSTANCE;
        obj1.i=10;

        obj1.whoami();
        obj2.whoami();
    }
}
