package util;

import java.io.*;
import java.util.*;
import java.util.logging.*;
import model.Person;

public class PhonebookUtil {

    private static final String DEFAULT_SEPARATOR = ",";

    public static void saveContacts(Writer w, List<Person> values) throws IOException {

        StringBuilder sb = new StringBuilder();
        for (Person value : values) {
            sb.append(value.getName());
            sb.append(DEFAULT_SEPARATOR);
            sb.append(value.getGender());
            sb.append(DEFAULT_SEPARATOR);
            sb.append(value.getAge());
            sb.append(DEFAULT_SEPARATOR);
            sb.append(value.getPhoneNumber());
            sb.append("\n");
        }

        w.append(sb.toString());
    }

    public static ArrayList<Person> loadContacts(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        ArrayList<Person> records = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            Person p = getRecordFromLine(str);
            if (p != null) {
                records.add(p);
            }
        }
        return records;
    }

    private static Person getRecordFromLine(String line) {
        Person p = null;
        try {
            Scanner rowScanner = new Scanner(line);
            rowScanner.useDelimiter(DEFAULT_SEPARATOR);
            while (rowScanner.hasNext()) {
                p = new Person();
                p.setName(rowScanner.next());
                p.setGender(rowScanner.next());
                p.setAge(Integer.parseInt(rowScanner.next()));
                p.setPhoneNumber(rowScanner.next());
            }
        } catch (Exception ex) {
            Logger.getLogger(PhonebookUtil.class.getName()).log(Level.SEVERE, null, ex);

        }
        return p;
    }

}
