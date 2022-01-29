package com.dxc;

import org.springframework.stereotype.Component;

@Component
public class car implements vehicle  {
    public void Ride()
    {
        System.out.println("take car and ride u own ");
    }
    
}
