/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hungnt.malthutil;


/**
 *
 * @author Admin
 */
public class MathUtility {
    //Class nay chua 1 nhom ham toan hoc, fake tu class chuan
    //java.util.Math cua JDK
    //vi la do xai chung nen se la STATIC
    // Class này chứa 1 nhóm hàm toán học, fake từ class chuẩn
    // java.util.Math của JDK
    // vì là đồ xài chung nên sẽ là STATIC
    public static final double PI = 3.1415;
    
    //hàm tính n!
    //Vì giai thừa tăng rất nhanh,21! tràn kiểu long
    // kiểu long chịu đc 10^18 18 con số 0
    //âm giai thừa không tính được
    
    public static long getFactorial(int n){
        if(n<0 || n>20)
            throw new IllegalArgumentException("Invalid argument. "
            + " n must be between 0..20");
        
        if(n==0 | n==1)
            return 1; // khỏi mất công tính, return ngay
        
        long result = 0; 
        
        //sống sót đến đoạn này, sure n= 2..20
        for (int i = 2; i <= n; i++) 
            result *= i;
        //n! = 1*2*3*4*5*...n
        return result;
    }
}
