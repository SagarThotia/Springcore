package com.st.springcore.beans;

import com.st.springcore.interfaces.MobileProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component // Nonqualified and De capitalize
           // defaults is Samsung @Component("mySamsung")
           // which is specifying the class object
public class Samsung
{
    @Autowired // search object itself
    @Qualifier("snapdragon")
    private MobileProcessor cpu;

    public MobileProcessor getCpu()
    {
        return cpu;
    }

    public void setCpu(MobileProcessor cpu)
    {
        this.cpu = cpu;
    }

    public void config()
    {
        System.out.println("Octacore Helio G90 Processor, 8gb Ram, 64MP camera");
        cpu.process();
    }
}
