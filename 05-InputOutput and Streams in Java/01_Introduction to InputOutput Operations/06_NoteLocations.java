class 06_NoteLocations {

    public static void main(String[] args) {
        try {
            // Create a directory
            File notesDir = new File("notes");
            if (notesDir.mkdir()) {
                System.out.println("Directory 'notes' created successfully");
            } else {
                System.out.println("Directory 'notes' already exists or could not be created");
            }

            // Ensure the directory exists before creating the file
            File noteFile = new File("notes/note.txt");
            if (noteFile.createNewFile()) {
                System.out.println("File 'note.txt' created successfully");
            } else {
                System.out.println("File 'note.txt' already exists or could not be created");
            }

            // List contents of the directory
            File[] files = notesDir.listFiles();
            if (files != null) {
                for (File f : files) {
                    System.out.println("File: " + f.getName());
                }
            }

            // Retrieve and print the absolute path of the file
            System.out.println("Absolute Path: " + noteFile.getAbsolutePath());

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}