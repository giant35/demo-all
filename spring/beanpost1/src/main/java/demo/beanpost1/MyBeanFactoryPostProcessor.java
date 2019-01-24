/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.beanpost1;

import java.util.logging.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 *
 * @author tangfanghua
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    private static final Logger LOG = Logger.getLogger(MyBeanFactoryPostProcessor.class.getName());

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        LOG.info("postProcessBeanFactory ");
    }

}
