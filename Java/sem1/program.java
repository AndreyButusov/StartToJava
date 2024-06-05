// Настроить проект, вывести в консоль "Hello, world!".
// Вывести в консоль системную дату и время.

// import java.time.LocalDateTime;
import java.util.Scanner;

// public class program {
//     public static void main(String[] args) {
//         System.out.println("Hello, world!");

//         System.out.println(LocalDateTime.now());
//     }
// }


// Написать программу, которая попросит пользователя ввести <Имя> в консоли.
// Получит введенную строку и напечатает в консоль сообщение “Привет, <Имя>!”

// public class program {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         String name = scanner.nextLine();
//         System.out.println("Привет, "+ name + "!");
//     }
// }



// В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида
// "Доброе утро, <Имя>!", если время от 05:00 до 11:59
// "Добрый день, <Имя>!", если время от 12:00 до 17:59;

// public class program {
//     public static void main(String[] args) {
//         System.out.println("Сколько вам лет?");
//         Scanner scanner = new Scanner(System.in);
//         int age = scanner.nextInt();
//         if (age < 10){
//             System.out.println("Вот вам конфета! ");
//         }
//         else if (age < 18) {
//             System.out.println("Вот вам конфета! ");
//         }
//         else if (age < 70) {
//             System.out.println("Вот вам очки! ");
//         }
//         else {
//             System.out.println("Вы прожили долгую жизнь... ");
//         }
        

//         }
//     }



// int[] arr = {1,4,5,4,7,8};
// // int[] arr1 = new int[]{1,4,5,4,7,8};
// // int[] arr2 = new int[5];
// // System.out.println(Arrays.toString(arr2));
// // System.out.println(Arrays.toString(arr1));
// // arr1[2] = 10;
// // System.out.println(Arrays.toString(arr1));
// int sum = 0;
// for (int i = 0; i < arr.length; i++) {
// sum += arr[i];
// }
// System.out.println(sum);

String str = "Добро пожаловать на курс по Java";
String[] arr = str.split(" ");
StringBuilder sb = new StringBuilder();
for (int i = arr.length- 1; i >= 0; i--) {
String temp = arr[i];
sb.append(temp).append(" ");

}
System.out.println(sb);