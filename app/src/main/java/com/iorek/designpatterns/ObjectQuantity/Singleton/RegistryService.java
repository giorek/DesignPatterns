package com.iorek.designpatterns.ObjectQuantity.Singleton;

import java.util.HashMap;
import java.util.Map;

public final class RegistryService {
    private static String TAG = RegistryService.class.getSimpleName();

    private static RegistryService Instance = new RegistryService();

    private RegistryService(){}

    public static RegistryService GetInstance()
    {
        return Instance;
    }

    private Map<String, ObserverInterface> map = new HashMap<>();

    public void RegisterObserver(ObserverInterface observerInterface,String name)
    {
        if(!map.containsKey(name))
        {
            map.put(name,observerInterface);
        }
    }

    public ObserverInterface LookupObserver(String name)
    {
        return map.get(name);
    }
}
