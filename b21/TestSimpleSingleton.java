/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b21;

/**
 *
 * @author Admin
 */
public class TestSimpleSingleton {
    public class SimpleSingletonTest {
    public static void main(String[] args) {
        // Lấy hai instance của SimpleSingleton
        SimpleSingleton instance1 = SimpleSingleton.getInstance();
        SimpleSingleton instance2 = SimpleSingleton.getInstance();

        // Đặt message cho instance thứ nhất
        instance1.setMessage("Hello, Singleton!");

        // In ra message từ cả hai instance
        System.out.println("Message from instance 1: " + instance1.getMessage());
        System.out.println("Message from instance 2: " + instance2.getMessage());

        // So sánh địa chỉ bộ nhớ của hai instance
        System.out.println("Are both instances the same? " + (instance1 == instance2));
        System.out.println("Memory address of instance 1: " + System.identityHashCode(instance1));
        System.out.println("Memory address of instance 2: " + System.identityHashCode(instance2));
    }
}

}
