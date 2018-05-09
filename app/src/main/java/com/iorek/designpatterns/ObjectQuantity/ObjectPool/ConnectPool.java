package com.iorek.designpatterns.ObjectQuantity.ObjectPool;

public class ConnectPool {

    private static ConnectPool Instance = new ConnectPool();
    private static ConnectPoolManager connectPoolManager = new ConnectPoolManager();
    private ConnectPool(){}

    public static ConnectPool GetInstace()
    {
        return Instance;
    }

    /**
     * 创建固定数量对象池
     * @param connectionNum
     */
    public void CreateConnections(int connectionNum)
    {
        for (int i = 0; i < connectionNum;i++)
        {
            connectPoolManager.Add(new ConnectImpl());
        }
    }

    /**
     * 从连接池中获取一个连接
     * @return
     */
    public ConnectImpl GetConnection()
    {
        ConnectImpl result = null;
        try {
            result = (ConnectImpl) connectPoolManager.GetConnection();
        } catch (ConnectPoolManager.EmptyException e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 释放连接
     * @param connect
     */
    public void ReleaseConnection(ConnectImpl connect)
    {
        try {
            connectPoolManager.ReleaseConnection(connect);
        } catch (ConnectPoolManager.EmptyException e) {
            e.printStackTrace();
        }
    }

}
