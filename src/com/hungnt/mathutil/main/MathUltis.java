/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hungnt.mathutil.main;

import com.hungnt.malthutil.MathUtility;

/**
 *
 * @author HungThinh
 */
public class MathUltis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //tui muốn test 5! có bằng 120 ko
        int n = 5;    //n!
        long expected = 120; // hope return 120
        long actual = MathUtility.getFactorial(n); //thực tế hàm chạy là mấy???
        // mình so sánh để biết đúng sai ???
        System.out.println("5! expected: " + expected + "  ; actual: " + actual);

        //TEST 0! CÓ BẰNG 1 KO
        n = 0;    //n!
        expected = 1; // hope return 120
        actual = MathUtility.getFactorial(n); //thực tế hàm chạy là mấy???
        // mình so sánh để biết đúng sai ???
        System.out.println("0! expected: " + expected + "  ; actual: " + actual);
    }

}
//VIẾT CODE XONG THÌ PHẢI TEST CODE - NGUYÊN TẮC PHẢI THEO
// TEST NGAY TỪNG HÀM TỪNG CLASS TRƯỚC KHI RÁP CHÚNG VỚI CÁC CODE KHÁC
// TEST NGAY KHI XONG HÀM, XONG CLASS 
// ==> ĐƯỢC GỌI LÀ TEST MỨC ĐỘ 1, MỨC UNIT TEST (TEST MỨC ĐƠN VỊ CODE)
// LÀM SAO ĐỂ TEST. CÓ NHIỀU CÁCH:
// Cách 1: sout(gọi hàm() để in ra kết quả của hàm)
// Cách 2: JOptionPane để popup lên kết quả xử lí cửa hàm (JAVADESKTOP)
// Cách 3: ghi ra LOG file, ra 1 trang web (JavaWeb)
// 3 cách này đều phải dùng mắt để xem kết quả và xác định đúng sai
// ĐÚNG: tức hàm này chạy ra 1 giá trị - AcTUAL VALUE
//                                      và ta thấy ACTUAL VALUE khớp, bằng với các giá trị mà ta mong đợi, ta tính
//                                      trước bằng tay gọi là EXPECTED VALUE
// ví dụ 5! hy bong EXPECTED hàm trả về đúng 120 - actual
// hàm chạy đứng cho 5!

//* sai: tui test 6!, EXPECTED = 720, khốn nạn thay, chạy ra actual 12!

//Cách 4: máy so sánh và kết luận giúp luôn vì máy có các phép toán so sánh
// con người không cần nhìn từng dòng kết quả trả về để luận đúng sai, máy sẽ lo hết
// Nếu tất cả tình huống hàm chạy đều đúng --> HÀM ĐÚNG --> MÀU XANH
// Hầu hết tình huống hàm chạy đều đúng, có 1 cái sai --> HÀM SAI --> MÀU ĐỎ

//ĐỎ : chỉ cần 1 thằng sai
//XANH : tất cả phải đều đúng

// muốn làm đc điều này ta cần thư viện phụ trợ giúp cho java xanh đỏ
// Điều này cũng có bên C#, PHP, JS, RUBY...
//Java : Junit, TestNG
//C# : NUnit, xUnit, MSTest
//PHP : PHPUnit