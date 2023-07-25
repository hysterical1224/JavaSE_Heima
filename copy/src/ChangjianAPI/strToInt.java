package ChangjianAPI;

public class strToInt {
    //String转换为int
    //转换方式
    //方式一：先将字符串数字转成Integer，再调用valueOf()方法
    //方式二：通过Integer静态方法parseInt()进行转换

    /*
    * 在将String转换为int时，推荐使用方式二，即使用Integer类的静态方法parseInt()进行转换。
    * 方式一，先将字符串数字转换为Integer对象，然后再调用valueOf()方法将其转换为int，
    * 这种方式虽然可以实现String到int的转换，但它涉及了两个步骤：首先将字符串转换为Integer对象，
    * 然后再将Integer对象转换为int类型。这样做可能会引入额外的性能开销和内存消耗。
    * 相比之下，方式二，使用Integer类的静态方法parseInt()，提供了更简洁和高效的方式来将String转换为int。该方法直接将字符串解析为int类型的值，并返回相应的结果。
    * */
    public static void main(String[] args) {
        int i = Integer.valueOf("123");

        int i1 = Integer.parseInt("123");
        /*
        * 如果字符串不能正确解析为int类型的值，parseInt()方法会抛出NumberFormatException异常。
        * 因此，在使用parseInt()方法时，应该确保字符串符合int的表示范围和格式要求，或者使用异常处理机制来捕获并处理异常情况。
        *
        *
         */
        Integer i2 = Integer.valueOf(321);
        Integer i3 = Integer.valueOf(12);
        Integer i4 = 12;
        //所以，对于Integer i2 = Integer.valueOf(321);这个语句，它会创建一个新的Integer对象来表示值为321的整数。由于321大于缓存池的范围，不会复用之前的对象。
        //
        //因此，在这种情况下，Integer i2 = Integer.valueOf(321);不会产生错误，但是可能会导致额外的对象创建和内存消耗。如果只是想获得一个Integer对象来表示321这个值，可以直接使用new Integer(321)创建一个新的对象，或者使用Integer.valueOf("321")来将字符串转换为Integer对象。
//由于自动装箱（Autoboxing）的引入，也可以直接将整数值12赋给Integer对象，而无需调用valueOf()方法
        int x = i4.intValue();

    }

}
