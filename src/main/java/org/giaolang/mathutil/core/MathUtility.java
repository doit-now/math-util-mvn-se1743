/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.giaolang.mathutil.core;

/**
 *
 * @author giao.lang
 */

//class này clone lại 100% cái class java.util.Math của JDK
//Math.sqrt() Math.sin()  Math.random()
public class MathUtility {
    
    public static final double PI = 3.1415;
    
    //tính n! = 1.2.3...n
    //thiết kế/quy ước cho hàm/method này
    //0! = 1! = 1
    //ko áp dụng giai thừa cho số âm. Nếu n < 0: CHỬI; NÉM RA EXCEPTION
    //ko áp dụng giai thừa cho số > 20. Vì 20! vừa đủ khít/khớp kiểu long
    //                                              18 con số 0
    //21!: CHỬI, NÉM RA NGOẠI LỆ
    public static long getFactorial(int n) {
        
        if (n < 0 || n > 20) 
            throw new IllegalArgumentException("Invalid n. n must be between 0..20, plz");
        
        if (n == 0 || n == 1)        
            return 1;
        
        long product = 1; //tích khởi đầu là 1, sau đó nhân dồn vào
        for (int i = 2; i <= n; i++) 
            product *= i;
        
        return product;
    }
    
}
