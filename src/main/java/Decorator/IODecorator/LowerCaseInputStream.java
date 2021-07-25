package Decorator.IODecorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {
    public LowerCaseInputStream(InputStream in) {
        super(in);
    }

    public int read() throws IOException {
        int c = in.read();
        if (c == -1) {
            return c;
        } else {
            return Character.toLowerCase((char) c);
        }
    }

    public int read(byte[] b, int offset, int length) throws IOException {
        int result = in.read(b, offset, length);
        for (int i = offset; i < offset + length; i++) {
            b[i] = (byte) Character.toLowerCase((char) b[i]);
        }
        return result;
    }
}
