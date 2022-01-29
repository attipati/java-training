package com.dxc;

import org.springframework.stereotype.Component;

@Component
public class bike implements vehicle {
    public void Ride()
    {
        System.out.println("take bike and ride own!!!!!");
    }
    
}
