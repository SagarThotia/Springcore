package com.st.springcore.main;

import com.st.springcore.config.Appconfig;
import com.st.springcore.dao.ProductDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class P01_GetProductCount
{
    public static void main(String[] args)
    {
        // a variable representing the spring container // object of spring container
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
        // our dependency
        ProductDao productDao = context.getBean("dummyDao", ProductDao.class);
        ProductDao productDao2 = context.getBean("jdbcDao", ProductDao.class);
        System.out.println("--------------------------------------------------------");
        System.out.println("ProductDao2 == ProductDao is " + (productDao2 == productDao));
        System.out.println("dao is an instanceof " + productDao.getClass().getName());
        System.out.println("There are " + productDao.count() + " products. ");
        context.close();
    }
}
