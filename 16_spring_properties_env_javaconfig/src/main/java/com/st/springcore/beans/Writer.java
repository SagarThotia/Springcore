package com.st.springcore.beans;

import com.st.springcore.interfaces.Pen;

public class Writer
{
    private final Pen pen;

    public Writer(final Pen pen)
    {
        this.pen = pen;
    }

    public void write()
    {
        pen.write();
    }
}
