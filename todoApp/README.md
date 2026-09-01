# CLI Todo Application

A command-line task manager application built in core Java with persistent file storage.

## Features

- **Add Task**: Create new tasks with auto-incremented IDs.
- **View Tasks**: Display all pending and completed tasks.
- **Complete Task**: Mark specific task IDs as completed.
- **Delete Task**: Remove tasks by ID.
- **Persistence**: Saves task states to `tasks.dat` using Java Object Serialization.

## Architecture

- **`Task.java`**: Serializable model class (`id`, `title`, `isCompleted`).
- **`todoService.java`**: Service layer handling task logic and `tasks.dat` file I/O.
- **`Main.java`**: Console user interface loop.

## How to Run

```bash
javac Main.java
java Main
```
