package ru.mirea.lab22.task3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ImageDocument implements IDocument {
    public ImageDocument() throws IOException {
        Files.createFile(Path.of("/home/georg0n/Документы/GitHub repos/javaPrac/javaPrac/Task22/Task22/files/image.jpg"));
        System.out.println("Был создан jpg файл");
    }
}