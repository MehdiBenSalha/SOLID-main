package com.directi.training.dip.exercise.refactored;

import java.util.Base64;

public class EncodingModule {
    private Reader _reader;
    private Writer _writer;

    public EncodingModule(Reader reader, Writer writer)
    {
        _reader = reader;
        _writer = writer;
    }

    public void encode()
    {
        String read = _reader.read();
        String encodedLine = Base64.getEncoder().encodeToString(read.getBytes());
        _writer.write(encodedLine);
    }
}
