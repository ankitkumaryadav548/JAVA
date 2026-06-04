import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TodoService service = new TodoService();

        while (true) {

            System.out.println("\n====== TODO APP ======");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Complete Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice;

            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid input.");
                continue;
            }

            switch (choice) {

                case 1:

                    System.out.print("Enter task title: ");
                    String title = sc.nextLine();

                    Task task = new Task(
                            service.getNextId(),
                            title
                    );

                    service.addTask(task);

                    System.out.println("Task added.");
                    break;

                case 2:
                    service.showTasks();
                    break;

                case 3:

                    System.out.print("Enter task id: ");
                    int completeId =
                            Integer.parseInt(sc.nextLine());

                    service.completeTask(completeId);
                    break;

                case 4:

                    System.out.print("Enter task id: ");
                    int deleteId =
                            Integer.parseInt(sc.nextLine());

                    service.deleteTask(deleteId);
                    break;

                case 5:

                    System.out.println("Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}