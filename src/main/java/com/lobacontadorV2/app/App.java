package com.lobacontadorV2.app;

import com.lobacontadorV2.app.service.execution.impl.EjecucionServiceImpl;

public class App 
{
    public static void main( String[] args )
    {
        EjecucionServiceImpl.ejecucion.ejecutar();
    }
}
