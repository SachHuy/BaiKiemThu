package com.mycompany.bai1;

import java.util.Arrays;

public class Bai1 {
    public static void main(String[] args) {
        // Nhập độ dài ba cạnh của tam giác từ người dùng
        int side1 = 5;
        int side2 = 4;
        int side3 = 3;

        // Xác định loại tam giác và in ra kết quả
        String triangleType = classifyTriangle(side1, side2, side3);
        System.out.println("Loại tam giác là: " + triangleType);
    }

    public static String classifyTriangle(int side1, int side2, int side3) {
        // Kiểm tra xem ba cạnh có thể tạo thành một tam giác hay không
        if (isTriangle(side1, side2, side3)) {
            // Kiểm tra loại tam giác
            if (side1 == side2 && side2 == side3) {
                return "Equilateral"; // Tam giác đều
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                return "Isosceles"; // Tam giác cân
            } else {
                // Kiểm tra xem tam giác có phải tam giác vuông hay không
                if (isRightTriangle(side1, side2, side3)) {
                    return "Right"; // Tam giác vuông
                } else {
                    return "Scalene"; // Tam giác thường
                }
            }
        } else {
            return "NotATriangle"; // Không là tam giác
        }
    }

    // Phương thức kiểm tra xem ba cạnh có thể tạo thành tam giác hay không
    public static boolean isTriangle(int side1, int side2, int side3) {
        return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
    }

    // Phương thức kiểm tra xem tam giác có phải là tam giác vuông hay không
    public static boolean isRightTriangle(int side1, int side2, int side3) {
        // Sắp xếp các cạnh theo thứ tự tăng dần
        int[] sides = { side1, side2, side3 };
        Arrays.sort(sides);

        // Áp dụng định lý Pythagoras
        return (sides[0] * sides[0] + sides[1] * sides[1] == sides[2] * sides[2]);
    }
}
