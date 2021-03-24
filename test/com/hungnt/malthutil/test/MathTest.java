package com.hungnt.malthutil.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static com.hungnt.malthutil.MathUtility.*; // tao mun cac ham bien trong class go truc tiep luon 
                                                 //go truc tiep ko can class cham 


import java.sql.SQLException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class MathTest {
    
 @Test   
    public void testFactorialGivenRightArgumentReturnsGoodResult(){
        int n = 5;              //test 5! cos dung la
        long expected = 120;    //120 hay ko
        long actual = getFactorial(n);
        assertEquals(expected, actual);
        //mình tiêp tục test các trường hợp khác đúng đầu vào , đầu ra
        //khỏi cần biến trung gian làm luôn trong lệnh
        assertEquals(720 , getFactorial(6));
        assertEquals(24 , getFactorial(4));
        assertEquals(6 , getFactorial(3));
        assertEquals(1 , getFactorial(1));
        assertEquals(1 , getFactorial(0));
        
    }   
    //dieu gi xay ra neu ta dua vao tham so ca chon,am, hoac >20
    //theo thiet ke cua ham, dua vao ca chon se nem ra ngoai le/
    //Tuc la thay xuat hien ngoai le neu co ca chon dua vao -> Ham dung
    //THẤY CÓ NGOẠII LỆ KHI CÓ CÀ CHƠN MÌNH LẠI MỪNG VÌ HÀM ĐÃ CHẠY ĐÚNG 
 @Test(expected = IllegalArgumentException.class)
 //có đúng khi chạy hàm này thì ném ra nhoại lệ tên là IIlegal...
 //nếu đúng nó ném ra ngoại lệ cùn tên, code đúng rồi, xanh thoy
    public void testFactorialWrongArgumentThrowsException(){
        //mình test tình huống hàm phải ném ra ngoại lệ nếu tham số cà chớn 
        //ngoại lệ là ko phải là value để so sánh
        //ta phải udnfg chiêu khác. JUnit 4 khác JUnit 5 ở chỗ bắt ngoại lệ
        //Kỳ 5 đi dự thính môn SWT401 của thầy hoàng: DI, Lambda Expression liên quan
        //JUnit 5.
        getFactorial(-5);
        getFactorial(21);
        getFactorial(40);
    }
    
}
