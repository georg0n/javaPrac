package ru.mirea.lab22.task3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TextDocument implements IDocument{
    public TextDocument() throws IOException {
        Files.createFile(Path.of("/home/georg0n/Документы/GitHub repos/javaPrac/javaPrac/Task22/Task22/files/text.txt"));
        System.out.println("Был создан txt файл");
    }
}
