public class AddCommand extends Command {

    private Task newTaskToBeAdded;

    /**
     * Constructs a Command to add Task to TaskList.
     *
     * @param newTaskToBeAdded is the task that will be added into TaskList
     */
    public AddCommand(Task newTaskToBeAdded) {
        this.newTaskToBeAdded = newTaskToBeAdded;
    }

    @Override
    boolean isExit() {
        return false;
    }

    /**
     * Executes an AddCommand given TaskList, UI, Storage.
     *
     * @param tasks the TaskList.
     * @param ui the UI.
     * @param storage the file storage.
     */
    @Override
    void execute(TaskList tasks, Ui ui, Storage storage) {
        tasks.addTask(newTaskToBeAdded);
        ui.printAdd(newTaskToBeAdded, tasks.getSize());
    }

    @Override
    public boolean equals(Object o) {

        // If the object is compared with itself then return true
        if (o == this) {
            return true;
        }

        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof AddCommand)) {
            return false;
        }

        // typecast o to Complex so that we can compare data members
        AddCommand ac = (AddCommand) o;

        // Compare the data members and return accordingly
        return ac.newTaskToBeAdded.toString().equalsIgnoreCase(this.newTaskToBeAdded.toString());
    }

}
