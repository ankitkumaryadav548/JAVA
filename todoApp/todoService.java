import java.io.*;
import java.util.ArrayList;
import java.util.List;

 class TodoService {

    private List<Task> tasks;
    private final String FILE_NAME = "tasks.dat";

    public TodoService() {
        tasks = loadTasks();
    }

    public void addTask(Task task) {
        tasks.add(task);
        saveTasks();
    }

    public void showTasks() {

        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }

        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public void completeTask(int id) {

        for (Task task : tasks) {

            if (task.getId() == id) {
                task.markCompleted();
                saveTasks();
                System.out.println("Task completed.");
                return;
            }
        }

        System.out.println("Task not found.");
    }

    public void deleteTask(int id) {

        boolean removed =
                tasks.removeIf(task -> task.getId() == id);

        if (removed) {
            saveTasks();
            System.out.println("Task deleted.");
        } else {
            System.out.println("Task not found.");
        }
    }

    public int getNextId() {

        int max = 0;

        for (Task task : tasks) {

            if (task.getId() > max) {
                max = task.getId();
            }
        }

        return max + 1;
    }

    private void saveTasks() {

        try (ObjectOutputStream out =
                     new ObjectOutputStream(
                             new FileOutputStream(FILE_NAME))) {

            out.writeObject(tasks);

        } catch (IOException e) {
            System.out.println("Error saving tasks.");
        }
    }

    private List<Task> loadTasks() {

        File file = new File(FILE_NAME);

        if (!file.exists()) {
            return new ArrayList<>();
        }

        try (ObjectInputStream in =
                     new ObjectInputStream(
                             new FileInputStream(FILE_NAME))) {

            return (ArrayList<Task>) in.readObject();

        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
}