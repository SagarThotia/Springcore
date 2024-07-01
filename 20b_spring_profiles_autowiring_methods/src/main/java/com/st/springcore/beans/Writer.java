package com.st.springcore.beans;

import com.st.springcore.interfaces.Pen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Writer
{
    private Pen pen;

    @Autowired
    public Writer(Pen pen)
    {
        this.pen = pen;
    }

    public void write()
    {
        pen.write();
    }
}
