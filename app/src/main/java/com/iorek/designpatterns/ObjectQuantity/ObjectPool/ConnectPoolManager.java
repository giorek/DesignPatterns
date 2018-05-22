package com.iorek.designpatterns.ObjectQuantity.ObjectPool;

import java.util.ArrayList;

public class ConnectPoolManager {

    /**
     * 每个连接对象都持有一个当前的连接和当前的使用状态
     */
    private class ConnectionPoolItem
    {
        Object item;
        boolean isUse = false;
        ConnectionPoolItem(Object item)
        {
            this.item = item;
        }
    }

    class EmptyException extends Exception
    {

        public EmptyException(String s) {
        }
    }

    private ArrayList<ConnectionPoolItem> poolList = new ArrayList<>();

    /**
     * 创建具体数量的连接
     * @param connect
     */
    public void Add(ConnectImpl connect)
    {
        poolList.add(new ConnectionPoolItem(connect));
    }

    /**
     * 获取一个连接
     * @return
     */
    public Object GetConnection() throws EmptyException
    {
        for(int i = 0 ;i < poolList.size();i++)
        {
            if(!poolList.get(i).isUse)
            {
                return poolList.get(i);
            }
        }
        throw new EmptyException(" current connection pool is full");
    }

    /**
     * 释放连接
     * @param connection
     */
    public void ReleaseConnection(Object connection) throws EmptyException {
        for(int i = 0 ;i < poolList.size();i++)
        {
            if(poolList.get(i) == connection)
            {
                return;
            }
        }
        throw new EmptyException(connection +" not found");
    }
}
