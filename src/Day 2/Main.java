public class Main {
    public static void main(String[] args) {
        int a = 2, b = 3, c = 4, d = 5;
        float k = 4.3f;
        float g = 0.0f; // Assuming g needs to be initialized

        // a) println( --b * a + c * d --)
        // Interpreted as: --b * a + c * d
        System.out.println(--b * a + c * d);
        // Explanation: --b decrements b to 2, then 2 * 2 + 4 * 5 = 4 + 20 = 24

        // b) println(a++);
        // Post-increment a
        System.out.println(a++);
        // Explanation: a++ prints 2, then increments a to 3

        // c) println (–2 * ( g – k ) +c);
        // Interpreted as: -2 * (g - k) + c
        System.out.println(-2 * (g - k) + c);
        // Explanation: g is assumed to be 0.0f, so -2 * (0.0f - 4.3f) + 4 = -2 * -4.3f + 4 = 8.6 + 4 = 12.6

        // d) println (c=c++);
        // Post-increment c, but assignment happens after the current value is used
        System.out.println(c = c++);
        // Explanation: c++ returns the current value of c (4), then increments c to 5, but assignment after `=` uses the value before increment

        // e) println (c=++c*a++);
        // Pre-increment c, post-increment a
        System.out.println(c = ++c * a++);
        // Explanation: ++c increments c to 6, then a++ returns 3 and increments a to 4, so c = 6 * 3 = 18

        // Print the final values of the variables
        System.out.println("Final values:");
        System.out.println("a = " + a); // Should be 4
        System.out.println("b = " + b); // Should be 2
        System.out.println("c = " + c); // Should be 18
        System.out.println("d = " + d); // Should be 5
        System.out.println("k = " + k); // Should be 4.3
    }
}
