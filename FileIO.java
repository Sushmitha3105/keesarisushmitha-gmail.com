package com.meghana;

import java.io.*;

public class FileIO {
    public static void main(String[] args) {
        String[] names = {"hi", "hello", "bye"};
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("writing to a file");
            writer.write("\n another line");
            for (String name : names) {
                writer.write("\n" + name);
            }

            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            String line;
            while ((line = reader.readLine()) != null)
                System.out.println(reader.readLine());
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
