package ru.mirea.lab22.task3;

import java.io.IOException;


public class CreateText implements ICreateDocument{
    @Override
    public IDocument createDocument() throws IOException {
        return new TextDocument();
    }
}
