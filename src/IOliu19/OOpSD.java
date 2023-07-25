package IOliu19;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class OOpSD {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./copy/oos.txt"));

        xuliehua xlh = new xuliehua("ss", 120);
        oos.writeObject(xlh);
        oos.close();


    }
}
