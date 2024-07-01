package com.st.springcore.beans;

import com.st.springcore.interfaces.Pen;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class Writer
{
    private Pen pen;

    @Inject
    public Writer(Pen pen)
    {
        this.pen = pen;
    }

    public void write()
    {
        pen.write();
    }
}
