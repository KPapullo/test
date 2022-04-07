import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> taskList = new ArrayList<>();

        out:
        while (true) {
            System.out.println("""
                                        
                    Выберите действие:\s
                    1. Добавить задачу\s
                    2. Вывести список задач\s
                    3. Удалить задачу\s
                    0. Выход\s
                    """);
            String newTask = scanner.nextLine();
            int operation = Integer.parseInt(newTask);
            switch (operation) {
                case 0:
                    break out;
                case 1:
                    System.out.println("Введите задачу для планирования: ");
                    String userTask = scanner.nextLine();
                    taskList.add(userTask);
                    break;
                case 2:
                    if (taskList.isEmpty()) {
                        System.out.println("Список пуст");
                        break;
                    } else {
                        System.out.println("Список задач:");
                        for (int i = 0; i < taskList.size(); i++) {
                            System.out.println((i + 1) + "." + taskList.get(i));
                        }
                        break;
                    }
                case 3:
                    if (taskList.isEmpty()) {
                        System.out.println("Список задач пуст");
                        break;
                    } else {
                        System.out.println("Выберите номер задачи, которую хотите удалить:");
                        for (int i = 0; i < taskList.size(); i++) {
                            System.out.println((i + 1) + "." + taskList.get(i));
                        }
                        userTask = scanner.nextLine();
                        int index = Integer.parseInt(userTask);
                        taskList.remove(index - 1);
                        break;
                    }
            }
        }
    }
}









