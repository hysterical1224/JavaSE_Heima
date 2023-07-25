package digui17;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class zifuliu {
    /**
     * 在字节流中操作中文字符可能会遇到一些问题，主要是因为中文字符使用的是多个字节表示，而字节流是以字节为单位进行读写操作的。
     *
     * 以下是字节流操作中文不方便的几个问题：
     *
     * 字符编码问题：字节流默认使用平台的默认字符编码，对于中文字符可能会出现乱码问题。例如，将中文字符直接写入字节流中，可能导致编码不一致，导致写入的数据无法正确解码。
     *
     * 字符长度不确定：中文字符通常使用多个字节表示，而字节流是以字节为单位进行读写的。这意味着在字节流中读取中文字符时，无法准确知道一个字符占用的字节数，可能会导致截断或者读取到错误的字符。
     *
     * 字节与字符转换：字节流需要将字节转换为字符进行处理，或者将字符转换为字节进行写入。这涉及到字符编码和解码的过程，如果处理不当，可能会导致数据损坏或乱码。
     *
     * 为了更方便地处理中文字符，通常建议使用字符流（Reader 和 Writer）而不是字节流。字符流以字符为单位进行读写操作，并且提供了字符编码的支持，可以更好地处理中文字符。
     *
     * 如果必须使用字节流操作中文字符，可以考虑使用 InputStreamReader 和 OutputStreamWriter 等字节流的装饰器类，它们可以将字节流转换为字符流，并指定字符编码，以便正确处理中文字符。
     *
     * 总之，虽然字节流可以进行基本的读写操作，但在处理中文字符时可能会遇到编码和长度不确定等问题。为了更方便和可靠地处理中文字符，建议使用字符流或者使用字节流的字符装饰器类进行操作。
     *
     *
     *
     * 字符流 = 字节流 + 编码表
     * 中文的字节存储方式
     * 用字节流复制文本文件时，文本文件也会有中文，但是没有问题，原因是最终底层操作会自动进行字节拼接成中文，如何识别是中文的呢？
     * 汉字在存储的时候，无论选择哪种编码存储，第一个字节都是负数
     * */

    public static void main(String[] args) throws UnsupportedEncodingException {
        //定义一个字符串
        String s = "中国";

        //byte[] bys = s.getBytes(); //[-28, -72, -83, -27, -101, -67]
        //byte[] bys = s.getBytes("UTF-8"); //[-28, -72, -83, -27, -101, -67]
        byte[] bys = s.getBytes("GBK"); //[-42, -48, -71, -6]
        System.out.println(Arrays.toString(bys));

        //String ss = new String(bys);
        //String ss = new String(bys,"UTF-8");
        String ss = new String(bys,"GBK");
        System.out.println(ss);
    }
}
