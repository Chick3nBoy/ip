package Duke;

import Duke.Tasks.Task;

import java.util.ArrayList;

public class Ui {
    static final String LINE = "____________________________________________________________";
    static final String BLANK = "    ";

    /**
     * Prints run message when by is called
     */
    static void printWelcome() {
        String logo = BLANK + LINE + "\n"
                + BLANK + "Hello! I'm Duke.Duke\n"
                + BLANK + "What can I do for you?\n"
                + BLANK + LINE;
        System.out.println("\n" + logo);
    }

    static void doFind(ArrayList<Task> taskList, String keyString) {
        System.out.println(BLANK + LINE);
        for (int i = 0; i < taskList.size(); i += 1) {
            if (taskList.get(i).getTaskName().contains(keyString)) {
                System.out.print(BLANK + (i + 1) + ".");
                taskList.get(i).printTask();
            }
        }
        System.out.println(BLANK + LINE);
    }

    /**
     * Prints goodbye message when by is called
     */

    static void doExit() {
        System.out.println(BLANK + LINE);
        System.out.println(BLANK + "Bye. Hope to see you again soon!");
        System.out.println(BLANK + LINE);
    }
}
