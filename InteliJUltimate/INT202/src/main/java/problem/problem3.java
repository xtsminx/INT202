package problem;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class problem3 {
    private Map<String, List<Integer>> wordRe;

    public problem3() {
        wordRe = new HashMap<>();
    }

    public void process(String dataFile) throws FileNotFoundException {
        File file = new File(dataFile);
        if (!file.exists()) {
            throw new FileNotFoundException(dataFile + " does not exist");
        }

        Scanner scanner = new Scanner(file);
        int position = 0;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] words = line.split("\\s+"); // Split line into words

            for (String word : words) {
                word = word.replaceAll("^[^a-zA-Z0-9]+|[^a-zA-Z0-9]+$", "");

                if (!word.isEmpty()) {
                    wordRe.putIfAbsent(word, new ArrayList<>());
                    wordRe.get(word).add(position);
                }
                position++;
            }
        }

        scanner.close();
    }

    public void displayResults() {
        for (Map.Entry<String, List<Integer>> entry : wordRe.entrySet()) {
            System.out.println(entry.getKey() + " (" + entry.getValue().size() + "): " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        String dataFile = "data.txt";

        problem3 problem = new problem3();

        try {
            problem.process(dataFile);

            problem.displayResults();
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
