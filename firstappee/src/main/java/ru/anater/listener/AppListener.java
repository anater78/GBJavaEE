package ru.anater.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.anater.FirsHttpServlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class AppListener implements ServletContextListener {

    Logger logger = LoggerFactory.getLogger(AppListener.class);

    @Override
    public void contextInitialized(ServletContextEvent sce) {

    }
}
