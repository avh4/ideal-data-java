package net.avh4.ideal.data.commons;

import net.avh4.ideal.data.ExternalStorageException;
import net.avh4.ideal.data.File;
import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CommonsIOFile implements File {
    private final String filename;
    private java.io.File file;

    public CommonsIOFile(java.io.File parent, String filename) {
        this.filename = filename;
        file = new java.io.File(parent, this.filename);
    }

    @Override
    public String getName() {
        return filename;
    }

    @Override
    public String getContents() {
        try {
            final FileInputStream fis = new FileInputStream(file);
            return IOUtils.toString(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            return null;
        }
    }

    @Override
    public void writeContents(String data) throws ExternalStorageException {
        try {
            final FileOutputStream fos = new FileOutputStream(file);
            IOUtils.write(data, fos);
        } catch (IOException e) {
            throw new ExternalStorageException("Cannot write file: " + filename, e);
        }
    }
}
