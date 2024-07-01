package com.st.springcore.dao;

public class JdbcProductDao implements ProductDao
{
    @Override
    public long count()
    {
        return 100;
    }
}
