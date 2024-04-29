 class CommandLineArgumentsExample {
    public static void main(String[] args) {
        // args is an array containing the command-line arguments
        // args[0] is the first argument, args[1] is the second, and so on
        
        // Check if any arguments were provided
        if (args.length == 0) {
            System.out.println("No arguments provided.");
        } else {
            System.out.println("Arguments provided:");
            // Iterate through the arguments and print each one
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + i + ": " + args[i]);
            }
        }
    }
}

