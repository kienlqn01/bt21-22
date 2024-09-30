/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b21;

/**
 *
 * @author Admin
 */
    public class SimpleSingleton {

    void setMessage(String hello_Singleton) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getMessage() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    // Biến static để giữ instance duy nhất của lớp
    private static SimpleSingleton instance;
    
    // Thuộc tính message kiểu String
    private String message;

    // Phương thức private constructor để ngăn chặn khởi tạo từ bên ngoài
    private SimpleSingleton() {}

    // Phương thức getInstance để lấy instance duy nhất của SimpleSingleton
    public static SimpleSingleton getInstance() {
        if (instance == null) {
            instance = new SimpleSingleton();
        }
        return instance;
    }

    // Phương thức setMessage để đặt giá trị cho thuộc tính message
    public void setMessage(String message) {
        this.message = message;
    }

    // Phương thức getMessage để lấy giá trị của thuộc tính message
    public String getMessage() {
        return message;
    }
}

    }
    

