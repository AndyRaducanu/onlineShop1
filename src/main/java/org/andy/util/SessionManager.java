package org.andy.util;

import org.andy.model.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class SessionManager extends AbstractSessionManager
{
    private static final SessionManager INSTANCE = new SessionManager();

    private SessionManager(){
    }

    public static SessionFactory getSessionFactory()
    {
        return INSTANCE.getSessionFactory("online_shop?serverTimezone=UTC");
    }

    public static void shutdown()
    {
        INSTANCE.shutdownSessionManager();
    }

    @Override
    protected void setAnnotatedClasses(Configuration configuration)
    {
        // add classes from model here
        configuration.addAnnotatedClass(Address.class);
        configuration.addAnnotatedClass(User.class);
        configuration.addAnnotatedClass(Order.class);
        configuration.addAnnotatedClass(Product.class);
        configuration.addAnnotatedClass(Category.class);

    }
}
