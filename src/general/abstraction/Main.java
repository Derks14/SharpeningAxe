package general.abstraction;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "src/general/abstraction/data.txt";

        Sort sort = new SortEmail();
        sort.prepareAndSendReport(path);
    }
}
