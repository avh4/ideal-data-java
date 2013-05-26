package net.avh4.ideal.data.commons;

import net.avh4.ideal.data.ExternalStorage;
import net.avh4.ideal.data.File;

import java.util.Arrays;
import java.util.List;

public class CommonsIOExternalStorage implements ExternalStorage {
    private final java.io.File dir;

    public CommonsIOExternalStorage() {
        dir = new java.io.File(".");
    }

    @Override
    public File getFile(String filename) {
        return new CommonsIOFile(dir, filename);
    }

    @Override
    public List<String> getFiles() {
        return Arrays.asList(dir.list());
    }
}
