package com.company.paixu;

import java.util.Arrays;
/*
* Arrays的常用方法
    方法名 说明
    public static String toString(int[] a) 返回指定数组的内容的字符串表示形式
    public static void sort(int[] a) 按照数字顺序排列指定的数组
*
*
* */
//工具类设计思想
//1、构造方法用 private 修饰
//2、成员用 public static 修饰
//工具类是一种在软件开发中常用的类，它包含一组静态方法，用于提供一些通用的功能和工具函数。工具类通常用于封装一些常见的操作，以便在不同的项目和场景中重复使用。
/*
* 静态方法：工具类中的方法通常都是静态的，这意味着不需要创建类的实例就可以直接调用这些方法。

无状态：工具类中的方法通常不持有状态，它们只依赖于输入参数，并返回相应的结果。这使得工具类的方法更加可复用和可预测。

提供常用功能：工具类的方法通常提供一些常用的功能，例如日期时间处理、字符串处理、文件操作、加密解密、数学计算等。这些功能可以帮助简化开发过程，并提高代码的可读性和可维护性。

隐藏实现细节：工具类可以封装复杂的算法或实现细节，对外部调用者提供简洁的接口。这样，使用工具类的开发者不需要了解具体的实现细节，只需要知道如何正确使用工具类的方法。

代码重用：通过使用工具类，开发者可以在不同的项目和场景中重复使用已经实现的功能。这样可以减少代码的重复编写，提高开发效率，并减少潜在的错误。
*
*
*
* */


public class MaoPao {

    public static String arrayToString(int[] arr){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('[');
        for (int i=0; i<arr.length-1; i++){
            stringBuffer.append(arr[i]);
            stringBuffer.append(',');
        }
        stringBuffer.append(arr[arr.length-1]);
        stringBuffer.append(']');
        return stringBuffer.toString();

    }

    public static void main(String[] args) {

        int[] arr = {24, 69, 80, 57, 13};
        for (int i=0; i<arr.length-1; i++){
            //从第0个到n-1
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[i]>arr[i+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        System.out.println(arrayToString(arr));
    }
}
