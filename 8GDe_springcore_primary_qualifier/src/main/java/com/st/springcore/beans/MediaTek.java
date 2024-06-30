package com.st.springcore.beans;

import com.st.springcore.interfaces.MobileProcessor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MediaTek implements MobileProcessor
{
    @Override
    public void process()
    {
        System.out.println("2nd Best CPU.");
    }
}
