package com.st.springcore.beans;

import com.st.springcore.interfaces.Pen;

public class Writer
{
    private Pen pen;

    public void write()
    {
        pen.write();
    }

    public Pen getPen()
    {
        return pen;
    }

    public void setPen(Pen pen)
    {
        this.pen = pen;
    }
}
